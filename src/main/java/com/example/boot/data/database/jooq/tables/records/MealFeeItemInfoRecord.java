/*
 * This file is generated by jOOQ.
 */
package com.example.boot.data.database.jooq.tables.records;


import com.example.boot.data.database.jooq.tables.MealFeeItemInfo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MealFeeItemInfoRecord extends UpdatableRecordImpl<MealFeeItemInfoRecord> implements Record11<Long, String, LocalDateTime, BigDecimal, BigDecimal, Long, Integer, Long, String, LocalDateTime, BigDecimal> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>physical_examination_system.meal_fee_item_info.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>physical_examination_system.meal_fee_item_info.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>physical_examination_system.meal_fee_item_info.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>physical_examination_system.meal_fee_item_info.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(1);
    }

    /**
     * Setter for <code>physical_examination_system.meal_fee_item_info.created_date</code>.
     */
    public void setCreatedDate(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>physical_examination_system.meal_fee_item_info.created_date</code>.
     */
    public LocalDateTime getCreatedDate() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>physical_examination_system.meal_fee_item_info.discount_price</code>.
     */
    public void setDiscountPrice(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>physical_examination_system.meal_fee_item_info.discount_price</code>.
     */
    public BigDecimal getDiscountPrice() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>physical_examination_system.meal_fee_item_info.discount_rate</code>.
     */
    public void setDiscountRate(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>physical_examination_system.meal_fee_item_info.discount_rate</code>.
     */
    public BigDecimal getDiscountRate() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>physical_examination_system.meal_fee_item_info.fee_item_id</code>.
     */
    public void setFeeItemId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>physical_examination_system.meal_fee_item_info.fee_item_id</code>.
     */
    public Long getFeeItemId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>physical_examination_system.meal_fee_item_info.is_deleted</code>.
     */
    public void setIsDeleted(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>physical_examination_system.meal_fee_item_info.is_deleted</code>.
     */
    public Integer getIsDeleted() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>physical_examination_system.meal_fee_item_info.meal_id</code>.
     */
    public void setMealId(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>physical_examination_system.meal_fee_item_info.meal_id</code>.
     */
    public Long getMealId() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>physical_examination_system.meal_fee_item_info.modified_by</code>.
     */
    public void setModifiedBy(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>physical_examination_system.meal_fee_item_info.modified_by</code>.
     */
    public String getModifiedBy() {
        return (String) get(8);
    }

    /**
     * Setter for <code>physical_examination_system.meal_fee_item_info.modified_date</code>.
     */
    public void setModifiedDate(LocalDateTime value) {
        set(9, value);
    }

    /**
     * Getter for <code>physical_examination_system.meal_fee_item_info.modified_date</code>.
     */
    public LocalDateTime getModifiedDate() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>physical_examination_system.meal_fee_item_info.price</code>.
     */
    public void setPrice(BigDecimal value) {
        set(10, value);
    }

    /**
     * Getter for <code>physical_examination_system.meal_fee_item_info.price</code>.
     */
    public BigDecimal getPrice() {
        return (BigDecimal) get(10);
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
    public Row11<Long, String, LocalDateTime, BigDecimal, BigDecimal, Long, Integer, Long, String, LocalDateTime, BigDecimal> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Long, String, LocalDateTime, BigDecimal, BigDecimal, Long, Integer, Long, String, LocalDateTime, BigDecimal> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return MealFeeItemInfo.MEAL_FEE_ITEM_INFO.ID;
    }

    @Override
    public Field<String> field2() {
        return MealFeeItemInfo.MEAL_FEE_ITEM_INFO.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return MealFeeItemInfo.MEAL_FEE_ITEM_INFO.CREATED_DATE;
    }

    @Override
    public Field<BigDecimal> field4() {
        return MealFeeItemInfo.MEAL_FEE_ITEM_INFO.DISCOUNT_PRICE;
    }

    @Override
    public Field<BigDecimal> field5() {
        return MealFeeItemInfo.MEAL_FEE_ITEM_INFO.DISCOUNT_RATE;
    }

    @Override
    public Field<Long> field6() {
        return MealFeeItemInfo.MEAL_FEE_ITEM_INFO.FEE_ITEM_ID;
    }

    @Override
    public Field<Integer> field7() {
        return MealFeeItemInfo.MEAL_FEE_ITEM_INFO.IS_DELETED;
    }

    @Override
    public Field<Long> field8() {
        return MealFeeItemInfo.MEAL_FEE_ITEM_INFO.MEAL_ID;
    }

    @Override
    public Field<String> field9() {
        return MealFeeItemInfo.MEAL_FEE_ITEM_INFO.MODIFIED_BY;
    }

    @Override
    public Field<LocalDateTime> field10() {
        return MealFeeItemInfo.MEAL_FEE_ITEM_INFO.MODIFIED_DATE;
    }

    @Override
    public Field<BigDecimal> field11() {
        return MealFeeItemInfo.MEAL_FEE_ITEM_INFO.PRICE;
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
    public BigDecimal component4() {
        return getDiscountPrice();
    }

    @Override
    public BigDecimal component5() {
        return getDiscountRate();
    }

    @Override
    public Long component6() {
        return getFeeItemId();
    }

    @Override
    public Integer component7() {
        return getIsDeleted();
    }

    @Override
    public Long component8() {
        return getMealId();
    }

    @Override
    public String component9() {
        return getModifiedBy();
    }

    @Override
    public LocalDateTime component10() {
        return getModifiedDate();
    }

    @Override
    public BigDecimal component11() {
        return getPrice();
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
    public BigDecimal value4() {
        return getDiscountPrice();
    }

    @Override
    public BigDecimal value5() {
        return getDiscountRate();
    }

    @Override
    public Long value6() {
        return getFeeItemId();
    }

    @Override
    public Integer value7() {
        return getIsDeleted();
    }

    @Override
    public Long value8() {
        return getMealId();
    }

    @Override
    public String value9() {
        return getModifiedBy();
    }

    @Override
    public LocalDateTime value10() {
        return getModifiedDate();
    }

    @Override
    public BigDecimal value11() {
        return getPrice();
    }

    @Override
    public MealFeeItemInfoRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public MealFeeItemInfoRecord value2(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public MealFeeItemInfoRecord value3(LocalDateTime value) {
        setCreatedDate(value);
        return this;
    }

    @Override
    public MealFeeItemInfoRecord value4(BigDecimal value) {
        setDiscountPrice(value);
        return this;
    }

    @Override
    public MealFeeItemInfoRecord value5(BigDecimal value) {
        setDiscountRate(value);
        return this;
    }

    @Override
    public MealFeeItemInfoRecord value6(Long value) {
        setFeeItemId(value);
        return this;
    }

    @Override
    public MealFeeItemInfoRecord value7(Integer value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public MealFeeItemInfoRecord value8(Long value) {
        setMealId(value);
        return this;
    }

    @Override
    public MealFeeItemInfoRecord value9(String value) {
        setModifiedBy(value);
        return this;
    }

    @Override
    public MealFeeItemInfoRecord value10(LocalDateTime value) {
        setModifiedDate(value);
        return this;
    }

    @Override
    public MealFeeItemInfoRecord value11(BigDecimal value) {
        setPrice(value);
        return this;
    }

    @Override
    public MealFeeItemInfoRecord values(Long value1, String value2, LocalDateTime value3, BigDecimal value4, BigDecimal value5, Long value6, Integer value7, Long value8, String value9, LocalDateTime value10, BigDecimal value11) {
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
     * Create a detached MealFeeItemInfoRecord
     */
    public MealFeeItemInfoRecord() {
        super(MealFeeItemInfo.MEAL_FEE_ITEM_INFO);
    }

    /**
     * Create a detached, initialised MealFeeItemInfoRecord
     */
    public MealFeeItemInfoRecord(Long id, String createdBy, LocalDateTime createdDate, BigDecimal discountPrice, BigDecimal discountRate, Long feeItemId, Integer isDeleted, Long mealId, String modifiedBy, LocalDateTime modifiedDate, BigDecimal price) {
        super(MealFeeItemInfo.MEAL_FEE_ITEM_INFO);

        setId(id);
        setCreatedBy(createdBy);
        setCreatedDate(createdDate);
        setDiscountPrice(discountPrice);
        setDiscountRate(discountRate);
        setFeeItemId(feeItemId);
        setIsDeleted(isDeleted);
        setMealId(mealId);
        setModifiedBy(modifiedBy);
        setModifiedDate(modifiedDate);
        setPrice(price);
    }
}
