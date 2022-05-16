/*
 * This file is generated by jOOQ.
 */
package com.example.boot.data.database.jooq.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PatientOrderItemInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private String        code;
    private String        createdBy;
    private LocalDateTime createdDate;
    private String        feeItemCode;
    private Long          feeItemId;
    private String        feeItemName;
    private Integer       isDeleted;
    private String        mealCode;
    private Long          mealId;
    private String        mealName;
    private String        modifiedBy;
    private LocalDateTime modifiedDate;
    private Integer       number;
    private String        patientCode;
    private Long          patientId;
    private BigDecimal    totalPrice;
    private Integer       type;
    private BigDecimal    unitPrice;

    public PatientOrderItemInfo() {}

    public PatientOrderItemInfo(PatientOrderItemInfo value) {
        this.id = value.id;
        this.code = value.code;
        this.createdBy = value.createdBy;
        this.createdDate = value.createdDate;
        this.feeItemCode = value.feeItemCode;
        this.feeItemId = value.feeItemId;
        this.feeItemName = value.feeItemName;
        this.isDeleted = value.isDeleted;
        this.mealCode = value.mealCode;
        this.mealId = value.mealId;
        this.mealName = value.mealName;
        this.modifiedBy = value.modifiedBy;
        this.modifiedDate = value.modifiedDate;
        this.number = value.number;
        this.patientCode = value.patientCode;
        this.patientId = value.patientId;
        this.totalPrice = value.totalPrice;
        this.type = value.type;
        this.unitPrice = value.unitPrice;
    }

    public PatientOrderItemInfo(
        Long          id,
        String        code,
        String        createdBy,
        LocalDateTime createdDate,
        String        feeItemCode,
        Long          feeItemId,
        String        feeItemName,
        Integer       isDeleted,
        String        mealCode,
        Long          mealId,
        String        mealName,
        String        modifiedBy,
        LocalDateTime modifiedDate,
        Integer       number,
        String        patientCode,
        Long          patientId,
        BigDecimal    totalPrice,
        Integer       type,
        BigDecimal    unitPrice
    ) {
        this.id = id;
        this.code = code;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.feeItemCode = feeItemCode;
        this.feeItemId = feeItemId;
        this.feeItemName = feeItemName;
        this.isDeleted = isDeleted;
        this.mealCode = mealCode;
        this.mealId = mealId;
        this.mealName = mealName;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
        this.number = number;
        this.patientCode = patientCode;
        this.patientId = patientId;
        this.totalPrice = totalPrice;
        this.type = type;
        this.unitPrice = unitPrice;
    }

    /**
     * Getter for <code>physical_examination_system.patient_order_item_info.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>physical_examination_system.patient_order_item_info.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>physical_examination_system.patient_order_item_info.code</code>.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>physical_examination_system.patient_order_item_info.code</code>.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for <code>physical_examination_system.patient_order_item_info.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>physical_examination_system.patient_order_item_info.created_by</code>.
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Getter for <code>physical_examination_system.patient_order_item_info.created_date</code>.
     */
    public LocalDateTime getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for <code>physical_examination_system.patient_order_item_info.created_date</code>.
     */
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Getter for <code>physical_examination_system.patient_order_item_info.fee_item_code</code>.
     */
    public String getFeeItemCode() {
        return this.feeItemCode;
    }

    /**
     * Setter for <code>physical_examination_system.patient_order_item_info.fee_item_code</code>.
     */
    public void setFeeItemCode(String feeItemCode) {
        this.feeItemCode = feeItemCode;
    }

    /**
     * Getter for <code>physical_examination_system.patient_order_item_info.fee_item_id</code>.
     */
    public Long getFeeItemId() {
        return this.feeItemId;
    }

    /**
     * Setter for <code>physical_examination_system.patient_order_item_info.fee_item_id</code>.
     */
    public void setFeeItemId(Long feeItemId) {
        this.feeItemId = feeItemId;
    }

    /**
     * Getter for <code>physical_examination_system.patient_order_item_info.fee_item_name</code>.
     */
    public String getFeeItemName() {
        return this.feeItemName;
    }

    /**
     * Setter for <code>physical_examination_system.patient_order_item_info.fee_item_name</code>.
     */
    public void setFeeItemName(String feeItemName) {
        this.feeItemName = feeItemName;
    }

    /**
     * Getter for <code>physical_examination_system.patient_order_item_info.is_deleted</code>.
     */
    public Integer getIsDeleted() {
        return this.isDeleted;
    }

    /**
     * Setter for <code>physical_examination_system.patient_order_item_info.is_deleted</code>.
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * Getter for <code>physical_examination_system.patient_order_item_info.meal_code</code>.
     */
    public String getMealCode() {
        return this.mealCode;
    }

    /**
     * Setter for <code>physical_examination_system.patient_order_item_info.meal_code</code>.
     */
    public void setMealCode(String mealCode) {
        this.mealCode = mealCode;
    }

    /**
     * Getter for <code>physical_examination_system.patient_order_item_info.meal_id</code>.
     */
    public Long getMealId() {
        return this.mealId;
    }

    /**
     * Setter for <code>physical_examination_system.patient_order_item_info.meal_id</code>.
     */
    public void setMealId(Long mealId) {
        this.mealId = mealId;
    }

    /**
     * Getter for <code>physical_examination_system.patient_order_item_info.meal_name</code>.
     */
    public String getMealName() {
        return this.mealName;
    }

    /**
     * Setter for <code>physical_examination_system.patient_order_item_info.meal_name</code>.
     */
    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    /**
     * Getter for <code>physical_examination_system.patient_order_item_info.modified_by</code>.
     */
    public String getModifiedBy() {
        return this.modifiedBy;
    }

    /**
     * Setter for <code>physical_examination_system.patient_order_item_info.modified_by</code>.
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * Getter for <code>physical_examination_system.patient_order_item_info.modified_date</code>.
     */
    public LocalDateTime getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for <code>physical_examination_system.patient_order_item_info.modified_date</code>.
     */
    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * Getter for <code>physical_examination_system.patient_order_item_info.number</code>.
     */
    public Integer getNumber() {
        return this.number;
    }

    /**
     * Setter for <code>physical_examination_system.patient_order_item_info.number</code>.
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * Getter for <code>physical_examination_system.patient_order_item_info.patient_code</code>.
     */
    public String getPatientCode() {
        return this.patientCode;
    }

    /**
     * Setter for <code>physical_examination_system.patient_order_item_info.patient_code</code>.
     */
    public void setPatientCode(String patientCode) {
        this.patientCode = patientCode;
    }

    /**
     * Getter for <code>physical_examination_system.patient_order_item_info.patient_id</code>.
     */
    public Long getPatientId() {
        return this.patientId;
    }

    /**
     * Setter for <code>physical_examination_system.patient_order_item_info.patient_id</code>.
     */
    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    /**
     * Getter for <code>physical_examination_system.patient_order_item_info.total_price</code>.
     */
    public BigDecimal getTotalPrice() {
        return this.totalPrice;
    }

    /**
     * Setter for <code>physical_examination_system.patient_order_item_info.total_price</code>.
     */
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * Getter for <code>physical_examination_system.patient_order_item_info.type</code>.
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * Setter for <code>physical_examination_system.patient_order_item_info.type</code>.
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * Getter for <code>physical_examination_system.patient_order_item_info.unit_price</code>.
     */
    public BigDecimal getUnitPrice() {
        return this.unitPrice;
    }

    /**
     * Setter for <code>physical_examination_system.patient_order_item_info.unit_price</code>.
     */
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PatientOrderItemInfo (");

        sb.append(id);
        sb.append(", ").append(code);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdDate);
        sb.append(", ").append(feeItemCode);
        sb.append(", ").append(feeItemId);
        sb.append(", ").append(feeItemName);
        sb.append(", ").append(isDeleted);
        sb.append(", ").append(mealCode);
        sb.append(", ").append(mealId);
        sb.append(", ").append(mealName);
        sb.append(", ").append(modifiedBy);
        sb.append(", ").append(modifiedDate);
        sb.append(", ").append(number);
        sb.append(", ").append(patientCode);
        sb.append(", ").append(patientId);
        sb.append(", ").append(totalPrice);
        sb.append(", ").append(type);
        sb.append(", ").append(unitPrice);

        sb.append(")");
        return sb.toString();
    }
}