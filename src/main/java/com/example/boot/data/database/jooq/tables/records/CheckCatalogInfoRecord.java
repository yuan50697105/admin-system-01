/*
 * This file is generated by jOOQ.
 */
package com.example.boot.data.database.jooq.tables.records;


import com.example.boot.data.database.jooq.tables.CheckCatalogInfo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 检查项目目录信息
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CheckCatalogInfoRecord extends UpdatableRecordImpl<CheckCatalogInfoRecord> implements Record11<Long, String, String, LocalDateTime, Integer, String, String, LocalDateTime, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>physical_examination_system.check_catalog_info.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>physical_examination_system.check_catalog_info.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>physical_examination_system.check_catalog_info.code</code>.
     */
    public void setCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>physical_examination_system.check_catalog_info.code</code>.
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>physical_examination_system.check_catalog_info.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>physical_examination_system.check_catalog_info.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(2);
    }

    /**
     * Setter for <code>physical_examination_system.check_catalog_info.created_date</code>.
     */
    public void setCreatedDate(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>physical_examination_system.check_catalog_info.created_date</code>.
     */
    public LocalDateTime getCreatedDate() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>physical_examination_system.check_catalog_info.is_deleted</code>.
     */
    public void setIsDeleted(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>physical_examination_system.check_catalog_info.is_deleted</code>.
     */
    public Integer getIsDeleted() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>physical_examination_system.check_catalog_info.mode</code>.
     */
    public void setMode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>physical_examination_system.check_catalog_info.mode</code>.
     */
    public String getMode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>physical_examination_system.check_catalog_info.modified_by</code>.
     */
    public void setModifiedBy(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>physical_examination_system.check_catalog_info.modified_by</code>.
     */
    public String getModifiedBy() {
        return (String) get(6);
    }

    /**
     * Setter for <code>physical_examination_system.check_catalog_info.modified_date</code>.
     */
    public void setModifiedDate(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>physical_examination_system.check_catalog_info.modified_date</code>.
     */
    public LocalDateTime getModifiedDate() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>physical_examination_system.check_catalog_info.name</code>.
     */
    public void setName(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>physical_examination_system.check_catalog_info.name</code>.
     */
    public String getName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>physical_examination_system.check_catalog_info.position</code>.
     */
    public void setPosition(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>physical_examination_system.check_catalog_info.position</code>.
     */
    public String getPosition() {
        return (String) get(9);
    }

    /**
     * Setter for <code>physical_examination_system.check_catalog_info.type</code>.
     */
    public void setType(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>physical_examination_system.check_catalog_info.type</code>.
     */
    public String getType() {
        return (String) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, String, String, LocalDateTime, Integer, String, String, LocalDateTime, String, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Long, String, String, LocalDateTime, Integer, String, String, LocalDateTime, String, String, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return CheckCatalogInfo.CHECK_CATALOG_INFO.ID;
    }

    @Override
    public Field<String> field2() {
        return CheckCatalogInfo.CHECK_CATALOG_INFO.CODE;
    }

    @Override
    public Field<String> field3() {
        return CheckCatalogInfo.CHECK_CATALOG_INFO.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return CheckCatalogInfo.CHECK_CATALOG_INFO.CREATED_DATE;
    }

    @Override
    public Field<Integer> field5() {
        return CheckCatalogInfo.CHECK_CATALOG_INFO.IS_DELETED;
    }

    @Override
    public Field<String> field6() {
        return CheckCatalogInfo.CHECK_CATALOG_INFO.MODE;
    }

    @Override
    public Field<String> field7() {
        return CheckCatalogInfo.CHECK_CATALOG_INFO.MODIFIED_BY;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return CheckCatalogInfo.CHECK_CATALOG_INFO.MODIFIED_DATE;
    }

    @Override
    public Field<String> field9() {
        return CheckCatalogInfo.CHECK_CATALOG_INFO.NAME;
    }

    @Override
    public Field<String> field10() {
        return CheckCatalogInfo.CHECK_CATALOG_INFO.POSITION;
    }

    @Override
    public Field<String> field11() {
        return CheckCatalogInfo.CHECK_CATALOG_INFO.TYPE;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getCode();
    }

    @Override
    public String component3() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component4() {
        return getCreatedDate();
    }

    @Override
    public Integer component5() {
        return getIsDeleted();
    }

    @Override
    public String component6() {
        return getMode();
    }

    @Override
    public String component7() {
        return getModifiedBy();
    }

    @Override
    public LocalDateTime component8() {
        return getModifiedDate();
    }

    @Override
    public String component9() {
        return getName();
    }

    @Override
    public String component10() {
        return getPosition();
    }

    @Override
    public String component11() {
        return getType();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getCode();
    }

    @Override
    public String value3() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value4() {
        return getCreatedDate();
    }

    @Override
    public Integer value5() {
        return getIsDeleted();
    }

    @Override
    public String value6() {
        return getMode();
    }

    @Override
    public String value7() {
        return getModifiedBy();
    }

    @Override
    public LocalDateTime value8() {
        return getModifiedDate();
    }

    @Override
    public String value9() {
        return getName();
    }

    @Override
    public String value10() {
        return getPosition();
    }

    @Override
    public String value11() {
        return getType();
    }

    @Override
    public CheckCatalogInfoRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public CheckCatalogInfoRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public CheckCatalogInfoRecord value3(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public CheckCatalogInfoRecord value4(LocalDateTime value) {
        setCreatedDate(value);
        return this;
    }

    @Override
    public CheckCatalogInfoRecord value5(Integer value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public CheckCatalogInfoRecord value6(String value) {
        setMode(value);
        return this;
    }

    @Override
    public CheckCatalogInfoRecord value7(String value) {
        setModifiedBy(value);
        return this;
    }

    @Override
    public CheckCatalogInfoRecord value8(LocalDateTime value) {
        setModifiedDate(value);
        return this;
    }

    @Override
    public CheckCatalogInfoRecord value9(String value) {
        setName(value);
        return this;
    }

    @Override
    public CheckCatalogInfoRecord value10(String value) {
        setPosition(value);
        return this;
    }

    @Override
    public CheckCatalogInfoRecord value11(String value) {
        setType(value);
        return this;
    }

    @Override
    public CheckCatalogInfoRecord values(Long value1, String value2, String value3, LocalDateTime value4, Integer value5, String value6, String value7, LocalDateTime value8, String value9, String value10, String value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CheckCatalogInfoRecord
     */
    public CheckCatalogInfoRecord() {
        super(CheckCatalogInfo.CHECK_CATALOG_INFO);
    }

    /**
     * Create a detached, initialised CheckCatalogInfoRecord
     */
    public CheckCatalogInfoRecord(Long id, String code, String createdBy, LocalDateTime createdDate, Integer isDeleted, String mode, String modifiedBy, LocalDateTime modifiedDate, String name, String position, String type) {
        super(CheckCatalogInfo.CHECK_CATALOG_INFO);

        setId(id);
        setCode(code);
        setCreatedBy(createdBy);
        setCreatedDate(createdDate);
        setIsDeleted(isDeleted);
        setMode(mode);
        setModifiedBy(modifiedBy);
        setModifiedDate(modifiedDate);
        setName(name);
        setPosition(position);
        setType(type);
    }
}
