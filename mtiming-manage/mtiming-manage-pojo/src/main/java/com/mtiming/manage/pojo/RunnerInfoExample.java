package com.mtiming.manage.pojo;

import java.util.ArrayList;
import java.util.List;

public class RunnerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RunnerInfoExample() {
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

        public Criteria andCatIsNull() {
            addCriterion("Cat is null");
            return (Criteria) this;
        }

        public Criteria andCatIsNotNull() {
            addCriterion("Cat is not null");
            return (Criteria) this;
        }

        public Criteria andCatEqualTo(String value) {
            addCriterion("Cat =", value, "cat");
            return (Criteria) this;
        }

        public Criteria andCatNotEqualTo(String value) {
            addCriterion("Cat <>", value, "cat");
            return (Criteria) this;
        }

        public Criteria andCatGreaterThan(String value) {
            addCriterion("Cat >", value, "cat");
            return (Criteria) this;
        }

        public Criteria andCatGreaterThanOrEqualTo(String value) {
            addCriterion("Cat >=", value, "cat");
            return (Criteria) this;
        }

        public Criteria andCatLessThan(String value) {
            addCriterion("Cat <", value, "cat");
            return (Criteria) this;
        }

        public Criteria andCatLessThanOrEqualTo(String value) {
            addCriterion("Cat <=", value, "cat");
            return (Criteria) this;
        }

        public Criteria andCatLike(String value) {
            addCriterion("Cat like", value, "cat");
            return (Criteria) this;
        }

        public Criteria andCatNotLike(String value) {
            addCriterion("Cat not like", value, "cat");
            return (Criteria) this;
        }

        public Criteria andCatIn(List<String> values) {
            addCriterion("Cat in", values, "cat");
            return (Criteria) this;
        }

        public Criteria andCatNotIn(List<String> values) {
            addCriterion("Cat not in", values, "cat");
            return (Criteria) this;
        }

        public Criteria andCatBetween(String value1, String value2) {
            addCriterion("Cat between", value1, value2, "cat");
            return (Criteria) this;
        }

        public Criteria andCatNotBetween(String value1, String value2) {
            addCriterion("Cat not between", value1, value2, "cat");
            return (Criteria) this;
        }

        public Criteria andCat2IsNull() {
            addCriterion("Cat2 is null");
            return (Criteria) this;
        }

        public Criteria andCat2IsNotNull() {
            addCriterion("Cat2 is not null");
            return (Criteria) this;
        }

        public Criteria andCat2EqualTo(String value) {
            addCriterion("Cat2 =", value, "cat2");
            return (Criteria) this;
        }

        public Criteria andCat2NotEqualTo(String value) {
            addCriterion("Cat2 <>", value, "cat2");
            return (Criteria) this;
        }

        public Criteria andCat2GreaterThan(String value) {
            addCriterion("Cat2 >", value, "cat2");
            return (Criteria) this;
        }

        public Criteria andCat2GreaterThanOrEqualTo(String value) {
            addCriterion("Cat2 >=", value, "cat2");
            return (Criteria) this;
        }

        public Criteria andCat2LessThan(String value) {
            addCriterion("Cat2 <", value, "cat2");
            return (Criteria) this;
        }

        public Criteria andCat2LessThanOrEqualTo(String value) {
            addCriterion("Cat2 <=", value, "cat2");
            return (Criteria) this;
        }

        public Criteria andCat2Like(String value) {
            addCriterion("Cat2 like", value, "cat2");
            return (Criteria) this;
        }

        public Criteria andCat2NotLike(String value) {
            addCriterion("Cat2 not like", value, "cat2");
            return (Criteria) this;
        }

        public Criteria andCat2In(List<String> values) {
            addCriterion("Cat2 in", values, "cat2");
            return (Criteria) this;
        }

        public Criteria andCat2NotIn(List<String> values) {
            addCriterion("Cat2 not in", values, "cat2");
            return (Criteria) this;
        }

        public Criteria andCat2Between(String value1, String value2) {
            addCriterion("Cat2 between", value1, value2, "cat2");
            return (Criteria) this;
        }

