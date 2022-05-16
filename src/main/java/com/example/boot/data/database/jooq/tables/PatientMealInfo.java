/*
 * This file is generated by jOOQ.
 */
package com.example.boot.data.database.jooq.tables;


import com.example.boot.data.database.jooq.Keys;
import com.example.boot.data.database.jooq.PhysicalExaminationSystem;
import com.example.boot.data.database.jooq.tables.records.PatientMealInfoRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
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
public class PatientMealInfo extends TableImpl<PatientMealInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>physical_examination_system.patient_meal_info</code>
     */
    public static final PatientMealInfo PATIENT_MEAL_INFO = new PatientMealInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PatientMealInfoRecord> getRecordType() {
        return PatientMealInfoRecord.class;
    }

    /**
     * The column <code>physical_examination_system.patient_meal_info.id</code>.
     */
    public final TableField<PatientMealInfoRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>physical_examination_system.patient_meal_info.created_by</code>.
     */
    public final TableField<PatientMealInfoRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.patient_meal_info.created_date</code>.
     */
    public final TableField<PatientMealInfoRecord, LocalDateTime> CREATED_DATE = createField(DSL.name("created_date"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>physical_examination_system.patient_meal_info.is_deleted</code>.
     */
    public final TableField<PatientMealInfoRecord, Integer> IS_DELETED = createField(DSL.name("is_deleted"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>physical_examination_system.patient_meal_info.meal_id</code>.
     */
    public final TableField<PatientMealInfoRecord, Long> MEAL_ID = createField(DSL.name("meal_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>physical_examination_system.patient_meal_info.meal_name</code>.
     */
    public final TableField<PatientMealInfoRecord, String> MEAL_NAME = createField(DSL.name("meal_name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.patient_meal_info.modified_by</code>.
     */
    public final TableField<PatientMealInfoRecord, String> MODIFIED_BY = createField(DSL.name("modified_by"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.patient_meal_info.modified_date</code>.
     */
    public final TableField<PatientMealInfoRecord, LocalDateTime> MODIFIED_DATE = createField(DSL.name("modified_date"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>physical_examination_system.patient_meal_info.patient_code</code>.
     */
    public final TableField<PatientMealInfoRecord, String> PATIENT_CODE = createField(DSL.name("patient_code"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.patient_meal_info.patient_id</code>.
     */
    public final TableField<PatientMealInfoRecord, Long> PATIENT_ID = createField(DSL.name("patient_id"), SQLDataType.BIGINT, this, "");

    private PatientMealInfo(Name alias, Table<PatientMealInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private PatientMealInfo(Name alias, Table<PatientMealInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>physical_examination_system.patient_meal_info</code> table reference
     */
    public PatientMealInfo(String alias) {
        this(DSL.name(alias), PATIENT_MEAL_INFO);
    }

    /**
     * Create an aliased <code>physical_examination_system.patient_meal_info</code> table reference
     */
    public PatientMealInfo(Name alias) {
        this(alias, PATIENT_MEAL_INFO);
    }

    /**
     * Create a <code>physical_examination_system.patient_meal_info</code> table reference
     */
    public PatientMealInfo() {
        this(DSL.name("patient_meal_info"), null);
    }

    public <O extends Record> PatientMealInfo(Table<O> child, ForeignKey<O, PatientMealInfoRecord> key) {
        super(child, key, PATIENT_MEAL_INFO);
    }

    @Override
    public Schema getSchema() {
        return PhysicalExaminationSystem.PHYSICAL_EXAMINATION_SYSTEM;
    }

    @Override
    public UniqueKey<PatientMealInfoRecord> getPrimaryKey() {
        return Keys.KEY_PATIENT_MEAL_INFO_PRIMARY;
    }

    @Override
    public List<UniqueKey<PatientMealInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<PatientMealInfoRecord>>asList(Keys.KEY_PATIENT_MEAL_INFO_PRIMARY);
    }

    @Override
    public PatientMealInfo as(String alias) {
        return new PatientMealInfo(DSL.name(alias), this);
    }

    @Override
    public PatientMealInfo as(Name alias) {
        return new PatientMealInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PatientMealInfo rename(String name) {
        return new PatientMealInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PatientMealInfo rename(Name name) {
        return new PatientMealInfo(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, String, LocalDateTime, Integer, Long, String, String, LocalDateTime, String, Long> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}