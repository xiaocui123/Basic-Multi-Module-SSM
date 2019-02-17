package com.mtiming.manage.pojo;

import java.util.ArrayList;
import java.util.List;

public class RaceGunInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RaceGunInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andRaceIsNull() {
            addCriterion("Race is null");
            return (Criteria) this;
        }

        public Criteria andRaceIsNotNull() {
            addCriterion("Race is not null");
            return (Criteria) this;
        }

        public Criteria andRaceEqualTo(Integer value) {
            addCriterion("Race =", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceNotEqualTo(Integer value) {
            addCriterion("Race <>", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceGreaterThan(Integer value) {
            addCriterion("Race >", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceGreaterThanOrEqualTo(Integer value) {
            addCriterion("Race >=", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceLessThan(Integer value) {
            addCriterion("Race <", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceLessThanOrEqualTo(Integer value) {
            addCriterion("Race <=", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceIn(List<Integer> values) {
            addCriterion("Race in", values, "race");
            return (Criteria) this;
        }

        public Criteria andRaceNotIn(List<Integer> values) {
            addCriterion("Race not in", values, "race");
            return (Criteria) this;
        }

        public Criteria andRaceBetween(Integer value1, Integer value2) {
            addCriterion("Race between", value1, value2, "race");
            return (Criteria) this;
        }

        public Criteria andRaceNotBetween(Integer value1, Integer value2) {
            addCriterion("Race not between", value1, value2, "race");
            return (Criteria) this;
        }

        public Criteria andPlannedguntimeIsNull() {
            addCriterion("PlannedGunTime is null");
            return (Criteria) this;
        }

        public Criteria andPlannedguntimeIsNotNull() {
            addCriterion("PlannedGunTime is not null");
            return (Criteria) this;
        }

        public Criteria andPlannedguntimeEqualTo(String value) {
            addCriterion("PlannedGunTime =", value, "plannedguntime");
            return (Criteria) this;
        }

        public Criteria andPlannedguntimeNotEqualTo(String value) {
            addCriterion("PlannedGunTime <>", value, "plannedguntime");
            return (Criteria) this;
        }

        public Criteria andPlannedguntimeGreaterThan(String value) {
            addCriterion("PlannedGunTime >", value, "plannedguntime");
            return (Criteria) this;
        }

        public Criteria andPlannedguntimeGreaterThanOrEqualTo(String value) {
            addCriterion("PlannedGunTime >=", value, "plannedguntime");
            return (Criteria) this;
        }

        public Criteria andPlannedguntimeLessThan(String value) {
            addCriterion("PlannedGunTime <", value, "plannedguntime");
            return (Criteria) this;
        }

        public Criteria andPlannedguntimeLessThanOrEqualTo(String value) {
            addCriterion("PlannedGunTime <=", value, "plannedguntime");
            return (Criteria) this;
        }

        public Criteria andPlannedguntimeLike(String value) {
            addCriterion("PlannedGunTime like", value, "plannedguntime");
            return (Criteria) this;
        }

        public Criteria andPlannedguntimeNotLike(String value) {
            addCriterion("PlannedGunTime not like", value, "plannedguntime");
            return (Criteria) this;
        }

        public Criteria andPlannedguntimeIn(List<String> values) {
            addCriterion("PlannedGunTime in", values, "plannedguntime");
            return (Criteria) this;
        }

        public Criteria andPlannedguntimeNotIn(List<String> values) {
            addCriterion("PlannedGunTime not in", values, "plannedguntime");
            return (Criteria) this;
        }

        public Criteria andPlannedguntimeBetween(String value1, String value2) {
            addCriterion("PlannedGunTime between", value1, value2, "plannedguntime");
            return (Criteria) this;
        }

        public Criteria andPlannedguntimeNotBetween(String value1, String value2) {
            addCriterion("PlannedGunTime not between", value1, value2, "plannedguntime");
            return (Criteria) this;
        }

        public Criteria andGuntimeIsNull() {
            addCriterion("GunTime is null");
            return (Criteria) this;
        }

        public Criteria andGuntimeIsNotNull() {
            addCriterion("GunTime is not null");
            return (Criteria) this;
        }

        public Criteria andGuntimeEqualTo(String value) {
            addCriterion("GunTime =", value, "guntime");
            return (Criteria) this;
        }

        public Criteria andGuntimeNotEqualTo(String value) {
            addCriterion("GunTime <>", value, "guntime");
            return (Criteria) this;
        }

        public Criteria andGuntimeGreaterThan(String value) {
            addCriterion("GunTime >", value, "guntime");
            return (Criteria) this;
        }

        public Criteria andGuntimeGreaterThanOrEqualTo(String value) {
            addCriterion("GunTime >=", value, "guntime");
            return (Criteria) this;
        }

        public Criteria andGuntimeLessThan(String value) {
            addCriterion("GunTime <", value, "guntime");
            return (Criteria) this;
        }

        public Criteria andGuntimeLessThanOrEqualTo(String value) {
            addCriterion("GunTime <=", value, "guntime");
            return (Criteria) this;
        }

        public Criteria andGuntimeLike(String value) {
            addCriterion("GunTime like", value, "guntime");
            return (Criteria) this;
        }

        public Criteria andGuntimeNotLike(String value) {
            addCriterion("GunTime not like", value, "guntime");
            return (Criteria) this;
        }

        public Criteria andGuntimeIn(List<String> values) {
            addCriterion("GunTime in", values, "guntime");
            return (Criteria) this;
        }

        public Criteria andGuntimeNotIn(List<String> values) {
            addCriterion("GunTime not in", values, "guntime");
            return (Criteria) this;
        }

        public Criteria andGuntimeBetween(String value1, String value2) {
            addCriterion("GunTime between", value1, value2, "guntime");
            return (Criteria) this;
        }

        public Criteria andGuntimeNotBetween(String value1, String value2) {
            addCriterion("GunTime not between", value1, value2, "guntime");
            return (Criteria) this;
        }

        public Criteria andCutoffoffsetIsNull() {
            addCriterion("CutOffOffset is null");
            return (Criteria) this;
        }

        public Criteria andCutoffoffsetIsNotNull() {
            addCriterion("CutOffOffset is not null");
            return (Criteria) this;
        }

        public Criteria andCutoffoffsetEqualTo(String value) {
            addCriterion("CutOffOffset =", value, "cutoffoffset");
            return (Criteria) this;
        }

        public Criteria andCutoffoffsetNotEqualTo(String value) {
            addCriterion("CutOffOffset <>", value, "cutoffoffset");
            return (Criteria) this;
        }

        public Criteria andCutoffoffsetGreaterThan(String value) {
            addCriterion("CutOffOffset >", value, "cutoffoffset");
            return (Criteria) this;
        }

        public Criteria andCutoffoffsetGreaterThanOrEqualTo(String value) {
            addCriterion("CutOffOffset >=", value, "cutoffoffset");
            return (Criteria) this;
        }

        public Criteria andCutoffoffsetLessThan(String value) {
            addCriterion("CutOffOffset <", value, "cutoffoffset");
            return (Criteria) this;
        }

        public Criteria andCutoffoffsetLessThanOrEqualTo(String value) {
            addCriterion("CutOffOffset <=", value, "cutoffoffset");
            return (Criteria) this;
        }

        public Criteria andCutoffoffsetLike(String value) {
            addCriterion("CutOffOffset like", value, "cutoffoffset");
            return (Criteria) this;
        }

        public Criteria andCutoffoffsetNotLike(String value) {
            addCriterion("CutOffOffset not like", value, "cutoffoffset");
            return (Criteria) this;
        }

        public Criteria andCutoffoffsetIn(List<String> values) {
            addCriterion("CutOffOffset in", values, "cutoffoffset");
            return (Criteria) this;
        }

        public Criteria andCutoffoffsetNotIn(List<String> values) {
            addCriterion("CutOffOffset not in", values, "cutoffoffset");
            return (Criteria) this;
        }

        public Criteria andCutoffoffsetBetween(String value1, String value2) {
            addCriterion("CutOffOffset between", value1, value2, "cutoffoffset");
            return (Criteria) this;
        }

        public Criteria andCutoffoffsetNotBetween(String value1, String value2) {
            addCriterion("CutOffOffset not between", value1, value2, "cutoffoffset");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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