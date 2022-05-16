/*
 * This file is generated by jOOQ.
 */
package com.example.boot.data.database.jooq.tables;


import com.example.boot.data.database.jooq.Keys;
import com.example.boot.data.database.jooq.PhysicalExaminationSystem;
import com.example.boot.data.database.jooq.tables.records.ScheduleAppointmentInfoRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
 * 预约排期
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ScheduleAppointmentInfo extends TableImpl<ScheduleAppointmentInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>physical_examination_system.schedule_appointment_info</code>
     */
    public static final ScheduleAppointmentInfo SCHEDULE_APPOINTMENT_INFO = new ScheduleAppointmentInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ScheduleAppointmentInfoRecord> getRecordType() {
        return ScheduleAppointmentInfoRecord.class;
    }

    /**
     * The column <code>physical_examination_system.schedule_appointment_info.id</code>. id
     */
    public final TableField<ScheduleAppointmentInfoRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "id");

    /**
     * The column <code>physical_examination_system.schedule_appointment_info.created_date</code>. createdDate
     */
    public final TableField<ScheduleAppointmentInfoRecord, LocalDateTime> CREATED_DATE = createField(DSL.name("created_date"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.inline("1000-01-01 00:00:00", SQLDataType.LOCALDATETIME)), this, "createdDate");

    /**
     * The column <code>physical_examination_system.schedule_appointment_info.modified_date</code>. modifiedDate
     */
    public final TableField<ScheduleAppointmentInfoRecord, LocalDateTime> MODIFIED_DATE = createField(DSL.name("modified_date"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.inline("1000-01-01 00:00:00", SQLDataType.LOCALDATETIME)), this, "modifiedDate");

    /**
     * The column <code>physical_examination_system.schedule_appointment_info.created_by</code>. createdBy
     */
    public final TableField<ScheduleAppointmentInfoRecord, String> CREATED_BY = createField(DSL.name("created_by"), SQLDataType.VARCHAR(50).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "createdBy");

    /**
     * The column <code>physical_examination_system.schedule_appointment_info.modified_by</code>. modifiedBy
     */
    public final TableField<ScheduleAppointmentInfoRecord, String> MODIFIED_BY = createField(DSL.name("modified_by"), SQLDataType.VARCHAR(50).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "modifiedBy");

    /**
     * The column <code>physical_examination_system.schedule_appointment_info.is_deleted</code>. isDeleted
     */
    public final TableField<ScheduleAppointmentInfoRecord, Integer> IS_DELETED = createField(DSL.name("is_deleted"), SQLDataType.INTEGER.defaultValue(DSL.inline("-1", SQLDataType.INTEGER)), this, "isDeleted");

    /**
     * The column <code>physical_examination_system.schedule_appointment_info.appointment_date</code>. 预约日期
     */
    public final TableField<ScheduleAppointmentInfoRecord, LocalDateTime> APPOINTMENT_DATE = createField(DSL.name("appointment_date"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.inline("1000-01-01 00:00:00", SQLDataType.LOCALDATETIME)), this, "预约日期");

    /**
     * The column <code>physical_examination_system.schedule_appointment_info.appointment_cycle</code>. 预约区间
     * 1 全天 2 上午 3 下午
     */
    public final TableField<ScheduleAppointmentInfoRecord, LocalDateTime> APPOINTMENT_CYCLE = createField(DSL.name("appointment_cycle"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.inline("1000-01-01 00:00:00", SQLDataType.LOCALDATETIME)), this, "预约区间\r\n     * 1 全天 2 上午 3 下午");

    /**
     * The column <code>physical_examination_system.schedule_appointment_info.appointment_type</code>. 预约类型
     * 1 个人 2 团队 3 总数
     */
    public final TableField<ScheduleAppointmentInfoRecord, Integer> APPOINTMENT_TYPE = createField(DSL.name("appointment_type"), SQLDataType.INTEGER.defaultValue(DSL.inline("-1", SQLDataType.INTEGER)), this, "预约类型\r\n     * 1 个人 2 团队 3 总数");

    /**
     * The column <code>physical_examination_system.schedule_appointment_info.is_enable</code>. 是否启用
     * 1 是 0 否
     */
    public final TableField<ScheduleAppointmentInfoRecord, Integer> IS_ENABLE = createField(DSL.name("is_enable"), SQLDataType.INTEGER.defaultValue(DSL.inline("-1", SQLDataType.INTEGER)), this, "是否启用\r\n     * 1 是 0 否");

    private ScheduleAppointmentInfo(Name alias, Table<ScheduleAppointmentInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private ScheduleAppointmentInfo(Name alias, Table<ScheduleAppointmentInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("预约排期"), TableOptions.table());
    }

    /**
     * Create an aliased <code>physical_examination_system.schedule_appointment_info</code> table reference
     */
    public ScheduleAppointmentInfo(String alias) {
        this(DSL.name(alias), SCHEDULE_APPOINTMENT_INFO);
    }

    /**
     * Create an aliased <code>physical_examination_system.schedule_appointment_info</code> table reference
     */
    public ScheduleAppointmentInfo(Name alias) {
        this(alias, SCHEDULE_APPOINTMENT_INFO);
    }

    /**
     * Create a <code>physical_examination_system.schedule_appointment_info</code> table reference
     */
    public ScheduleAppointmentInfo() {
        this(DSL.name("schedule_appointment_info"), null);
    }

    public <O extends Record> ScheduleAppointmentInfo(Table<O> child, ForeignKey<O, ScheduleAppointmentInfoRecord> key) {
        super(child, key, SCHEDULE_APPOINTMENT_INFO);
    }

    @Override
    public Schema getSchema() {
        return PhysicalExaminationSystem.PHYSICAL_EXAMINATION_SYSTEM;
    }

    @Override
    public Identity<ScheduleAppointmentInfoRecord, Long> getIdentity() {
        return (Identity<ScheduleAppointmentInfoRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<ScheduleAppointmentInfoRecord> getPrimaryKey() {
        return Keys.KEY_SCHEDULE_APPOINTMENT_INFO_PRIMARY;
    }

    @Override
    public List<UniqueKey<ScheduleAppointmentInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<ScheduleAppointmentInfoRecord>>asList(Keys.KEY_SCHEDULE_APPOINTMENT_INFO_PRIMARY);
    }

    @Override
    public ScheduleAppointmentInfo as(String alias) {
        return new ScheduleAppointmentInfo(DSL.name(alias), this);
    }

    @Override
    public ScheduleAppointmentInfo as(Name alias) {
        return new ScheduleAppointmentInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ScheduleAppointmentInfo rename(String name) {
        return new ScheduleAppointmentInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ScheduleAppointmentInfo rename(Name name) {
        return new ScheduleAppointmentInfo(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, LocalDateTime, LocalDateTime, String, String, Integer, LocalDateTime, LocalDateTime, Integer, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
