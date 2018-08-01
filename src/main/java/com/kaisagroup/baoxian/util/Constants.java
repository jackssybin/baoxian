package com.kaisagroup.baoxian.util;

/**
 * Created by jackssy on 2018/7/27.
 */
public class Constants {

    public final static String OPER_ADD="add";

    public final static String OPER_UPDATE="update";

    public final static String OPER_VIEW="view";

    public final static String OPER_AUDIT="audit";


    public final static String OPER_REAUDIT="reaudit";

    public final static String OPER_MAN="admin_jackssy";

    public static enum Status {
        toAudit("toAudit","待审核"), auditSuccess("auditSuccess","审核成功"), reject("reject","驳回");
        private String code;
        private String name;
        Status(String code,String name){
            this.code=code;
            this.name=name;
        }
        public static String getNameByCode(String code) {
            String value = "未知" + code;
            Status[] values = values();

            for(int i = 0; i < values.length; ++i) {
                Status status = values[i];
                if(status.code.equals(code)) {
                    value = status.name;
                    break;
                }
            }
            return value;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Status{" +
                    "code='" + code + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}

