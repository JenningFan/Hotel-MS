package gdut.cs7.fzn.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class Room implements Serializable {
    private Integer roomNum;

    private String type;

    private Integer isEmpty;

    private Integer isOrder;

    private static final long serialVersionUID = 1L;

    public Integer getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getIsEmpty() {
        return isEmpty;
    }

    public void setIsEmpty(Integer isEmpty) {
        this.isEmpty = isEmpty;
    }

    public Integer getIsOrder() {
        return isOrder;
    }

    public void setIsOrder(Integer isOrder) {
        this.isOrder = isOrder;
    }
}