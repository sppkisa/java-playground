package com.chuan;

/**
 * @author xucy-e
 */
public interface JsonApi<T extends BaseBean> {
    String bean2Json(T bean);

    T json2Bean(String json);
}
