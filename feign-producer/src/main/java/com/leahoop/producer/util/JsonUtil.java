package com.leahoop.producer.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;


@Configuration
public class JsonUtil {

    @Autowired
    private static ObjectMapper objectMapper;

    @Autowired
    public void setObjectMapper(ObjectMapper objectMapper) {
        JsonUtil.objectMapper = objectMapper;
    }

    public static String convert2String(Object o) {
        try {
            return objectMapper.writeValueAsString(o);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public static <T> T convert2Object(String str, Class<T> tClass) {
        try {
            return objectMapper.readValue(str.getBytes(StandardCharsets.UTF_8), tClass);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public static Map convertBean2Map(Object bean) {
        return objectMapper.convertValue(bean, Map.class);
    }

}
