package com.example.webdemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Channel {
    private long id;
    private String name;

    @JsonProperty("url")
    private String url;

    public Channel(long id,String name,String url){
        this.name = name;
        this.url = url;
        this.id = id;
    }

    public Channel(String name,String url){
        this.name= name;
        this.url = url;
    }

    public Channel(){}

    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl(){
        return url;
    }
}
