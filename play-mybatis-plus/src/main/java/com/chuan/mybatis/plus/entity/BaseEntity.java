package com.chuan.mybatis.plus.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author xucy-e
 */
@Data
public class BaseEntity {
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    protected LocalDateTime createTime;
    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    protected LocalDateTime updateTime;
}
