package com.example.webdemo.dto;

public class ChannelDto {
    private long id;
    private String name;
    private String Streamurl;

    public ChannelDto(long id,String name,String Streamurl){
        this.id = id;
        this.Streamurl = Streamurl;
        this.name = name;
    }

    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getStreamurl(){
        return Streamurl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStreamurl(String Streamurl) {
        this.Streamurl = Streamurl;
    }

    public void setId(long id) {
        this.id = id;
    }
}
