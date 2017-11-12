package gdut.cs7.fzn.dao;

import gdut.cs7.fzn.pojo.User;
import gdut.cs7.fzn.pojo.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer jobNum);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);
    
    //添加获取用户模型的方法
    User selectByUserName(String user);

    User selectByPrimaryKey(Integer jobNum);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}