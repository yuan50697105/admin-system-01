/*
 * This file is generated by jOOQ.
 */
package com.example.boot.data.database.jooq.tables.records;


import com.example.boot.data.database.jooq.tables.FeeCheckItemInfo;

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
public class FeeCheckItemInfoRecord extends UpdatableRecordImpl<FeeCheckItemInfoRecord> implements Record9<Long, Long, String, LocalDateTime, Long, Integer, Integer, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>physical_examination_system.fee_check_item_info.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>physical_examination_system.fee_check_item_info.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>physical_examination_system.fee_check_item_info.check_item_id</code>.
     */
    public void setCheckItemId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>physical_examination_system.fee_check_item_info.check_item_id</code>.
     */
    public Long getCheckItemId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>physical_examination_system.fee_check_item_info.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>physical_examination_system.fee_check_item_info.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(2);
    }

    /**
     * Setter for <code>physical_examination_system.fee_check_item_info.created_date</code>.
     */
    public void setCreatedDate(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>physical_examination_system.fee_check_item_info.created_date</code>.
     */
    public LocalDateTime getCreatedDate() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>physical_examination_system.fee_check_item_info.fee_item_id</code>.
     */
    public void setFeeItemId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>physical_examination_system.fee_check_item_info.fee_item_id</code>.
     */
    public Long getFeeItemId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>physical_examination_system.fee_check_item_info.is_deleted</code>.
     */
    public void setIsDeleted(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>physical_examination_system.fee_check_item_info.is_deleted</code>.
     */
    public Integer getIsDeleted() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>physical_examination_system.fee_check_item_info.is_single</code>.
     */
    public void setIsSingle(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>physical_examination_system.fee_check_item_info.is_single</code>.
     */
    public Integer getIsSingle() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>physical_examination_system.fee_check_item_info.modified_by</code>.
     */
    public void setModifiedBy(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>physical_examination_system.fee_check_item_info.modified_by</code>.
     */
    public String getModifiedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>physical_examination_system.fee_check_item_info.modified_date</code>.
     */
    public void setModifiedDate(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>physical_examination_system.fee_check_item_info.modified_date</code>.
     */
    public LocalDateTime getModifiedDate() {
        return (LocalDateTime) get(8);
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
    public Row9<Long, Long, String, LocalDateTime, Long, Integer, Integer, String, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, Long, String, LocalDateTime, Long, Integer, Integer, String, LocalDateTime> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return FeeCheckItemInfo.FEE_CHECK_ITEM_INFO.ID;
    }

    @Override
    public Field<Long> field2() {
        return FeeCheckItemInfo.FEE_CHECK_ITEM_INFO.CHECK_ITEM_ID;
    }

    @Override
    public Field<String> field3() {
        return FeeCheckItemInfo.FEE_CHECK_ITEM_INFO.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return FeeCheckItemInfo.FEE_CHECK_ITEM_INFO.CREATED_DATE;
    }

    @Override
    public Field<Long> field5() {
        return FeeCheckItemInfo.FEE_CHECK_ITEM_INFO.FEE_ITEM_ID;
    }

    @Override
    public Field<Integer> field6() {
        return FeeCheckItemInfo.FEE_CHECK_ITEM_INFO.IS_DELETED;
    }

    @Override
    public Field<Integer> field7() {
        return FeeCheckItemInfo.FEE_CHECK_ITEM_INFO.IS_SINGLE;
    }

    @Override
    public Field<String> field8() {
        return FeeCheckItemInfo.FEE_CHECK_ITEM_INFO.MODIFIED_BY;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return FeeCheckItemInfo.FEE_CHECK_ITEM_INFO.MODIFIED_DATE;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getCheckItemId();
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
    public Long component5() {
        return getFeeItemId();
    }

    @Override
    public Integer component6() {
        return getIsDeleted();
    }

    @Override
    public Integer component7() {
        return getIsSingle();
    }

    @Override
    public String component8() {
        return getModifiedBy();
    }

    @Override
    public LocalDateTime component9() {
        return getModifiedDate();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getCheckItemId();
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
    public Long value5() {
        return getFeeItemId();
    }

    @Override
    public Integer value6() {
        return getIsDeleted();
    }

    @Override
    public Integer value7() {
        return getIsSingle();
    }

    @Override
    public String value8() {
        return getModifiedBy();
    }

    @Override
    public LocalDateTime value9() {
        return getModifiedDate();
    }

    @Override
    public FeeCheckItemInfoRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public FeeCheckItemInfoRecord value2(Long value) {
        setCheckItemId(value);
        return this;
    }

    @Override
    public FeeCheckItemInfoRecord value3(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public FeeCheckItemInfoRecord value4(LocalDateTime value) {
        setCreatedDate(value);
        return this;
    }

    @Override
    public FeeCheckItemInfoRecord value5(Long value) {
        setFeeItemId(value);
        return this;
    }

    @Override
    public FeeCheckItemInfoRecord value6(Integer value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public FeeCheckItemInfoRecord value7(Integer value) {
        setIsSingle(value);
        return this;
    }

    @Override
    public FeeCheckItemInfoRecord value8(String value) {
        setModifiedBy(value);
        return this;
    }

    @Override
    public FeeCheckItemInfoRecord value9(LocalDateTime value) {
        setModifiedDate(value);
        return this;
    }

    @Override
    public FeeCheckItemInfoRecord values(Long value1, Long value2, String value3, LocalDateTime value4, Long value5, Integer value6, Integer value7, String value8, LocalDateTime value9) {
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
     * Create a detached FeeCheckItemInfoRecord
     */
    public FeeCheckItemInfoRecord() {
        super(FeeCheckItemInfo.FEE_CHECK_ITEM_INFO);
    }

    /**
     * Create a detached, initialised FeeCheckItemInfoRecord
     */
    public FeeCheckItemInfoRecord(Long id, Long checkItemId, String createdBy, LocalDateTime createdDate, Long feeItemId, Integer isDeleted, Integer isSingle, String modifiedBy, LocalDateTime modifiedDate) {
        super(FeeCheckItemInfo.FEE_CHECK_ITEM_INFO);

        setId(id);
        setCheckItemId(checkItemId);
        setCreatedBy(createdBy);
        setCreatedDate(createdDate);
        setFeeItemId(feeItemId);
        setIsDeleted(isDeleted);
        setIsSingle(isSingle);
        setModifiedBy(modifiedBy);
        setModifiedDate(modifiedDate);
    }
}
