package com.yunku.demo.common.baseclass;

import java.io.Serializable;

/**
 * 公共基本类
 *
 * @author Jeddden
 * @create 2019-06-13 19:55
 */
public class SuperEntity implements Serializable {

    protected int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
