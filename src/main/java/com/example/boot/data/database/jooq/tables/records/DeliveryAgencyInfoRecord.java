/*
 * This file is generated by jOOQ.
 */
package com.example.boot.data.database.jooq.tables.records;


import com.example.boot.data.database.jooq.tables.DeliveryAgencyInfo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DeliveryAgencyInfoRecord extends UpdatableRecordImpl<DeliveryAgencyInfoRecord> implements Record9<Long, String, String, LocalDateTime, Integer, String, LocalDateTime, String, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>physical_examination_system.delivery_agency_info.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>physical_examination_system.delivery_agency_info.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>physical_examination_system.delivery_agency_info.code</code>.
     */
    public void setCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>physical_examination_system.delivery_agency_info.code</code>.
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>physical_examination_system.delivery_agency_info.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>physical_examination_system.delivery_agency_info.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(2);
    }

    /**
     * Setter for <code>physical_examination_system.delivery_agency_info.created_date</code>.
     */
    public void setCreatedDate(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>physical_examination_system.delivery_agency_info.created_date</code>.
     */
    public LocalDateTime getCreatedDate() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>physical_examination_system.delivery_agency_info.is_deleted</code>.
     */
    public void setIsDeleted(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>physical_examination_system.delivery_agency_info.is_deleted</code>.
     */
    public Integer getIsDeleted() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>physical_examination_system.delivery_agency_info.modified_by</code>.
     */
    public void setModifiedBy(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>physical_examination_system.delivery_agency_info.modified_by</code>.
     */
    public String getModifiedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>physical_examination_system.delivery_agency_info.modified_date</code>.
     */
    public void setModifiedDate(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>physical_examination_system.delivery_agency_info.modified_date</code>.
     */
    public LocalDateTime getModifiedDate() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>physical_examination_system.delivery_agency_info.name</code>.
     */
    public void setName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>physical_examination_system.delivery_agency_info.name</code>.
     */
    public String getName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>physical_examination_system.delivery_agency_info.type</code>.
     */
    public void setType(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>physical_examination_system.delivery_agency_info.type</code>.
     */
    public Integer getType() {
        return (Integer) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, String, String, LocalDateTime, Integer, String, LocalDateTime, String, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, String, String, LocalDateTime, Integer, String, LocalDateTime, String, Integer> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return DeliveryAgencyInfo.DELIVERY_AGENCY_INFO.ID;
    }

    @Override
    public Field<String> field2() {
        return DeliveryAgencyInfo.DELIVERY_AGENCY_INFO.CODE;
    }

    @Override
    public Field<String> field3() {
        return DeliveryAgencyInfo.DELIVERY_AGENCY_INFO.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return DeliveryAgencyInfo.DELIVERY_AGENCY_INFO.CREATED_DATE;
    }

    @Override
    public Field<Integer> field5() {
        return DeliveryAgencyInfo.DELIVERY_AGENCY_INFO.IS_DELETED;
    }

    @Override
    public Field<String> field6() {
        return DeliveryAgencyInfo.DELIVERY_AGENCY_INFO.MODIFIED_BY;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return DeliveryAgencyInfo.DELIVERY_AGENCY_INFO.MODIFIED_DATE;
    }

    @Override
    public Field<String> field8() {
        return DeliveryAgencyInfo.DELIVERY_AGENCY_INFO.NAME;
    }

    @Override
    public Field<Integer> field9() {
        return DeliveryAgencyInfo.DELIVERY_AGENCY_INFO.TYPE;
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
        return getModifiedBy();
    }

    @Override
    public LocalDateTime component7() {
        return getModifiedDate();
    }

    @Override
    public String component8() {
        return getName();
    }

    @Override
    public Integer component9() {
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
        return getModifiedBy();
    }

    @Override
    public LocalDateTime value7() {
        return getModifiedDate();
    }

    @Override
    public String value8() {
        return getName();
    }

    @Override
    public Integer value9() {
        return getType();
    }

    @Override
    public DeliveryAgencyInfoRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public DeliveryAgencyInfoRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public DeliveryAgencyInfoRecord value3(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public DeliveryAgencyInfoRecord value4(LocalDateTime value) {
        setCreatedDate(value);
        return this;
    }

    @Override
    public DeliveryAgencyInfoRecord value5(Integer value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public DeliveryAgencyInfoRecord value6(String value) {
        setModifiedBy(value);
        return this;
    }

    @Override
    public DeliveryAgencyInfoRecord value7(LocalDateTime value) {
        setModifiedDate(value);
        return this;
    }

    @Override
    public DeliveryAgencyInfoRecord value8(String value) {
        setName(value);
        return this;
    }

    @Override
    public DeliveryAgencyInfoRecord value9(Integer value) {
        setType(value);
        return this;
    }

    @Override
    public DeliveryAgencyInfoRecord values(Long value1, String value2, String value3, LocalDateTime value4, Integer value5, String value6, LocalDateTime value7, String value8, Integer value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DeliveryAgencyInfoRecord
     */
    public DeliveryAgencyInfoRecord() {
        super(DeliveryAgencyInfo.DELIVERY_AGENCY_INFO);
    }

    /**
     * Create a detached, initialised DeliveryAgencyInfoRecord
     */
    public DeliveryAgencyInfoRecord(Long id, String code, String createdBy, LocalDateTime createdDate, Integer isDeleted, String modifiedBy, LocalDateTime modifiedDate, String name, Integer type) {
        super(DeliveryAgencyInfo.DELIVERY_AGENCY_INFO);

        setId(id);
        setCode(code);
        setCreatedBy(createdBy);
        setCreatedDate(createdDate);
        setIsDeleted(isDeleted);
        setModifiedBy(modifiedBy);
        setModifiedDate(modifiedDate);
        setName(name);
        setType(type);
    }
}
