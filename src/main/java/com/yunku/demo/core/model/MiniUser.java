package com.yunku.demo.core.model;

import java.io.Serializable;

/**
 * 照顾前端传值困难所创间的modul
 *
 * @author Jeddden
 * @create 2019-08-19 19:42
 */
public class MiniUser implements Serializable {
    static final long serialVersionUID = 1L;
    String loginname;
    String password;
    String code;

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
