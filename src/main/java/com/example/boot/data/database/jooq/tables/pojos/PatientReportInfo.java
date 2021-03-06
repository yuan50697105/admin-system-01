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
public class PatientReportInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private String        createdBy;
    private LocalDateTime createdDate;
    private Integer       isDeleted;
    private String        modifiedBy;
    private LocalDateTime modifiedDate;
    private String        patientCode;
    private Long          patientId;
    private String        pdfName;
    private String        pdfUrl;
    private Integer       type;
    private String        wordName;
    private String        wordUrl;

    public PatientReportInfo() {}

    public PatientReportInfo(PatientReportInfo value) {
        this.id = value.id;
        this.createdBy = value.createdBy;
        this.createdDate = value.createdDate;
        this.isDeleted = value.isDeleted;
        this.modifiedBy = value.modifiedBy;
        this.modifiedDate = value.modifiedDate;
        this.patientCode = value.patientCode;
        this.patientId = value.patientId;
        this.pdfName = value.pdfName;
        this.pdfUrl = value.pdfUrl;
        this.type = value.type;
        this.wordName = value.wordName;
        this.wordUrl = value.wordUrl;
    }

    public PatientReportInfo(
        Long          id,
        String        createdBy,
        LocalDateTime createdDate,
        Integer       isDeleted,
        String        modifiedBy,
        LocalDateTime modifiedDate,
        String        patientCode,
        Long          patientId,
        String        pdfName,
        String        pdfUrl,
        Integer       type,
        String        wordName,
        String        wordUrl
    ) {
        this.id = id;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.isDeleted = isDeleted;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
        this.patientCode = patientCode;
        this.patientId = patientId;
        this.pdfName = pdfName;
        this.pdfUrl = pdfUrl;
        this.type = type;
        this.wordName = wordName;
        this.wordUrl = wordUrl;
    }

    /**
     * Getter for <code>physical_examination_system.patient_report_info.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>physical_examination_system.patient_report_info.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>physical_examination_system.patient_report_info.created_by</code>.
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>physical_examination_system.patient_report_info.created_by</code>.
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Getter for <code>physical_examination_system.patient_report_info.created_date</code>.
     */
    public LocalDateTime getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for <code>physical_examination_system.patient_report_info.created_date</code>.
     */
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Getter for <code>physical_examination_system.patient_report_info.is_deleted</code>.
     */
    public Integer getIsDeleted() {
        return this.isDeleted;
    }

    /**
     * Setter for <code>physical_examination_system.patient_report_info.is_deleted</code>.
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * Getter for <code>physical_examination_system.patient_report_info.modified_by</code>.
     */
    public String getModifiedBy() {
        return this.modifiedBy;
    }

    /**
     * Setter for <code>physical_examination_system.patient_report_info.modified_by</code>.
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * Getter for <code>physical_examination_system.patient_report_info.modified_date</code>.
     */
    public LocalDateTime getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for <code>physical_examination_system.patient_report_info.modified_date</code>.
     */
    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * Getter for <code>physical_examination_system.patient_report_info.patient_code</code>.
     */
    public String getPatientCode() {
        return this.patientCode;
    }

    /**
     * Setter for <code>physical_examination_system.patient_report_info.patient_code</code>.
     */
    public void setPatientCode(String patientCode) {
        this.patientCode = patientCode;
    }

    /**
     * Getter for <code>physical_examination_system.patient_report_info.patient_id</code>.
     */
    public Long getPatientId() {
        return this.patientId;
    }

    /**
     * Setter for <code>physical_examination_system.patient_report_info.patient_id</code>.
     */
    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    /**
     * Getter for <code>physical_examination_system.patient_report_info.pdf_name</code>.
     */
    public String getPdfName() {
        return this.pdfName;
    }

    /**
     * Setter for <code>physical_examination_system.patient_report_info.pdf_name</code>.
     */
    public void setPdfName(String pdfName) {
        this.pdfName = pdfName;
    }

    /**
     * Getter for <code>physical_examination_system.patient_report_info.pdf_url</code>.
     */
    public String getPdfUrl() {
        return this.pdfUrl;
    }

    /**
     * Setter for <code>physical_examination_system.patient_report_info.pdf_url</code>.
     */
    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }

    /**
     * Getter for <code>physical_examination_system.patient_report_info.type</code>.
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * Setter for <code>physical_examination_system.patient_report_info.type</code>.
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * Getter for <code>physical_examination_system.patient_report_info.word_name</code>.
     */
    public String getWordName() {
        return this.wordName;
    }

    /**
     * Setter for <code>physical_examination_system.patient_report_info.word_name</code>.
     */
    public void setWordName(String wordName) {
        this.wordName = wordName;
    }

    /**
     * Getter for <code>physical_examination_system.patient_report_info.word_url</code>.
     */
    public String getWordUrl() {
        return this.wordUrl;
    }

    /**
     * Setter for <code>physical_examination_system.patient_report_info.word_url</code>.
     */
    public void setWordUrl(String wordUrl) {
        this.wordUrl = wordUrl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PatientReportInfo (");

        sb.append(id);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(createdDate);
        sb.append(", ").append(isDeleted);
        sb.append(", ").append(modifiedBy);
        sb.append(", ").append(modifiedDate);
        sb.append(", ").append(patientCode);
        sb.append(", ").append(patientId);
        sb.append(", ").append(pdfName);
        sb.append(", ").append(pdfUrl);
        sb.append(", ").append(type);
        sb.append(", ").append(wordName);
        sb.append(", ").append(wordUrl);

        sb.append(")");
        return sb.toString();
    }
}
