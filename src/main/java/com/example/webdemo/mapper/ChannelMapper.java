package com.example.webdemo.mapper;

import com.example.webdemo.dto.ChannelDto;
import com.example.webdemo.model.Channel;

public class ChannelMapper {
    public static ChannelDto toDto(Channel channel){
        return new ChannelDto(channel.getId(), channel.getName(), channel.getUrl());
    }
}
