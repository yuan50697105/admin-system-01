/*
 * This file is generated by jOOQ.
 */
package com.example.boot.data.database.jooq.tables;


import com.example.boot.data.database.jooq.Keys;
import com.example.boot.data.database.jooq.PhysicalExaminationSystem;
import com.example.boot.data.database.jooq.tables.records.FeeItemInfoRecord;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FeeItemInfo extends TableImpl<FeeItemInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>physical_examination_system.fee_item_info</code>
     */
    public static final FeeItemInfo FEE_ITEM_INFO = new FeeItemInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FeeItemInfoRecord> getRecordType() {
        return FeeItemInfoRecord.class;
    }

    /**
     * The column <code>physical_examination_system.fee_item_info.id</code>.
     */
    public final TableField<FeeItemInfoRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>physical_examination_system.fee_item_info.code</code>.
     */
    public final TableField<FeeItemInfoRecord, String> CODE = createField(DSL.name("code"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.fee_item_info.created_by</code>.
     */
    public final TableField<FeeItemInfoRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.fee_item_info.created_date</code>.
     */
    public final TableField<FeeItemInfoRecord, LocalDateTime> CREATED_DATE = createField(DSL.name("created_date"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>physical_examination_system.fee_item_info.is_deleted</code>.
     */
    public final TableField<FeeItemInfoRecord, Integer> IS_DELETED = createField(DSL.name("is_deleted"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>physical_examination_system.fee_item_info.modified_by</code>.
     */
    public final TableField<FeeItemInfoRecord, String> MODIFIED_BY = createField(DSL.name("modified_by"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.fee_item_info.modified_date</code>.
     */
    public final TableField<FeeItemInfoRecord, LocalDateTime> MODIFIED_DATE = createField(DSL.name("modified_date"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>physical_examination_system.fee_item_info.name</code>.
     */
    public final TableField<FeeItemInfoRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.fee_item_info.position</code>.
     */
    public final TableField<FeeItemInfoRecord, String> POSITION = createField(DSL.name("position"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.fee_item_info.price</code>.
     */
    public final TableField<FeeItemInfoRecord, BigDecimal> PRICE = createField(DSL.name("price"), SQLDataType.DECIMAL(19, 2), this, "");

    /**
     * The column <code>physical_examination_system.fee_item_info.type</code>.
     */
    public final TableField<FeeItemInfoRecord, String> TYPE = createField(DSL.name("type"), SQLDataType.VARCHAR(255), this, "");

    private FeeItemInfo(Name alias, Table<FeeItemInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private FeeItemInfo(Name alias, Table<FeeItemInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>physical_examination_system.fee_item_info</code> table reference
     */
    public FeeItemInfo(String alias) {
        this(DSL.name(alias), FEE_ITEM_INFO);
    }

    /**
     * Create an aliased <code>physical_examination_system.fee_item_info</code> table reference
     */
    public FeeItemInfo(Name alias) {
        this(alias, FEE_ITEM_INFO);
    }

    /**
     * Create a <code>physical_examination_system.fee_item_info</code> table reference
     */
    public FeeItemInfo() {
        this(DSL.name("fee_item_info"), null);
    }

    public <O extends Record> FeeItemInfo(Table<O> child, ForeignKey<O, FeeItemInfoRecord> key) {
        super(child, key, FEE_ITEM_INFO);
    }

    @Override
    public Schema getSchema() {
        return PhysicalExaminationSystem.PHYSICAL_EXAMINATION_SYSTEM;
    }

    @Override
    public UniqueKey<FeeItemInfoRecord> getPrimaryKey() {
        return Keys.KEY_FEE_ITEM_INFO_PRIMARY;
    }

    @Override
    public List<UniqueKey<FeeItemInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<FeeItemInfoRecord>>asList(Keys.KEY_FEE_ITEM_INFO_PRIMARY);
    }

    @Override
    public FeeItemInfo as(String alias) {
        return new FeeItemInfo(DSL.name(alias), this);
    }

    @Override
    public FeeItemInfo as(Name alias) {
        return new FeeItemInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FeeItemInfo rename(String name) {
        return new FeeItemInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FeeItemInfo rename(Name name) {
        return new FeeItemInfo(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, String, String, LocalDateTime, Integer, String, LocalDateTime, String, String, BigDecimal, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}
