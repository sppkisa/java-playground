package com.chuan;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author xucy-e
 */
@EqualsAndHashCode
@Data
public abstract class BaseBean {
    protected int id;

    protected float ratio;

    protected BigDecimal money;

    protected String name;

    protected boolean flag;

    protected List<String> regions;

    abstract public void setSelfFields();

    public static <T extends BaseBean> T buildSampleBean(T t) {
        t.setId(10086);
        t.setRatio(3.1415926f);
        t.setMoney(new BigDecimal("2.718"));
        t.setName("play-json");
        t.setFlag(false);
        t.setRegions(Stream.of("河南省", "陕西省", "四川省").collect(Collectors.toList()));
        t.setSelfFields();
        return t;
    }
}
