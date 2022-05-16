/*
 * This file is generated by jOOQ.
 */
package com.example.boot.data.database.jooq.tables;


import com.example.boot.data.database.jooq.Keys;
import com.example.boot.data.database.jooq.PhysicalExaminationSystem;
import com.example.boot.data.database.jooq.tables.records.PatientExamInfoRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row19;
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
public class PatientExamInfo extends TableImpl<PatientExamInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>physical_examination_system.patient_exam_info</code>
     */
    public static final PatientExamInfo PATIENT_EXAM_INFO = new PatientExamInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PatientExamInfoRecord> getRecordType() {
        return PatientExamInfoRecord.class;
    }

    /**
     * The column <code>physical_examination_system.patient_exam_info.id</code>.
     */
    public final TableField<PatientExamInfoRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>physical_examination_system.patient_exam_info.age</code>.
     */
    public final TableField<PatientExamInfoRecord, Integer> AGE = createField(DSL.name("age"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>physical_examination_system.patient_exam_info.check_completion_time</code>.
     */
    public final TableField<PatientExamInfoRecord, LocalDateTime> CHECK_COMPLETION_TIME = createField(DSL.name("check_completion_time"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>physical_examination_system.patient_exam_info.check_outage_time</code>.
     */
    public final TableField<PatientExamInfoRecord, LocalDateTime> CHECK_OUTAGE_TIME = createField(DSL.name("check_outage_time"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>physical_examination_system.patient_exam_info.check_status</code>.
     */
    public final TableField<PatientExamInfoRecord, Integer> CHECK_STATUS = createField(DSL.name("check_status"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>physical_examination_system.patient_exam_info.created_by</code>.
     */
    public final TableField<PatientExamInfoRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.patient_exam_info.created_date</code>.
     */
    public final TableField<PatientExamInfoRecord, LocalDateTime> CREATED_DATE = createField(DSL.name("created_date"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>physical_examination_system.patient_exam_info.gender</code>.
     */
    public final TableField<PatientExamInfoRecord, Integer> GENDER = createField(DSL.name("gender"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>physical_examination_system.patient_exam_info.id_card_no</code>.
     */
    public final TableField<PatientExamInfoRecord, String> ID_CARD_NO = createField(DSL.name("id_card_no"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.patient_exam_info.is_deleted</code>.
     */
    public final TableField<PatientExamInfoRecord, Integer> IS_DELETED = createField(DSL.name("is_deleted"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>physical_examination_system.patient_exam_info.is_register</code>.
     */
    public final TableField<PatientExamInfoRecord, LocalDateTime> IS_REGISTER = createField(DSL.name("is_register"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>physical_examination_system.patient_exam_info.modified_by</code>.
     */
    public final TableField<PatientExamInfoRecord, String> MODIFIED_BY = createField(DSL.name("modified_by"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.patient_exam_info.modified_date</code>.
     */
    public final TableField<PatientExamInfoRecord, LocalDateTime> MODIFIED_DATE = createField(DSL.name("modified_date"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>physical_examination_system.patient_exam_info.name</code>.
     */
    public final TableField<PatientExamInfoRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.patient_exam_info.password</code>.
     */
    public final TableField<PatientExamInfoRecord, String> PASSWORD = createField(DSL.name("password"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.patient_exam_info.phone</code>.
     */
    public final TableField<PatientExamInfoRecord, String> PHONE = createField(DSL.name("phone"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.patient_exam_info.register_time</code>.
     */
    public final TableField<PatientExamInfoRecord, LocalDateTime> REGISTER_TIME = createField(DSL.name("register_time"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>physical_examination_system.patient_exam_info.report_status</code>.
     */
    public final TableField<PatientExamInfoRecord, Integer> REPORT_STATUS = createField(DSL.name("report_status"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>physical_examination_system.patient_exam_info.username</code>.
     */
    public final TableField<PatientExamInfoRecord, String> USERNAME = createField(DSL.name("username"), SQLDataType.VARCHAR(255), this, "");

    private PatientExamInfo(Name alias, Table<PatientExamInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private PatientExamInfo(Name alias, Table<PatientExamInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>physical_examination_system.patient_exam_info</code> table reference
     */
    public PatientExamInfo(String alias) {
        this(DSL.name(alias), PATIENT_EXAM_INFO);
    }

    /**
     * Create an aliased <code>physical_examination_system.patient_exam_info</code> table reference
     */
    public PatientExamInfo(Name alias) {
        this(alias, PATIENT_EXAM_INFO);
    }

    /**
     * Create a <code>physical_examination_system.patient_exam_info</code> table reference
     */
    public PatientExamInfo() {
        this(DSL.name("patient_exam_info"), null);
    }

    public <O extends Record> PatientExamInfo(Table<O> child, ForeignKey<O, PatientExamInfoRecord> key) {
        super(child, key, PATIENT_EXAM_INFO);
    }

    @Override
    public Schema getSchema() {
        return PhysicalExaminationSystem.PHYSICAL_EXAMINATION_SYSTEM;
    }

    @Override
    public UniqueKey<PatientExamInfoRecord> getPrimaryKey() {
        return Keys.KEY_PATIENT_EXAM_INFO_PRIMARY;
    }

    @Override
    public List<UniqueKey<PatientExamInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<PatientExamInfoRecord>>asList(Keys.KEY_PATIENT_EXAM_INFO_PRIMARY);
    }

    @Override
    public PatientExamInfo as(String alias) {
        return new PatientExamInfo(DSL.name(alias), this);
    }

    @Override
    public PatientExamInfo as(Name alias) {
        return new PatientExamInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PatientExamInfo rename(String name) {
        return new PatientExamInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PatientExamInfo rename(Name name) {
        return new PatientExamInfo(name, null);
    }

    // -------------------------------------------------------------------------
    // Row19 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row19<Long, Integer, LocalDateTime, LocalDateTime, Integer, String, LocalDateTime, Integer, String, Integer, LocalDateTime, String, LocalDateTime, String, String, String, LocalDateTime, Integer, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }
}
