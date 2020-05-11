package org.sang.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 后台用户信息(SysUser)实体类
 *
 * @author makejava
 * @since 2020-05-08 21:49:55
 */
public class SysUser implements Serializable {
    private static final long serialVersionUID = 114991161548868189L;

    @Override
    public String toString() {
        return "SysUser{" +
                "id=" + id +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", statusId=" + statusId +
                ", sort=" + sort +
                ", userNo=" + userNo +
                ", mobile='" + mobile + '\'' +
                ", realName='" + realName + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    /**
    * 主键
    */
    private Integer id;
    /**
    * 创建时间
    */
    private Date gmtCreate;
    /**
    * 修改时间
    */
    private Date gmtModified;
    /**
    * 状态(1:正常，0:禁用)
    */
    private Boolean statusId;
    /**
    * 排序
    */
    private int sort;
    /**
    * 用户编号
    */
    private Long userNo;
    /**
    * 手机
    */
    private String mobile;
    /**
    * 真实姓名
    */
    private String realName;
    /**
    * 备注
    */
    private String remark;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Boolean getStatusId() {
        return statusId;
    }

    public void setStatusId(Boolean statusId) {
        this.statusId = statusId;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public Long getUserNo() {
        return userNo;
    }

    public void setUserNo(Long userNo) {
        this.userNo = userNo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}