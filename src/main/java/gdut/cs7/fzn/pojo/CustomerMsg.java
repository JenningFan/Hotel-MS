package gdut.cs7.fzn.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class CustomerMsg implements Serializable {
    private Integer idNum;

    private String name;

    private String sex;

    private Integer phoneNum;

    private static final long serialVersionUID = 1L;

    public Integer getIdNum() {
        return idNum;
    }

    public void setIdNum(Integer idNum) {
        this.idNum = idNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Integer phoneNum) {
        this.phoneNum = phoneNum;
    }
}