package com.chuan.fastjson;

import com.chuan.BaseBean;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author xucy-e
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class FastjsonBean extends BaseBean {

    private LocalDate localDate;

    private LocalDateTime localDateTime;

    @Override
    public void setSelfFields() {
        this.localDate = LocalDate.of(2022, 9, 30);
        this.localDateTime = LocalDateTime.of(2022, 10, 1, 1, 30, 25);
    }
}
