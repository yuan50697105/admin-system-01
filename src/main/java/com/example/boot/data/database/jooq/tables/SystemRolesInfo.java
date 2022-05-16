/*
 * This file is generated by jOOQ.
 */
package com.example.boot.data.database.jooq.tables;


import com.example.boot.data.database.jooq.Keys;
import com.example.boot.data.database.jooq.PhysicalExaminationSystem;
import com.example.boot.data.database.jooq.tables.records.SystemRolesInfoRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
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
public class SystemRolesInfo extends TableImpl<SystemRolesInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>physical_examination_system.system_roles_info</code>
     */
    public static final SystemRolesInfo SYSTEM_ROLES_INFO = new SystemRolesInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SystemRolesInfoRecord> getRecordType() {
        return SystemRolesInfoRecord.class;
    }

    /**
     * The column <code>physical_examination_system.system_roles_info.id</code>.
     */
    public final TableField<SystemRolesInfoRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>physical_examination_system.system_roles_info.created_by</code>.
     */
    public final TableField<SystemRolesInfoRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.system_roles_info.created_date</code>.
     */
    public final TableField<SystemRolesInfoRecord, LocalDateTime> CREATED_DATE = createField(DSL.name("created_date"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>physical_examination_system.system_roles_info.is_deleted</code>.
     */
    public final TableField<SystemRolesInfoRecord, Integer> IS_DELETED = createField(DSL.name("is_deleted"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>physical_examination_system.system_roles_info.is_enabled</code>.
     */
    public final TableField<SystemRolesInfoRecord, Integer> IS_ENABLED = createField(DSL.name("is_enabled"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>physical_examination_system.system_roles_info.modified_by</code>.
     */
    public final TableField<SystemRolesInfoRecord, String> MODIFIED_BY = createField(DSL.name("modified_by"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.system_roles_info.modified_date</code>.
     */
    public final TableField<SystemRolesInfoRecord, LocalDateTime> MODIFIED_DATE = createField(DSL.name("modified_date"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>physical_examination_system.system_roles_info.name</code>.
     */
    public final TableField<SystemRolesInfoRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255), this, "");

    private SystemRolesInfo(Name alias, Table<SystemRolesInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private SystemRolesInfo(Name alias, Table<SystemRolesInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>physical_examination_system.system_roles_info</code> table reference
     */
    public SystemRolesInfo(String alias) {
        this(DSL.name(alias), SYSTEM_ROLES_INFO);
    }

    /**
     * Create an aliased <code>physical_examination_system.system_roles_info</code> table reference
     */
    public SystemRolesInfo(Name alias) {
        this(alias, SYSTEM_ROLES_INFO);
    }

    /**
     * Create a <code>physical_examination_system.system_roles_info</code> table reference
     */
    public SystemRolesInfo() {
        this(DSL.name("system_roles_info"), null);
    }

    public <O extends Record> SystemRolesInfo(Table<O> child, ForeignKey<O, SystemRolesInfoRecord> key) {
        super(child, key, SYSTEM_ROLES_INFO);
    }

    @Override
    public Schema getSchema() {
        return PhysicalExaminationSystem.PHYSICAL_EXAMINATION_SYSTEM;
    }

    @Override
    public UniqueKey<SystemRolesInfoRecord> getPrimaryKey() {
        return Keys.KEY_SYSTEM_ROLES_INFO_PRIMARY;
    }

    @Override
    public List<UniqueKey<SystemRolesInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<SystemRolesInfoRecord>>asList(Keys.KEY_SYSTEM_ROLES_INFO_PRIMARY);
    }

    @Override
    public SystemRolesInfo as(String alias) {
        return new SystemRolesInfo(DSL.name(alias), this);
    }

    @Override
    public SystemRolesInfo as(Name alias) {
        return new SystemRolesInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SystemRolesInfo rename(String name) {
        return new SystemRolesInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SystemRolesInfo rename(Name name) {
        return new SystemRolesInfo(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, String, LocalDateTime, Integer, Integer, String, LocalDateTime, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
