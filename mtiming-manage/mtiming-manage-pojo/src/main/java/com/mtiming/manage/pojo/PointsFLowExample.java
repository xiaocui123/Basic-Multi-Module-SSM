package com.mtiming.manage.pojo;

import java.util.ArrayList;
import java.util.List;

public class PointsFLowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PointsFLowExample() {
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

        public Criteria andCourseidIsNull() {
            addCriterion("CourseID is null");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNotNull() {
            addCriterion("CourseID is not null");
            return (Criteria) this;
        }

        public Criteria andCourseidEqualTo(Integer value) {
            addCriterion("CourseID =", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotEqualTo(Integer value) {
            addCriterion("CourseID <>", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThan(Integer value) {
            addCriterion("CourseID >", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CourseID >=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThan(Integer value) {
            addCriterion("CourseID <", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThanOrEqualTo(Integer value) {
            addCriterion("CourseID <=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidIn(List<Integer> values) {
            addCriterion("CourseID in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotIn(List<Integer> values) {
            addCriterion("CourseID not in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidBetween(Integer value1, Integer value2) {
            addCriterion("CourseID between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotBetween(Integer value1, Integer value2) {
            addCriterion("CourseID not between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andPointsIsNull() {
            addCriterion("Points is null");
            return (Criteria) this;
        }

        public Criteria andPointsIsNotNull() {
            addCriterion("Points is not null");
            return (Criteria) this;
        }

        public Criteria andPointsEqualTo(String value) {
            addCriterion("Points =", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotEqualTo(String value) {
            addCriterion("Points <>", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThan(String value) {
            addCriterion("Points >", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThanOrEqualTo(String value) {
            addCriterion("Points >=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThan(String value) {
            addCriterion("Points <", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThanOrEqualTo(String value) {
            addCriterion("Points <=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLike(String value) {
            addCriterion("Points like", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotLike(String value) {
            addCriterion("Points not like", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsIn(List<String> values) {
            addCriterion("Points in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotIn(List<String> values) {
            addCriterion("Points not in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsBetween(String value1, String value2) {
            addCriterion("Points between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotBetween(String value1, String value2) {
            addCriterion("Points not between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andDeviceIsNull() {
            addCriterion("Device is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIsNotNull() {
            addCriterion("Device is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceEqualTo(String value) {
            addCriterion("Device =", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotEqualTo(String value) {
            addCriterion("Device <>", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceGreaterThan(String value) {
            addCriterion("Device >", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceGreaterThanOrEqualTo(String value) {
            addCriterion("Device >=", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceLessThan(String value) {
            addCriterion("Device <", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceLessThanOrEqualTo(String value) {
            addCriterion("Device <=", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceLike(String value) {
            addCriterion("Device like", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotLike(String value) {
            addCriterion("Device not like", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceIn(List<String> values) {
            addCriterion("Device in", values, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotIn(List<String> values) {
            addCriterion("Device not in", values, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceBetween(String value1, String value2) {
            addCriterion("Device between", value1, value2, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotBetween(String value1, String value2) {
            addCriterion("Device not between", value1, value2, "device");
            return (Criteria) this;
        }

        public Criteria andSeqIsNull() {
            addCriterion("Seq is null");
            return (Criteria) this;
        }

        public Criteria andSeqIsNotNull() {
            addCriterion("Seq is not null");
            return (Criteria) this;
        }

        public Criteria andSeqEqualTo(Integer value) {
            addCriterion("Seq =", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotEqualTo(Integer value) {
            addCriterion("Seq <>", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThan(Integer value) {
            addCriterion("Seq >", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("Seq >=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThan(Integer value) {
            addCriterion("Seq <", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThanOrEqualTo(Integer value) {
            addCriterion("Seq <=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqIn(List<Integer> values) {
            addCriterion("Seq in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotIn(List<Integer> values) {
            addCriterion("Seq not in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqBetween(Integer value1, Integer value2) {
            addCriterion("Seq between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("Seq not between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andPriorpointIsNull() {
            addCriterion("PriorPoint is null");
            return (Criteria) this;
        }

        public Criteria andPriorpointIsNotNull() {
            addCriterion("PriorPoint is not null");
            return (Criteria) this;
        }

        public Criteria andPriorpointEqualTo(String value) {
            addCriterion("PriorPoint =", value, "priorpoint");
            return (Criteria) this;
        }

        public Criteria andPriorpointNotEqualTo(String value) {
            addCriterion("PriorPoint <>", value, "priorpoint");
            return (Criteria) this;
        }

        public Criteria andPriorpointGreaterThan(String value) {
            addCriterion("PriorPoint >", value, "priorpoint");
            return (Criteria) this;
        }

        public Criteria andPriorpointGreaterThanOrEqualTo(String value) {
            addCriterion("PriorPoint >=", value, "priorpoint");
            return (Criteria) this;
        }

        public Criteria andPriorpointLessThan(String value) {
            addCriterion("PriorPoint <", value, "priorpoint");
            return (Criteria) this;
        }

        public Criteria andPriorpointLessThanOrEqualTo(String value) {
            addCriterion("PriorPoint <=", value, "priorpoint");
            return (Criteria) this;
        }

        public Criteria andPriorpointLike(String value) {
            addCriterion("PriorPoint like", value, "priorpoint");
            return (Criteria) this;
        }

        public Criteria andPriorpointNotLike(String value) {
            addCriterion("PriorPoint not like", value, "priorpoint");
            return (Criteria) this;
        }

        public Criteria andPriorpointIn(List<String> values) {
            addCriterion("PriorPoint in", values, "priorpoint");
            return (Criteria) this;
        }

        public Criteria andPriorpointNotIn(List<String> values) {
            addCriterion("PriorPoint not in", values, "priorpoint");
            return (Criteria) this;
        }

        public Criteria andPriorpointBetween(String value1, String value2) {
            addCriterion("PriorPoint between", value1, value2, "priorpoint");
            return (Criteria) this;
        }

        public Criteria andPriorpointNotBetween(String value1, String value2) {
            addCriterion("PriorPoint not between", value1, value2, "priorpoint");
            return (Criteria) this;
        }

        public Criteria andIntervalIsNull() {
            addCriterion("Interval is null");
            return (Criteria) this;
        }

        public Criteria andIntervalIsNotNull() {
            addCriterion("Interval is not null");
            return (Criteria) this;
        }

        public Criteria andIntervalEqualTo(Integer value) {
            addCriterion("Interval =", value, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalNotEqualTo(Integer value) {
            addCriterion("Interval <>", value, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalGreaterThan(Integer value) {
            addCriterion("Interval >", value, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalGreaterThanOrEqualTo(Integer value) {
            addCriterion("Interval >=", value, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalLessThan(Integer value) {
            addCriterion("Interval <", value, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalLessThanOrEqualTo(Integer value) {
            addCriterion("Interval <=", value, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalIn(List<Integer> values) {
            addCriterion("Interval in", values, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalNotIn(List<Integer> values) {
            addCriterion("Interval not in", values, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalBetween(Integer value1, Integer value2) {
            addCriterion("Interval between", value1, value2, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalNotBetween(Integer value1, Integer value2) {
            addCriterion("Interval not between", value1, value2, "interval");
            return (Criteria) this;
        }

        public Criteria andNextpointIsNull() {
            addCriterion("NextPoint is null");
            return (Criteria) this;
        }

        public Criteria andNextpointIsNotNull() {
            addCriterion("NextPoint is not null");
            return (Criteria) this;
        }

        public Criteria andNextpointEqualTo(String value) {
            addCriterion("NextPoint =", value, "nextpoint");
            return (Criteria) this;
        }

        public Criteria andNextpointNotEqualTo(String value) {
            addCriterion("NextPoint <>", value, "nextpoint");
            return (Criteria) this;
        }

        public Criteria andNextpointGreaterThan(String value) {
            addCriterion("NextPoint >", value, "nextpoint");
            return (Criteria) this;
        }

        public Criteria andNextpointGreaterThanOrEqualTo(String value) {
            addCriterion("NextPoint >=", value, "nextpoint");
            return (Criteria) this;
        }

        public Criteria andNextpointLessThan(String value) {
            addCriterion("NextPoint <", value, "nextpoint");
            return (Criteria) this;
        }

        public Criteria andNextpointLessThanOrEqualTo(String value) {
            addCriterion("NextPoint <=", value, "nextpoint");
            return (Criteria) this;
        }

        public Criteria andNextpointLike(String value) {
            addCriterion("NextPoint like", value, "nextpoint");
            return (Criteria) this;
        }

        public Criteria andNextpointNotLike(String value) {
            addCriterion("NextPoint not like", value, "nextpoint");
            return (Criteria) this;
        }

        public Criteria andNextpointIn(List<String> values) {
            addCriterion("NextPoint in", values, "nextpoint");
            return (Criteria) this;
        }

        public Criteria andNextpointNotIn(List<String> values) {
            addCriterion("NextPoint not in", values, "nextpoint");
            return (Criteria) this;
        }

        public Criteria andNextpointBetween(String value1, String value2) {
            addCriterion("NextPoint between", value1, value2, "nextpoint");
            return (Criteria) this;
        }

        public Criteria andNextpointNotBetween(String value1, String value2) {
            addCriterion("NextPoint not between", value1, value2, "nextpoint");
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