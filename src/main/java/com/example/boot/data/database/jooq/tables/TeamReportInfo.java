/*
 * This file is generated by jOOQ.
 */
package com.example.boot.data.database.jooq.tables;


import com.example.boot.data.database.jooq.Keys;
import com.example.boot.data.database.jooq.PhysicalExaminationSystem;
import com.example.boot.data.database.jooq.tables.records.TeamReportInfoRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row15;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * 团队报告信息
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TeamReportInfo extends TableImpl<TeamReportInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>physical_examination_system.team_report_info</code>
     */
    public static final TeamReportInfo TEAM_REPORT_INFO = new TeamReportInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TeamReportInfoRecord> getRecordType() {
        return TeamReportInfoRecord.class;
    }

    /**
     * The column <code>physical_examination_system.team_report_info.id</code>. id
     */
    public final TableField<TeamReportInfoRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "id");

    /**
     * The column <code>physical_examination_system.team_report_info.created_date</code>. createdDate
     */
    public final TableField<TeamReportInfoRecord, LocalDateTime> CREATED_DATE = createField(DSL.name("created_date"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.inline("1000-01-01 00:00:00", SQLDataType.LOCALDATETIME)), this, "createdDate");

    /**
     * The column <code>physical_examination_system.team_report_info.modified_date</code>. modifiedDate
     */
    public final TableField<TeamReportInfoRecord, LocalDateTime> MODIFIED_DATE = createField(DSL.name("modified_date"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.inline("1000-01-01 00:00:00", SQLDataType.LOCALDATETIME)), this, "modifiedDate");

    /**
     * The column <code>physical_examination_system.team_report_info.created_by</code>. createdBy
     */
    public final TableField<TeamReportInfoRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(50).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "createdBy");

    /**
     * The column <code>physical_examination_system.team_report_info.modified_by</code>. modifiedBy
     */
    public final TableField<TeamReportInfoRecord, String> MODIFIED_BY = createField(DSL.name("modified_by"), SQLDataType.VARCHAR(50).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "modifiedBy");

    /**
     * The column <code>physical_examination_system.team_report_info.is_deleted</code>. isDeleted
     */
    public final TableField<TeamReportInfoRecord, Integer> IS_DELETED = createField(DSL.name("is_deleted"), SQLDataType.INTEGER.defaultValue(DSL.inline("-1", SQLDataType.INTEGER)), this, "isDeleted");

    /**
     * The column <code>physical_examination_system.team_report_info.team_id</code>. 团队Id
     */
    public final TableField<TeamReportInfoRecord, Long> TEAM_ID = createField(DSL.name("team_id"), SQLDataType.BIGINT.defaultValue(DSL.inline("-1", SQLDataType.BIGINT)), this, "团队Id");

    /**
     * The column <code>physical_examination_system.team_report_info.team_code</code>. 团队编号
     */
    public final TableField<TeamReportInfoRecord, String> TEAM_CODE = createField(DSL.name("team_code"), SQLDataType.VARCHAR(50).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "团队编号");

    /**
     * The column <code>physical_examination_system.team_report_info.team_name</code>. 团队名称
     */
    public final TableField<TeamReportInfoRecord, String> TEAM_NAME = createField(DSL.name("team_name"), SQLDataType.VARCHAR(50).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "团队名称");

    /**
     * The column <code>physical_examination_system.team_report_info.customer_id</code>. 客户ID
     */
    public final TableField<TeamReportInfoRecord, Long> CUSTOMER_ID = createField(DSL.name("customer_id"), SQLDataType.BIGINT.defaultValue(DSL.inline("-1", SQLDataType.BIGINT)), this, "客户ID");

    /**
     * The column <code>physical_examination_system.team_report_info.customer_code</code>. 客户编号
     */
    public final TableField<TeamReportInfoRecord, String> CUSTOMER_CODE = createField(DSL.name("customer_code"), SQLDataType.VARCHAR(50).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "客户编号");

    /**
     * The column <code>physical_examination_system.team_report_info.customer_name</code>. 客户名称
     */
    public final TableField<TeamReportInfoRecord, String> CUSTOMER_NAME = createField(DSL.name("customer_name"), SQLDataType.VARCHAR(50).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "客户名称");

    /**
     * The column <code>physical_examination_system.team_report_info.file_name</code>. 文件名
     */
    public final TableField<TeamReportInfoRecord, String> FILE_NAME = createField(DSL.name("file_name"), SQLDataType.VARCHAR(50).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "文件名");

    /**
     * The column <code>physical_examination_system.team_report_info.file_url</code>. 文件名URL
     */
    public final TableField<TeamReportInfoRecord, String> FILE_URL = createField(DSL.name("file_url"), SQLDataType.VARCHAR(50).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "文件名URL");

    /**
     * The column <code>physical_examination_system.team_report_info.status</code>. 状态
     */
    public final TableField<TeamReportInfoRecord, Integer> STATUS = createField(DSL.name("status"), SQLDataType.INTEGER.defaultValue(DSL.inline("-1", SQLDataType.INTEGER)), this, "状态");

    private TeamReportInfo(Name alias, Table<TeamReportInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private TeamReportInfo(Name alias, Table<TeamReportInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("团队报告信息"), TableOptions.table());
    }

    /**
     * Create an aliased <code>physical_examination_system.team_report_info</code> table reference
     */
    public TeamReportInfo(String alias) {
        this(DSL.name(alias), TEAM_REPORT_INFO);
    }

    /**
     * Create an aliased <code>physical_examination_system.team_report_info</code> table reference
     */
    public TeamReportInfo(Name alias) {
        this(alias, TEAM_REPORT_INFO);
    }

    /**
     * Create a <code>physical_examination_system.team_report_info</code> table reference
     */
    public TeamReportInfo() {
        this(DSL.name("team_report_info"), null);
    }

    public <O extends Record> TeamReportInfo(Table<O> child, ForeignKey<O, TeamReportInfoRecord> key) {
        super(child, key, TEAM_REPORT_INFO);
    }

    @Override
    public Schema getSchema() {
        return PhysicalExaminationSystem.PHYSICAL_EXAMINATION_SYSTEM;
    }

    @Override
    public Identity<TeamReportInfoRecord, Long> getIdentity() {
        return (Identity<TeamReportInfoRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<TeamReportInfoRecord> getPrimaryKey() {
        return Keys.KEY_TEAM_REPORT_INFO_PRIMARY;
    }

    @Override
    public List<UniqueKey<TeamReportInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<TeamReportInfoRecord>>asList(Keys.KEY_TEAM_REPORT_INFO_PRIMARY);
    }

    @Override
    public TeamReportInfo as(String alias) {
        return new TeamReportInfo(DSL.name(alias), this);
    }

    @Override
    public TeamReportInfo as(Name alias) {
        return new TeamReportInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TeamReportInfo rename(String name) {
        return new TeamReportInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TeamReportInfo rename(Name name) {
        return new TeamReportInfo(name, null);
    }

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row15<Long, LocalDateTime, LocalDateTime, String, String, Integer, Long, String, String, Long, String, String, String, String, Integer> fieldsRow() {
        return (Row15) super.fieldsRow();
    }
}
