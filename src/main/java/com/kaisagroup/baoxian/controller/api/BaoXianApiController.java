
package com.kaisagroup.baoxian.controller.api;

import com.github.pagehelper.PageHelper;
import com.kaisagroup.baoxian.entity.*;
import com.kaisagroup.baoxian.service.BaoXioanService;
import com.kaisagroup.baoxian.util.Constants;
import com.kaisagroup.baoxian.util.LayuiData;
import com.kaisagroup.baoxian.util.baoxianjson.ReportJsonData;
import com.kaisagroup.baoxian.util.baoxianjson.RepostJsonDataResp;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by jackssy on 2018/7/27.
 */
@Controller
@RequestMapping("/baoxian")
public class BaoXianApiController {

    private Log logger = LogFactory.getLog(this.getClass());

    @Autowired
    private BaoXioanService baoXioanService;

    @ApiOperation(value = "新增或修改保存")
    @RequestMapping(path = "/doAddOrUpdate", method={RequestMethod.POST})
    @ResponseBody
    public LayuiData doAddOrUpdate(HttpServletRequest request,
                                 ComplexEntity complexEntity,BindingResult bindingResult) {
        String addOrUpdateType=request.getParameter("addOrUpdateType");//新增add,修改 update,查看 view ，审核 audit
        if(!StringUtils.isEmpty(addOrUpdateType)){
            if(Constants.OPER_ADD.equals(addOrUpdateType)){
                this.baoXioanService.save(complexEntity.getBaoxian(),complexEntity.getShouxian(),complexEntity.getChanxian());
            }else if(Constants.OPER_UPDATE.equals(addOrUpdateType)){
                this.baoXioanService.update(complexEntity.getBaoxian(),complexEntity.getShouxian(),complexEntity.getChanxian());
            }
        }
        LayuiData layuiData =new LayuiData();
        layuiData.setCode(1);
        layuiData.setMsg("success");
        return layuiData;
    }

    @ApiOperation(value = "新增或修改保存保险")
    @RequestMapping(path = "/doAddOrUpdateBaoXian", method={RequestMethod.POST})
    @ResponseBody
    public LayuiData doAddOrUpdateBaoXian(HttpServletRequest request,
                                   BaoXian baoXian,BindingResult bindingResult) {
        String addOrUpdateType=request.getParameter("addOrUpdateType");//新增add,修改 update,查看 view ，审核 audit
        if(!StringUtils.isEmpty(addOrUpdateType)){
            if(Constants.OPER_ADD.equals(addOrUpdateType)||Constants.OPER_UPDATE.equals(addOrUpdateType)){
                this.baoXioanService.saveOrUpdateBaoXian(baoXian);
            }
        }
        LayuiData layuiData =new LayuiData();
        layuiData.setCode(1);
        layuiData.setMsg("success");
        return layuiData;
    }

    @ApiOperation(value = "新增或修改保存产险")
    @RequestMapping(path = "/doAddOrUpdateChanXian", method={RequestMethod.POST})
    @ResponseBody
    public LayuiData doAddOrUpdateChanXian(HttpServletRequest request,
                                          List<ChanXian> chanXianList) {
        String addOrUpdateType=request.getParameter("addOrUpdateType");//新增add,修改 update,查看 view ，审核 audit
        if(!StringUtils.isEmpty(addOrUpdateType)){
            if(Constants.OPER_ADD.equals(addOrUpdateType)||Constants.OPER_UPDATE.equals(addOrUpdateType)){
//                this.baoXioanService.saveOrUpdateChanXian(chanXian);
            }
        }
        LayuiData layuiData =new LayuiData();
        layuiData.setCode(1);
        layuiData.setMsg("success");
        return layuiData;
    }

