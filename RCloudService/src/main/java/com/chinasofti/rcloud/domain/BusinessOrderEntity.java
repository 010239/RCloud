package com.chinasofti.rcloud.domain;

import java.io.Serializable;
import java.util.Date;

public class BusinessOrderEntity implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_business_order.business_order_id
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String businessOrderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_business_order.user_id
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_business_order.prod_id
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String prodId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_business_order.pkg_id
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String pkgId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_business_order.business_order_type
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private Integer businessOrderType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_business_order.status
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_business_order.create_time
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_business_order.pay_pattern
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private Integer payPattern;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_business_order.mark_delete
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private Integer markDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_business_order.cancel_time
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private Date cancelTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_business_order.valid_date
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private Date validDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_business_order.expire_date
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private Date expireDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_business_order.pause_time
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private Date pauseTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_business_order.restart_time
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private Date restartTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_business_order.account_tag
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private Integer accountTag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_business_order.cancel_reason
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String cancelReason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table portal_business_order
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_business_order.business_order_id
     *
     * @return the value of portal_business_order.business_order_id
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getBusinessOrderId() {
        return businessOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_business_order.business_order_id
     *
     * @param businessOrderId the value for portal_business_order.business_order_id
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setBusinessOrderId(String businessOrderId) {
        this.businessOrderId = businessOrderId == null ? null : businessOrderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_business_order.user_id
     *
     * @return the value of portal_business_order.user_id
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_business_order.user_id
     *
     * @param userId the value for portal_business_order.user_id
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_business_order.prod_id
     *
     * @return the value of portal_business_order.prod_id
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getProdId() {
        return prodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_business_order.prod_id
     *
     * @param prodId the value for portal_business_order.prod_id
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setProdId(String prodId) {
        this.prodId = prodId == null ? null : prodId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_business_order.pkg_id
     *
     * @return the value of portal_business_order.pkg_id
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getPkgId() {
        return pkgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_business_order.pkg_id
     *
     * @param pkgId the value for portal_business_order.pkg_id
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setPkgId(String pkgId) {
        this.pkgId = pkgId == null ? null : pkgId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_business_order.business_order_type
     *
     * @return the value of portal_business_order.business_order_type
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public Integer getBusinessOrderType() {
        return businessOrderType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_business_order.business_order_type
     *
     * @param businessOrderType the value for portal_business_order.business_order_type
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setBusinessOrderType(Integer businessOrderType) {
        this.businessOrderType = businessOrderType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_business_order.status
     *
     * @return the value of portal_business_order.status
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_business_order.status
     *
     * @param status the value for portal_business_order.status
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_business_order.create_time
     *
     * @return the value of portal_business_order.create_time
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_business_order.create_time
     *
     * @param createTime the value for portal_business_order.create_time
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_business_order.pay_pattern
     *
     * @return the value of portal_business_order.pay_pattern
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public Integer getPayPattern() {
        return payPattern;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_business_order.pay_pattern
     *
     * @param payPattern the value for portal_business_order.pay_pattern
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setPayPattern(Integer payPattern) {
        this.payPattern = payPattern;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_business_order.mark_delete
     *
     * @return the value of portal_business_order.mark_delete
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public Integer getMarkDelete() {
        return markDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_business_order.mark_delete
     *
     * @param markDelete the value for portal_business_order.mark_delete
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setMarkDelete(Integer markDelete) {
        this.markDelete = markDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_business_order.cancel_time
     *
     * @return the value of portal_business_order.cancel_time
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public Date getCancelTime() {
        return cancelTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_business_order.cancel_time
     *
     * @param cancelTime the value for portal_business_order.cancel_time
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_business_order.valid_date
     *
     * @return the value of portal_business_order.valid_date
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public Date getValidDate() {
        return validDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_business_order.valid_date
     *
     * @param validDate the value for portal_business_order.valid_date
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_business_order.expire_date
     *
     * @return the value of portal_business_order.expire_date
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public Date getExpireDate() {
        return expireDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_business_order.expire_date
     *
     * @param expireDate the value for portal_business_order.expire_date
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_business_order.pause_time
     *
     * @return the value of portal_business_order.pause_time
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public Date getPauseTime() {
        return pauseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_business_order.pause_time
     *
     * @param pauseTime the value for portal_business_order.pause_time
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setPauseTime(Date pauseTime) {
        this.pauseTime = pauseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_business_order.restart_time
     *
     * @return the value of portal_business_order.restart_time
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public Date getRestartTime() {
        return restartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_business_order.restart_time
     *
     * @param restartTime the value for portal_business_order.restart_time
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setRestartTime(Date restartTime) {
        this.restartTime = restartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_business_order.account_tag
     *
     * @return the value of portal_business_order.account_tag
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public Integer getAccountTag() {
        return accountTag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_business_order.account_tag
     *
     * @param accountTag the value for portal_business_order.account_tag
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setAccountTag(Integer accountTag) {
        this.accountTag = accountTag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_business_order.cancel_reason
     *
     * @return the value of portal_business_order.cancel_reason
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_business_order.cancel_reason
     *
     * @param cancelReason the value for portal_business_order.cancel_reason
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason == null ? null : cancelReason.trim();
    }
}