package com.chinasofti.rcloud.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApplicationBillEntityExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table portal_application_bill
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table portal_application_bill
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table portal_application_bill
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_application_bill
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public ApplicationBillEntityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_application_bill
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_application_bill
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_application_bill
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_application_bill
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_application_bill
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_application_bill
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_application_bill
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_application_bill
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_application_bill
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_application_bill
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table portal_application_bill
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andBillIdIsNull() {
            addCriterion("bill_id is null");
            return (Criteria) this;
        }

        public Criteria andBillIdIsNotNull() {
            addCriterion("bill_id is not null");
            return (Criteria) this;
        }

        public Criteria andBillIdEqualTo(String value) {
            addCriterion("bill_id =", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotEqualTo(String value) {
            addCriterion("bill_id <>", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThan(String value) {
            addCriterion("bill_id >", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThanOrEqualTo(String value) {
            addCriterion("bill_id >=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThan(String value) {
            addCriterion("bill_id <", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThanOrEqualTo(String value) {
            addCriterion("bill_id <=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLike(String value) {
            addCriterion("bill_id like", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotLike(String value) {
            addCriterion("bill_id not like", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdIn(List<String> values) {
            addCriterion("bill_id in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotIn(List<String> values) {
            addCriterion("bill_id not in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdBetween(String value1, String value2) {
            addCriterion("bill_id between", value1, value2, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotBetween(String value1, String value2) {
            addCriterion("bill_id not between", value1, value2, "billId");
            return (Criteria) this;
        }

        public Criteria andBillNumberIsNull() {
            addCriterion("bill_number is null");
            return (Criteria) this;
        }

        public Criteria andBillNumberIsNotNull() {
            addCriterion("bill_number is not null");
            return (Criteria) this;
        }

        public Criteria andBillNumberEqualTo(String value) {
            addCriterion("bill_number =", value, "billNumber");
            return (Criteria) this;
        }

        public Criteria andBillNumberNotEqualTo(String value) {
            addCriterion("bill_number <>", value, "billNumber");
            return (Criteria) this;
        }

        public Criteria andBillNumberGreaterThan(String value) {
            addCriterion("bill_number >", value, "billNumber");
            return (Criteria) this;
        }

        public Criteria andBillNumberGreaterThanOrEqualTo(String value) {
            addCriterion("bill_number >=", value, "billNumber");
            return (Criteria) this;
        }

        public Criteria andBillNumberLessThan(String value) {
            addCriterion("bill_number <", value, "billNumber");
            return (Criteria) this;
        }

        public Criteria andBillNumberLessThanOrEqualTo(String value) {
            addCriterion("bill_number <=", value, "billNumber");
            return (Criteria) this;
        }

        public Criteria andBillNumberLike(String value) {
            addCriterion("bill_number like", value, "billNumber");
            return (Criteria) this;
        }

        public Criteria andBillNumberNotLike(String value) {
            addCriterion("bill_number not like", value, "billNumber");
            return (Criteria) this;
        }

        public Criteria andBillNumberIn(List<String> values) {
            addCriterion("bill_number in", values, "billNumber");
            return (Criteria) this;
        }

        public Criteria andBillNumberNotIn(List<String> values) {
            addCriterion("bill_number not in", values, "billNumber");
            return (Criteria) this;
        }

        public Criteria andBillNumberBetween(String value1, String value2) {
            addCriterion("bill_number between", value1, value2, "billNumber");
            return (Criteria) this;
        }

        public Criteria andBillNumberNotBetween(String value1, String value2) {
            addCriterion("bill_number not between", value1, value2, "billNumber");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andBillCostsIsNull() {
            addCriterion("bill_costs is null");
            return (Criteria) this;
        }

        public Criteria andBillCostsIsNotNull() {
            addCriterion("bill_costs is not null");
            return (Criteria) this;
        }

        public Criteria andBillCostsEqualTo(BigDecimal value) {
            addCriterion("bill_costs =", value, "billCosts");
            return (Criteria) this;
        }

        public Criteria andBillCostsNotEqualTo(BigDecimal value) {
            addCriterion("bill_costs <>", value, "billCosts");
            return (Criteria) this;
        }

        public Criteria andBillCostsGreaterThan(BigDecimal value) {
            addCriterion("bill_costs >", value, "billCosts");
            return (Criteria) this;
        }

        public Criteria andBillCostsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bill_costs >=", value, "billCosts");
            return (Criteria) this;
        }

        public Criteria andBillCostsLessThan(BigDecimal value) {
            addCriterion("bill_costs <", value, "billCosts");
            return (Criteria) this;
        }

        public Criteria andBillCostsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bill_costs <=", value, "billCosts");
            return (Criteria) this;
        }

        public Criteria andBillCostsIn(List<BigDecimal> values) {
            addCriterion("bill_costs in", values, "billCosts");
            return (Criteria) this;
        }

        public Criteria andBillCostsNotIn(List<BigDecimal> values) {
            addCriterion("bill_costs not in", values, "billCosts");
            return (Criteria) this;
        }

        public Criteria andBillCostsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bill_costs between", value1, value2, "billCosts");
            return (Criteria) this;
        }

        public Criteria andBillCostsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bill_costs not between", value1, value2, "billCosts");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNull() {
            addCriterion("bill_type is null");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNotNull() {
            addCriterion("bill_type is not null");
            return (Criteria) this;
        }

        public Criteria andBillTypeEqualTo(Integer value) {
            addCriterion("bill_type =", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotEqualTo(Integer value) {
            addCriterion("bill_type <>", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThan(Integer value) {
            addCriterion("bill_type >", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_type >=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThan(Integer value) {
            addCriterion("bill_type <", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThanOrEqualTo(Integer value) {
            addCriterion("bill_type <=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeIn(List<Integer> values) {
            addCriterion("bill_type in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotIn(List<Integer> values) {
            addCriterion("bill_type not in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeBetween(Integer value1, Integer value2) {
            addCriterion("bill_type between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_type not between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andMarkDeleteIsNull() {
            addCriterion("mark_delete is null");
            return (Criteria) this;
        }

        public Criteria andMarkDeleteIsNotNull() {
            addCriterion("mark_delete is not null");
            return (Criteria) this;
        }

        public Criteria andMarkDeleteEqualTo(Integer value) {
            addCriterion("mark_delete =", value, "markDelete");
            return (Criteria) this;
        }

        public Criteria andMarkDeleteNotEqualTo(Integer value) {
            addCriterion("mark_delete <>", value, "markDelete");
            return (Criteria) this;
        }

        public Criteria andMarkDeleteGreaterThan(Integer value) {
            addCriterion("mark_delete >", value, "markDelete");
            return (Criteria) this;
        }

        public Criteria andMarkDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("mark_delete >=", value, "markDelete");
            return (Criteria) this;
        }

        public Criteria andMarkDeleteLessThan(Integer value) {
            addCriterion("mark_delete <", value, "markDelete");
            return (Criteria) this;
        }

        public Criteria andMarkDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("mark_delete <=", value, "markDelete");
            return (Criteria) this;
        }

        public Criteria andMarkDeleteIn(List<Integer> values) {
            addCriterion("mark_delete in", values, "markDelete");
            return (Criteria) this;
        }

        public Criteria andMarkDeleteNotIn(List<Integer> values) {
            addCriterion("mark_delete not in", values, "markDelete");
            return (Criteria) this;
        }

        public Criteria andMarkDeleteBetween(Integer value1, Integer value2) {
            addCriterion("mark_delete between", value1, value2, "markDelete");
            return (Criteria) this;
        }

        public Criteria andMarkDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("mark_delete not between", value1, value2, "markDelete");
            return (Criteria) this;
        }

        public Criteria andMarkOwedIsNull() {
            addCriterion("mark_owed is null");
            return (Criteria) this;
        }

        public Criteria andMarkOwedIsNotNull() {
            addCriterion("mark_owed is not null");
            return (Criteria) this;
        }

        public Criteria andMarkOwedEqualTo(Integer value) {
            addCriterion("mark_owed =", value, "markOwed");
            return (Criteria) this;
        }

        public Criteria andMarkOwedNotEqualTo(Integer value) {
            addCriterion("mark_owed <>", value, "markOwed");
            return (Criteria) this;
        }

        public Criteria andMarkOwedGreaterThan(Integer value) {
            addCriterion("mark_owed >", value, "markOwed");
            return (Criteria) this;
        }

        public Criteria andMarkOwedGreaterThanOrEqualTo(Integer value) {
            addCriterion("mark_owed >=", value, "markOwed");
            return (Criteria) this;
        }

        public Criteria andMarkOwedLessThan(Integer value) {
            addCriterion("mark_owed <", value, "markOwed");
            return (Criteria) this;
        }

        public Criteria andMarkOwedLessThanOrEqualTo(Integer value) {
            addCriterion("mark_owed <=", value, "markOwed");
            return (Criteria) this;
        }

        public Criteria andMarkOwedIn(List<Integer> values) {
            addCriterion("mark_owed in", values, "markOwed");
            return (Criteria) this;
        }

        public Criteria andMarkOwedNotIn(List<Integer> values) {
            addCriterion("mark_owed not in", values, "markOwed");
            return (Criteria) this;
        }

        public Criteria andMarkOwedBetween(Integer value1, Integer value2) {
            addCriterion("mark_owed between", value1, value2, "markOwed");
            return (Criteria) this;
        }

        public Criteria andMarkOwedNotBetween(Integer value1, Integer value2) {
            addCriterion("mark_owed not between", value1, value2, "markOwed");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table portal_application_bill
     *
     * @mbggenerated do_not_delete_during_merge Mon Jan 19 10:09:58 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table portal_application_bill
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}