package com.demo.dao.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : Gary
 * @create 2024/10/14 19:53
 */
@Data
public class BaseDO implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 逻辑删除标记  是：Y;  否：N
     * 由MP全局配置属性控制 可以为sql自动注入isDeleted=N的查询条件
     */
    private String isDeleted ;

    /**
     * 创建时间 LocalDateTime类型便于自动填充
     */
    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreated;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 最后修改时间 LocalDateTime类型便于自动填充
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmt_modified;

    /**
     * 最后修改人
     */
    private String modifier;

}
