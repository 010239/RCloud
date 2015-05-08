package com.chinasofti.rcloud.domain;

import java.io.Serializable;
import java.util.Date;

public class PkgEntity implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boss_pkg.pkg_id
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String pkgId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boss_pkg.pkg_name
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String pkgName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boss_pkg.service_id
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String serviceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boss_pkg.pkg_type
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private Integer pkgType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boss_pkg.description
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boss_pkg.create_user
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boss_pkg.create_time
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boss_pkg.modify_user
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String modifyUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column boss_pkg.modify_time
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table boss_pkg
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boss_pkg.pkg_id
     *
     * @return the value of boss_pkg.pkg_id
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getPkgId() {
        return pkgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boss_pkg.pkg_id
     *
     * @param pkgId the value for boss_pkg.pkg_id
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setPkgId(String pkgId) {
        this.pkgId = pkgId == null ? null : pkgId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boss_pkg.pkg_name
     *
     * @return the value of boss_pkg.pkg_name
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getPkgName() {
        return pkgName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boss_pkg.pkg_name
     *
     * @param pkgName the value for boss_pkg.pkg_name
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setPkgName(String pkgName) {
        this.pkgName = pkgName == null ? null : pkgName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boss_pkg.service_id
     *
     * @return the value of boss_pkg.service_id
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boss_pkg.service_id
     *
     * @param serviceId the value for boss_pkg.service_id
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId == null ? null : serviceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boss_pkg.pkg_type
     *
     * @return the value of boss_pkg.pkg_type
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public Integer getPkgType() {
        return pkgType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boss_pkg.pkg_type
     *
     * @param pkgType the value for boss_pkg.pkg_type
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setPkgType(Integer pkgType) {
        this.pkgType = pkgType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boss_pkg.description
     *
     * @return the value of boss_pkg.description
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boss_pkg.description
     *
     * @param description the value for boss_pkg.description
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boss_pkg.create_user
     *
     * @return the value of boss_pkg.create_user
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boss_pkg.create_user
     *
     * @param createUser the value for boss_pkg.create_user
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boss_pkg.create_time
     *
     * @return the value of boss_pkg.create_time
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boss_pkg.create_time
     *
     * @param createTime the value for boss_pkg.create_time
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boss_pkg.modify_user
     *
     * @return the value of boss_pkg.modify_user
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getModifyUser() {
        return modifyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boss_pkg.modify_user
     *
     * @param modifyUser the value for boss_pkg.modify_user
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser == null ? null : modifyUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column boss_pkg.modify_time
     *
     * @return the value of boss_pkg.modify_time
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column boss_pkg.modify_time
     *
     * @param modifyTime the value for boss_pkg.modify_time
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}