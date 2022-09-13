package com.chuan.datetime.fastjson;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author xucy-e
 */
public class FastJsonDateTest {
    @Test
    public void testToJson() {
        FastJsonDate fastJsonDate = new FastJsonDate();
        // Calendar calendar = Calendar.getInstance();
        // calendar.set(2022, 8, 12, 23, 30);
        // fastJsonDate.setDate(calendar.getTime());
        fastJsonDate.setDate(new Date("September 12, 2022 00:15:34"));
        fastJsonDate.setLocalDateTime(LocalDateTime.of(2022, 9, 12, 0, 15, 34));
        fastJsonDate.setLocalDate(LocalDate.of(2022, 9, 12));
        System.out.println(JSON.toJSONString(fastJsonDate));
    }
}
