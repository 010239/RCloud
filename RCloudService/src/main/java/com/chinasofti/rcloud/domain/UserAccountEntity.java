package com.chinasofti.rcloud.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class UserAccountEntity implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_user_account.account_id
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String accountId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_user_account.money_amount
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private BigDecimal moneyAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_user_account.user_id
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table portal_user_account
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_user_account.account_id
     *
     * @return the value of portal_user_account.account_id
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_user_account.account_id
     *
     * @param accountId the value for portal_user_account.account_id
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_user_account.money_amount
     *
     * @return the value of portal_user_account.money_amount
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public BigDecimal getMoneyAmount() {
        return moneyAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_user_account.money_amount
     *
     * @param moneyAmount the value for portal_user_account.money_amount
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setMoneyAmount(BigDecimal moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_user_account.user_id
     *
     * @return the value of portal_user_account.user_id
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_user_account.user_id
     *
     * @param userId the value for portal_user_account.user_id
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}