package com.chuan;

import com.chuan.fastjson.FastjsonApi;
import com.chuan.fastjson.FastjsonBean;
import com.chuan.jackson.JacksonApi;
import com.chuan.jackson.JacksonBean;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author xucy-e
 */
public class JsonApiTest {

    private JacksonBean jacksonBean;

    private FastjsonBean fastjsonBean;

    @Before
    public void setBeanSample() {
        this.jacksonBean = BaseBean.buildSampleBean(new JacksonBean());
        this.fastjsonBean = BaseBean.buildSampleBean(new FastjsonBean());
    }

    @Test
    public void testJackson() throws JsonProcessingException {
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
}
