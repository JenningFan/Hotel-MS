package gdut.cs7.fzn.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class Order implements Serializable {
    private Integer phoneNum;

    private String name;

    private String type;

    private String date;

    private static final long serialVersionUID = 1L;

    public Integer getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Integer phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}