package com.mtiming.manage.pojo;

import java.util.ArrayList;
import java.util.List;

public class RaceCatMasterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RaceCatMasterExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRacenoIsNull() {
            addCriterion("RaceNo is null");
            return (Criteria) this;
        }

        public Criteria andRacenoIsNotNull() {
            addCriterion("RaceNo is not null");
            return (Criteria) this;
        }

        public Criteria andRacenoEqualTo(Integer value) {
            addCriterion("RaceNo =", value, "raceno");
            return (Criteria) this;
        }

        public Criteria andRacenoNotEqualTo(Integer value) {
            addCriterion("RaceNo <>", value, "raceno");
            return (Criteria) this;
        }

        public Criteria andRacenoGreaterThan(Integer value) {
            addCriterion("RaceNo >", value, "raceno");
            return (Criteria) this;
        }

        public Criteria andRacenoGreaterThanOrEqualTo(Integer value) {
            addCriterion("RaceNo >=", value, "raceno");
            return (Criteria) this;
        }

        public Criteria andRacenoLessThan(Integer value) {
            addCriterion("RaceNo <", value, "raceno");
            return (Criteria) this;
        }

        public Criteria andRacenoLessThanOrEqualTo(Integer value) {
            addCriterion("RaceNo <=", value, "raceno");
            return (Criteria) this;
        }

        public Criteria andRacenoIn(List<Integer> values) {
            addCriterion("RaceNo in", values, "raceno");
            return (Criteria) this;
        }

        public Criteria andRacenoNotIn(List<Integer> values) {
            addCriterion("RaceNo not in", values, "raceno");
            return (Criteria) this;
        }

        public Criteria andRacenoBetween(Integer value1, Integer value2) {
            addCriterion("RaceNo between", value1, value2, "raceno");
            return (Criteria) this;
        }

        public Criteria andRacenoNotBetween(Integer value1, Integer value2) {
            addCriterion("RaceNo not between", value1, value2, "raceno");
            return (Criteria) this;
        }

        public Criteria andRacecatIsNull() {
            addCriterion("RaceCat is null");
            return (Criteria) this;
        }

        public Criteria andRacecatIsNotNull() {
            addCriterion("RaceCat is not null");
            return (Criteria) this;
        }

        public Criteria andRacecatEqualTo(String value) {
            addCriterion("RaceCat =", value, "racecat");
            return (Criteria) this;
        }

        public Criteria andRacecatNotEqualTo(String value) {
            addCriterion("RaceCat <>", value, "racecat");
            return (Criteria) this;
        }

        public Criteria andRacecatGreaterThan(String value) {
            addCriterion("RaceCat >", value, "racecat");
            return (Criteria) this;
        }

        public Criteria andRacecatGreaterThanOrEqualTo(String value) {
            addCriterion("RaceCat >=", value, "racecat");
            return (Criteria) this;
        }

        public Criteria andRacecatLessThan(String value) {
            addCriterion("RaceCat <", value, "racecat");
            return (Criteria) this;
        }

        public Criteria andRacecatLessThanOrEqualTo(String value) {
            addCriterion("RaceCat <=", value, "racecat");
            return (Criteria) this;
        }

        public Criteria andRacecatLike(String value) {
            addCriterion("RaceCat like", value, "racecat");
            return (Criteria) this;
        }

        public Criteria andRacecatNotLike(String value) {
            addCriterion("RaceCat not like", value, "racecat");
            return (Criteria) this;
        }

        public Criteria andRacecatIn(List<String> values) {
            addCriterion("RaceCat in", values, "racecat");
            return (Criteria) this;
        }

        public Criteria andRacecatNotIn(List<String> values) {
            addCriterion("RaceCat not in", values, "racecat");
            return (Criteria) this;
        }

        public Criteria andRacecatBetween(String value1, String value2) {
            addCriterion("RaceCat between", value1, value2, "racecat");
            return (Criteria) this;
        }

        public Criteria andRacecatNotBetween(String value1, String value2) {
            addCriterion("RaceCat not between", value1, value2, "racecat");
            return (Criteria) this;
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

        public Criteria andRacecatnameIsNull() {
            addCriterion("RaceCatName is null");
            return (Criteria) this;
        }

        public Criteria andRacecatnameIsNotNull() {
            addCriterion("RaceCatName is not null");
            return (Criteria) this;
        }

        public Criteria andRacecatnameEqualTo(String value) {
            addCriterion("RaceCatName =", value, "racecatname");
            return (Criteria) this;
        }

        public Criteria andRacecatnameNotEqualTo(String value) {
            addCriterion("RaceCatName <>", value, "racecatname");
            return (Criteria) this;
        }

        public Criteria andRacecatnameGreaterThan(String value) {
            addCriterion("RaceCatName >", value, "racecatname");
            return (Criteria) this;
        }

        public Criteria andRacecatnameGreaterThanOrEqualTo(String value) {
            addCriterion("RaceCatName >=", value, "racecatname");
            return (Criteria) this;
        }

        public Criteria andRacecatnameLessThan(String value) {
            addCriterion("RaceCatName <", value, "racecatname");
            return (Criteria) this;
        }

        public Criteria andRacecatnameLessThanOrEqualTo(String value) {
            addCriterion("RaceCatName <=", value, "racecatname");
            return (Criteria) this;
        }

        public Criteria andRacecatnameLike(String value) {
            addCriterion("RaceCatName like", value, "racecatname");
            return (Criteria) this;
        }

        public Criteria andRacecatnameNotLike(String value) {
            addCriterion("RaceCatName not like", value, "racecatname");
            return (Criteria) this;
        }

        public Criteria andRacecatnameIn(List<String> values) {
            addCriterion("RaceCatName in", values, "racecatname");
            return (Criteria) this;
        }

        public Criteria andRacecatnameNotIn(List<String> values) {
            addCriterion("RaceCatName not in", values, "racecatname");
            return (Criteria) this;
        }

        public Criteria andRacecatnameBetween(String value1, String value2) {
            addCriterion("RaceCatName between", value1, value2, "racecatname");
            return (Criteria) this;
        }

        public Criteria andRacecatnameNotBetween(String value1, String value2) {
            addCriterion("RaceCatName not between", value1, value2, "racecatname");
            return (Criteria) this;
        }

        public Criteria andRacecatnamechiIsNull() {
            addCriterion("RaceCatNameChi is null");
            return (Criteria) this;
        }

        public Criteria andRacecatnamechiIsNotNull() {
            addCriterion("RaceCatNameChi is not null");
            return (Criteria) this;
        }

        public Criteria andRacecatnamechiEqualTo(String value) {
            addCriterion("RaceCatNameChi =", value, "racecatnamechi");
            return (Criteria) this;
        }

        public Criteria andRacecatnamechiNotEqualTo(String value) {
            addCriterion("RaceCatNameChi <>", value, "racecatnamechi");
            return (Criteria) this;
        }

        public Criteria andRacecatnamechiGreaterThan(String value) {
            addCriterion("RaceCatNameChi >", value, "racecatnamechi");
            return (Criteria) this;
        }

        public Criteria andRacecatnamechiGreaterThanOrEqualTo(String value) {
            addCriterion("RaceCatNameChi >=", value, "racecatnamechi");
            return (Criteria) this;
        }

        public Criteria andRacecatnamechiLessThan(String value) {
            addCriterion("RaceCatNameChi <", value, "racecatnamechi");
            return (Criteria) this;
        }

        public Criteria andRacecatnamechiLessThanOrEqualTo(String value) {
            addCriterion("RaceCatNameChi <=", value, "racecatnamechi");
            return (Criteria) this;
        }

        public Criteria andRacecatnamechiLike(String value) {
            addCriterion("RaceCatNameChi like", value, "racecatnamechi");
            return (Criteria) this;
        }

        public Criteria andRacecatnamechiNotLike(String value) {
            addCriterion("RaceCatNameChi not like", value, "racecatnamechi");
            return (Criteria) this;
        }

        public Criteria andRacecatnamechiIn(List<String> values) {
            addCriterion("RaceCatNameChi in", values, "racecatnamechi");
            return (Criteria) this;
        }

        public Criteria andRacecatnamechiNotIn(List<String> values) {
            addCriterion("RaceCatNameChi not in", values, "racecatnamechi");
            return (Criteria) this;
        }

        public Criteria andRacecatnamechiBetween(String value1, String value2) {
            addCriterion("RaceCatNameChi between", value1, value2, "racecatnamechi");
            return (Criteria) this;
        }

        public Criteria andRacecatnamechiNotBetween(String value1, String value2) {
            addCriterion("RaceCatNameChi not between", value1, value2, "racecatnamechi");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("Gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("Gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("Gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("Gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("Gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("Gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("Gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("Gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("Gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("Gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("Gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("Gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("Gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("Gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andIsteamIsNull() {
            addCriterion("IsTeam is null");
            return (Criteria) this;
        }

        public Criteria andIsteamIsNotNull() {
            addCriterion("IsTeam is not null");
            return (Criteria) this;
        }

        public Criteria andIsteamEqualTo(String value) {
            addCriterion("IsTeam =", value, "isteam");
            return (Criteria) this;
        }

        public Criteria andIsteamNotEqualTo(String value) {
            addCriterion("IsTeam <>", value, "isteam");
            return (Criteria) this;
        }

        public Criteria andIsteamGreaterThan(String value) {
            addCriterion("IsTeam >", value, "isteam");
            return (Criteria) this;
        }

        public Criteria andIsteamGreaterThanOrEqualTo(String value) {
            addCriterion("IsTeam >=", value, "isteam");
            return (Criteria) this;
        }

        public Criteria andIsteamLessThan(String value) {
            addCriterion("IsTeam <", value, "isteam");
            return (Criteria) this;
        }

        public Criteria andIsteamLessThanOrEqualTo(String value) {
            addCriterion("IsTeam <=", value, "isteam");
            return (Criteria) this;
        }

        public Criteria andIsteamLike(String value) {
            addCriterion("IsTeam like", value, "isteam");
            return (Criteria) this;
        }

        public Criteria andIsteamNotLike(String value) {
            addCriterion("IsTeam not like", value, "isteam");
            return (Criteria) this;
        }

        public Criteria andIsteamIn(List<String> values) {
            addCriterion("IsTeam in", values, "isteam");
            return (Criteria) this;
        }

        public Criteria andIsteamNotIn(List<String> values) {
            addCriterion("IsTeam not in", values, "isteam");
            return (Criteria) this;
        }

        public Criteria andIsteamBetween(String value1, String value2) {
            addCriterion("IsTeam between", value1, value2, "isteam");
            return (Criteria) this;
        }

        public Criteria andIsteamNotBetween(String value1, String value2) {
            addCriterion("IsTeam not between", value1, value2, "isteam");
            return (Criteria) this;
        }

        public Criteria andCorelegIsNull() {
            addCriterion("CoreLeg is null");
            return (Criteria) this;
        }

        public Criteria andCorelegIsNotNull() {
            addCriterion("CoreLeg is not null");
            return (Criteria) this;
        }

        public Criteria andCorelegEqualTo(Integer value) {
            addCriterion("CoreLeg =", value, "coreleg");
            return (Criteria) this;
        }

        public Criteria andCorelegNotEqualTo(Integer value) {
            addCriterion("CoreLeg <>", value, "coreleg");
            return (Criteria) this;
        }

        public Criteria andCorelegGreaterThan(Integer value) {
            addCriterion("CoreLeg >", value, "coreleg");
            return (Criteria) this;
        }

        public Criteria andCorelegGreaterThanOrEqualTo(Integer value) {
            addCriterion("CoreLeg >=", value, "coreleg");
            return (Criteria) this;
        }

        public Criteria andCorelegLessThan(Integer value) {
            addCriterion("CoreLeg <", value, "coreleg");
            return (Criteria) this;
        }

        public Criteria andCorelegLessThanOrEqualTo(Integer value) {
            addCriterion("CoreLeg <=", value, "coreleg");
            return (Criteria) this;
        }

        public Criteria andCorelegIn(List<Integer> values) {
            addCriterion("CoreLeg in", values, "coreleg");
            return (Criteria) this;
        }

        public Criteria andCorelegNotIn(List<Integer> values) {
            addCriterion("CoreLeg not in", values, "coreleg");
            return (Criteria) this;
        }

        public Criteria andCorelegBetween(Integer value1, Integer value2) {
            addCriterion("CoreLeg between", value1, value2, "coreleg");
            return (Criteria) this;
        }

        public Criteria andCorelegNotBetween(Integer value1, Integer value2) {
            addCriterion("CoreLeg not between", value1, value2, "coreleg");
            return (Criteria) this;
        }

        public Criteria andNoofprizeIsNull() {
            addCriterion("NoOfPrize is null");
            return (Criteria) this;
        }

        public Criteria andNoofprizeIsNotNull() {
            addCriterion("NoOfPrize is not null");
            return (Criteria) this;
        }

        public Criteria andNoofprizeEqualTo(Integer value) {
            addCriterion("NoOfPrize =", value, "noofprize");
            return (Criteria) this;
        }

        public Criteria andNoofprizeNotEqualTo(Integer value) {
            addCriterion("NoOfPrize <>", value, "noofprize");
            return (Criteria) this;
        }

        public Criteria andNoofprizeGreaterThan(Integer value) {
            addCriterion("NoOfPrize >", value, "noofprize");
            return (Criteria) this;
        }

        public Criteria andNoofprizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("NoOfPrize >=", value, "noofprize");
            return (Criteria) this;
        }

        public Criteria andNoofprizeLessThan(Integer value) {
            addCriterion("NoOfPrize <", value, "noofprize");
            return (Criteria) this;
        }

        public Criteria andNoofprizeLessThanOrEqualTo(Integer value) {
            addCriterion("NoOfPrize <=", value, "noofprize");
            return (Criteria) this;
        }

        public Criteria andNoofprizeIn(List<Integer> values) {
            addCriterion("NoOfPrize in", values, "noofprize");
            return (Criteria) this;
        }

        public Criteria andNoofprizeNotIn(List<Integer> values) {
            addCriterion("NoOfPrize not in", values, "noofprize");
            return (Criteria) this;
        }

        public Criteria andNoofprizeBetween(Integer value1, Integer value2) {
            addCriterion("NoOfPrize between", value1, value2, "noofprize");
            return (Criteria) this;
        }

        public Criteria andNoofprizeNotBetween(Integer value1, Integer value2) {
            addCriterion("NoOfPrize not between", value1, value2, "noofprize");
            return (Criteria) this;
        }

        public Criteria andHeaderIsNull() {
            addCriterion("Header is null");
            return (Criteria) this;
        }

        public Criteria andHeaderIsNotNull() {
            addCriterion("Header is not null");
            return (Criteria) this;
        }

        public Criteria andHeaderEqualTo(String value) {
            addCriterion("Header =", value, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderNotEqualTo(String value) {
            addCriterion("Header <>", value, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderGreaterThan(String value) {
            addCriterion("Header >", value, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderGreaterThanOrEqualTo(String value) {
            addCriterion("Header >=", value, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderLessThan(String value) {
            addCriterion("Header <", value, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderLessThanOrEqualTo(String value) {
            addCriterion("Header <=", value, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderLike(String value) {
            addCriterion("Header like", value, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderNotLike(String value) {
            addCriterion("Header not like", value, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderIn(List<String> values) {
            addCriterion("Header in", values, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderNotIn(List<String> values) {
            addCriterion("Header not in", values, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderBetween(String value1, String value2) {
            addCriterion("Header between", value1, value2, "header");
            return (Criteria) this;
        }

        public Criteria andHeaderNotBetween(String value1, String value2) {
            addCriterion("Header not between", value1, value2, "header");
            return (Criteria) this;
        }

        public Criteria andSeperatorIsNull() {
            addCriterion("Seperator is null");
            return (Criteria) this;
        }

        public Criteria andSeperatorIsNotNull() {
            addCriterion("Seperator is not null");
            return (Criteria) this;
        }

        public Criteria andSeperatorEqualTo(String value) {
            addCriterion("Seperator =", value, "seperator");
            return (Criteria) this;
        }

        public Criteria andSeperatorNotEqualTo(String value) {
            addCriterion("Seperator <>", value, "seperator");
            return (Criteria) this;
        }

        public Criteria andSeperatorGreaterThan(String value) {
            addCriterion("Seperator >", value, "seperator");
            return (Criteria) this;
        }

        public Criteria andSeperatorGreaterThanOrEqualTo(String value) {
            addCriterion("Seperator >=", value, "seperator");
            return (Criteria) this;
        }

        public Criteria andSeperatorLessThan(String value) {
            addCriterion("Seperator <", value, "seperator");
            return (Criteria) this;
        }

        public Criteria andSeperatorLessThanOrEqualTo(String value) {
            addCriterion("Seperator <=", value, "seperator");
            return (Criteria) this;
        }

        public Criteria andSeperatorLike(String value) {
            addCriterion("Seperator like", value, "seperator");
            return (Criteria) this;
        }

        public Criteria andSeperatorNotLike(String value) {
            addCriterion("Seperator not like", value, "seperator");
            return (Criteria) this;
        }

        public Criteria andSeperatorIn(List<String> values) {
            addCriterion("Seperator in", values, "seperator");
            return (Criteria) this;
        }

        public Criteria andSeperatorNotIn(List<String> values) {
            addCriterion("Seperator not in", values, "seperator");
            return (Criteria) this;
        }

        public Criteria andSeperatorBetween(String value1, String value2) {
            addCriterion("Seperator between", value1, value2, "seperator");
            return (Criteria) this;
        }

        public Criteria andSeperatorNotBetween(String value1, String value2) {
            addCriterion("Seperator not between", value1, value2, "seperator");
            return (Criteria) this;
        }

        public Criteria andLapsIsNull() {
            addCriterion("Laps is null");
            return (Criteria) this;
        }

        public Criteria andLapsIsNotNull() {
            addCriterion("Laps is not null");
            return (Criteria) this;
        }

        public Criteria andLapsEqualTo(Integer value) {
            addCriterion("Laps =", value, "laps");
            return (Criteria) this;
        }

        public Criteria andLapsNotEqualTo(Integer value) {
            addCriterion("Laps <>", value, "laps");
            return (Criteria) this;
        }

        public Criteria andLapsGreaterThan(Integer value) {
            addCriterion("Laps >", value, "laps");
            return (Criteria) this;
        }

        public Criteria andLapsGreaterThanOrEqualTo(Integer value) {
            addCriterion("Laps >=", value, "laps");
            return (Criteria) this;
        }

        public Criteria andLapsLessThan(Integer value) {
            addCriterion("Laps <", value, "laps");
            return (Criteria) this;
        }

        public Criteria andLapsLessThanOrEqualTo(Integer value) {
            addCriterion("Laps <=", value, "laps");
            return (Criteria) this;
        }

        public Criteria andLapsIn(List<Integer> values) {
            addCriterion("Laps in", values, "laps");
            return (Criteria) this;
        }

        public Criteria andLapsNotIn(List<Integer> values) {
            addCriterion("Laps not in", values, "laps");
            return (Criteria) this;
        }

        public Criteria andLapsBetween(Integer value1, Integer value2) {
            addCriterion("Laps between", value1, value2, "laps");
            return (Criteria) this;
        }

        public Criteria andLapsNotBetween(Integer value1, Integer value2) {
            addCriterion("Laps not between", value1, value2, "laps");
            return (Criteria) this;
        }

        public Criteria andRankcatbyIsNull() {
            addCriterion("RankCatBy is null");
            return (Criteria) this;
        }

        public Criteria andRankcatbyIsNotNull() {
            addCriterion("RankCatBy is not null");
            return (Criteria) this;
        }

        public Criteria andRankcatbyEqualTo(String value) {
            addCriterion("RankCatBy =", value, "rankcatby");
            return (Criteria) this;
        }

        public Criteria andRankcatbyNotEqualTo(String value) {
            addCriterion("RankCatBy <>", value, "rankcatby");
            return (Criteria) this;
        }

        public Criteria andRankcatbyGreaterThan(String value) {
            addCriterion("RankCatBy >", value, "rankcatby");
            return (Criteria) this;
        }

        public Criteria andRankcatbyGreaterThanOrEqualTo(String value) {
            addCriterion("RankCatBy >=", value, "rankcatby");
            return (Criteria) this;
        }

        public Criteria andRankcatbyLessThan(String value) {
            addCriterion("RankCatBy <", value, "rankcatby");
            return (Criteria) this;
        }

        public Criteria andRankcatbyLessThanOrEqualTo(String value) {
            addCriterion("RankCatBy <=", value, "rankcatby");
            return (Criteria) this;
        }

        public Criteria andRankcatbyLike(String value) {
            addCriterion("RankCatBy like", value, "rankcatby");
            return (Criteria) this;
        }

        public Criteria andRankcatbyNotLike(String value) {
            addCriterion("RankCatBy not like", value, "rankcatby");
            return (Criteria) this;
        }

        public Criteria andRankcatbyIn(List<String> values) {
            addCriterion("RankCatBy in", values, "rankcatby");
            return (Criteria) this;
        }

        public Criteria andRankcatbyNotIn(List<String> values) {
            addCriterion("RankCatBy not in", values, "rankcatby");
            return (Criteria) this;
        }

        public Criteria andRankcatbyBetween(String value1, String value2) {
            addCriterion("RankCatBy between", value1, value2, "rankcatby");
            return (Criteria) this;
        }

        public Criteria andRankcatbyNotBetween(String value1, String value2) {
            addCriterion("RankCatBy not between", value1, value2, "rankcatby");
            return (Criteria) this;
        }

        public Criteria andWinposIsNull() {
            addCriterion("WinPos is null");
            return (Criteria) this;
        }

        public Criteria andWinposIsNotNull() {
            addCriterion("WinPos is not null");
            return (Criteria) this;
        }

        public Criteria andWinposEqualTo(Integer value) {
            addCriterion("WinPos =", value, "winpos");
            return (Criteria) this;
        }

        public Criteria andWinposNotEqualTo(Integer value) {
            addCriterion("WinPos <>", value, "winpos");
            return (Criteria) this;
        }

        public Criteria andWinposGreaterThan(Integer value) {
            addCriterion("WinPos >", value, "winpos");
            return (Criteria) this;
        }

        public Criteria andWinposGreaterThanOrEqualTo(Integer value) {
            addCriterion("WinPos >=", value, "winpos");
            return (Criteria) this;
        }

        public Criteria andWinposLessThan(Integer value) {
            addCriterion("WinPos <", value, "winpos");
            return (Criteria) this;
        }

        public Criteria andWinposLessThanOrEqualTo(Integer value) {
            addCriterion("WinPos <=", value, "winpos");
            return (Criteria) this;
        }

        public Criteria andWinposIn(List<Integer> values) {
            addCriterion("WinPos in", values, "winpos");
            return (Criteria) this;
        }

        public Criteria andWinposNotIn(List<Integer> values) {
            addCriterion("WinPos not in", values, "winpos");
            return (Criteria) this;
        }

        public Criteria andWinposBetween(Integer value1, Integer value2) {
            addCriterion("WinPos between", value1, value2, "winpos");
            return (Criteria) this;
        }

        public Criteria andWinposNotBetween(Integer value1, Integer value2) {
            addCriterion("WinPos not between", value1, value2, "winpos");
            return (Criteria) this;
        }

        public Criteria andTeamsizeIsNull() {
            addCriterion("TeamSize is null");
            return (Criteria) this;
        }

        public Criteria andTeamsizeIsNotNull() {
            addCriterion("TeamSize is not null");
            return (Criteria) this;
        }

        public Criteria andTeamsizeEqualTo(Integer value) {
            addCriterion("TeamSize =", value, "teamsize");
            return (Criteria) this;
        }

        public Criteria andTeamsizeNotEqualTo(Integer value) {
            addCriterion("TeamSize <>", value, "teamsize");
            return (Criteria) this;
        }

        public Criteria andTeamsizeGreaterThan(Integer value) {
            addCriterion("TeamSize >", value, "teamsize");
            return (Criteria) this;
        }

        public Criteria andTeamsizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TeamSize >=", value, "teamsize");
            return (Criteria) this;
        }

        public Criteria andTeamsizeLessThan(Integer value) {
            addCriterion("TeamSize <", value, "teamsize");
            return (Criteria) this;
        }

        public Criteria andTeamsizeLessThanOrEqualTo(Integer value) {
            addCriterion("TeamSize <=", value, "teamsize");
            return (Criteria) this;
        }

        public Criteria andTeamsizeIn(List<Integer> values) {
            addCriterion("TeamSize in", values, "teamsize");
            return (Criteria) this;
        }

        public Criteria andTeamsizeNotIn(List<Integer> values) {
            addCriterion("TeamSize not in", values, "teamsize");
            return (Criteria) this;
        }

        public Criteria andTeamsizeBetween(Integer value1, Integer value2) {
            addCriterion("TeamSize between", value1, value2, "teamsize");
            return (Criteria) this;
        }

        public Criteria andTeamsizeNotBetween(Integer value1, Integer value2) {
            addCriterion("TeamSize not between", value1, value2, "teamsize");
            return (Criteria) this;
        }

        public Criteria andTeamtimemodeIsNull() {
            addCriterion("TeamTimeMode is null");
            return (Criteria) this;
        }

        public Criteria andTeamtimemodeIsNotNull() {
            addCriterion("TeamTimeMode is not null");
            return (Criteria) this;
        }

        public Criteria andTeamtimemodeEqualTo(String value) {
            addCriterion("TeamTimeMode =", value, "teamtimemode");
            return (Criteria) this;
        }

        public Criteria andTeamtimemodeNotEqualTo(String value) {
            addCriterion("TeamTimeMode <>", value, "teamtimemode");
            return (Criteria) this;
        }

        public Criteria andTeamtimemodeGreaterThan(String value) {
            addCriterion("TeamTimeMode >", value, "teamtimemode");
            return (Criteria) this;
        }

        public Criteria andTeamtimemodeGreaterThanOrEqualTo(String value) {
            addCriterion("TeamTimeMode >=", value, "teamtimemode");
            return (Criteria) this;
        }

        public Criteria andTeamtimemodeLessThan(String value) {
            addCriterion("TeamTimeMode <", value, "teamtimemode");
            return (Criteria) this;
        }

        public Criteria andTeamtimemodeLessThanOrEqualTo(String value) {
            addCriterion("TeamTimeMode <=", value, "teamtimemode");
            return (Criteria) this;
        }

        public Criteria andTeamtimemodeLike(String value) {
            addCriterion("TeamTimeMode like", value, "teamtimemode");
            return (Criteria) this;
        }

        public Criteria andTeamtimemodeNotLike(String value) {
            addCriterion("TeamTimeMode not like", value, "teamtimemode");
            return (Criteria) this;
        }

        public Criteria andTeamtimemodeIn(List<String> values) {
            addCriterion("TeamTimeMode in", values, "teamtimemode");
            return (Criteria) this;
        }

        public Criteria andTeamtimemodeNotIn(List<String> values) {
            addCriterion("TeamTimeMode not in", values, "teamtimemode");
            return (Criteria) this;
        }

        public Criteria andTeamtimemodeBetween(String value1, String value2) {
            addCriterion("TeamTimeMode between", value1, value2, "teamtimemode");
            return (Criteria) this;
        }

        public Criteria andTeamtimemodeNotBetween(String value1, String value2) {
            addCriterion("TeamTimeMode not between", value1, value2, "teamtimemode");
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