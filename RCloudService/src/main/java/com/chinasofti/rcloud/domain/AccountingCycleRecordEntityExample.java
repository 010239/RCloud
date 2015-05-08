package com.chinasofti.rcloud.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountingCycleRecordEntityExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table boss_accounting_cycle_record
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table boss_accounting_cycle_record
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table boss_accounting_cycle_record
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boss_accounting_cycle_record
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public AccountingCycleRecordEntityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boss_accounting_cycle_record
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boss_accounting_cycle_record
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boss_accounting_cycle_record
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boss_accounting_cycle_record
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boss_accounting_cycle_record
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boss_accounting_cycle_record
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boss_accounting_cycle_record
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
     * This method corresponds to the database table boss_accounting_cycle_record
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
     * This method corresponds to the database table boss_accounting_cycle_record
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boss_accounting_cycle_record
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
     * This class corresponds to the database table boss_accounting_cycle_record
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOriAccountingTimeIsNull() {
            addCriterion("ori_accounting_time is null");
            return (Criteria) this;
        }

        public Criteria andOriAccountingTimeIsNotNull() {
            addCriterion("ori_accounting_time is not null");
            return (Criteria) this;
        }

        public Criteria andOriAccountingTimeEqualTo(Integer value) {
            addCriterion("ori_accounting_time =", value, "oriAccountingTime");
            return (Criteria) this;
        }

        public Criteria andOriAccountingTimeNotEqualTo(Integer value) {
            addCriterion("ori_accounting_time <>", value, "oriAccountingTime");
            return (Criteria) this;
        }

        public Criteria andOriAccountingTimeGreaterThan(Integer value) {
            addCriterion("ori_accounting_time >", value, "oriAccountingTime");
            return (Criteria) this;
        }

        public Criteria andOriAccountingTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ori_accounting_time >=", value, "oriAccountingTime");
            return (Criteria) this;
        }

        public Criteria andOriAccountingTimeLessThan(Integer value) {
            addCriterion("ori_accounting_time <", value, "oriAccountingTime");
            return (Criteria) this;
        }

        public Criteria andOriAccountingTimeLessThanOrEqualTo(Integer value) {
            addCriterion("ori_accounting_time <=", value, "oriAccountingTime");
            return (Criteria) this;
        }

        public Criteria andOriAccountingTimeIn(List<Integer> values) {
            addCriterion("ori_accounting_time in", values, "oriAccountingTime");
            return (Criteria) this;
        }

        public Criteria andOriAccountingTimeNotIn(List<Integer> values) {
            addCriterion("ori_accounting_time not in", values, "oriAccountingTime");
            return (Criteria) this;
        }

        public Criteria andOriAccountingTimeBetween(Integer value1, Integer value2) {
            addCriterion("ori_accounting_time between", value1, value2, "oriAccountingTime");
            return (Criteria) this;
        }

        public Criteria andOriAccountingTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("ori_accounting_time not between", value1, value2, "oriAccountingTime");
            return (Criteria) this;
        }

        public Criteria andCurAccountingTimeIsNull() {
            addCriterion("cur_accounting_time is null");
            return (Criteria) this;
        }

        public Criteria andCurAccountingTimeIsNotNull() {
            addCriterion("cur_accounting_time is not null");
            return (Criteria) this;
        }

        public Criteria andCurAccountingTimeEqualTo(Integer value) {
            addCriterion("cur_accounting_time =", value, "curAccountingTime");
            return (Criteria) this;
        }

        public Criteria andCurAccountingTimeNotEqualTo(Integer value) {
            addCriterion("cur_accounting_time <>", value, "curAccountingTime");
            return (Criteria) this;
        }

        public Criteria andCurAccountingTimeGreaterThan(Integer value) {
            addCriterion("cur_accounting_time >", value, "curAccountingTime");
            return (Criteria) this;
        }

        public Criteria andCurAccountingTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cur_accounting_time >=", value, "curAccountingTime");
            return (Criteria) this;
        }

        public Criteria andCurAccountingTimeLessThan(Integer value) {
            addCriterion("cur_accounting_time <", value, "curAccountingTime");
            return (Criteria) this;
        }

        public Criteria andCurAccountingTimeLessThanOrEqualTo(Integer value) {
            addCriterion("cur_accounting_time <=", value, "curAccountingTime");
            return (Criteria) this;
        }

        public Criteria andCurAccountingTimeIn(List<Integer> values) {
            addCriterion("cur_accounting_time in", values, "curAccountingTime");
            return (Criteria) this;
        }

        public Criteria andCurAccountingTimeNotIn(List<Integer> values) {
            addCriterion("cur_accounting_time not in", values, "curAccountingTime");
            return (Criteria) this;
        }

        public Criteria andCurAccountingTimeBetween(Integer value1, Integer value2) {
            addCriterion("cur_accounting_time between", value1, value2, "curAccountingTime");
            return (Criteria) this;
        }

        public Criteria andCurAccountingTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("cur_accounting_time not between", value1, value2, "curAccountingTime");
            return (Criteria) this;
        }

        public Criteria andMarkAccountingIsNull() {
            addCriterion("mark_accounting is null");
            return (Criteria) this;
        }

        public Criteria andMarkAccountingIsNotNull() {
            addCriterion("mark_accounting is not null");
            return (Criteria) this;
        }

        public Criteria andMarkAccountingEqualTo(Integer value) {
            addCriterion("mark_accounting =", value, "markAccounting");
            return (Criteria) this;
        }

        public Criteria andMarkAccountingNotEqualTo(Integer value) {
            addCriterion("mark_accounting <>", value, "markAccounting");
            return (Criteria) this;
        }

        public Criteria andMarkAccountingGreaterThan(Integer value) {
            addCriterion("mark_accounting >", value, "markAccounting");
            return (Criteria) this;
        }

        public Criteria andMarkAccountingGreaterThanOrEqualTo(Integer value) {
            addCriterion("mark_accounting >=", value, "markAccounting");
            return (Criteria) this;
        }

        public Criteria andMarkAccountingLessThan(Integer value) {
            addCriterion("mark_accounting <", value, "markAccounting");
            return (Criteria) this;
        }

        public Criteria andMarkAccountingLessThanOrEqualTo(Integer value) {
            addCriterion("mark_accounting <=", value, "markAccounting");
            return (Criteria) this;
        }

        public Criteria andMarkAccountingIn(List<Integer> values) {
            addCriterion("mark_accounting in", values, "markAccounting");
            return (Criteria) this;
        }

        public Criteria andMarkAccountingNotIn(List<Integer> values) {
            addCriterion("mark_accounting not in", values, "markAccounting");
            return (Criteria) this;
        }

        public Criteria andMarkAccountingBetween(Integer value1, Integer value2) {
            addCriterion("mark_accounting between", value1, value2, "markAccounting");
            return (Criteria) this;
        }

        public Criteria andMarkAccountingNotBetween(Integer value1, Integer value2) {
            addCriterion("mark_accounting not between", value1, value2, "markAccounting");
            return (Criteria) this;
        }

        public Criteria andModifyUserIsNull() {
            addCriterion("modify_user is null");
            return (Criteria) this;
        }

        public Criteria andModifyUserIsNotNull() {
            addCriterion("modify_user is not null");
            return (Criteria) this;
        }

        public Criteria andModifyUserEqualTo(String value) {
            addCriterion("modify_user =", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotEqualTo(String value) {
            addCriterion("modify_user <>", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserGreaterThan(String value) {
            addCriterion("modify_user >", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("modify_user >=", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLessThan(String value) {
            addCriterion("modify_user <", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLessThanOrEqualTo(String value) {
            addCriterion("modify_user <=", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLike(String value) {
            addCriterion("modify_user like", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotLike(String value) {
            addCriterion("modify_user not like", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserIn(List<String> values) {
            addCriterion("modify_user in", values, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotIn(List<String> values) {
            addCriterion("modify_user not in", values, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserBetween(String value1, String value2) {
            addCriterion("modify_user between", value1, value2, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotBetween(String value1, String value2) {
            addCriterion("modify_user not between", value1, value2, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table boss_accounting_cycle_record
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
     * This class corresponds to the database table boss_accounting_cycle_record
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