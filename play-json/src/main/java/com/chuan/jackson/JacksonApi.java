package com.chuan.jackson;

import com.chuan.JsonApi;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

/**
 * @author xucy-e
 */
public class JacksonApi implements JsonApi<JacksonBean> {
    @SneakyThrows
    @Override
    public String bean2Json(JacksonBean bean) {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(bean);
    }

    @SneakyThrows
    @Override
    public JacksonBean json2Bean(String json) {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(json, JacksonBean.class);
    }
}
