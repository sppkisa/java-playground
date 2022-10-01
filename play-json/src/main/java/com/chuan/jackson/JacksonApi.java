package com.chuan.jackson;

import com.chuan.JsonApi;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author xucy-e
 */
public class JacksonApi implements JsonApi<JacksonBean> {
    @Override
    public String bean2Json(JacksonBean bean) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(bean);
    }

    @Override
    public JacksonBean json2Bean(String json) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(json, JacksonBean.class);
    }
}
