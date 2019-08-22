package com.yunku.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Jeddden
 * @create 2019-08-16 12:00
 */
@Component
@ConfigurationProperties(prefix = "iot")
public class IotConfig {

    private String bridgeUrl;

    public String getBridgeUrl() {
        return bridgeUrl;
    }

    public void setBridgeUrl(String bridgeUrl) {
        this.bridgeUrl = bridgeUrl;
    }
}
