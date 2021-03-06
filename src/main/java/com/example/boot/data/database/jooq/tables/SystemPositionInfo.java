/*
 * This file is generated by jOOQ.
 */
package com.example.boot.data.database.jooq.tables;


import com.example.boot.data.database.jooq.Keys;
import com.example.boot.data.database.jooq.PhysicalExaminationSystem;
import com.example.boot.data.database.jooq.tables.records.SystemPositionInfoRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row13;
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
public class SystemPositionInfo extends TableImpl<SystemPositionInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>physical_examination_system.system_position_info</code>
     */
    public static final SystemPositionInfo SYSTEM_POSITION_INFO = new SystemPositionInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SystemPositionInfoRecord> getRecordType() {
        return SystemPositionInfoRecord.class;
    }

    /**
     * The column <code>physical_examination_system.system_position_info.id</code>.
     */
    public final TableField<SystemPositionInfoRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>physical_examination_system.system_position_info.created_by</code>.
     */
    public final TableField<SystemPositionInfoRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.system_position_info.created_date</code>.
     */
    public final TableField<SystemPositionInfoRecord, LocalDateTime> CREATED_DATE = createField(DSL.name("created_date"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>physical_examination_system.system_position_info.full_name</code>.
     */
    public final TableField<SystemPositionInfoRecord, String> FULL_NAME = createField(DSL.name("full_name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.system_position_info.is_deleted</code>.
     */
    public final TableField<SystemPositionInfoRecord, Integer> IS_DELETED = createField(DSL.name("is_deleted"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>physical_examination_system.system_position_info.is_enabled</code>.
     */
    public final TableField<SystemPositionInfoRecord, Integer> IS_ENABLED = createField(DSL.name("is_enabled"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>physical_examination_system.system_position_info.level</code>.
     */
    public final TableField<SystemPositionInfoRecord, Integer> LEVEL = createField(DSL.name("level"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>physical_examination_system.system_position_info.modified_by</code>.
     */
    public final TableField<SystemPositionInfoRecord, String> MODIFIED_BY = createField(DSL.name("modified_by"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.system_position_info.modified_date</code>.
     */
    public final TableField<SystemPositionInfoRecord, LocalDateTime> MODIFIED_DATE = createField(DSL.name("modified_date"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>physical_examination_system.system_position_info.module</code>.
     */
    public final TableField<SystemPositionInfoRecord, String> MODULE = createField(DSL.name("module"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.system_position_info.name</code>.
     */
    public final TableField<SystemPositionInfoRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.system_position_info.code</code>.
     */
    public final TableField<SystemPositionInfoRecord, String> CODE = createField(DSL.name("code"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.system_position_info.description</code>.
     */
    public final TableField<SystemPositionInfoRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR(255), this, "");

    private SystemPositionInfo(Name alias, Table<SystemPositionInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private SystemPositionInfo(Name alias, Table<SystemPositionInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>physical_examination_system.system_position_info</code> table reference
     */
    public SystemPositionInfo(String alias) {
        this(DSL.name(alias), SYSTEM_POSITION_INFO);
    }

    /**
     * Create an aliased <code>physical_examination_system.system_position_info</code> table reference
     */
    public SystemPositionInfo(Name alias) {
        this(alias, SYSTEM_POSITION_INFO);
    }

    /**
     * Create a <code>physical_examination_system.system_position_info</code> table reference
     */
    public SystemPositionInfo() {
        this(DSL.name("system_position_info"), null);
    }

    public <O extends Record> SystemPositionInfo(Table<O> child, ForeignKey<O, SystemPositionInfoRecord> key) {
        super(child, key, SYSTEM_POSITION_INFO);
    }

    @Override
    public Schema getSchema() {
        return PhysicalExaminationSystem.PHYSICAL_EXAMINATION_SYSTEM;
    }

    @Override
    public UniqueKey<SystemPositionInfoRecord> getPrimaryKey() {
        return Keys.KEY_SYSTEM_POSITION_INFO_PRIMARY;
    }

    @Override
    public List<UniqueKey<SystemPositionInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<SystemPositionInfoRecord>>asList(Keys.KEY_SYSTEM_POSITION_INFO_PRIMARY);
    }

    @Override
    public SystemPositionInfo as(String alias) {
        return new SystemPositionInfo(DSL.name(alias), this);
    }

    @Override
    public SystemPositionInfo as(Name alias) {
        return new SystemPositionInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SystemPositionInfo rename(String name) {
        return new SystemPositionInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SystemPositionInfo rename(Name name) {
        return new SystemPositionInfo(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<Long, String, LocalDateTime, String, Integer, Integer, Integer, String, LocalDateTime, String, String, String, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}