    @ApiOperation(value = "新增或修改保存寿险")
    @RequestMapping(path = "/doAddOrUpdateShouxian", method={RequestMethod.POST})
    @ResponseBody
    public LayuiData doAddOrUpdateShouxian(HttpServletRequest request,
                                           List<ShouXian> shouXianList) {
        String addOrUpdateType=request.getParameter("addOrUpdateType");//新增add,修改 update,查看 view ，审核 audit
        if(!StringUtils.isEmpty(addOrUpdateType)){
            if(Constants.OPER_ADD.equals(addOrUpdateType)||Constants.OPER_UPDATE.equals(addOrUpdateType)){
//                this.baoXioanService.saveOrUpdateShouXian(shouXian);
            }
        }
        LayuiData layuiData =new LayuiData();
        layuiData.setCode(1);
        layuiData.setMsg("success");
        return layuiData;
    }

    @ApiOperation(value = "产品列表")
    @RequestMapping(value = "listAll/{start}/{size}",method={RequestMethod.POST})
    public @ResponseBody
    LayuiData listAll(@PathVariable("start")int start, @PathVariable("size")int size,
                      BaoXian baoxian){
        PageHelper.startPage(start,size);
        BaoXianExample example = new BaoXianExample();
        if(null!=baoxian&& null!=baoxian.getYear()&&baoxian.getYear()>0){
            example.createCriteria().andYearEqualTo(baoxian.getYear());
        }
        if(null!=baoxian&& null!=baoxian.getMonth()&&baoxian.getMonth()>0){
            example.createCriteria().andMonthEqualTo(baoxian.getMonth());
        }

        if(null!=baoxian&& !StringUtils.isEmpty(baoxian.getReportplace())){
            example.createCriteria().andReportplaceEqualTo(baoxian.getReportplace());
        }
       List<BaoXian> list = this.baoXioanService.findBiaoXianList(example);

        LayuiData layuiData = new LayuiData();
        layuiData.setMsg("ok");
        layuiData.setCode(0);
        layuiData.setCount(list.size());
        layuiData.setData(list);
        return layuiData ;
    }

    @RequestMapping(value = "auditStatus",method={RequestMethod.POST})
    @ApiOperation(value = "更新保险状态[auditSuccess:成功 reject:驳回 toAudit:待审核]")
    public @ResponseBody
    LayuiData auditStatus(String operId,String status){
        int result=this.baoXioanService.auditStatus( operId, status,Constants.OPER_MAN);
        LayuiData layuiData = new LayuiData();
        if(Constants.Status.auditSuccess.getCode().equals(status)){//审核通过并报送
            logger.info("审核成功:开始提交报文信息");
            RepostJsonDataResp resp = this.baoXioanService.postReportPlaceData(operId);
            logger.info("提交报文信息结束:"+resp.getResult().toString());
            layuiData.setCode(Integer.parseInt(resp.getResult().getCode()));
            layuiData.setMsg(resp.getResult().getMessage());
            return layuiData;
        }
        layuiData.setMsg("ok");
        layuiData.setCode(result);
        return layuiData ;
    }

    @RequestMapping(value = "deleteBaoXianById",method={RequestMethod.POST})
    @ApiOperation(value = "删除保险")
    public @ResponseBody
    LayuiData deleteBaoXianById(String operId){
        int result=this.baoXioanService.deleteBaoXianById(operId);
        LayuiData layuiData = new LayuiData();
        layuiData.setMsg(result>0?"ok":"error");
        layuiData.setCode(result);
        return layuiData ;
    }

