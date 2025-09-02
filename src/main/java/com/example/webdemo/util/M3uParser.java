package com.example.webdemo.util;

import com.example.webdemo.model.Channel;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class M3uParser {
    public static List<Channel> parse(String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        // Load from resources (src/main/resources)
        InputStream inputStream = JsonParser.class.getResourceAsStream("/" + fileName);
        if (inputStream == null) {
            throw new IOException("File not found: " + fileName);
        }

        return mapper.readValue(inputStream, new TypeReference<List<Channel>>() {});
    }
}
