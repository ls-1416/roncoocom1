package org.sang.entity;

import java.sql.Timestamp;
import java.util.Date;
import java.io.Serializable;

/**
 * 角色信息(SysRole)实体类
 *
 * @author makejava
 * @since 2020-05-08 22:02:24
 */
public class SysRole implements Serializable {
    @Override
    public String toString() {
        return "SysRole{" +
                "id=" + id +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", statusId=" + statusId +
                ", sort=" + sort +
                ", roleName='" + roleName + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    private static final long serialVersionUID = 848371644692913495L;
    /**
    * 主键
    */
    private Integer id;
    /**
    * 创建时间
    */
    private String gmtCreate;
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
    * 名称
    */
    private String roleName;
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

    public String getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(String gmtCreate) {
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

    public int  getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}