    /**
     * 去新增或修改界面 查看 审核界面
     * @param model
     * @return
     */
    @RequestMapping(value = "toAddOrUpdateOrViewOrAudit",method={RequestMethod.GET})
    @ApiOperation(value = "跳转到新增add,修改update,查看view,审核audit,页面")
    public String toAddOrUpdateOrViewOrAudit(String addOrUpdateType,String id,
                                             Model model) {
//        String addOrUpdateType=request.getParameter("addOrUpdateType");//新增add,修改 update,查看 view ，审核 audit
        if(StringUtils.isEmpty(addOrUpdateType)){
            addOrUpdateType="add";
        }
        BaoXian baoxian=new BaoXian();
        ShouXian shouxian=new ShouXian();
        ChanXian chanxian =new ChanXian();
//        String id=request.getParameter("id");
        if(!StringUtils.isEmpty(addOrUpdateType)&&!StringUtils.isEmpty(id)&&!Constants.OPER_ADD.equals(addOrUpdateType)){
            baoxian = this.baoXioanService.findBaoxianById(id);
            shouxian= this.baoXioanService.findShouxianByBxId(id);
            chanxian= this.baoXioanService.findChanxianByBxId(id);
        }

        model.addAttribute("addOrUpdateType",addOrUpdateType);
        model.addAttribute("baoxian",baoxian);
        model.addAttribute("shouxian",shouxian);
        model.addAttribute("chanxian",chanxian);
        return "baoxian/addOrUpdate";
    }

    @RequestMapping(value = "postReportPlaceTest",method={RequestMethod.POST})
    @ApiOperation(value = "测试报送地址")
    public LayuiData postReportPlaceTest(@RequestParam String operId){
        if(StringUtils.isEmpty(operId)){
            throw new RuntimeException("operId 为空");
//            operId="42ff36b44103480b8d2e99172dbf9409";
        }
        LayuiData layuiData = new LayuiData();

        logger.info("审核成功:开始提交报文信息");
        RepostJsonDataResp resp = this.baoXioanService.postReportPlaceData(operId);
        if(null!=resp&&null!=resp.getResult()){
            logger.info("提交报文信息结束:"+resp.getResult().toString());
        }else{
            logger.info("请求异常");
        }

        layuiData.setCode(Integer.parseInt(resp.getResult().getCode()));
        layuiData.setMsg(resp.getResult().getMessage());


        layuiData.setMsg("ok");

        return layuiData ;
    }



    @RequestMapping(value = "postReportPlaceReceiveTest",method={RequestMethod.POST})
    @ApiOperation(value = "测试报送地址")
    public String postReportPlaceReceiveTest(@RequestBody ReportJsonData data){
        logger.info("postReportPlaceTest="+data.toString());

        return data.toString();
    }




    /**
     * **********************************************************************
     *              分隔符
     * * **********************************************************************
     */




//    @RequestMapping(path = "/getBaoXianList", method={RequestMethod.POST,RequestMethod.GET})
//    @ResponseBody
    public LayuiData getBaoXianList (HttpServletRequest request){

        String id = request.getParameter("");
        if(id==null){
            id="";
        }
        String pageStr= request.getParameter("page");
        String limitStr=  request.getParameter("limit");
        int page=1;
        int limit =10;
        if(!StringUtils.isEmpty(pageStr)){
            page=Integer.parseInt(pageStr);
        }
        if(!StringUtils.isEmpty(limitStr)){
            limit=Integer.parseInt(limitStr);
        }
        if(page>=2){
            page = (page-1)*limit;
        }


        LayuiData layuiData = new LayuiData();
//        List<BaoXian> baoxianList =this.baoXioanService.f
//        int count = userService.getUserCount();
        layuiData.setCode(0);
        layuiData.setCount(22);
        layuiData.setMsg("数据请求成功");
//        layuiData.setData(userList);
        return layuiData;
    }



    @InitBinder("baoxian")
    public void baoXianBinder(WebDataBinder webDataBinder){
        webDataBinder.setFieldDefaultPrefix("baoxian.");
    }

    @InitBinder("shouxian")
    public void shouXianBinder(WebDataBinder webDataBinder){
        webDataBinder.setFieldDefaultPrefix("shouxian.");
    }

    @InitBinder("chanxian")
    public void chanXianBinder(WebDataBinder webDataBinder){
        webDataBinder.setFieldDefaultPrefix("chanxian.");
    }







}
