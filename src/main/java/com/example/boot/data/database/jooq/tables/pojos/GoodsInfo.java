/*
 * This file is generated by jOOQ.
 */
package com.example.boot.data.database.jooq.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


/**
 * 商品信息
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GoodsInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    private String        createdBy;
    private String        modifiedBy;
    private Integer       isDeleted;
    private Integer       type;
    private String        code;
    private String        name;
    private BigDecimal    price;

    public GoodsInfo() {}

    public GoodsInfo(GoodsInfo value) {
        this.id = value.id;
        this.createdDate = value.createdDate;
        this.modifiedDate = value.modifiedDate;
        this.createdBy = value.createdBy;
        this.modifiedBy = value.modifiedBy;
        this.isDeleted = value.isDeleted;
        this.type = value.type;
        this.code = value.code;
        this.name = value.name;
        this.price = value.price;
    }

    public GoodsInfo(
        Long          id,
        LocalDateTime createdDate,
        LocalDateTime modifiedDate,
        String        createdBy,
        String        modifiedBy,
        Integer       isDeleted,
        Integer       type,
        String        code,
        String        name,
        BigDecimal    price
    ) {
        this.id = id;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
        this.isDeleted = isDeleted;
        this.type = type;
        this.code = code;
        this.name = name;
        this.price = price;
    }

    /**
     * Getter for <code>physical_examination_system.goods_info.id</code>. id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>physical_examination_system.goods_info.id</code>. id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>physical_examination_system.goods_info.created_date</code>. createdDate
     */
    public LocalDateTime getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for <code>physical_examination_system.goods_info.created_date</code>. createdDate
     */
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Getter for <code>physical_examination_system.goods_info.modified_date</code>. modifiedDate
     */
    public LocalDateTime getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for <code>physical_examination_system.goods_info.modified_date</code>. modifiedDate
     */
    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * Getter for <code>physical_examination_system.goods_info.created_by</code>. createdBy
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>physical_examination_system.goods_info.created_by</code>. createdBy
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Getter for <code>physical_examination_system.goods_info.modified_by</code>. modifiedBy
     */
    public String getModifiedBy() {
        return this.modifiedBy;
    }

    /**
     * Setter for <code>physical_examination_system.goods_info.modified_by</code>. modifiedBy
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * Getter for <code>physical_examination_system.goods_info.is_deleted</code>. isDeleted
     */
    public Integer getIsDeleted() {
        return this.isDeleted;
    }

    /**
     * Setter for <code>physical_examination_system.goods_info.is_deleted</code>. isDeleted
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * Getter for <code>physical_examination_system.goods_info.type</code>. 商品类型
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * Setter for <code>physical_examination_system.goods_info.type</code>. 商品类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * Getter for <code>physical_examination_system.goods_info.code</code>. 商品编号
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>physical_examination_system.goods_info.code</code>. 商品编号
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for <code>physical_examination_system.goods_info.name</code>. 商品名称
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>physical_examination_system.goods_info.name</code>. 商品名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>physical_examination_system.goods_info.price</code>. 商品单价
     */
    public BigDecimal getPrice() {
        return this.price;
    }

    /**
     * Setter for <code>physical_examination_system.goods_info.price</code>. 商品单价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GoodsInfo (");

        sb.append(id);
        sb.append(", ").append(createdDate);
        sb.append(", ").append(modifiedDate);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(modifiedBy);
        sb.append(", ").append(isDeleted);
        sb.append(", ").append(type);
        sb.append(", ").append(code);
        sb.append(", ").append(name);
        sb.append(", ").append(price);

        sb.append(")");
        return sb.toString();
    }
}
