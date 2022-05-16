/*
 * This file is generated by jOOQ.
 */
package com.example.boot.data.database.jooq.tables;


import com.example.boot.data.database.jooq.Keys;
import com.example.boot.data.database.jooq.PhysicalExaminationSystem;
import com.example.boot.data.database.jooq.tables.records.TeamPatientInfoRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
 * 团队人员信息
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TeamPatientInfo extends TableImpl<TeamPatientInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>physical_examination_system.team_patient_info</code>
     */
    public static final TeamPatientInfo TEAM_PATIENT_INFO = new TeamPatientInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TeamPatientInfoRecord> getRecordType() {
        return TeamPatientInfoRecord.class;
    }

    /**
     * The column <code>physical_examination_system.team_patient_info.id</code>. id
     */
    public final TableField<TeamPatientInfoRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "id");

    /**
     * The column <code>physical_examination_system.team_patient_info.created_date</code>. createdDate
     */
    public final TableField<TeamPatientInfoRecord, LocalDateTime> CREATED_DATE = createField(DSL.name("created_date"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.inline("1000-01-01 00:00:00", SQLDataType.LOCALDATETIME)), this, "createdDate");

    /**
     * The column <code>physical_examination_system.team_patient_info.modified_date</code>. modifiedDate
     */
    public final TableField<TeamPatientInfoRecord, LocalDateTime> MODIFIED_DATE = createField(DSL.name("modified_date"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.inline("1000-01-01 00:00:00", SQLDataType.LOCALDATETIME)), this, "modifiedDate");

    /**
     * The column <code>physical_examination_system.team_patient_info.created_by</code>. createdBy
     */
    public final TableField<TeamPatientInfoRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(50).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "createdBy");

    /**
     * The column <code>physical_examination_system.team_patient_info.modified_by</code>. modifiedBy
     */
    public final TableField<TeamPatientInfoRecord, String> MODIFIED_BY = createField(DSL.name("modified_by"), SQLDataType.VARCHAR(50).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "modifiedBy");

    /**
     * The column <code>physical_examination_system.team_patient_info.is_deleted</code>. isDeleted
     */
    public final TableField<TeamPatientInfoRecord, Integer> IS_DELETED = createField(DSL.name("is_deleted"), SQLDataType.INTEGER.defaultValue(DSL.inline("-1", SQLDataType.INTEGER)), this, "isDeleted");

    /**
     * The column <code>physical_examination_system.team_patient_info.customer_id</code>. 客户ID
     */
    public final TableField<TeamPatientInfoRecord, Long> CUSTOMER_ID = createField(DSL.name("customer_id"), SQLDataType.BIGINT.defaultValue(DSL.inline("-1", SQLDataType.BIGINT)), this, "客户ID");

    /**
     * The column <code>physical_examination_system.team_patient_info.customer_name</code>. 客户名称
     */
    public final TableField<TeamPatientInfoRecord, String> CUSTOMER_NAME = createField(DSL.name("customer_name"), SQLDataType.VARCHAR(50).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "客户名称");

    /**
     * The column <code>physical_examination_system.team_patient_info.team_id</code>. 团体ID
     */
    public final TableField<TeamPatientInfoRecord, Long> TEAM_ID = createField(DSL.name("team_id"), SQLDataType.BIGINT.defaultValue(DSL.inline("-1", SQLDataType.BIGINT)), this, "团体ID");

    /**
     * The column <code>physical_examination_system.team_patient_info.team_code</code>. 团队编号
     */
    public final TableField<TeamPatientInfoRecord, String> TEAM_CODE = createField(DSL.name("team_code"), SQLDataType.VARCHAR(50).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "团队编号");

    /**
     * The column <code>physical_examination_system.team_patient_info.team_name</code>. 团队名称
     */
    public final TableField<TeamPatientInfoRecord, String> TEAM_NAME = createField(DSL.name("team_name"), SQLDataType.VARCHAR(50).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "团队名称");

    /**
     * The column <code>physical_examination_system.team_patient_info.patient_id</code>. 体检人ID
     */
    public final TableField<TeamPatientInfoRecord, Long> PATIENT_ID = createField(DSL.name("patient_id"), SQLDataType.BIGINT.defaultValue(DSL.inline("-1", SQLDataType.BIGINT)), this, "体检人ID");

    /**
     * The column <code>physical_examination_system.team_patient_info.patient_code</code>. 体检人编号
     */
    public final TableField<TeamPatientInfoRecord, String> PATIENT_CODE = createField(DSL.name("patient_code"), SQLDataType.VARCHAR(50).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "体检人编号");

    /**
     * The column <code>physical_examination_system.team_patient_info.patient_name</code>. 体检人姓名
     */
    public final TableField<TeamPatientInfoRecord, String> PATIENT_NAME = createField(DSL.name("patient_name"), SQLDataType.VARCHAR(50).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "体检人姓名");

    /**
     * The column <code>physical_examination_system.team_patient_info.patient_id_card</code>. 体检人证件号
     */
    public final TableField<TeamPatientInfoRecord, String> PATIENT_ID_CARD = createField(DSL.name("patient_id_card"), SQLDataType.VARCHAR(50).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "体检人证件号");

    /**
     * The column <code>physical_examination_system.team_patient_info.patient_gender</code>. 体检人性别
     */
    public final TableField<TeamPatientInfoRecord, String> PATIENT_GENDER = createField(DSL.name("patient_gender"), SQLDataType.VARCHAR(50).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "体检人性别");

    /**
     * The column <code>physical_examination_system.team_patient_info.patient_age</code>. 体检人年龄
     */
    public final TableField<TeamPatientInfoRecord, Integer> PATIENT_AGE = createField(DSL.name("patient_age"), SQLDataType.INTEGER.defaultValue(DSL.inline("-1", SQLDataType.INTEGER)), this, "体检人年龄");

    /**
     * The column <code>physical_examination_system.team_patient_info.patient_status</code>. 体检人状态
     */
    public final TableField<TeamPatientInfoRecord, Integer> PATIENT_STATUS = createField(DSL.name("patient_status"), SQLDataType.INTEGER.defaultValue(DSL.inline("-1", SQLDataType.INTEGER)), this, "体检人状态");

    private TeamPatientInfo(Name alias, Table<TeamPatientInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private TeamPatientInfo(Name alias, Table<TeamPatientInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("团队人员信息"), TableOptions.table());
    }

    /**
     * Create an aliased <code>physical_examination_system.team_patient_info</code> table reference
     */
    public TeamPatientInfo(String alias) {
        this(DSL.name(alias), TEAM_PATIENT_INFO);
    }

    /**
     * Create an aliased <code>physical_examination_system.team_patient_info</code> table reference
     */
    public TeamPatientInfo(Name alias) {
        this(alias, TEAM_PATIENT_INFO);
    }

    /**
     * Create a <code>physical_examination_system.team_patient_info</code> table reference
     */
    public TeamPatientInfo() {
        this(DSL.name("team_patient_info"), null);
    }

    public <O extends Record> TeamPatientInfo(Table<O> child, ForeignKey<O, TeamPatientInfoRecord> key) {
        super(child, key, TEAM_PATIENT_INFO);
    }

    @Override
    public Schema getSchema() {
        return PhysicalExaminationSystem.PHYSICAL_EXAMINATION_SYSTEM;
    }

    @Override
    public Identity<TeamPatientInfoRecord, Long> getIdentity() {
        return (Identity<TeamPatientInfoRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<TeamPatientInfoRecord> getPrimaryKey() {
        return Keys.KEY_TEAM_PATIENT_INFO_PRIMARY;
    }

    @Override
    public List<UniqueKey<TeamPatientInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<TeamPatientInfoRecord>>asList(Keys.KEY_TEAM_PATIENT_INFO_PRIMARY);
    }

    @Override
    public TeamPatientInfo as(String alias) {
        return new TeamPatientInfo(DSL.name(alias), this);
    }

    @Override
    public TeamPatientInfo as(Name alias) {
        return new TeamPatientInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TeamPatientInfo rename(String name) {
        return new TeamPatientInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TeamPatientInfo rename(Name name) {
        return new TeamPatientInfo(name, null);
    }

    // -------------------------------------------------------------------------
    // Row18 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row18<Long, LocalDateTime, LocalDateTime, String, String, Integer, Long, String, Long, String, String, Long, String, String, String, String, Integer, Integer> fieldsRow() {
        return (Row18) super.fieldsRow();
    }
}