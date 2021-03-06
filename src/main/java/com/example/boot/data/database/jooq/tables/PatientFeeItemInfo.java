/*
 * This file is generated by jOOQ.
 */
package com.example.boot.data.database.jooq.tables;


import com.example.boot.data.database.jooq.Keys;
import com.example.boot.data.database.jooq.PhysicalExaminationSystem;
import com.example.boot.data.database.jooq.tables.records.PatientFeeItemInfoRecord;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row16;
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
public class PatientFeeItemInfo extends TableImpl<PatientFeeItemInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>physical_examination_system.patient_fee_item_info</code>
     */
    public static final PatientFeeItemInfo PATIENT_FEE_ITEM_INFO = new PatientFeeItemInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PatientFeeItemInfoRecord> getRecordType() {
        return PatientFeeItemInfoRecord.class;
    }

    /**
     * The column <code>physical_examination_system.patient_fee_item_info.id</code>.
     */
    public final TableField<PatientFeeItemInfoRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>physical_examination_system.patient_fee_item_info.created_by</code>.
     */
    public final TableField<PatientFeeItemInfoRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.patient_fee_item_info.created_date</code>.
     */
    public final TableField<PatientFeeItemInfoRecord, LocalDateTime> CREATED_DATE = createField(DSL.name("created_date"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>physical_examination_system.patient_fee_item_info.fee_item_code</code>.
     */
    public final TableField<PatientFeeItemInfoRecord, String> FEE_ITEM_CODE = createField(DSL.name("fee_item_code"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.patient_fee_item_info.fee_item_id</code>.
     */
    public final TableField<PatientFeeItemInfoRecord, Long> FEE_ITEM_ID = createField(DSL.name("fee_item_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>physical_examination_system.patient_fee_item_info.fee_item_name</code>.
     */
    public final TableField<PatientFeeItemInfoRecord, String> FEE_ITEM_NAME = createField(DSL.name("fee_item_name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.patient_fee_item_info.fee_item_price</code>.
     */
    public final TableField<PatientFeeItemInfoRecord, BigDecimal> FEE_ITEM_PRICE = createField(DSL.name("fee_item_price"), SQLDataType.DECIMAL(19, 2), this, "");

    /**
     * The column <code>physical_examination_system.patient_fee_item_info.fee_item_type</code>.
     */
    public final TableField<PatientFeeItemInfoRecord, Integer> FEE_ITEM_TYPE = createField(DSL.name("fee_item_type"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>physical_examination_system.patient_fee_item_info.is_deleted</code>.
     */
    public final TableField<PatientFeeItemInfoRecord, Integer> IS_DELETED = createField(DSL.name("is_deleted"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>physical_examination_system.patient_fee_item_info.meal_code</code>.
     */
    public final TableField<PatientFeeItemInfoRecord, String> MEAL_CODE = createField(DSL.name("meal_code"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.patient_fee_item_info.meal_id</code>.
     */
    public final TableField<PatientFeeItemInfoRecord, Long> MEAL_ID = createField(DSL.name("meal_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>physical_examination_system.patient_fee_item_info.modified_by</code>.
     */
    public final TableField<PatientFeeItemInfoRecord, String> MODIFIED_BY = createField(DSL.name("modified_by"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.patient_fee_item_info.modified_date</code>.
     */
    public final TableField<PatientFeeItemInfoRecord, LocalDateTime> MODIFIED_DATE = createField(DSL.name("modified_date"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>physical_examination_system.patient_fee_item_info.patient_exam_code</code>.
     */
    public final TableField<PatientFeeItemInfoRecord, String> PATIENT_EXAM_CODE = createField(DSL.name("patient_exam_code"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.patient_fee_item_info.patient_exam_id</code>.
     */
    public final TableField<PatientFeeItemInfoRecord, Long> PATIENT_EXAM_ID = createField(DSL.name("patient_exam_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>physical_examination_system.patient_fee_item_info.patient_meal_id</code>.
     */
    public final TableField<PatientFeeItemInfoRecord, Long> PATIENT_MEAL_ID = createField(DSL.name("patient_meal_id"), SQLDataType.BIGINT, this, "");

    private PatientFeeItemInfo(Name alias, Table<PatientFeeItemInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private PatientFeeItemInfo(Name alias, Table<PatientFeeItemInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>physical_examination_system.patient_fee_item_info</code> table reference
     */
    public PatientFeeItemInfo(String alias) {
        this(DSL.name(alias), PATIENT_FEE_ITEM_INFO);
    }

    /**
     * Create an aliased <code>physical_examination_system.patient_fee_item_info</code> table reference
     */
    public PatientFeeItemInfo(Name alias) {
        this(alias, PATIENT_FEE_ITEM_INFO);
    }

    /**
     * Create a <code>physical_examination_system.patient_fee_item_info</code> table reference
     */
    public PatientFeeItemInfo() {
        this(DSL.name("patient_fee_item_info"), null);
    }

    public <O extends Record> PatientFeeItemInfo(Table<O> child, ForeignKey<O, PatientFeeItemInfoRecord> key) {
        super(child, key, PATIENT_FEE_ITEM_INFO);
    }

    @Override
    public Schema getSchema() {
        return PhysicalExaminationSystem.PHYSICAL_EXAMINATION_SYSTEM;
    }

    @Override
    public UniqueKey<PatientFeeItemInfoRecord> getPrimaryKey() {
        return Keys.KEY_PATIENT_FEE_ITEM_INFO_PRIMARY;
    }

    @Override
    public List<UniqueKey<PatientFeeItemInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<PatientFeeItemInfoRecord>>asList(Keys.KEY_PATIENT_FEE_ITEM_INFO_PRIMARY);
    }

    @Override
    public PatientFeeItemInfo as(String alias) {
        return new PatientFeeItemInfo(DSL.name(alias), this);
    }

    @Override
    public PatientFeeItemInfo as(Name alias) {
        return new PatientFeeItemInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PatientFeeItemInfo rename(String name) {
        return new PatientFeeItemInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PatientFeeItemInfo rename(Name name) {
        return new PatientFeeItemInfo(name, null);
    }

    // -------------------------------------------------------------------------
    // Row16 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row16<Long, String, LocalDateTime, String, Long, String, BigDecimal, Integer, Integer, String, Long, String, LocalDateTime, String, Long, Long> fieldsRow() {
        return (Row16) super.fieldsRow();
    }
}
