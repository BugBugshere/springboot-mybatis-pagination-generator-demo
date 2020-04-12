package com.example.demo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import javax.persistence.*;

@Data
@NoArgsConstructor
@Table(name = "users")
public class Users {
    /**
     * 用户id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码密文
     */
    private String password;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 用户手机
     */
    private String mobile;

    /**
     * 简介
     */
    private String description;

    /**
     * 是否已删除Y：已删除，N：未删除
     */
    private String deleted;

    /**
     * 是否有效用户
     */
    private Boolean enabled;

    /**
     * 账号是否未过期
     */
    @Column(name = "account_non_expired")
    private Boolean accountNonExpired;

    /**
     * 密码是否未过期
     */
    @Column(name = "credentials_non_expired")
    private Boolean credentialsNonExpired;

    /**
     * 是否未锁定
     */
    @Column(name = "account_non_locked")
    private Boolean accountNonLocked;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 更新时间
     */
    @Column(name = "updated_time")
    private Date updatedTime;

    /**
     * 创建人
     */
    @Column(name = "created_by")
    private String createdBy;

    /**
     * 更新人
     */
    @Column(name = "updated_by")
    private String updatedBy;

}