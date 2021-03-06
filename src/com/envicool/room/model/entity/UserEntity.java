package com.envicool.room.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_user")
public class UserEntity extends BaseEntity {

    private static final long serialVersionUID = -1892443123862589773L;

    //登录名
    @Column(name="login_name")
    private String login;
    
    //显示名
    @Column(name="display_name")
    private String display;
    
    //密码
    @Column(name="login_pswd")
    private String password;
    
    //所属公司
    @Column(name="user_company")
    private String company;
    
    //手机号
    @Column(name="user_cell")
    private String cell;
    
    //邮箱
    @Column(name="user_email")
    private String email;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
