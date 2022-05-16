/*
 * This file is generated by jOOQ.
 */
package com.example.boot.data.database.jooq.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PatientTotalConclusionInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private String        conclusion;
    private String        createdBy;
    private LocalDateTime createdDate;
    private Integer       isAbnormal;
    private Integer       isDeleted;
    private String        modifiedBy;
    private LocalDateTime modifiedDate;
    private String        patientCode;
    private Long          patientId;

    public PatientTotalConclusionInfo() {}

    public PatientTotalConclusionInfo(PatientTotalConclusionInfo value) {
        this.id = value.id;
        this.conclusion = value.conclusion;
        this.createdBy = value.createdBy;
        this.createdDate = value.createdDate;
        this.isAbnormal = value.isAbnormal;
        this.isDeleted = value.isDeleted;
        this.modifiedBy = value.modifiedBy;
        this.modifiedDate = value.modifiedDate;
        this.patientCode = value.patientCode;
        this.patientId = value.patientId;
    }

    public PatientTotalConclusionInfo(
        Long          id,
        String        conclusion,
        String        createdBy,
        LocalDateTime createdDate,
        Integer       isAbnormal,
        Integer       isDeleted,
        String        modifiedBy,
        LocalDateTime modifiedDate,
        String        patientCode,
        Long          patientId
    ) {
        this.id = id;
        this.conclusion = conclusion;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.isAbnormal = isAbnormal;
        this.isDeleted = isDeleted;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
        this.patientCode = patientCode;
        this.patientId = patientId;
    }

    /**
     * Getter for <code>physical_examination_system.patient_total_conclusion_info.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>physical_examination_system.patient_total_conclusion_info.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>physical_examination_system.patient_total_conclusion_info.conclusion</code>.
     */
    public String getConclusion() {
        return this.conclusion;
    }

    /**
     * Setter for <code>physical_examination_system.patient_total_conclusion_info.conclusion</code>.
     */
    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    /**
     * Getter for <code>physical_examination_system.patient_total_conclusion_info.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>physical_examination_system.patient_total_conclusion_info.created_by</code>.
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Getter for <code>physical_examination_system.patient_total_conclusion_info.created_date</code>.
     */
    public LocalDateTime getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for <code>physical_examination_system.patient_total_conclusion_info.created_date</code>.
     */
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Getter for <code>physical_examination_system.patient_total_conclusion_info.is_abnormal</code>.
     */
    public Integer getIsAbnormal() {
        return this.isAbnormal;
    }

    /**
     * Setter for <code>physical_examination_system.patient_total_conclusion_info.is_abnormal</code>.
     */
    public void setIsAbnormal(Integer isAbnormal) {
        this.isAbnormal = isAbnormal;
    }

    /**
     * Getter for <code>physical_examination_system.patient_total_conclusion_info.is_deleted</code>.
     */
    public Integer getIsDeleted() {
        return this.isDeleted;
    }

    /**
     * Setter for <code>physical_examination_system.patient_total_conclusion_info.is_deleted</code>.
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * Getter for <code>physical_examination_system.patient_total_conclusion_info.modified_by</code>.
     */
    public String getModifiedBy() {
        return this.modifiedBy;
    }

    /**
     * Setter for <code>physical_examination_system.patient_total_conclusion_info.modified_by</code>.
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * Getter for <code>physical_examination_system.patient_total_conclusion_info.modified_date</code>.
     */
    public LocalDateTime getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for <code>physical_examination_system.patient_total_conclusion_info.modified_date</code>.
     */
    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * Getter for <code>physical_examination_system.patient_total_conclusion_info.patient_code</code>.
     */
    public String getPatientCode() {
        return this.patientCode;
    }

    /**
     * Setter for <code>physical_examination_system.patient_total_conclusion_info.patient_code</code>.
     */
    public void setPatientCode(String patientCode) {
        this.patientCode = patientCode;
    }

    /**
     * Getter for <code>physical_examination_system.patient_total_conclusion_info.patient_id</code>.
     */
    public Long getPatientId() {
        return this.patientId;
    }

    /**
     * Setter for <code>physical_examination_system.patient_total_conclusion_info.patient_id</code>.
     */
    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PatientTotalConclusionInfo (");

        sb.append(id);
        sb.append(", ").append(conclusion);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdDate);
        sb.append(", ").append(isAbnormal);
        sb.append(", ").append(isDeleted);
        sb.append(", ").append(modifiedBy);
        sb.append(", ").append(modifiedDate);
        sb.append(", ").append(patientCode);
        sb.append(", ").append(patientId);

        sb.append(")");
        return sb.toString();
    }
}
