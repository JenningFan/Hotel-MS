package gdut.cs7.fzn.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class User implements Serializable {
    private Integer jobNum;

    private String user;

    private String password;

    private static final long serialVersionUID = 1L;

    public Integer getJobNum() {
        return jobNum;
    }

    public void setJobNum(Integer jobNum) {
        this.jobNum = jobNum;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}