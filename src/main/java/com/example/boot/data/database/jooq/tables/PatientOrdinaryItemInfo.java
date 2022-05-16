/*
 * This file is generated by jOOQ.
 */
package com.example.boot.data.database.jooq.tables;


import com.example.boot.data.database.jooq.Keys;
import com.example.boot.data.database.jooq.PhysicalExaminationSystem;
import com.example.boot.data.database.jooq.tables.records.PatientOrdinaryItemInfoRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row18;
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
public class PatientOrdinaryItemInfo extends TableImpl<PatientOrdinaryItemInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>physical_examination_system.patient_ordinary_item_info</code>
     */
    public static final PatientOrdinaryItemInfo PATIENT_ORDINARY_ITEM_INFO = new PatientOrdinaryItemInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PatientOrdinaryItemInfoRecord> getRecordType() {
        return PatientOrdinaryItemInfoRecord.class;
    }

    /**
     * The column <code>physical_examination_system.patient_ordinary_item_info.id</code>.
     */
    public final TableField<PatientOrdinaryItemInfoRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>physical_examination_system.patient_ordinary_item_info.created_by</code>.
     */
    public final TableField<PatientOrdinaryItemInfoRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.patient_ordinary_item_info.created_date</code>.
     */
    public final TableField<PatientOrdinaryItemInfoRecord, LocalDateTime> CREATED_DATE = createField(DSL.name("created_date"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>physical_examination_system.patient_ordinary_item_info.fee_item_id</code>.
     */
    public final TableField<PatientOrdinaryItemInfoRecord, Long> FEE_ITEM_ID = createField(DSL.name("fee_item_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>physical_examination_system.patient_ordinary_item_info.is_abnormal</code>.
     */
    public final TableField<PatientOrdinaryItemInfoRecord, Integer> IS_ABNORMAL = createField(DSL.name("is_abnormal"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>physical_examination_system.patient_ordinary_item_info.is_deleted</code>.
     */
    public final TableField<PatientOrdinaryItemInfoRecord, Integer> IS_DELETED = createField(DSL.name("is_deleted"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>physical_examination_system.patient_ordinary_item_info.is_reference</code>.
     */
    public final TableField<PatientOrdinaryItemInfoRecord, Integer> IS_REFERENCE = createField(DSL.name("is_reference"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>physical_examination_system.patient_ordinary_item_info.item_code</code>.
     */
    public final TableField<PatientOrdinaryItemInfoRecord, String> ITEM_CODE = createField(DSL.name("item_code"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.patient_ordinary_item_info.item_id</code>.
     */
    public final TableField<PatientOrdinaryItemInfoRecord, Long> ITEM_ID = createField(DSL.name("item_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>physical_examination_system.patient_ordinary_item_info.item_name</code>.
     */
    public final TableField<PatientOrdinaryItemInfoRecord, String> ITEM_NAME = createField(DSL.name("item_name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.patient_ordinary_item_info.modified_by</code>.
     */
    public final TableField<PatientOrdinaryItemInfoRecord, String> MODIFIED_BY = createField(DSL.name("modified_by"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.patient_ordinary_item_info.modified_date</code>.
     */
    public final TableField<PatientOrdinaryItemInfoRecord, LocalDateTime> MODIFIED_DATE = createField(DSL.name("modified_date"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>physical_examination_system.patient_ordinary_item_info.patient_fee_item_id</code>.
     */
    public final TableField<PatientOrdinaryItemInfoRecord, Long> PATIENT_FEE_ITEM_ID = createField(DSL.name("patient_fee_item_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>physical_examination_system.patient_ordinary_item_info.reference_max</code>.
     */
    public final TableField<PatientOrdinaryItemInfoRecord, String> REFERENCE_MAX = createField(DSL.name("reference_max"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.patient_ordinary_item_info.reference_min</code>.
     */
    public final TableField<PatientOrdinaryItemInfoRecord, String> REFERENCE_MIN = createField(DSL.name("reference_min"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.patient_ordinary_item_info.result</code>.
     */
    public final TableField<PatientOrdinaryItemInfoRecord, String> RESULT = createField(DSL.name("result"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.patient_ordinary_item_info.result_type</code>.
     */
    public final TableField<PatientOrdinaryItemInfoRecord, Integer> RESULT_TYPE = createField(DSL.name("result_type"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>physical_examination_system.patient_ordinary_item_info.unit</code>.
     */
    public final TableField<PatientOrdinaryItemInfoRecord, String> UNIT = createField(DSL.name("unit"), SQLDataType.VARCHAR(255), this, "");

    private PatientOrdinaryItemInfo(Name alias, Table<PatientOrdinaryItemInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private PatientOrdinaryItemInfo(Name alias, Table<PatientOrdinaryItemInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>physical_examination_system.patient_ordinary_item_info</code> table reference
     */
    public PatientOrdinaryItemInfo(String alias) {
        this(DSL.name(alias), PATIENT_ORDINARY_ITEM_INFO);
    }

    /**
     * Create an aliased <code>physical_examination_system.patient_ordinary_item_info</code> table reference
     */
    public PatientOrdinaryItemInfo(Name alias) {
        this(alias, PATIENT_ORDINARY_ITEM_INFO);
    }

    /**
     * Create a <code>physical_examination_system.patient_ordinary_item_info</code> table reference
     */
    public PatientOrdinaryItemInfo() {
        this(DSL.name("patient_ordinary_item_info"), null);
    }

    public <O extends Record> PatientOrdinaryItemInfo(Table<O> child, ForeignKey<O, PatientOrdinaryItemInfoRecord> key) {
        super(child, key, PATIENT_ORDINARY_ITEM_INFO);
    }

    @Override
    public Schema getSchema() {
        return PhysicalExaminationSystem.PHYSICAL_EXAMINATION_SYSTEM;
    }

    @Override
    public UniqueKey<PatientOrdinaryItemInfoRecord> getPrimaryKey() {
        return Keys.KEY_PATIENT_ORDINARY_ITEM_INFO_PRIMARY;
    }

    @Override
    public List<UniqueKey<PatientOrdinaryItemInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<PatientOrdinaryItemInfoRecord>>asList(Keys.KEY_PATIENT_ORDINARY_ITEM_INFO_PRIMARY);
    }

    @Override
    public PatientOrdinaryItemInfo as(String alias) {
        return new PatientOrdinaryItemInfo(DSL.name(alias), this);
    }

    @Override
    public PatientOrdinaryItemInfo as(Name alias) {
        return new PatientOrdinaryItemInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PatientOrdinaryItemInfo rename(String name) {
        return new PatientOrdinaryItemInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PatientOrdinaryItemInfo rename(Name name) {
        return new PatientOrdinaryItemInfo(name, null);
    }

    // -------------------------------------------------------------------------
    // Row18 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row18<Long, String, LocalDateTime, Long, Integer, Integer, Integer, String, Long, String, String, LocalDateTime, Long, String, String, String, Integer, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }
}