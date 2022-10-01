package com.chuan;

import com.chuan.fastjson.FastjsonApi;
import com.chuan.fastjson.FastjsonBean;
import com.chuan.gson.GsonApi;
import com.chuan.gson.GsonBean;
import com.chuan.jackson.JacksonApi;
import com.chuan.jackson.JacksonBean;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author xucy-e
 */
public class JsonApiTest {

    private JacksonBean jacksonBean;

    private FastjsonBean fastjsonBean;

    private GsonBean gsonBean;

    @Before
    public void setBeanSample() {
        this.jacksonBean = BaseBean.buildSampleBean(new JacksonBean());
        this.fastjsonBean = BaseBean.buildSampleBean(new FastjsonBean());
        this.gsonBean = BaseBean.buildSampleBean(new GsonBean());
    }

    @Test
    public void testJackson() {
        JacksonApi jacksonApi = new JacksonApi();
        String json = jacksonApi.bean2Json(this.jacksonBean);
        BaseBean bean = jacksonApi.json2Bean(json);
        Assert.assertEquals(this.jacksonBean, bean);
        System.out.println(json);
    }

    @Test
    public void testFastjson() {
        FastjsonApi fastjsonApi = new FastjsonApi();
        String json = fastjsonApi.bean2Json(this.fastjsonBean);
        BaseBean bean = fastjsonApi.json2Bean(json);
        Assert.assertEquals(this.fastjsonBean, bean);
        System.out.println(json);
    }

    @Test
    public void testGson() {
        GsonApi gsonApi = new GsonApi();
        String json = gsonApi.bean2Json(this.gsonBean);
        GsonBean bean = gsonApi.json2Bean(json);
        Assert.assertEquals(this.gsonBean, bean);
        System.out.println(json);
    }
}
