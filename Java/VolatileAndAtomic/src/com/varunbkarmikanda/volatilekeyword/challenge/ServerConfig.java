package com.varunbkarmikanda.volatilekeyword.challenge;

public class ServerConfig {
    private final String URL;

    private final int timeout;

    public ServerConfig(String URL, int timeout){
        this.URL = URL;
        this.timeout = timeout;
    }

    public String getURL(){
        return URL;
    }
}
