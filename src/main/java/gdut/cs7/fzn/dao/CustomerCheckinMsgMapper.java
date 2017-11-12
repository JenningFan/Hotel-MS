package gdut.cs7.fzn.dao;

import gdut.cs7.fzn.pojo.CustomerCheckinMsg;
import gdut.cs7.fzn.pojo.CustomerCheckinMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerCheckinMsgMapper {
    long countByExample(CustomerCheckinMsgExample example);

    int deleteByExample(CustomerCheckinMsgExample example);

    int deleteByPrimaryKey(Integer idNum);
    
    //新增根据房号删除记录
    int deleteByRoomNum(Integer roomNum);

    int insert(CustomerCheckinMsg record);
    
    //自己添加的insert方法
    int insertV2(CustomerCheckinMsg record);

    int insertSelective(CustomerCheckinMsg record);

    List<CustomerCheckinMsg> selectByExample(CustomerCheckinMsgExample example);

    CustomerCheckinMsg selectByPrimaryKey(Integer idNum);

    int updateByExampleSelective(@Param("record") CustomerCheckinMsg record, @Param("example") CustomerCheckinMsgExample example);

    int updateByExample(@Param("record") CustomerCheckinMsg record, @Param("example") CustomerCheckinMsgExample example);

    int updateByPrimaryKeySelective(CustomerCheckinMsg record);

    int updateByPrimaryKey(CustomerCheckinMsg record);
    
    int updateRoom(@Param("oldRoom") Integer oldRoom, @Param("newRoom") Integer newRoom, @Param("name") String name);
}