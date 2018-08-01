package com.kaisagroup.baoxian.mapper;

import com.kaisagroup.baoxian.entity.User;

import java.util.List;

/**
 * 创建人：thj
 * 创建时间： 2018/6/26 9:28
 * 用途：
 */

//@Repository
public interface UserMapper {

   // @Select("SELECT * FROM USER WHERE id = #{id}")
   User getUserById(Integer id);

   // @Select("SELECT * FROM USER")
    public List<User> getUserList(String name,int page, int limit);

   // @Insert("insert into USER(name, age) values(#{username}, #{age})")
    public int add(User user);

   // @Update("UPDATE USER SET name = #{user.name} , age = #{user.age} WHERE id = #{id}")
   public int update(User user);

   // @Delete("DELETE FROM USER WHERE id = #{id} ")
    public int delete(Integer id);


    int getUserCount();
}