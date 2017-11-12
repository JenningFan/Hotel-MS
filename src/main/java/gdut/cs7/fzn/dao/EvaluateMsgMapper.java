package gdut.cs7.fzn.dao;

import gdut.cs7.fzn.pojo.EvaluateMsg;
import gdut.cs7.fzn.pojo.EvaluateMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EvaluateMsgMapper {
    long countByExample(EvaluateMsgExample example);

    int deleteByExample(EvaluateMsgExample example);

    int deleteByPrimaryKey(String name);

    int insert(EvaluateMsg record);
    
    int insertV2(EvaluateMsg record);

    int insertSelective(EvaluateMsg record);

    List<EvaluateMsg> selectByExample(EvaluateMsgExample example);

    EvaluateMsg selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") EvaluateMsg record, @Param("example") EvaluateMsgExample example);

    int updateByExample(@Param("record") EvaluateMsg record, @Param("example") EvaluateMsgExample example);

    int updateByPrimaryKeySelective(EvaluateMsg record);

    int updateByPrimaryKey(EvaluateMsg record);
}