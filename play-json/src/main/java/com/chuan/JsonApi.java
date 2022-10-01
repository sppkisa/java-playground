package com.chuan;

import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * @author xucy-e
 */
public interface JsonApi<T extends BaseBean> {
    String bean2Json(T bean) throws JsonProcessingException;

    T json2Bean(String json) throws JsonProcessingException;
}