        public Criteria andCat2NotBetween(String value1, String value2) {
            addCriterion("Cat2 not between", value1, value2, "cat2");
            return (Criteria) this;
        }

        public Criteria andBibIsNull() {
            addCriterion("Bib is null");
            return (Criteria) this;
        }

        public Criteria andBibIsNotNull() {
            addCriterion("Bib is not null");
            return (Criteria) this;
        }

        public Criteria andBibEqualTo(String value) {
            addCriterion("Bib =", value, "bib");
            return (Criteria) this;
        }

        public Criteria andBibNotEqualTo(String value) {
            addCriterion("Bib <>", value, "bib");
            return (Criteria) this;
        }

        public Criteria andBibGreaterThan(String value) {
            addCriterion("Bib >", value, "bib");
            return (Criteria) this;
        }

        public Criteria andBibGreaterThanOrEqualTo(String value) {
            addCriterion("Bib >=", value, "bib");
            return (Criteria) this;
        }

        public Criteria andBibLessThan(String value) {
            addCriterion("Bib <", value, "bib");
            return (Criteria) this;
        }

        public Criteria andBibLessThanOrEqualTo(String value) {
            addCriterion("Bib <=", value, "bib");
            return (Criteria) this;
        }

        public Criteria andBibLike(String value) {
            addCriterion("Bib like", value, "bib");
            return (Criteria) this;
        }

        public Criteria andBibNotLike(String value) {
            addCriterion("Bib not like", value, "bib");
            return (Criteria) this;
        }

        public Criteria andBibIn(List<String> values) {
            addCriterion("Bib in", values, "bib");
            return (Criteria) this;
        }

        public Criteria andBibNotIn(List<String> values) {
            addCriterion("Bib not in", values, "bib");
            return (Criteria) this;
        }

        public Criteria andBibBetween(String value1, String value2) {
            addCriterion("Bib between", value1, value2, "bib");
            return (Criteria) this;
        }

        public Criteria andBibNotBetween(String value1, String value2) {
            addCriterion("Bib not between", value1, value2, "bib");
            return (Criteria) this;
        }

        public Criteria andNamechiIsNull() {
            addCriterion("NameChi is null");
            return (Criteria) this;
        }

        public Criteria andNamechiIsNotNull() {
            addCriterion("NameChi is not null");
            return (Criteria) this;
        }

        public Criteria andNamechiEqualTo(String value) {
            addCriterion("NameChi =", value, "namechi");
            return (Criteria) this;
        }

        public Criteria andNamechiNotEqualTo(String value) {
            addCriterion("NameChi <>", value, "namechi");
            return (Criteria) this;
        }

        public Criteria andNamechiGreaterThan(String value) {
            addCriterion("NameChi >", value, "namechi");
            return (Criteria) this;
        }

        public Criteria andNamechiGreaterThanOrEqualTo(String value) {
            addCriterion("NameChi >=", value, "namechi");
            return (Criteria) this;
        }

        public Criteria andNamechiLessThan(String value) {
            addCriterion("NameChi <", value, "namechi");
            return (Criteria) this;
        }

        public Criteria andNamechiLessThanOrEqualTo(String value) {
            addCriterion("NameChi <=", value, "namechi");
            return (Criteria) this;
        }

        public Criteria andNamechiLike(String value) {
            addCriterion("NameChi like", value, "namechi");
            return (Criteria) this;
        }

        public Criteria andNamechiNotLike(String value) {
            addCriterion("NameChi not like", value, "namechi");
            return (Criteria) this;
        }

        public Criteria andNamechiIn(List<String> values) {
            addCriterion("NameChi in", values, "namechi");
            return (Criteria) this;
        }

        public Criteria andNamechiNotIn(List<String> values) {
            addCriterion("NameChi not in", values, "namechi");
            return (Criteria) this;
        }

        public Criteria andNamechiBetween(String value1, String value2) {
            addCriterion("NameChi between", value1, value2, "namechi");
            return (Criteria) this;
        }

        public Criteria andNamechiNotBetween(String value1, String value2) {
            addCriterion("NameChi not between", value1, value2, "namechi");
            return (Criteria) this;
        }

