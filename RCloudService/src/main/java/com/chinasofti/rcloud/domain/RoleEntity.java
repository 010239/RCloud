package com.chinasofti.rcloud.domain;

import java.io.Serializable;
import java.util.Date;

public class RoleEntity implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_role.role_code
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String roleCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_role.role_name
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String roleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_role.role_description
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String roleDescription;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_role.role_chname
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String roleChname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_role.create_user
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_role.create_time
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_role.modify_user
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String modifyUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_role.modify_time
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table portal_role
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_role.role_code
     *
     * @return the value of portal_role.role_code
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_role.role_code
     *
     * @param roleCode the value for portal_role.role_code
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_role.role_name
     *
     * @return the value of portal_role.role_name
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_role.role_name
     *
     * @param roleName the value for portal_role.role_name
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_role.role_description
     *
     * @return the value of portal_role.role_description
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getRoleDescription() {
        return roleDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_role.role_description
     *
     * @param roleDescription the value for portal_role.role_description
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription == null ? null : roleDescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_role.role_chname
     *
     * @return the value of portal_role.role_chname
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getRoleChname() {
        return roleChname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_role.role_chname
     *
     * @param roleChname the value for portal_role.role_chname
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setRoleChname(String roleChname) {
        this.roleChname = roleChname == null ? null : roleChname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_role.create_user
     *
     * @return the value of portal_role.create_user
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_role.create_user
     *
     * @param createUser the value for portal_role.create_user
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_role.create_time
     *
     * @return the value of portal_role.create_time
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_role.create_time
     *
     * @param createTime the value for portal_role.create_time
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_role.modify_user
     *
     * @return the value of portal_role.modify_user
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getModifyUser() {
        return modifyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_role.modify_user
     *
     * @param modifyUser the value for portal_role.modify_user
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser == null ? null : modifyUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_role.modify_time
     *
     * @return the value of portal_role.modify_time
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_role.modify_time
     *
     * @param modifyTime the value for portal_role.modify_time
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}