package com.demo.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2024/10/14 19:52
 */
@Data
@TableName("t_bank")
public class BankDO extends BaseDO {

    private String bankId;
    private String bankName;
    private String bankDesc;
}
