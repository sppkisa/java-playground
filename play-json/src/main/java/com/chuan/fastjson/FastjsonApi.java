package com.chuan.fastjson;

import com.alibaba.fastjson.JSONObject;
import com.chuan.JsonApi;

/**
 * @author xucy-e
 */
public class FastjsonApi implements JsonApi<FastjsonBean> {

    @Override
    public String bean2Json(FastjsonBean bean) {
        return JSONObject.toJSONString(bean);
    }

    @Override
    public FastjsonBean json2Bean(String json) {
        return JSONObject.parseObject(json, FastjsonBean.class);
    }
}
