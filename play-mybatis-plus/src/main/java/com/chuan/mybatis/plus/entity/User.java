package com.chuan.mybatis.plus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
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
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private Integer age;
    private String email;
    @TableField("user_qr_code")
    private String userQRCode;
}
