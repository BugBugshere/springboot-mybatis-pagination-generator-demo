package com.example.demo.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * groups
 * @author 
 */
@Data
public class Groups implements Serializable {
    /**
     * id
     */
    private String id;

    /**
     * 用户组父id
     */
    private String parentId;

    /**
     * 用户组名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 是否已删除Y：已删除，N：未删除
     */
    private String deleted;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 更新时间
     */
    private Date updatedTime;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 更新人
     */
    private String updatedBy;

    private static final long serialVersionUID = 1L;
}