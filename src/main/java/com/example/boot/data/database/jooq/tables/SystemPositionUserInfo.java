/*
 * This file is generated by jOOQ.
 */
package com.example.boot.data.database.jooq.tables;


import com.example.boot.data.database.jooq.Keys;
import com.example.boot.data.database.jooq.PhysicalExaminationSystem;
import com.example.boot.data.database.jooq.tables.records.SystemPositionUserInfoRecord;

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
public class SystemPositionUserInfo extends TableImpl<SystemPositionUserInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>physical_examination_system.system_position_user_info</code>
     */
    public static final SystemPositionUserInfo SYSTEM_POSITION_USER_INFO = new SystemPositionUserInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SystemPositionUserInfoRecord> getRecordType() {
        return SystemPositionUserInfoRecord.class;
    }

    /**
     * The column <code>physical_examination_system.system_position_user_info.id</code>.
     */
    public final TableField<SystemPositionUserInfoRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>physical_examination_system.system_position_user_info.created_by</code>.
     */
    public final TableField<SystemPositionUserInfoRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.system_position_user_info.created_date</code>.
     */
    public final TableField<SystemPositionUserInfoRecord, LocalDateTime> CREATED_DATE = createField(DSL.name("created_date"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>physical_examination_system.system_position_user_info.is_deleted</code>.
     */
    public final TableField<SystemPositionUserInfoRecord, Integer> IS_DELETED = createField(DSL.name("is_deleted"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>physical_examination_system.system_position_user_info.modified_by</code>.
     */
    public final TableField<SystemPositionUserInfoRecord, String> MODIFIED_BY = createField(DSL.name("modified_by"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>physical_examination_system.system_position_user_info.modified_date</code>.
     */
    public final TableField<SystemPositionUserInfoRecord, LocalDateTime> MODIFIED_DATE = createField(DSL.name("modified_date"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>physical_examination_system.system_position_user_info.position_id</code>.
     */
    public final TableField<SystemPositionUserInfoRecord, Long> POSITION_ID = createField(DSL.name("position_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>physical_examination_system.system_position_user_info.user_id</code>.
     */
    public final TableField<SystemPositionUserInfoRecord, Long> USER_ID = createField(DSL.name("user_id"), SQLDataType.BIGINT, this, "");

    private SystemPositionUserInfo(Name alias, Table<SystemPositionUserInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private SystemPositionUserInfo(Name alias, Table<SystemPositionUserInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>physical_examination_system.system_position_user_info</code> table reference
     */
    public SystemPositionUserInfo(String alias) {
        this(DSL.name(alias), SYSTEM_POSITION_USER_INFO);
    }

    /**
     * Create an aliased <code>physical_examination_system.system_position_user_info</code> table reference
     */
    public SystemPositionUserInfo(Name alias) {
        this(alias, SYSTEM_POSITION_USER_INFO);
    }

    /**
     * Create a <code>physical_examination_system.system_position_user_info</code> table reference
     */
    public SystemPositionUserInfo() {
        this(DSL.name("system_position_user_info"), null);
    }

    public <O extends Record> SystemPositionUserInfo(Table<O> child, ForeignKey<O, SystemPositionUserInfoRecord> key) {
        super(child, key, SYSTEM_POSITION_USER_INFO);
    }

    @Override
    public Schema getSchema() {
        return PhysicalExaminationSystem.PHYSICAL_EXAMINATION_SYSTEM;
    }

    @Override
    public UniqueKey<SystemPositionUserInfoRecord> getPrimaryKey() {
        return Keys.KEY_SYSTEM_POSITION_USER_INFO_PRIMARY;
    }

    @Override
    public List<UniqueKey<SystemPositionUserInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<SystemPositionUserInfoRecord>>asList(Keys.KEY_SYSTEM_POSITION_USER_INFO_PRIMARY);
    }

    @Override
    public SystemPositionUserInfo as(String alias) {
        return new SystemPositionUserInfo(DSL.name(alias), this);
    }

    @Override
    public SystemPositionUserInfo as(Name alias) {
        return new SystemPositionUserInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SystemPositionUserInfo rename(String name) {
        return new SystemPositionUserInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SystemPositionUserInfo rename(Name name) {
        return new SystemPositionUserInfo(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, String, LocalDateTime, Integer, String, LocalDateTime, Long, Long> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