        public Criteria andNameengIsNull() {
            addCriterion("NameEng is null");
            return (Criteria) this;
        }

        public Criteria andNameengIsNotNull() {
            addCriterion("NameEng is not null");
            return (Criteria) this;
        }

        public Criteria andNameengEqualTo(String value) {
            addCriterion("NameEng =", value, "nameeng");
            return (Criteria) this;
        }

        public Criteria andNameengNotEqualTo(String value) {
            addCriterion("NameEng <>", value, "nameeng");
            return (Criteria) this;
        }

        public Criteria andNameengGreaterThan(String value) {
            addCriterion("NameEng >", value, "nameeng");
            return (Criteria) this;
        }

        public Criteria andNameengGreaterThanOrEqualTo(String value) {
            addCriterion("NameEng >=", value, "nameeng");
            return (Criteria) this;
        }

        public Criteria andNameengLessThan(String value) {
            addCriterion("NameEng <", value, "nameeng");
            return (Criteria) this;
        }

        public Criteria andNameengLessThanOrEqualTo(String value) {
            addCriterion("NameEng <=", value, "nameeng");
            return (Criteria) this;
        }

        public Criteria andNameengLike(String value) {
            addCriterion("NameEng like", value, "nameeng");
            return (Criteria) this;
        }

        public Criteria andNameengNotLike(String value) {
            addCriterion("NameEng not like", value, "nameeng");
            return (Criteria) this;
        }

        public Criteria andNameengIn(List<String> values) {
            addCriterion("NameEng in", values, "nameeng");
            return (Criteria) this;
        }

        public Criteria andNameengNotIn(List<String> values) {
            addCriterion("NameEng not in", values, "nameeng");
            return (Criteria) this;
        }

        public Criteria andNameengBetween(String value1, String value2) {
            addCriterion("NameEng between", value1, value2, "nameeng");
            return (Criteria) this;
        }

