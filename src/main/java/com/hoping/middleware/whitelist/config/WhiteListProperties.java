package com.hoping.middleware.whitelist.config;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties("hoping.whitelist")
public class WhiteListProperties {

    private String users;

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }
}
