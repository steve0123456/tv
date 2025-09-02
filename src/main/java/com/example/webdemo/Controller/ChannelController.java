package com.example.webdemo.Controller;

import com.example.webdemo.dto.ChannelDto;
import com.example.webdemo.mapper.ChannelMapper;
import com.example.webdemo.model.Channel;
import com.example.webdemo.util.M3uParser;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/channels")
public class ChannelController {

    @GetMapping
    public List<ChannelDto> getChannel() throws Exception {
        // Load channels.json from resources
        List<Channel> channels = M3uParser.parse("channels.json");

        // Convert Channel -> ChannelDto
        return channels.stream()
                .map(ChannelMapper::toDto)
                .collect(Collectors.toUnmodifiableList());
    }
}