        public Criteria andNameengNotBetween(String value1, String value2) {
            addCriterion("NameEng not between", value1, value2, "nameeng");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("Tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("Tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(Integer value) {
            addCriterion("Tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(Integer value) {
            addCriterion("Tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(Integer value) {
            addCriterion("Tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(Integer value) {
            addCriterion("Tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(Integer value) {
            addCriterion("Tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(Integer value) {
            addCriterion("Tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<Integer> values) {
            addCriterion("Tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<Integer> values) {
            addCriterion("Tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(Integer value1, Integer value2) {
            addCriterion("Tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(Integer value1, Integer value2) {
            addCriterion("Tag not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andDisqIsNull() {
            addCriterion("Disq is null");
            return (Criteria) this;
        }

        public Criteria andDisqIsNotNull() {
            addCriterion("Disq is not null");
            return (Criteria) this;
        }

        public Criteria andDisqEqualTo(String value) {
            addCriterion("Disq =", value, "disq");
            return (Criteria) this;
        }

        public Criteria andDisqNotEqualTo(String value) {
            addCriterion("Disq <>", value, "disq");
            return (Criteria) this;
        }

        public Criteria andDisqGreaterThan(String value) {
            addCriterion("Disq >", value, "disq");
            return (Criteria) this;
        }

        public Criteria andDisqGreaterThanOrEqualTo(String value) {
            addCriterion("Disq >=", value, "disq");
            return (Criteria) this;
        }

        public Criteria andDisqLessThan(String value) {
            addCriterion("Disq <", value, "disq");
            return (Criteria) this;
        }

        public Criteria andDisqLessThanOrEqualTo(String value) {
            addCriterion("Disq <=", value, "disq");
            return (Criteria) this;
        }

        public Criteria andDisqLike(String value) {
            addCriterion("Disq like", value, "disq");
            return (Criteria) this;
        }

        public Criteria andDisqNotLike(String value) {
            addCriterion("Disq not like", value, "disq");
            return (Criteria) this;
        }

        public Criteria andDisqIn(List<String> values) {
            addCriterion("Disq in", values, "disq");
            return (Criteria) this;
        }

        public Criteria andDisqNotIn(List<String> values) {
            addCriterion("Disq not in", values, "disq");
            return (Criteria) this;
        }

        public Criteria andDisqBetween(String value1, String value2) {
            addCriterion("Disq between", value1, value2, "disq");
            return (Criteria) this;
        }

        public Criteria andDisqNotBetween(String value1, String value2) {
            addCriterion("Disq not between", value1, value2, "disq");
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

        public Criteria andTeamtypeIsNull() {
            addCriterion("TeamType is null");
            return (Criteria) this;
        }

        public Criteria andTeamtypeIsNotNull() {
            addCriterion("TeamType is not null");
            return (Criteria) this;
        }

        public Criteria andTeamtypeEqualTo(String value) {
            addCriterion("TeamType =", value, "teamtype");
            return (Criteria) this;
        }

        public Criteria andTeamtypeNotEqualTo(String value) {
            addCriterion("TeamType <>", value, "teamtype");
            return (Criteria) this;
        }

        public Criteria andTeamtypeGreaterThan(String value) {
            addCriterion("TeamType >", value, "teamtype");
            return (Criteria) this;
        }

        public Criteria andTeamtypeGreaterThanOrEqualTo(String value) {
            addCriterion("TeamType >=", value, "teamtype");
            return (Criteria) this;
        }

        public Criteria andTeamtypeLessThan(String value) {
            addCriterion("TeamType <", value, "teamtype");
            return (Criteria) this;
        }

        public Criteria andTeamtypeLessThanOrEqualTo(String value) {
            addCriterion("TeamType <=", value, "teamtype");
            return (Criteria) this;
        }

        public Criteria andTeamtypeLike(String value) {
            addCriterion("TeamType like", value, "teamtype");
            return (Criteria) this;
        }

        public Criteria andTeamtypeNotLike(String value) {
            addCriterion("TeamType not like", value, "teamtype");
            return (Criteria) this;
        }

        public Criteria andTeamtypeIn(List<String> values) {
            addCriterion("TeamType in", values, "teamtype");
            return (Criteria) this;
        }

        public Criteria andTeamtypeNotIn(List<String> values) {
            addCriterion("TeamType not in", values, "teamtype");
            return (Criteria) this;
        }

        public Criteria andTeamtypeBetween(String value1, String value2) {
            addCriterion("TeamType between", value1, value2, "teamtype");
            return (Criteria) this;
        }

        public Criteria andTeamtypeNotBetween(String value1, String value2) {
            addCriterion("TeamType not between", value1, value2, "teamtype");
            return (Criteria) this;
        }

        public Criteria andTeamcatIsNull() {
            addCriterion("TeamCat is null");
            return (Criteria) this;
        }

        public Criteria andTeamcatIsNotNull() {
            addCriterion("TeamCat is not null");
            return (Criteria) this;
        }

        public Criteria andTeamcatEqualTo(String value) {
            addCriterion("TeamCat =", value, "teamcat");
            return (Criteria) this;
        }

        public Criteria andTeamcatNotEqualTo(String value) {
            addCriterion("TeamCat <>", value, "teamcat");
            return (Criteria) this;
        }

        public Criteria andTeamcatGreaterThan(String value) {
            addCriterion("TeamCat >", value, "teamcat");
            return (Criteria) this;
        }

        public Criteria andTeamcatGreaterThanOrEqualTo(String value) {
            addCriterion("TeamCat >=", value, "teamcat");
            return (Criteria) this;
        }

        public Criteria andTeamcatLessThan(String value) {
            addCriterion("TeamCat <", value, "teamcat");
            return (Criteria) this;
        }

        public Criteria andTeamcatLessThanOrEqualTo(String value) {
            addCriterion("TeamCat <=", value, "teamcat");
            return (Criteria) this;
        }

        public Criteria andTeamcatLike(String value) {
            addCriterion("TeamCat like", value, "teamcat");
            return (Criteria) this;
        }

        public Criteria andTeamcatNotLike(String value) {
            addCriterion("TeamCat not like", value, "teamcat");
            return (Criteria) this;
        }

        public Criteria andTeamcatIn(List<String> values) {
            addCriterion("TeamCat in", values, "teamcat");
            return (Criteria) this;
        }

        public Criteria andTeamcatNotIn(List<String> values) {
            addCriterion("TeamCat not in", values, "teamcat");
            return (Criteria) this;
        }

        public Criteria andTeamcatBetween(String value1, String value2) {
            addCriterion("TeamCat between", value1, value2, "teamcat");
            return (Criteria) this;
        }

        public Criteria andTeamcatNotBetween(String value1, String value2) {
            addCriterion("TeamCat not between", value1, value2, "teamcat");
            return (Criteria) this;
        }

        public Criteria andTeamIsNull() {
            addCriterion("Team is null");
            return (Criteria) this;
        }

        public Criteria andTeamIsNotNull() {
            addCriterion("Team is not null");
            return (Criteria) this;
        }

        public Criteria andTeamEqualTo(String value) {
            addCriterion("Team =", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotEqualTo(String value) {
            addCriterion("Team <>", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamGreaterThan(String value) {
            addCriterion("Team >", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamGreaterThanOrEqualTo(String value) {
            addCriterion("Team >=", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamLessThan(String value) {
            addCriterion("Team <", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamLessThanOrEqualTo(String value) {
            addCriterion("Team <=", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamLike(String value) {
            addCriterion("Team like", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotLike(String value) {
            addCriterion("Team not like", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamIn(List<String> values) {
            addCriterion("Team in", values, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotIn(List<String> values) {
            addCriterion("Team not in", values, "team");
            return (Criteria) this;
        }

        public Criteria andTeamBetween(String value1, String value2) {
            addCriterion("Team between", value1, value2, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotBetween(String value1, String value2) {
            addCriterion("Team not between", value1, value2, "team");
            return (Criteria) this;
        }

        public Criteria andTeamnameengIsNull() {
            addCriterion("TeamNameEng is null");
            return (Criteria) this;
        }

        public Criteria andTeamnameengIsNotNull() {
            addCriterion("TeamNameEng is not null");
            return (Criteria) this;
        }

        public Criteria andTeamnameengEqualTo(String value) {
            addCriterion("TeamNameEng =", value, "teamnameeng");
            return (Criteria) this;
        }

        public Criteria andTeamnameengNotEqualTo(String value) {
            addCriterion("TeamNameEng <>", value, "teamnameeng");
            return (Criteria) this;
        }

        public Criteria andTeamnameengGreaterThan(String value) {
            addCriterion("TeamNameEng >", value, "teamnameeng");
            return (Criteria) this;
        }

        public Criteria andTeamnameengGreaterThanOrEqualTo(String value) {
            addCriterion("TeamNameEng >=", value, "teamnameeng");
            return (Criteria) this;
        }

        public Criteria andTeamnameengLessThan(String value) {
            addCriterion("TeamNameEng <", value, "teamnameeng");
            return (Criteria) this;
        }

        public Criteria andTeamnameengLessThanOrEqualTo(String value) {
            addCriterion("TeamNameEng <=", value, "teamnameeng");
            return (Criteria) this;
        }

        public Criteria andTeamnameengLike(String value) {
            addCriterion("TeamNameEng like", value, "teamnameeng");
            return (Criteria) this;
        }

        public Criteria andTeamnameengNotLike(String value) {
            addCriterion("TeamNameEng not like", value, "teamnameeng");
            return (Criteria) this;
        }

        public Criteria andTeamnameengIn(List<String> values) {
            addCriterion("TeamNameEng in", values, "teamnameeng");
            return (Criteria) this;
        }

        public Criteria andTeamnameengNotIn(List<String> values) {
            addCriterion("TeamNameEng not in", values, "teamnameeng");
            return (Criteria) this;
        }

        public Criteria andTeamnameengBetween(String value1, String value2) {
            addCriterion("TeamNameEng between", value1, value2, "teamnameeng");
            return (Criteria) this;
        }

        public Criteria andTeamnameengNotBetween(String value1, String value2) {
            addCriterion("TeamNameEng not between", value1, value2, "teamnameeng");
            return (Criteria) this;
        }

        public Criteria andTeamnamechiIsNull() {
            addCriterion("TeamNameChi is null");
            return (Criteria) this;
        }

        public Criteria andTeamnamechiIsNotNull() {
            addCriterion("TeamNameChi is not null");
            return (Criteria) this;
        }

        public Criteria andTeamnamechiEqualTo(String value) {
            addCriterion("TeamNameChi =", value, "teamnamechi");
            return (Criteria) this;
        }

        public Criteria andTeamnamechiNotEqualTo(String value) {
            addCriterion("TeamNameChi <>", value, "teamnamechi");
            return (Criteria) this;
        }

        public Criteria andTeamnamechiGreaterThan(String value) {
            addCriterion("TeamNameChi >", value, "teamnamechi");
            return (Criteria) this;
        }

        public Criteria andTeamnamechiGreaterThanOrEqualTo(String value) {
            addCriterion("TeamNameChi >=", value, "teamnamechi");
            return (Criteria) this;
        }

        public Criteria andTeamnamechiLessThan(String value) {
            addCriterion("TeamNameChi <", value, "teamnamechi");
            return (Criteria) this;
        }

        public Criteria andTeamnamechiLessThanOrEqualTo(String value) {
            addCriterion("TeamNameChi <=", value, "teamnamechi");
            return (Criteria) this;
        }

        public Criteria andTeamnamechiLike(String value) {
            addCriterion("TeamNameChi like", value, "teamnamechi");
            return (Criteria) this;
        }

        public Criteria andTeamnamechiNotLike(String value) {
            addCriterion("TeamNameChi not like", value, "teamnamechi");
            return (Criteria) this;
        }

        public Criteria andTeamnamechiIn(List<String> values) {
            addCriterion("TeamNameChi in", values, "teamnamechi");
            return (Criteria) this;
        }

        public Criteria andTeamnamechiNotIn(List<String> values) {
            addCriterion("TeamNameChi not in", values, "teamnamechi");
            return (Criteria) this;
        }

        public Criteria andTeamnamechiBetween(String value1, String value2) {
            addCriterion("TeamNameChi between", value1, value2, "teamnamechi");
            return (Criteria) this;
        }

        public Criteria andTeamnamechiNotBetween(String value1, String value2) {
            addCriterion("TeamNameChi not between", value1, value2, "teamnamechi");
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

        public Criteria andCorelegEqualTo(String value) {
            addCriterion("CoreLeg =", value, "coreleg");
            return (Criteria) this;
        }

        public Criteria andCorelegNotEqualTo(String value) {
            addCriterion("CoreLeg <>", value, "coreleg");
            return (Criteria) this;
        }

        public Criteria andCorelegGreaterThan(String value) {
            addCriterion("CoreLeg >", value, "coreleg");
            return (Criteria) this;
        }

        public Criteria andCorelegGreaterThanOrEqualTo(String value) {
            addCriterion("CoreLeg >=", value, "coreleg");
            return (Criteria) this;
        }

        public Criteria andCorelegLessThan(String value) {
            addCriterion("CoreLeg <", value, "coreleg");
            return (Criteria) this;
        }

        public Criteria andCorelegLessThanOrEqualTo(String value) {
            addCriterion("CoreLeg <=", value, "coreleg");
            return (Criteria) this;
        }

        public Criteria andCorelegLike(String value) {
            addCriterion("CoreLeg like", value, "coreleg");
            return (Criteria) this;
        }

        public Criteria andCorelegNotLike(String value) {
            addCriterion("CoreLeg not like", value, "coreleg");
            return (Criteria) this;
        }

        public Criteria andCorelegIn(List<String> values) {
            addCriterion("CoreLeg in", values, "coreleg");
            return (Criteria) this;
        }

        public Criteria andCorelegNotIn(List<String> values) {
            addCriterion("CoreLeg not in", values, "coreleg");
            return (Criteria) this;
        }

        public Criteria andCorelegBetween(String value1, String value2) {
            addCriterion("CoreLeg between", value1, value2, "coreleg");
            return (Criteria) this;
        }

        public Criteria andCorelegNotBetween(String value1, String value2) {
            addCriterion("CoreLeg not between", value1, value2, "coreleg");
            return (Criteria) this;
        }

        public Criteria andAssociationIsNull() {
            addCriterion("Association is null");
            return (Criteria) this;
        }

        public Criteria andAssociationIsNotNull() {
            addCriterion("Association is not null");
            return (Criteria) this;
        }

        public Criteria andAssociationEqualTo(String value) {
            addCriterion("Association =", value, "association");
            return (Criteria) this;
        }

        public Criteria andAssociationNotEqualTo(String value) {
            addCriterion("Association <>", value, "association");
            return (Criteria) this;
        }

        public Criteria andAssociationGreaterThan(String value) {
            addCriterion("Association >", value, "association");
            return (Criteria) this;
        }

        public Criteria andAssociationGreaterThanOrEqualTo(String value) {
            addCriterion("Association >=", value, "association");
            return (Criteria) this;
        }

        public Criteria andAssociationLessThan(String value) {
            addCriterion("Association <", value, "association");
            return (Criteria) this;
        }

        public Criteria andAssociationLessThanOrEqualTo(String value) {
            addCriterion("Association <=", value, "association");
            return (Criteria) this;
        }

        public Criteria andAssociationLike(String value) {
            addCriterion("Association like", value, "association");
            return (Criteria) this;
        }

        public Criteria andAssociationNotLike(String value) {
            addCriterion("Association not like", value, "association");
            return (Criteria) this;
        }

        public Criteria andAssociationIn(List<String> values) {
            addCriterion("Association in", values, "association");
            return (Criteria) this;
        }

        public Criteria andAssociationNotIn(List<String> values) {
            addCriterion("Association not in", values, "association");
            return (Criteria) this;
        }

        public Criteria andAssociationBetween(String value1, String value2) {
            addCriterion("Association between", value1, value2, "association");
            return (Criteria) this;
        }

        public Criteria andAssociationNotBetween(String value1, String value2) {
            addCriterion("Association not between", value1, value2, "association");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("Phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("Phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("Phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("Phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("Phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("Phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("Phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("Phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("Phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("Phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("Phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("Phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("Phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("Phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andLastyeartimeIsNull() {
            addCriterion("LastYearTime is null");
            return (Criteria) this;
        }

        public Criteria andLastyeartimeIsNotNull() {
            addCriterion("LastYearTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastyeartimeEqualTo(String value) {
            addCriterion("LastYearTime =", value, "lastyeartime");
            return (Criteria) this;
        }

        public Criteria andLastyeartimeNotEqualTo(String value) {
            addCriterion("LastYearTime <>", value, "lastyeartime");
            return (Criteria) this;
        }

        public Criteria andLastyeartimeGreaterThan(String value) {
            addCriterion("LastYearTime >", value, "lastyeartime");
            return (Criteria) this;
        }

        public Criteria andLastyeartimeGreaterThanOrEqualTo(String value) {
            addCriterion("LastYearTime >=", value, "lastyeartime");
            return (Criteria) this;
        }

        public Criteria andLastyeartimeLessThan(String value) {
            addCriterion("LastYearTime <", value, "lastyeartime");
            return (Criteria) this;
        }

        public Criteria andLastyeartimeLessThanOrEqualTo(String value) {
            addCriterion("LastYearTime <=", value, "lastyeartime");
            return (Criteria) this;
        }

        public Criteria andLastyeartimeLike(String value) {
            addCriterion("LastYearTime like", value, "lastyeartime");
            return (Criteria) this;
        }

        public Criteria andLastyeartimeNotLike(String value) {
            addCriterion("LastYearTime not like", value, "lastyeartime");
            return (Criteria) this;
        }

        public Criteria andLastyeartimeIn(List<String> values) {
            addCriterion("LastYearTime in", values, "lastyeartime");
            return (Criteria) this;
        }

        public Criteria andLastyeartimeNotIn(List<String> values) {
            addCriterion("LastYearTime not in", values, "lastyeartime");
            return (Criteria) this;
        }

        public Criteria andLastyeartimeBetween(String value1, String value2) {
            addCriterion("LastYearTime between", value1, value2, "lastyeartime");
            return (Criteria) this;
        }

        public Criteria andLastyeartimeNotBetween(String value1, String value2) {
            addCriterion("LastYearTime not between", value1, value2, "lastyeartime");
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