/*
 * This file is generated by jOOQ.
 */
package com.example.boot.data.database.jooq.tables.records;


import com.example.boot.data.database.jooq.tables.SystemConfig;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SystemConfigRecord extends UpdatableRecordImpl<SystemConfigRecord> implements Record8<Long, String, LocalDateTime, Integer, String, LocalDateTime, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>physical_examination_system.system_config.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>physical_examination_system.system_config.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>physical_examination_system.system_config.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>physical_examination_system.system_config.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(1);
    }

    /**
     * Setter for <code>physical_examination_system.system_config.created_date</code>.
     */
    public void setCreatedDate(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>physical_examination_system.system_config.created_date</code>.
     */
    public LocalDateTime getCreatedDate() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>physical_examination_system.system_config.is_deleted</code>.
     */
    public void setIsDeleted(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>physical_examination_system.system_config.is_deleted</code>.
     */
    public Integer getIsDeleted() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>physical_examination_system.system_config.modified_by</code>.
     */
    public void setModifiedBy(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>physical_examination_system.system_config.modified_by</code>.
     */
    public String getModifiedBy() {
        return (String) get(4);
    }

    /**
     * Setter for <code>physical_examination_system.system_config.modified_date</code>.
     */
    public void setModifiedDate(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>physical_examination_system.system_config.modified_date</code>.
     */
    public LocalDateTime getModifiedDate() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>physical_examination_system.system_config.name</code>.
     */
    public void setName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>physical_examination_system.system_config.name</code>.
     */
    public String getName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>physical_examination_system.system_config.value</code>.
     */
    public void setValue(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>physical_examination_system.system_config.value</code>.
     */
    public String getValue() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, String, LocalDateTime, Integer, String, LocalDateTime, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Long, String, LocalDateTime, Integer, String, LocalDateTime, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return SystemConfig.SYSTEM_CONFIG.ID;
    }

    @Override
    public Field<String> field2() {
        return SystemConfig.SYSTEM_CONFIG.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return SystemConfig.SYSTEM_CONFIG.CREATED_DATE;
    }

    @Override
    public Field<Integer> field4() {
        return SystemConfig.SYSTEM_CONFIG.IS_DELETED;
    }

    @Override
    public Field<String> field5() {
        return SystemConfig.SYSTEM_CONFIG.MODIFIED_BY;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return SystemConfig.SYSTEM_CONFIG.MODIFIED_DATE;
    }

    @Override
    public Field<String> field7() {
        return SystemConfig.SYSTEM_CONFIG.NAME;
    }

    @Override
    public Field<String> field8() {
        return SystemConfig.SYSTEM_CONFIG.VALUE;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component3() {
        return getCreatedDate();
    }

    @Override
    public Integer component4() {
        return getIsDeleted();
    }

    @Override
    public String component5() {
        return getModifiedBy();
    }

    @Override
    public LocalDateTime component6() {
        return getModifiedDate();
    }

    @Override
    public String component7() {
        return getName();
    }

    @Override
    public String component8() {
        return getValue();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value3() {
        return getCreatedDate();
    }

    @Override
    public Integer value4() {
        return getIsDeleted();
    }

    @Override
    public String value5() {
        return getModifiedBy();
    }

    @Override
    public LocalDateTime value6() {
        return getModifiedDate();
    }

    @Override
    public String value7() {
        return getName();
    }

    @Override
    public String value8() {
        return getValue();
    }

    @Override
    public SystemConfigRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public SystemConfigRecord value2(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public SystemConfigRecord value3(LocalDateTime value) {
        setCreatedDate(value);
        return this;
    }

    @Override
    public SystemConfigRecord value4(Integer value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public SystemConfigRecord value5(String value) {
        setModifiedBy(value);
        return this;
    }

    @Override
    public SystemConfigRecord value6(LocalDateTime value) {
        setModifiedDate(value);
        return this;
    }

    @Override
    public SystemConfigRecord value7(String value) {
        setName(value);
        return this;
    }

    @Override
    public SystemConfigRecord value8(String value) {
        setValue(value);
        return this;
    }

    @Override
    public SystemConfigRecord values(Long value1, String value2, LocalDateTime value3, Integer value4, String value5, LocalDateTime value6, String value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SystemConfigRecord
     */
    public SystemConfigRecord() {
        super(SystemConfig.SYSTEM_CONFIG);
    }

    /**
     * Create a detached, initialised SystemConfigRecord
     */
    public SystemConfigRecord(Long id, String createdBy, LocalDateTime createdDate, Integer isDeleted, String modifiedBy, LocalDateTime modifiedDate, String name, String value) {
        super(SystemConfig.SYSTEM_CONFIG);

        setId(id);
        setCreatedBy(createdBy);
        setCreatedDate(createdDate);
        setIsDeleted(isDeleted);
        setModifiedBy(modifiedBy);
        setModifiedDate(modifiedDate);
        setName(name);
        setValue(value);
    }
}
