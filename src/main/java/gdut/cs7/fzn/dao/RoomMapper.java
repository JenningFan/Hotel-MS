package gdut.cs7.fzn.dao;

import gdut.cs7.fzn.pojo.Room;
import gdut.cs7.fzn.pojo.RoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomMapper {
    long countByExample(RoomExample example);

    int deleteByExample(RoomExample example);

    int deleteByPrimaryKey(Integer roomNum);

    int insert(Room record);

    int insertSelective(Room record);

    List<Room> selectByExample(RoomExample example);

    Room selectByPrimaryKey(Integer roomNum);

    int updateByExampleSelective(@Param("record") Room record, @Param("example") RoomExample example);

    int updateByExample(@Param("record") Room record, @Param("example") RoomExample example);

    int updateByPrimaryKeySelective(Room record);

    int updateByPrimaryKey(Room record);
    
    //随机为客户安排指定类型的房间
    int setRoomOrderd(String type);
    //更改房间入住状态
    int updateIsEmpty(@Param("flag") Integer flag, @Param("roomNum") Integer roomNum);
    //更新房间预订状态
    int updateIsOrder(@Param("flag") Integer flag, @Param("roomNum") Integer roomNum);  
}