/*
 * This file is generated by jOOQ.
 */
package com.example.boot.data.database.jooq.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * 团队分组信息
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TeamGroupInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    private String        createdBy;
    private String        modifiedBy;
    private Integer       isDeleted;
    private Long          customerId;
    private String        customerName;
    private String        code;
    private String        name;
    private Integer       groupCode;
    private Long          mealId;
    private Long          patientId;

    public TeamGroupInfo() {}

    public TeamGroupInfo(TeamGroupInfo value) {
        this.id = value.id;
        this.createdDate = value.createdDate;
        this.modifiedDate = value.modifiedDate;
        this.createdBy = value.createdBy;
        this.modifiedBy = value.modifiedBy;
        this.isDeleted = value.isDeleted;
        this.customerId = value.customerId;
        this.customerName = value.customerName;
        this.code = value.code;
        this.name = value.name;
        this.groupCode = value.groupCode;
        this.mealId = value.mealId;
        this.patientId = value.patientId;
    }

    public TeamGroupInfo(
        Long          id,
        LocalDateTime createdDate,
        LocalDateTime modifiedDate,
        String        createdBy,
        String        modifiedBy,
        Integer       isDeleted,
        Long          customerId,
        String        customerName,
        String        code,
        String        name,
        Integer       groupCode,
        Long          mealId,
        Long          patientId
    ) {
        this.id = id;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
        this.isDeleted = isDeleted;
        this.customerId = customerId;
        this.customerName = customerName;
        this.code = code;
        this.name = name;
        this.groupCode = groupCode;
        this.mealId = mealId;
        this.patientId = patientId;
    }

    /**
     * Getter for <code>physical_examination_system.team_group_info.id</code>. id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>physical_examination_system.team_group_info.id</code>. id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>physical_examination_system.team_group_info.created_date</code>. createdDate
     */
    public LocalDateTime getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for <code>physical_examination_system.team_group_info.created_date</code>. createdDate
     */
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Getter for <code>physical_examination_system.team_group_info.modified_date</code>. modifiedDate
     */
    public LocalDateTime getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for <code>physical_examination_system.team_group_info.modified_date</code>. modifiedDate
     */
    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * Getter for <code>physical_examination_system.team_group_info.created_by</code>. createdBy
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>physical_examination_system.team_group_info.created_by</code>. createdBy
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Getter for <code>physical_examination_system.team_group_info.modified_by</code>. modifiedBy
     */
    public String getModifiedBy() {
        return this.modifiedBy;
    }

    /**
     * Setter for <code>physical_examination_system.team_group_info.modified_by</code>. modifiedBy
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * Getter for <code>physical_examination_system.team_group_info.is_deleted</code>. isDeleted
     */
    public Integer getIsDeleted() {
        return this.isDeleted;
    }

    /**
     * Setter for <code>physical_examination_system.team_group_info.is_deleted</code>. isDeleted
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * Getter for <code>physical_examination_system.team_group_info.customer_id</code>. 客户ID
     */
    public Long getCustomerId() {
        return this.customerId;
    }

    /**
     * Setter for <code>physical_examination_system.team_group_info.customer_id</code>. 客户ID
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    /**
     * Getter for <code>physical_examination_system.team_group_info.customer_name</code>. 客户名称
     */
    public String getCustomerName() {
        return this.customerName;
    }

    /**
     * Setter for <code>physical_examination_system.team_group_info.customer_name</code>. 客户名称
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * Getter for <code>physical_examination_system.team_group_info.code</code>. 团队编号
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>physical_examination_system.team_group_info.code</code>. 团队编号
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for <code>physical_examination_system.team_group_info.name</code>. 团队名称
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>physical_examination_system.team_group_info.name</code>. 团队名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>physical_examination_system.team_group_info.group_code</code>. 分组编号
     */
    public Integer getGroupCode() {
        return this.groupCode;
    }

    /**
     * Setter for <code>physical_examination_system.team_group_info.group_code</code>. 分组编号
     */
    public void setGroupCode(Integer groupCode) {
        this.groupCode = groupCode;
    }

    /**
     * Getter for <code>physical_examination_system.team_group_info.meal_id</code>. 套餐ID
     */
    public Long getMealId() {
        return this.mealId;
    }

    /**
     * Setter for <code>physical_examination_system.team_group_info.meal_id</code>. 套餐ID
     */
    public void setMealId(Long mealId) {
        this.mealId = mealId;
    }

    /**
     * Getter for <code>physical_examination_system.team_group_info.patient_id</code>. 体检人ID
     */
    public Long getPatientId() {
        return this.patientId;
    }

    /**
     * Setter for <code>physical_examination_system.team_group_info.patient_id</code>. 体检人ID
     */
    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TeamGroupInfo (");

        sb.append(id);
        sb.append(", ").append(createdDate);
        sb.append(", ").append(modifiedDate);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(modifiedBy);
        sb.append(", ").append(isDeleted);
        sb.append(", ").append(customerId);
        sb.append(", ").append(customerName);
        sb.append(", ").append(code);
        sb.append(", ").append(name);
        sb.append(", ").append(groupCode);
        sb.append(", ").append(mealId);
        sb.append(", ").append(patientId);

        sb.append(")");
        return sb.toString();
    }
}