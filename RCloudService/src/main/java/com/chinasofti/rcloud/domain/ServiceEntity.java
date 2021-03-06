package com.chinasofti.rcloud.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ServiceEntity implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boss_service.service_id
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String serviceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boss_service.service_name
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String serviceName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boss_service.created_time
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private Date createdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boss_service.creator
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boss_service.mark_delete
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private Integer markDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boss_service.logo_path
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String logoPath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boss_service.show_price_hour
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private BigDecimal showPriceHour;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boss_service.show_price_year
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private BigDecimal showPriceYear;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boss_service.chname
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String chname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boss_service.manage_url
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String manageUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boss_service.show_detail_url
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String showDetailUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boss_service.show_order
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private Integer showOrder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boss_service.service_description
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String serviceDescription;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table boss_service
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boss_service.service_id
     *
     * @return the value of boss_service.service_id
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boss_service.service_id
     *
     * @param serviceId the value for boss_service.service_id
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId == null ? null : serviceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boss_service.service_name
     *
     * @return the value of boss_service.service_name
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boss_service.service_name
     *
     * @param serviceName the value for boss_service.service_name
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName == null ? null : serviceName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boss_service.created_time
     *
     * @return the value of boss_service.created_time
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boss_service.created_time
     *
     * @param createdTime the value for boss_service.created_time
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boss_service.creator
     *
     * @return the value of boss_service.creator
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boss_service.creator
     *
     * @param creator the value for boss_service.creator
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boss_service.mark_delete
     *
     * @return the value of boss_service.mark_delete
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public Integer getMarkDelete() {
        return markDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boss_service.mark_delete
     *
     * @param markDelete the value for boss_service.mark_delete
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setMarkDelete(Integer markDelete) {
        this.markDelete = markDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boss_service.logo_path
     *
     * @return the value of boss_service.logo_path
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getLogoPath() {
        return logoPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boss_service.logo_path
     *
     * @param logoPath the value for boss_service.logo_path
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath == null ? null : logoPath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boss_service.show_price_hour
     *
     * @return the value of boss_service.show_price_hour
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public BigDecimal getShowPriceHour() {
        return showPriceHour;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boss_service.show_price_hour
     *
     * @param showPriceHour the value for boss_service.show_price_hour
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setShowPriceHour(BigDecimal showPriceHour) {
        this.showPriceHour = showPriceHour;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boss_service.show_price_year
     *
     * @return the value of boss_service.show_price_year
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public BigDecimal getShowPriceYear() {
        return showPriceYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boss_service.show_price_year
     *
     * @param showPriceYear the value for boss_service.show_price_year
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setShowPriceYear(BigDecimal showPriceYear) {
        this.showPriceYear = showPriceYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boss_service.chname
     *
     * @return the value of boss_service.chname
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getChname() {
        return chname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boss_service.chname
     *
     * @param chname the value for boss_service.chname
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setChname(String chname) {
        this.chname = chname == null ? null : chname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boss_service.manage_url
     *
     * @return the value of boss_service.manage_url
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getManageUrl() {
        return manageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boss_service.manage_url
     *
     * @param manageUrl the value for boss_service.manage_url
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setManageUrl(String manageUrl) {
        this.manageUrl = manageUrl == null ? null : manageUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boss_service.show_detail_url
     *
     * @return the value of boss_service.show_detail_url
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getShowDetailUrl() {
        return showDetailUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boss_service.show_detail_url
     *
     * @param showDetailUrl the value for boss_service.show_detail_url
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setShowDetailUrl(String showDetailUrl) {
        this.showDetailUrl = showDetailUrl == null ? null : showDetailUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boss_service.show_order
     *
     * @return the value of boss_service.show_order
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public Integer getShowOrder() {
        return showOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boss_service.show_order
     *
     * @param showOrder the value for boss_service.show_order
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setShowOrder(Integer showOrder) {
        this.showOrder = showOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boss_service.service_description
     *
     * @return the value of boss_service.service_description
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getServiceDescription() {
        return serviceDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boss_service.service_description
     *
     * @param serviceDescription the value for boss_service.service_description
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription == null ? null : serviceDescription.trim();
    }
}