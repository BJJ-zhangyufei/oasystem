package com.oasystem.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by zyf on 2018/10/16.
 */
@Entity
@Table(name="user")
public class User implements Serializable {
    private static final long serialVersionUID = -202473586475569831L;

    @Id
    @Column(columnDefinition="int(4)")
    @GeneratedValue
    private int Id;

    @Column(name="UserName",length=20,nullable=false)
    private String UserName;

    @Column(name="LoginName",length=20,nullable=false)
    private String LoginName;

    @Column(name="LoginPwd",length=20,nullable=false)
    private String LoginPwd;

    @Column(name="Role",length=20,nullable=false)
    private int Role;

    public User() {
        super();
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = Id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getLogginName() {
        return LoginName;
    }

    public void setLogginName(String logginName) {
        LoginName = logginName;
    }

    public String getLogginPwd() {
        return LoginPwd;
    }

    public void setLogginPwd(String logginPwd) {
        LoginPwd = logginPwd;
    }

    public int getRole() {
        return Role;
    }

    public void setRole(int role) {
        Role = role;
    }

}
