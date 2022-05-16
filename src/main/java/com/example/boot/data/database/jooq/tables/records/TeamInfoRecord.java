/*
 * This file is generated by jOOQ.
 */
package com.example.boot.data.database.jooq.tables.records;


import com.example.boot.data.database.jooq.tables.TeamInfo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 团队信息
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TeamInfoRecord extends UpdatableRecordImpl<TeamInfoRecord> implements Record10<Long, LocalDateTime, LocalDateTime, String, String, Integer, Long, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>physical_examination_system.team_info.id</code>. id
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>physical_examination_system.team_info.id</code>. id
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>physical_examination_system.team_info.created_date</code>. createdDate
     */
    public void setCreatedDate(LocalDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>physical_examination_system.team_info.created_date</code>. createdDate
     */
    public LocalDateTime getCreatedDate() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>physical_examination_system.team_info.modified_date</code>. modifiedDate
     */
    public void setModifiedDate(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>physical_examination_system.team_info.modified_date</code>. modifiedDate
     */
    public LocalDateTime getModifiedDate() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>physical_examination_system.team_info.created_by</code>. createdBy
     */
    public void setCreatedBy(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>physical_examination_system.team_info.created_by</code>. createdBy
     */
    public String getCreatedBy() {
        return (String) get(3);
    }

    /**
     * Setter for <code>physical_examination_system.team_info.modified_by</code>. modifiedBy
     */
    public void setModifiedBy(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>physical_examination_system.team_info.modified_by</code>. modifiedBy
     */
    public String getModifiedBy() {
        return (String) get(4);
    }

    /**
     * Setter for <code>physical_examination_system.team_info.is_deleted</code>. isDeleted
     */
    public void setIsDeleted(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>physical_examination_system.team_info.is_deleted</code>. isDeleted
     */
    public Integer getIsDeleted() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>physical_examination_system.team_info.customer_id</code>. 客户ID
     */
    public void setCustomerId(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>physical_examination_system.team_info.customer_id</code>. 客户ID
     */
    public Long getCustomerId() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>physical_examination_system.team_info.customer_name</code>. 客户名称
     */
    public void setCustomerName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>physical_examination_system.team_info.customer_name</code>. 客户名称
     */
    public String getCustomerName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>physical_examination_system.team_info.code</code>. 团队编号
     */
    public void setCode(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>physical_examination_system.team_info.code</code>. 团队编号
     */
    public String getCode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>physical_examination_system.team_info.name</code>. 团队名称
     */
    public void setName(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>physical_examination_system.team_info.name</code>. 团队名称
     */
    public String getName() {
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
    public Row10<Long, LocalDateTime, LocalDateTime, String, String, Integer, Long, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Long, LocalDateTime, LocalDateTime, String, String, Integer, Long, String, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return TeamInfo.TEAM_INFO.ID;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return TeamInfo.TEAM_INFO.CREATED_DATE;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return TeamInfo.TEAM_INFO.MODIFIED_DATE;
    }

    @Override
    public Field<String> field4() {
        return TeamInfo.TEAM_INFO.CREATED_BY;
    }

    @Override
    public Field<String> field5() {
        return TeamInfo.TEAM_INFO.MODIFIED_BY;
    }

    @Override
    public Field<Integer> field6() {
        return TeamInfo.TEAM_INFO.IS_DELETED;
    }

    @Override
    public Field<Long> field7() {
        return TeamInfo.TEAM_INFO.CUSTOMER_ID;
    }

    @Override
    public Field<String> field8() {
        return TeamInfo.TEAM_INFO.CUSTOMER_NAME;
    }

    @Override
    public Field<String> field9() {
        return TeamInfo.TEAM_INFO.CODE;
    }

    @Override
    public Field<String> field10() {
        return TeamInfo.TEAM_INFO.NAME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public LocalDateTime component2() {
        return getCreatedDate();
    }

    @Override
    public LocalDateTime component3() {
        return getModifiedDate();
    }

    @Override
    public String component4() {
        return getCreatedBy();
    }

    @Override
    public String component5() {
        return getModifiedBy();
    }

    @Override
    public Integer component6() {
        return getIsDeleted();
    }

    @Override
    public Long component7() {
        return getCustomerId();
    }

    @Override
    public String component8() {
        return getCustomerName();
    }

    @Override
    public String component9() {
        return getCode();
    }

    @Override
    public String component10() {
        return getName();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public LocalDateTime value2() {
        return getCreatedDate();
    }

    @Override
    public LocalDateTime value3() {
        return getModifiedDate();
    }

    @Override
    public String value4() {
        return getCreatedBy();
    }

    @Override
    public String value5() {
        return getModifiedBy();
    }

    @Override
    public Integer value6() {
        return getIsDeleted();
    }

    @Override
    public Long value7() {
        return getCustomerId();
    }

    @Override
    public String value8() {
        return getCustomerName();
    }

    @Override
    public String value9() {
        return getCode();
    }

    @Override
    public String value10() {
        return getName();
    }

    @Override
    public TeamInfoRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public TeamInfoRecord value2(LocalDateTime value) {
        setCreatedDate(value);
        return this;
    }

    @Override
    public TeamInfoRecord value3(LocalDateTime value) {
        setModifiedDate(value);
        return this;
    }

    @Override
    public TeamInfoRecord value4(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public TeamInfoRecord value5(String value) {
        setModifiedBy(value);
        return this;
    }

    @Override
    public TeamInfoRecord value6(Integer value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public TeamInfoRecord value7(Long value) {
        setCustomerId(value);
        return this;
    }

    @Override
    public TeamInfoRecord value8(String value) {
        setCustomerName(value);
        return this;
    }

    @Override
    public TeamInfoRecord value9(String value) {
        setCode(value);
        return this;
    }

    @Override
    public TeamInfoRecord value10(String value) {
        setName(value);
        return this;
    }

    @Override
    public TeamInfoRecord values(Long value1, LocalDateTime value2, LocalDateTime value3, String value4, String value5, Integer value6, Long value7, String value8, String value9, String value10) {
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
     * Create a detached TeamInfoRecord
     */
    public TeamInfoRecord() {
        super(TeamInfo.TEAM_INFO);
    }

    /**
     * Create a detached, initialised TeamInfoRecord
     */
    public TeamInfoRecord(Long id, LocalDateTime createdDate, LocalDateTime modifiedDate, String createdBy, String modifiedBy, Integer isDeleted, Long customerId, String customerName, String code, String name) {
        super(TeamInfo.TEAM_INFO);

        setId(id);
        setCreatedDate(createdDate);
        setModifiedDate(modifiedDate);
        setCreatedBy(createdBy);
        setModifiedBy(modifiedBy);
        setIsDeleted(isDeleted);
        setCustomerId(customerId);
        setCustomerName(customerName);
        setCode(code);
        setName(name);
    }
}
