package com.chinasofti.rcloud.domain;

import java.io.Serializable;
import java.util.Date;

public class ApplyEntity implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boss_apply.apply_id
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String applyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boss_apply.apply_type
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String applyType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boss_apply.apply_explanation
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String applyExplanation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boss_apply.audit_explanation
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String auditExplanation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boss_apply.application_id
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String applicationId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boss_apply.apply_user
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String applyUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boss_apply.apply_time
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private Date applyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boss_apply.audit_user
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String auditUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boss_apply.audit_time
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private Date auditTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boss_apply.status
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table boss_apply
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boss_apply.apply_id
     *
     * @return the value of boss_apply.apply_id
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getApplyId() {
        return applyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boss_apply.apply_id
     *
     * @param applyId the value for boss_apply.apply_id
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setApplyId(String applyId) {
        this.applyId = applyId == null ? null : applyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boss_apply.apply_type
     *
     * @return the value of boss_apply.apply_type
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getApplyType() {
        return applyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boss_apply.apply_type
     *
     * @param applyType the value for boss_apply.apply_type
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setApplyType(String applyType) {
        this.applyType = applyType == null ? null : applyType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boss_apply.apply_explanation
     *
     * @return the value of boss_apply.apply_explanation
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getApplyExplanation() {
        return applyExplanation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boss_apply.apply_explanation
     *
     * @param applyExplanation the value for boss_apply.apply_explanation
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setApplyExplanation(String applyExplanation) {
        this.applyExplanation = applyExplanation == null ? null : applyExplanation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boss_apply.audit_explanation
     *
     * @return the value of boss_apply.audit_explanation
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getAuditExplanation() {
        return auditExplanation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boss_apply.audit_explanation
     *
     * @param auditExplanation the value for boss_apply.audit_explanation
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setAuditExplanation(String auditExplanation) {
        this.auditExplanation = auditExplanation == null ? null : auditExplanation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boss_apply.application_id
     *
     * @return the value of boss_apply.application_id
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boss_apply.application_id
     *
     * @param applicationId the value for boss_apply.application_id
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId == null ? null : applicationId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boss_apply.apply_user
     *
     * @return the value of boss_apply.apply_user
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getApplyUser() {
        return applyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boss_apply.apply_user
     *
     * @param applyUser the value for boss_apply.apply_user
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setApplyUser(String applyUser) {
        this.applyUser = applyUser == null ? null : applyUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boss_apply.apply_time
     *
     * @return the value of boss_apply.apply_time
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public Date getApplyTime() {
        return applyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boss_apply.apply_time
     *
     * @param applyTime the value for boss_apply.apply_time
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boss_apply.audit_user
     *
     * @return the value of boss_apply.audit_user
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getAuditUser() {
        return auditUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boss_apply.audit_user
     *
     * @param auditUser the value for boss_apply.audit_user
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setAuditUser(String auditUser) {
        this.auditUser = auditUser == null ? null : auditUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boss_apply.audit_time
     *
     * @return the value of boss_apply.audit_time
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public Date getAuditTime() {
        return auditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boss_apply.audit_time
     *
     * @param auditTime the value for boss_apply.audit_time
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boss_apply.status
     *
     * @return the value of boss_apply.status
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boss_apply.status
     *
     * @param status the value for boss_apply.status
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}