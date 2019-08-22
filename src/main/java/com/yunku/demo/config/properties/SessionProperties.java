package com.yunku.demo.config.properties;

/**
 * @author Jeddden
 * @create 2019-08-16 17:14
 */
public class SessionProperties {

    private String keyName = "token";

    private Integer expriationTime = 600;

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public Integer getExpriationTime() {
        return expriationTime;
    }

    public void setExpriationTime(Integer expriationTime) {
        this.expriationTime = expriationTime;
    }
}
