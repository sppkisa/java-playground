package com.chuan.play.mybatis.plus.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author xucy-e
 */
@EqualsAndHashCode(callSuper = true)
@TableName
@ToString(callSuper = true)
@Data
public class User extends BaseEntity {
    @TableId
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
