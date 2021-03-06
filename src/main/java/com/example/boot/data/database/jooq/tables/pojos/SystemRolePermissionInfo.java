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
public class SystemRolePermissionInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private String        createdBy;
    private LocalDateTime createdDate;
    private Integer       isDeleted;
    private String        modifiedBy;
    private LocalDateTime modifiedDate;
    private Long          permissionId;
    private Long          roleId;

    public SystemRolePermissionInfo() {}

    public SystemRolePermissionInfo(SystemRolePermissionInfo value) {
        this.id = value.id;
        this.createdBy = value.createdBy;
        this.createdDate = value.createdDate;
        this.isDeleted = value.isDeleted;
        this.modifiedBy = value.modifiedBy;
        this.modifiedDate = value.modifiedDate;
        this.permissionId = value.permissionId;
        this.roleId = value.roleId;
    }

    public SystemRolePermissionInfo(
        Long          id,
        String        createdBy,
        LocalDateTime createdDate,
        Integer       isDeleted,
        String        modifiedBy,
        LocalDateTime modifiedDate,
        Long          permissionId,
        Long          roleId
    ) {
        this.id = id;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.isDeleted = isDeleted;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
        this.permissionId = permissionId;
        this.roleId = roleId;
    }

    /**
     * Getter for <code>physical_examination_system.system_role_permission_info.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>physical_examination_system.system_role_permission_info.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>physical_examination_system.system_role_permission_info.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>physical_examination_system.system_role_permission_info.created_by</code>.
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Getter for <code>physical_examination_system.system_role_permission_info.created_date</code>.
     */
    public LocalDateTime getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for <code>physical_examination_system.system_role_permission_info.created_date</code>.
     */
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Getter for <code>physical_examination_system.system_role_permission_info.is_deleted</code>.
     */
    public Integer getIsDeleted() {
        return this.isDeleted;
    }

    /**
     * Setter for <code>physical_examination_system.system_role_permission_info.is_deleted</code>.
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * Getter for <code>physical_examination_system.system_role_permission_info.modified_by</code>.
     */
    public String getModifiedBy() {
        return this.modifiedBy;
    }

    /**
     * Setter for <code>physical_examination_system.system_role_permission_info.modified_by</code>.
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * Getter for <code>physical_examination_system.system_role_permission_info.modified_date</code>.
     */
    public LocalDateTime getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for <code>physical_examination_system.system_role_permission_info.modified_date</code>.
     */
    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * Getter for <code>physical_examination_system.system_role_permission_info.permission_id</code>.
     */
    public Long getPermissionId() {
        return this.permissionId;
    }

    /**
     * Setter for <code>physical_examination_system.system_role_permission_info.permission_id</code>.
     */
    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * Getter for <code>physical_examination_system.system_role_permission_info.role_id</code>.
     */
    public Long getRoleId() {
        return this.roleId;
    }

    /**
     * Setter for <code>physical_examination_system.system_role_permission_info.role_id</code>.
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SystemRolePermissionInfo (");

        sb.append(id);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdDate);
        sb.append(", ").append(isDeleted);
        sb.append(", ").append(modifiedBy);
        sb.append(", ").append(modifiedDate);
        sb.append(", ").append(permissionId);
        sb.append(", ").append(roleId);

        sb.append(")");
        return sb.toString();
    }
}
