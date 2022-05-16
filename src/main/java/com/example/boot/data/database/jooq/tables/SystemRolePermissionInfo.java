/*
 * This file is generated by jOOQ.
 */
package com.example.boot.data.database.jooq.tables;


import com.example.boot.data.database.jooq.Keys;
import com.example.boot.data.database.jooq.PhysicalExaminationSystem;
import com.example.boot.data.database.jooq.tables.records.SystemRolePermissionInfoRecord;

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
public class SystemRolePermissionInfo extends TableImpl<SystemRolePermissionInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>physical_examination_system.system_role_permission_info</code>
     */
    public static final SystemRolePermissionInfo SYSTEM_ROLE_PERMISSION_INFO = new SystemRolePermissionInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SystemRolePermissionInfoRecord> getRecordType() {
        return SystemRolePermissionInfoRecord.class;
    }

    /**
     * The column <code>physical_examination_system.system_role_permission_info.id</code>.
     */
    public final TableField<SystemRolePermissionInfoRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>physical_examination_system.system_role_permission_info.created_by</code>.
     */
    public final TableField<SystemRolePermissionInfoRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.system_role_permission_info.created_date</code>.
     */
    public final TableField<SystemRolePermissionInfoRecord, LocalDateTime> CREATED_DATE = createField(DSL.name("created_date"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>physical_examination_system.system_role_permission_info.is_deleted</code>.
     */
    public final TableField<SystemRolePermissionInfoRecord, Integer> IS_DELETED = createField(DSL.name("is_deleted"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>physical_examination_system.system_role_permission_info.modified_by</code>.
     */
    public final TableField<SystemRolePermissionInfoRecord, String> MODIFIED_BY = createField(DSL.name("modified_by"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.system_role_permission_info.modified_date</code>.
     */
    public final TableField<SystemRolePermissionInfoRecord, LocalDateTime> MODIFIED_DATE = createField(DSL.name("modified_date"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>physical_examination_system.system_role_permission_info.permission_id</code>.
     */
    public final TableField<SystemRolePermissionInfoRecord, Long> PERMISSION_ID = createField(DSL.name("permission_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>physical_examination_system.system_role_permission_info.role_id</code>.
     */
    public final TableField<SystemRolePermissionInfoRecord, Long> ROLE_ID = createField(DSL.name("role_id"), SQLDataType.BIGINT, this, "");

    private SystemRolePermissionInfo(Name alias, Table<SystemRolePermissionInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private SystemRolePermissionInfo(Name alias, Table<SystemRolePermissionInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>physical_examination_system.system_role_permission_info</code> table reference
     */
    public SystemRolePermissionInfo(String alias) {
        this(DSL.name(alias), SYSTEM_ROLE_PERMISSION_INFO);
    }

    /**
     * Create an aliased <code>physical_examination_system.system_role_permission_info</code> table reference
     */
    public SystemRolePermissionInfo(Name alias) {
        this(alias, SYSTEM_ROLE_PERMISSION_INFO);
    }

    /**
     * Create a <code>physical_examination_system.system_role_permission_info</code> table reference
     */
    public SystemRolePermissionInfo() {
        this(DSL.name("system_role_permission_info"), null);
    }

    public <O extends Record> SystemRolePermissionInfo(Table<O> child, ForeignKey<O, SystemRolePermissionInfoRecord> key) {
        super(child, key, SYSTEM_ROLE_PERMISSION_INFO);
    }

    @Override
    public Schema getSchema() {
        return PhysicalExaminationSystem.PHYSICAL_EXAMINATION_SYSTEM;
    }

    @Override
    public UniqueKey<SystemRolePermissionInfoRecord> getPrimaryKey() {
        return Keys.KEY_SYSTEM_ROLE_PERMISSION_INFO_PRIMARY;
    }

    @Override
    public List<UniqueKey<SystemRolePermissionInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<SystemRolePermissionInfoRecord>>asList(Keys.KEY_SYSTEM_ROLE_PERMISSION_INFO_PRIMARY);
    }

    @Override
    public SystemRolePermissionInfo as(String alias) {
        return new SystemRolePermissionInfo(DSL.name(alias), this);
    }

    @Override
    public SystemRolePermissionInfo as(Name alias) {
        return new SystemRolePermissionInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SystemRolePermissionInfo rename(String name) {
        return new SystemRolePermissionInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SystemRolePermissionInfo rename(Name name) {
        return new SystemRolePermissionInfo(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, String, LocalDateTime, Integer, String, LocalDateTime, Long, Long> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
