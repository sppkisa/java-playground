package com.chuan.gson;

import com.chuan.JsonApi;
import com.google.gson.Gson;

/**
 * @author xucy-e
 */
public class GsonApi implements JsonApi<GsonBean> {
    @Override
    public String bean2Json(GsonBean bean) {
        Gson gson = new Gson();
        return gson.toJson(bean);
    }

    @Override
    public GsonBean json2Bean(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, GsonBean.class);
    }
}
