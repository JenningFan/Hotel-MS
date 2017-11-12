package gdut.cs7.fzn.dao;

import gdut.cs7.fzn.pojo.CustomerMsg;
import gdut.cs7.fzn.pojo.CustomerMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerMsgMapper {
    long countByExample(CustomerMsgExample example);

    int deleteByExample(CustomerMsgExample example);

    int deleteByPrimaryKey(Integer idNum);

    int insert(CustomerMsg record);

    int insertSelective(CustomerMsg record);

    List<CustomerMsg> selectByExample(CustomerMsgExample example);

    CustomerMsg selectByPrimaryKey(Integer idNum);

    int updateByExampleSelective(@Param("record") CustomerMsg record, @Param("example") CustomerMsgExample example);

    int updateByExample(@Param("record") CustomerMsg record, @Param("example") CustomerMsgExample example);

    int updateByPrimaryKeySelective(CustomerMsg record);

    int updateByPrimaryKey(CustomerMsg record);
}