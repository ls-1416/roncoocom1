package org.sang.util;

import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;
import java.util.Date;

public class CourseVo implements Serializable {
    /**
     * 主键
     */
    @Field("id")
    private Long id;
    /**
     * 创建时间
     */
    @Field("gmtCreate")
    private Date gmtCreate;
    /**
     * 修改时间
     */
    @Field("gmtModified")
    private Date gmtModified;
    /**
     * 状态(1:正常，0:禁用)
     */
    @Field("statusId")
    private Boolean statusId;
    /**
     * 排序
     */
    @Field("sort")
    private Integer sort;
    /**
     * 讲师用户编码
     */
    @Field("lecturerUserNo")
    private Long lecturerUserNo;
    /**
     * 一级分类ID
     */
    @Field("categoryId1")
    private Long categoryId1;
    /**
     * 二级分类ID
     */
    @Field("categoryId2")
    private Long categoryId2;
    /**
     * 三级分类ID
     */
    @Field("categoryId3")
    private Long categoryId3;
    /**
     * 课程名称
     */
    @Field("courseName")
    private String courseName;
    /**
     * 课程封面
     */
    @Field("courseLogo")
    private String courseLogo;
    /**
     * 课程介绍ID
     */
    @Field("introduceId")
    private Long introduceId;
    /**
     * 是否免费：1免费，0收费
     */
    @Field("isFree")
    private Boolean isFree;
    /**
     * 原价
     */
    @Field("courseOriginal")
    private Double courseOriginal;
    /**
     * 优惠价
     */
    @Field("courseDiscount")
    private Double courseDiscount;
    /**
     * 是否上架(1:上架，0:下架)
     */
    @Field("isPutaway")
    private Boolean isPutaway;
    /**
     * 课程排序(前端显示使用)
     */
    @Field("courseSort")
    private Integer courseSort;
    /**
     * 购买人数
     */
    @Field("countBuy")
    private Integer countBuy;
    /**
     * 学习人数
     */
    @Field("countStudy")
    private Integer countStudy;
    /**
     * 总课时数
     */
    @Field("periodTotal")
    private Integer periodTotal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Long getLecturerUserNo() {
        return lecturerUserNo;
    }

    public void setLecturerUserNo(Long lecturerUserNo) {
        this.lecturerUserNo = lecturerUserNo;
    }

    public Long getCategoryId1() {
        return categoryId1;
    }

    public void setCategoryId1(Long categoryId1) {
        this.categoryId1 = categoryId1;
    }

    public Long getCategoryId2() {
        return categoryId2;
    }

    public void setCategoryId2(Long categoryId2) {
        this.categoryId2 = categoryId2;
    }

    public Long getCategoryId3() {
        return categoryId3;
    }

    public void setCategoryId3(Long categoryId3) {
        this.categoryId3 = categoryId3;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseLogo() {
        return courseLogo;
    }

    public void setCourseLogo(String courseLogo) {
        this.courseLogo = courseLogo;
    }

    public Long getIntroduceId() {
        return introduceId;
    }

    public void setIntroduceId(Long introduceId) {
        this.introduceId = introduceId;
    }

    public Boolean getFree() {
        return isFree;
    }

    public void setFree(Boolean free) {
        isFree = free;
    }

    public Double getCourseOriginal() {
        return courseOriginal;
    }

    public void setCourseOriginal(Double courseOriginal) {
        this.courseOriginal = courseOriginal;
    }

    public Double getCourseDiscount() {
        return courseDiscount;
    }

    public void setCourseDiscount(Double courseDiscount) {
        this.courseDiscount = courseDiscount;
    }

    public Boolean getPutaway() {
        return isPutaway;
    }

    public void setPutaway(Boolean putaway) {
        isPutaway = putaway;
    }

    public Integer getCourseSort() {
        return courseSort;
    }

    public void setCourseSort(Integer courseSort) {
        this.courseSort = courseSort;
    }

    public Integer getCountBuy() {
        return countBuy;
    }

    public void setCountBuy(Integer countBuy) {
        this.countBuy = countBuy;
    }

    public Integer getCountStudy() {
        return countStudy;
    }

    public void setCountStudy(Integer countStudy) {
        this.countStudy = countStudy;
    }

    public Integer getPeriodTotal() {
        return periodTotal;
    }

    public void setPeriodTotal(Integer periodTotal) {
        this.periodTotal = periodTotal;
    }
}
