/*
 * This file is generated by jOOQ.
 */
package com.example.boot.data.database.jooq.tables.records;


import com.example.boot.data.database.jooq.tables.CustomerInfo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 客户信息
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CustomerInfoRecord extends UpdatableRecordImpl<CustomerInfoRecord> implements Record12<Long, LocalDateTime, LocalDateTime, String, String, Integer, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>physical_examination_system.customer_info.id</code>. id
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>physical_examination_system.customer_info.id</code>. id
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>physical_examination_system.customer_info.created_date</code>. createdDate
     */
    public void setCreatedDate(LocalDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>physical_examination_system.customer_info.created_date</code>. createdDate
     */
    public LocalDateTime getCreatedDate() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>physical_examination_system.customer_info.modified_date</code>. modifiedDate
     */
    public void setModifiedDate(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>physical_examination_system.customer_info.modified_date</code>. modifiedDate
     */
    public LocalDateTime getModifiedDate() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>physical_examination_system.customer_info.created_by</code>. createdBy
     */
    public void setCreatedBy(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>physical_examination_system.customer_info.created_by</code>. createdBy
     */
    public String getCreatedBy() {
        return (String) get(3);
    }

    /**
     * Setter for <code>physical_examination_system.customer_info.modified_by</code>. modifiedBy
     */
    public void setModifiedBy(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>physical_examination_system.customer_info.modified_by</code>. modifiedBy
     */
    public String getModifiedBy() {
        return (String) get(4);
    }

    /**
     * Setter for <code>physical_examination_system.customer_info.is_deleted</code>. isDeleted
     */
    public void setIsDeleted(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>physical_examination_system.customer_info.is_deleted</code>. isDeleted
     */
    public Integer getIsDeleted() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>physical_examination_system.customer_info.code</code>. 客户编号
     */
    public void setCode(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>physical_examination_system.customer_info.code</code>. 客户编号
     */
    public String getCode() {
        return (String) get(6);
    }

    /**
     * Setter for <code>physical_examination_system.customer_info.name</code>. 客户名称
     */
    public void setName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>physical_examination_system.customer_info.name</code>. 客户名称
     */
    public String getName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>physical_examination_system.customer_info.type</code>. 客户类型
     */
    public void setType(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>physical_examination_system.customer_info.type</code>. 客户类型
     */
    public String getType() {
        return (String) get(8);
    }

    /**
     * Setter for <code>physical_examination_system.customer_info.contact</code>. 联系人
     */
    public void setContact(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>physical_examination_system.customer_info.contact</code>. 联系人
     */
    public String getContact() {
        return (String) get(9);
    }

    /**
     * Setter for <code>physical_examination_system.customer_info.contact_number</code>. 联系电话
     */
    public void setContactNumber(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>physical_examination_system.customer_info.contact_number</code>. 联系电话
     */
    public String getContactNumber() {
        return (String) get(10);
    }

    /**
     * Setter for <code>physical_examination_system.customer_info.status</code>. 状态
     */
    public void setStatus(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>physical_examination_system.customer_info.status</code>. 状态
     */
    public String getStatus() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, LocalDateTime, LocalDateTime, String, String, Integer, String, String, String, String, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Long, LocalDateTime, LocalDateTime, String, String, Integer, String, String, String, String, String, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return CustomerInfo.CUSTOMER_INFO.ID;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return CustomerInfo.CUSTOMER_INFO.CREATED_DATE;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return CustomerInfo.CUSTOMER_INFO.MODIFIED_DATE;
    }

    @Override
    public Field<String> field4() {
        return CustomerInfo.CUSTOMER_INFO.CREATED_BY;
    }

    @Override
    public Field<String> field5() {
        return CustomerInfo.CUSTOMER_INFO.MODIFIED_BY;
    }

    @Override
    public Field<Integer> field6() {
        return CustomerInfo.CUSTOMER_INFO.IS_DELETED;
    }

    @Override
    public Field<String> field7() {
        return CustomerInfo.CUSTOMER_INFO.CODE;
    }

    @Override
    public Field<String> field8() {
        return CustomerInfo.CUSTOMER_INFO.NAME;
    }

    @Override
    public Field<String> field9() {
        return CustomerInfo.CUSTOMER_INFO.TYPE;
    }

    @Override
    public Field<String> field10() {
        return CustomerInfo.CUSTOMER_INFO.CONTACT;
    }

    @Override
    public Field<String> field11() {
        return CustomerInfo.CUSTOMER_INFO.CONTACT_NUMBER;
    }

    @Override
    public Field<String> field12() {
        return CustomerInfo.CUSTOMER_INFO.STATUS;
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
    public String component7() {
        return getCode();
    }

    @Override
    public String component8() {
        return getName();
    }

    @Override
    public String component9() {
        return getType();
    }

    @Override
    public String component10() {
        return getContact();
    }

    @Override
    public String component11() {
        return getContactNumber();
    }

    @Override
    public String component12() {
        return getStatus();
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
    public String value7() {
        return getCode();
    }

    @Override
    public String value8() {
        return getName();
    }

    @Override
    public String value9() {
        return getType();
    }

    @Override
    public String value10() {
        return getContact();
    }

    @Override
    public String value11() {
        return getContactNumber();
    }

    @Override
    public String value12() {
        return getStatus();
    }

    @Override
    public CustomerInfoRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public CustomerInfoRecord value2(LocalDateTime value) {
        setCreatedDate(value);
        return this;
    }

    @Override
    public CustomerInfoRecord value3(LocalDateTime value) {
        setModifiedDate(value);
        return this;
    }

    @Override
    public CustomerInfoRecord value4(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public CustomerInfoRecord value5(String value) {
        setModifiedBy(value);
        return this;
    }

    @Override
    public CustomerInfoRecord value6(Integer value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public CustomerInfoRecord value7(String value) {
        setCode(value);
        return this;
    }

    @Override
    public CustomerInfoRecord value8(String value) {
        setName(value);
        return this;
    }

    @Override
    public CustomerInfoRecord value9(String value) {
        setType(value);
        return this;
    }

    @Override
    public CustomerInfoRecord value10(String value) {
        setContact(value);
        return this;
    }

    @Override
    public CustomerInfoRecord value11(String value) {
        setContactNumber(value);
        return this;
    }

    @Override
    public CustomerInfoRecord value12(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public CustomerInfoRecord values(Long value1, LocalDateTime value2, LocalDateTime value3, String value4, String value5, Integer value6, String value7, String value8, String value9, String value10, String value11, String value12) {
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
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CustomerInfoRecord
     */
    public CustomerInfoRecord() {
        super(CustomerInfo.CUSTOMER_INFO);
    }

    /**
     * Create a detached, initialised CustomerInfoRecord
     */
    public CustomerInfoRecord(Long id, LocalDateTime createdDate, LocalDateTime modifiedDate, String createdBy, String modifiedBy, Integer isDeleted, String code, String name, String type, String contact, String contactNumber, String status) {
        super(CustomerInfo.CUSTOMER_INFO);

        setId(id);
        setCreatedDate(createdDate);
        setModifiedDate(modifiedDate);
        setCreatedBy(createdBy);
        setModifiedBy(modifiedBy);
        setIsDeleted(isDeleted);
        setCode(code);
        setName(name);
        setType(type);
        setContact(contact);
        setContactNumber(contactNumber);
        setStatus(status);
    }
}
