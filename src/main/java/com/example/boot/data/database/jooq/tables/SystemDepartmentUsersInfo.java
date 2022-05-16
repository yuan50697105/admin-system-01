/*
 * This file is generated by jOOQ.
 */
package com.example.boot.data.database.jooq.tables;


import com.example.boot.data.database.jooq.Keys;
import com.example.boot.data.database.jooq.PhysicalExaminationSystem;
import com.example.boot.data.database.jooq.tables.records.SystemDepartmentUsersInfoRecord;

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
public class SystemDepartmentUsersInfo extends TableImpl<SystemDepartmentUsersInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>physical_examination_system.system_department_users_info</code>
     */
    public static final SystemDepartmentUsersInfo SYSTEM_DEPARTMENT_USERS_INFO = new SystemDepartmentUsersInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SystemDepartmentUsersInfoRecord> getRecordType() {
        return SystemDepartmentUsersInfoRecord.class;
    }

    /**
     * The column <code>physical_examination_system.system_department_users_info.id</code>.
     */
    public final TableField<SystemDepartmentUsersInfoRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>physical_examination_system.system_department_users_info.created_by</code>.
     */
    public final TableField<SystemDepartmentUsersInfoRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.system_department_users_info.created_date</code>.
     */
    public final TableField<SystemDepartmentUsersInfoRecord, LocalDateTime> CREATED_DATE = createField(DSL.name("created_date"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>physical_examination_system.system_department_users_info.department_id</code>.
     */
    public final TableField<SystemDepartmentUsersInfoRecord, Long> DEPARTMENT_ID = createField(DSL.name("department_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>physical_examination_system.system_department_users_info.is_deleted</code>.
     */
    public final TableField<SystemDepartmentUsersInfoRecord, Integer> IS_DELETED = createField(DSL.name("is_deleted"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>physical_examination_system.system_department_users_info.modified_by</code>.
     */
    public final TableField<SystemDepartmentUsersInfoRecord, String> MODIFIED_BY = createField(DSL.name("modified_by"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.system_department_users_info.modified_date</code>.
     */
    public final TableField<SystemDepartmentUsersInfoRecord, LocalDateTime> MODIFIED_DATE = createField(DSL.name("modified_date"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>physical_examination_system.system_department_users_info.user_id</code>.
     */
    public final TableField<SystemDepartmentUsersInfoRecord, Long> USER_ID = createField(DSL.name("user_id"), SQLDataType.BIGINT, this, "");

    private SystemDepartmentUsersInfo(Name alias, Table<SystemDepartmentUsersInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private SystemDepartmentUsersInfo(Name alias, Table<SystemDepartmentUsersInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>physical_examination_system.system_department_users_info</code> table reference
     */
    public SystemDepartmentUsersInfo(String alias) {
        this(DSL.name(alias), SYSTEM_DEPARTMENT_USERS_INFO);
    }

    /**
     * Create an aliased <code>physical_examination_system.system_department_users_info</code> table reference
     */
    public SystemDepartmentUsersInfo(Name alias) {
        this(alias, SYSTEM_DEPARTMENT_USERS_INFO);
    }

    /**
     * Create a <code>physical_examination_system.system_department_users_info</code> table reference
     */
    public SystemDepartmentUsersInfo() {
        this(DSL.name("system_department_users_info"), null);
    }

    public <O extends Record> SystemDepartmentUsersInfo(Table<O> child, ForeignKey<O, SystemDepartmentUsersInfoRecord> key) {
        super(child, key, SYSTEM_DEPARTMENT_USERS_INFO);
    }

    @Override
    public Schema getSchema() {
        return PhysicalExaminationSystem.PHYSICAL_EXAMINATION_SYSTEM;
    }

    @Override
    public UniqueKey<SystemDepartmentUsersInfoRecord> getPrimaryKey() {
        return Keys.KEY_SYSTEM_DEPARTMENT_USERS_INFO_PRIMARY;
    }

    @Override
    public List<UniqueKey<SystemDepartmentUsersInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<SystemDepartmentUsersInfoRecord>>asList(Keys.KEY_SYSTEM_DEPARTMENT_USERS_INFO_PRIMARY);
    }

    @Override
    public SystemDepartmentUsersInfo as(String alias) {
        return new SystemDepartmentUsersInfo(DSL.name(alias), this);
    }

    @Override
    public SystemDepartmentUsersInfo as(Name alias) {
        return new SystemDepartmentUsersInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SystemDepartmentUsersInfo rename(String name) {
        return new SystemDepartmentUsersInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SystemDepartmentUsersInfo rename(Name name) {
        return new SystemDepartmentUsersInfo(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, String, LocalDateTime, Long, Integer, String, LocalDateTime, Long> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}