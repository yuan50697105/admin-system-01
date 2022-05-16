/*
 * This file is generated by jOOQ.
 */
package com.example.boot.data.database.jooq.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SystemPositionUserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private String        createdBy;
    private LocalDateTime createdDate;
    private Integer       isDeleted;
    private String        modifiedBy;
    private LocalDateTime modifiedDate;
    private Long          positionId;
    private Long          userId;

    public SystemPositionUserInfo() {}

    public SystemPositionUserInfo(SystemPositionUserInfo value) {
        this.id = value.id;
        this.createdBy = value.createdBy;
        this.createdDate = value.createdDate;
        this.isDeleted = value.isDeleted;
        this.modifiedBy = value.modifiedBy;
        this.modifiedDate = value.modifiedDate;
        this.positionId = value.positionId;
        this.userId = value.userId;
    }

    public SystemPositionUserInfo(
        Long          id,
        String        createdBy,
        LocalDateTime createdDate,
        Integer       isDeleted,
        String        modifiedBy,
        LocalDateTime modifiedDate,
        Long          positionId,
        Long          userId
    ) {
        this.id = id;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.isDeleted = isDeleted;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
        this.positionId = positionId;
        this.userId = userId;
    }

    /**
     * Getter for <code>physical_examination_system.system_position_user_info.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>physical_examination_system.system_position_user_info.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>physical_examination_system.system_position_user_info.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>physical_examination_system.system_position_user_info.created_by</code>.
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Getter for <code>physical_examination_system.system_position_user_info.created_date</code>.
     */
    public LocalDateTime getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for <code>physical_examination_system.system_position_user_info.created_date</code>.
     */
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Getter for <code>physical_examination_system.system_position_user_info.is_deleted</code>.
     */
    public Integer getIsDeleted() {
        return this.isDeleted;
    }

    /**
     * Setter for <code>physical_examination_system.system_position_user_info.is_deleted</code>.
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * Getter for <code>physical_examination_system.system_position_user_info.modified_by</code>.
     */
    public String getModifiedBy() {
        return this.modifiedBy;
    }

    /**
     * Setter for <code>physical_examination_system.system_position_user_info.modified_by</code>.
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * Getter for <code>physical_examination_system.system_position_user_info.modified_date</code>.
     */
    public LocalDateTime getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for <code>physical_examination_system.system_position_user_info.modified_date</code>.
     */
    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * Getter for <code>physical_examination_system.system_position_user_info.position_id</code>.
     */
    public Long getPositionId() {
        return this.positionId;
    }

    /**
     * Setter for <code>physical_examination_system.system_position_user_info.position_id</code>.
     */
    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    /**
     * Getter for <code>physical_examination_system.system_position_user_info.user_id</code>.
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>physical_examination_system.system_position_user_info.user_id</code>.
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SystemPositionUserInfo (");

        sb.append(id);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdDate);
        sb.append(", ").append(isDeleted);
        sb.append(", ").append(modifiedBy);
        sb.append(", ").append(modifiedDate);
        sb.append(", ").append(positionId);
        sb.append(", ").append(userId);

        sb.append(")");
        return sb.toString();
    }
}