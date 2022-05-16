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
public class MealInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private String        code;
    private String        createdBy;
    private LocalDateTime createdDate;
    private BigDecimal    discountRate;
    private BigDecimal    discountTotalPrice;
    private Integer       isDeleted;
    private String        modifiedBy;
    private LocalDateTime modifiedDate;
    private String        name;
    private BigDecimal    totalPrice;
    private String        type;

    public MealInfo() {}

    public MealInfo(MealInfo value) {
        this.id = value.id;
        this.code = value.code;
        this.createdBy = value.createdBy;
        this.createdDate = value.createdDate;
        this.discountRate = value.discountRate;
        this.discountTotalPrice = value.discountTotalPrice;
        this.isDeleted = value.isDeleted;
        this.modifiedBy = value.modifiedBy;
        this.modifiedDate = value.modifiedDate;
        this.name = value.name;
        this.totalPrice = value.totalPrice;
        this.type = value.type;
    }

    public MealInfo(
        Long          id,
        String        code,
        String        createdBy,
        LocalDateTime createdDate,
        BigDecimal    discountRate,
        BigDecimal    discountTotalPrice,
        Integer       isDeleted,
        String        modifiedBy,
        LocalDateTime modifiedDate,
        String        name,
        BigDecimal    totalPrice,
        String        type
    ) {
        this.id = id;
        this.code = code;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.discountRate = discountRate;
        this.discountTotalPrice = discountTotalPrice;
        this.isDeleted = isDeleted;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
        this.name = name;
        this.totalPrice = totalPrice;
        this.type = type;
    }

    /**
     * Getter for <code>physical_examination_system.meal_info.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>physical_examination_system.meal_info.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>physical_examination_system.meal_info.code</code>.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>physical_examination_system.meal_info.code</code>.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for <code>physical_examination_system.meal_info.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>physical_examination_system.meal_info.created_by</code>.
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Getter for <code>physical_examination_system.meal_info.created_date</code>.
     */
    public LocalDateTime getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for <code>physical_examination_system.meal_info.created_date</code>.
     */
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Getter for <code>physical_examination_system.meal_info.discount_rate</code>.
     */
    public BigDecimal getDiscountRate() {
        return this.discountRate;
    }

    /**
     * Setter for <code>physical_examination_system.meal_info.discount_rate</code>.
     */
    public void setDiscountRate(BigDecimal discountRate) {
        this.discountRate = discountRate;
    }

    /**
     * Getter for <code>physical_examination_system.meal_info.discount_total_price</code>.
     */
    public BigDecimal getDiscountTotalPrice() {
        return this.discountTotalPrice;
    }

    /**
     * Setter for <code>physical_examination_system.meal_info.discount_total_price</code>.
     */
    public void setDiscountTotalPrice(BigDecimal discountTotalPrice) {
        this.discountTotalPrice = discountTotalPrice;
    }

    /**
     * Getter for <code>physical_examination_system.meal_info.is_deleted</code>.
     */
    public Integer getIsDeleted() {
        return this.isDeleted;
    }

    /**
     * Setter for <code>physical_examination_system.meal_info.is_deleted</code>.
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * Getter for <code>physical_examination_system.meal_info.modified_by</code>.
     */
    public String getModifiedBy() {
        return this.modifiedBy;
    }

    /**
     * Setter for <code>physical_examination_system.meal_info.modified_by</code>.
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * Getter for <code>physical_examination_system.meal_info.modified_date</code>.
     */
    public LocalDateTime getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for <code>physical_examination_system.meal_info.modified_date</code>.
     */
    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * Getter for <code>physical_examination_system.meal_info.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>physical_examination_system.meal_info.name</code>.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>physical_examination_system.meal_info.total_price</code>.
     */
    public BigDecimal getTotalPrice() {
        return this.totalPrice;
    }

    /**
     * Setter for <code>physical_examination_system.meal_info.total_price</code>.
     */
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * Getter for <code>physical_examination_system.meal_info.type</code>.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>physical_examination_system.meal_info.type</code>.
     */
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MealInfo (");

        sb.append(id);
        sb.append(", ").append(code);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdDate);
        sb.append(", ").append(discountRate);
        sb.append(", ").append(discountTotalPrice);
        sb.append(", ").append(isDeleted);
        sb.append(", ").append(modifiedBy);
        sb.append(", ").append(modifiedDate);
        sb.append(", ").append(name);
        sb.append(", ").append(totalPrice);
        sb.append(", ").append(type);

        sb.append(")");
        return sb.toString();
    }
}
