/*
 * This file is generated by jOOQ.
 */
package com.example.boot.data.database.jooq.tables.records;


import com.example.boot.data.database.jooq.tables.SystemDataDict;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SystemDataDictRecord extends UpdatableRecordImpl<SystemDataDictRecord> implements Record10<Long, String, LocalDateTime, Long, Integer, Integer, String, LocalDateTime, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>physical_examination_system.system_data_dict.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>physical_examination_system.system_data_dict.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>physical_examination_system.system_data_dict.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>physical_examination_system.system_data_dict.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(1);
    }

    /**
     * Setter for <code>physical_examination_system.system_data_dict.created_date</code>.
     */
    public void setCreatedDate(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>physical_examination_system.system_data_dict.created_date</code>.
     */
    public LocalDateTime getCreatedDate() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>physical_examination_system.system_data_dict.group_id</code>.
     */
    public void setGroupId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>physical_examination_system.system_data_dict.group_id</code>.
     */
    public Long getGroupId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>physical_examination_system.system_data_dict.is_deleted</code>.
     */
    public void setIsDeleted(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>physical_examination_system.system_data_dict.is_deleted</code>.
     */
    public Integer getIsDeleted() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>physical_examination_system.system_data_dict.is_enabled</code>.
     */
    public void setIsEnabled(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>physical_examination_system.system_data_dict.is_enabled</code>.
     */
    public Integer getIsEnabled() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>physical_examination_system.system_data_dict.modified_by</code>.
     */
    public void setModifiedBy(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>physical_examination_system.system_data_dict.modified_by</code>.
     */
    public String getModifiedBy() {
        return (String) get(6);
    }

    /**
     * Setter for <code>physical_examination_system.system_data_dict.modified_date</code>.
     */
    public void setModifiedDate(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>physical_examination_system.system_data_dict.modified_date</code>.
     */
    public LocalDateTime getModifiedDate() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>physical_examination_system.system_data_dict.name</code>.
     */
    public void setName(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>physical_examination_system.system_data_dict.name</code>.
     */
    public String getName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>physical_examination_system.system_data_dict.value</code>.
     */
    public void setValue(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>physical_examination_system.system_data_dict.value</code>.
     */
    public String getValue() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, String, LocalDateTime, Long, Integer, Integer, String, LocalDateTime, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Long, String, LocalDateTime, Long, Integer, Integer, String, LocalDateTime, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return SystemDataDict.SYSTEM_DATA_DICT.ID;
    }

    @Override
    public Field<String> field2() {
        return SystemDataDict.SYSTEM_DATA_DICT.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return SystemDataDict.SYSTEM_DATA_DICT.CREATED_DATE;
    }

    @Override
    public Field<Long> field4() {
        return SystemDataDict.SYSTEM_DATA_DICT.GROUP_ID;
    }

    @Override
    public Field<Integer> field5() {
        return SystemDataDict.SYSTEM_DATA_DICT.IS_DELETED;
    }

    @Override
    public Field<Integer> field6() {
        return SystemDataDict.SYSTEM_DATA_DICT.IS_ENABLED;
    }

    @Override
    public Field<String> field7() {
        return SystemDataDict.SYSTEM_DATA_DICT.MODIFIED_BY;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return SystemDataDict.SYSTEM_DATA_DICT.MODIFIED_DATE;
    }

    @Override
    public Field<String> field9() {
        return SystemDataDict.SYSTEM_DATA_DICT.NAME;
    }

    @Override
    public Field<String> field10() {
        return SystemDataDict.SYSTEM_DATA_DICT.VALUE;
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
    public Long component4() {
        return getGroupId();
    }

    @Override
    public Integer component5() {
        return getIsDeleted();
    }

    @Override
    public Integer component6() {
        return getIsEnabled();
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
    public Long value4() {
        return getGroupId();
    }

    @Override
    public Integer value5() {
        return getIsDeleted();
    }

    @Override
    public Integer value6() {
        return getIsEnabled();
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
        return getValue();
    }

    @Override
    public SystemDataDictRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public SystemDataDictRecord value2(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public SystemDataDictRecord value3(LocalDateTime value) {
        setCreatedDate(value);
        return this;
    }

    @Override
    public SystemDataDictRecord value4(Long value) {
        setGroupId(value);
        return this;
    }

    @Override
    public SystemDataDictRecord value5(Integer value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public SystemDataDictRecord value6(Integer value) {
        setIsEnabled(value);
        return this;
    }

    @Override
    public SystemDataDictRecord value7(String value) {
        setModifiedBy(value);
        return this;
    }

    @Override
    public SystemDataDictRecord value8(LocalDateTime value) {
        setModifiedDate(value);
        return this;
    }

    @Override
    public SystemDataDictRecord value9(String value) {
        setName(value);
        return this;
    }

    @Override
    public SystemDataDictRecord value10(String value) {
        setValue(value);
        return this;
    }

    @Override
    public SystemDataDictRecord values(Long value1, String value2, LocalDateTime value3, Long value4, Integer value5, Integer value6, String value7, LocalDateTime value8, String value9, String value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SystemDataDictRecord
     */
    public SystemDataDictRecord() {
        super(SystemDataDict.SYSTEM_DATA_DICT);
    }

    /**
     * Create a detached, initialised SystemDataDictRecord
     */
    public SystemDataDictRecord(Long id, String createdBy, LocalDateTime createdDate, Long groupId, Integer isDeleted, Integer isEnabled, String modifiedBy, LocalDateTime modifiedDate, String name, String value) {
        super(SystemDataDict.SYSTEM_DATA_DICT);

        setId(id);
        setCreatedBy(createdBy);
        setCreatedDate(createdDate);
        setGroupId(groupId);
        setIsDeleted(isDeleted);
        setIsEnabled(isEnabled);
        setModifiedBy(modifiedBy);
        setModifiedDate(modifiedDate);
        setName(name);
        setValue(value);
    }
}
