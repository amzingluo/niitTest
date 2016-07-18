package com.niit.po;

import java.util.ArrayList;
import java.util.List;

public class RoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomExample() {
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

        public Criteria andRnoIsNull() {
            addCriterion("rno is null");
            return (Criteria) this;
        }

        public Criteria andRnoIsNotNull() {
            addCriterion("rno is not null");
            return (Criteria) this;
        }

        public Criteria andRnoEqualTo(Integer value) {
            addCriterion("rno =", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoNotEqualTo(Integer value) {
            addCriterion("rno <>", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoGreaterThan(Integer value) {
            addCriterion("rno >", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("rno >=", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoLessThan(Integer value) {
            addCriterion("rno <", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoLessThanOrEqualTo(Integer value) {
            addCriterion("rno <=", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoIn(List<Integer> values) {
            addCriterion("rno in", values, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoNotIn(List<Integer> values) {
            addCriterion("rno not in", values, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoBetween(Integer value1, Integer value2) {
            addCriterion("rno between", value1, value2, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoNotBetween(Integer value1, Integer value2) {
            addCriterion("rno not between", value1, value2, "rno");
            return (Criteria) this;
        }

        public Criteria andRnameIsNull() {
            addCriterion("rname is null");
            return (Criteria) this;
        }

        public Criteria andRnameIsNotNull() {
            addCriterion("rname is not null");
            return (Criteria) this;
        }

        public Criteria andRnameEqualTo(String value) {
            addCriterion("rname =", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotEqualTo(String value) {
            addCriterion("rname <>", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameGreaterThan(String value) {
            addCriterion("rname >", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameGreaterThanOrEqualTo(String value) {
            addCriterion("rname >=", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLessThan(String value) {
            addCriterion("rname <", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLessThanOrEqualTo(String value) {
            addCriterion("rname <=", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLike(String value) {
            addCriterion("rname like", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotLike(String value) {
            addCriterion("rname not like", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameIn(List<String> values) {
            addCriterion("rname in", values, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotIn(List<String> values) {
            addCriterion("rname not in", values, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameBetween(String value1, String value2) {
            addCriterion("rname between", value1, value2, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotBetween(String value1, String value2) {
            addCriterion("rname not between", value1, value2, "rname");
            return (Criteria) this;
        }

        public Criteria andRaddressIsNull() {
            addCriterion("raddress is null");
            return (Criteria) this;
        }

        public Criteria andRaddressIsNotNull() {
            addCriterion("raddress is not null");
            return (Criteria) this;
        }

        public Criteria andRaddressEqualTo(String value) {
            addCriterion("raddress =", value, "raddress");
            return (Criteria) this;
        }

        public Criteria andRaddressNotEqualTo(String value) {
            addCriterion("raddress <>", value, "raddress");
            return (Criteria) this;
        }

        public Criteria andRaddressGreaterThan(String value) {
            addCriterion("raddress >", value, "raddress");
            return (Criteria) this;
        }

        public Criteria andRaddressGreaterThanOrEqualTo(String value) {
            addCriterion("raddress >=", value, "raddress");
            return (Criteria) this;
        }

        public Criteria andRaddressLessThan(String value) {
            addCriterion("raddress <", value, "raddress");
            return (Criteria) this;
        }

        public Criteria andRaddressLessThanOrEqualTo(String value) {
            addCriterion("raddress <=", value, "raddress");
            return (Criteria) this;
        }

        public Criteria andRaddressLike(String value) {
            addCriterion("raddress like", value, "raddress");
            return (Criteria) this;
        }

        public Criteria andRaddressNotLike(String value) {
            addCriterion("raddress not like", value, "raddress");
            return (Criteria) this;
        }

        public Criteria andRaddressIn(List<String> values) {
            addCriterion("raddress in", values, "raddress");
            return (Criteria) this;
        }

        public Criteria andRaddressNotIn(List<String> values) {
            addCriterion("raddress not in", values, "raddress");
            return (Criteria) this;
        }

        public Criteria andRaddressBetween(String value1, String value2) {
            addCriterion("raddress between", value1, value2, "raddress");
            return (Criteria) this;
        }

        public Criteria andRaddressNotBetween(String value1, String value2) {
            addCriterion("raddress not between", value1, value2, "raddress");
            return (Criteria) this;
        }

        public Criteria andRphoneIsNull() {
            addCriterion("rphone is null");
            return (Criteria) this;
        }

        public Criteria andRphoneIsNotNull() {
            addCriterion("rphone is not null");
            return (Criteria) this;
        }

        public Criteria andRphoneEqualTo(String value) {
            addCriterion("rphone =", value, "rphone");
            return (Criteria) this;
        }

        public Criteria andRphoneNotEqualTo(String value) {
            addCriterion("rphone <>", value, "rphone");
            return (Criteria) this;
        }

        public Criteria andRphoneGreaterThan(String value) {
            addCriterion("rphone >", value, "rphone");
            return (Criteria) this;
        }

        public Criteria andRphoneGreaterThanOrEqualTo(String value) {
            addCriterion("rphone >=", value, "rphone");
            return (Criteria) this;
        }

        public Criteria andRphoneLessThan(String value) {
            addCriterion("rphone <", value, "rphone");
            return (Criteria) this;
        }

        public Criteria andRphoneLessThanOrEqualTo(String value) {
            addCriterion("rphone <=", value, "rphone");
            return (Criteria) this;
        }

        public Criteria andRphoneLike(String value) {
            addCriterion("rphone like", value, "rphone");
            return (Criteria) this;
        }

        public Criteria andRphoneNotLike(String value) {
            addCriterion("rphone not like", value, "rphone");
            return (Criteria) this;
        }

        public Criteria andRphoneIn(List<String> values) {
            addCriterion("rphone in", values, "rphone");
            return (Criteria) this;
        }

        public Criteria andRphoneNotIn(List<String> values) {
            addCriterion("rphone not in", values, "rphone");
            return (Criteria) this;
        }

        public Criteria andRphoneBetween(String value1, String value2) {
            addCriterion("rphone between", value1, value2, "rphone");
            return (Criteria) this;
        }

        public Criteria andRphoneNotBetween(String value1, String value2) {
            addCriterion("rphone not between", value1, value2, "rphone");
            return (Criteria) this;
        }

        public Criteria andLeaderidIsNull() {
            addCriterion("leaderid is null");
            return (Criteria) this;
        }

        public Criteria andLeaderidIsNotNull() {
            addCriterion("leaderid is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderidEqualTo(Integer value) {
            addCriterion("leaderid =", value, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidNotEqualTo(Integer value) {
            addCriterion("leaderid <>", value, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidGreaterThan(Integer value) {
            addCriterion("leaderid >", value, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("leaderid >=", value, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidLessThan(Integer value) {
            addCriterion("leaderid <", value, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidLessThanOrEqualTo(Integer value) {
            addCriterion("leaderid <=", value, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidIn(List<Integer> values) {
            addCriterion("leaderid in", values, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidNotIn(List<Integer> values) {
            addCriterion("leaderid not in", values, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidBetween(Integer value1, Integer value2) {
            addCriterion("leaderid between", value1, value2, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidNotBetween(Integer value1, Integer value2) {
            addCriterion("leaderid not between", value1, value2, "leaderid");
            return (Criteria) this;
        }

        public Criteria andBednumIsNull() {
            addCriterion("bednum is null");
            return (Criteria) this;
        }

        public Criteria andBednumIsNotNull() {
            addCriterion("bednum is not null");
            return (Criteria) this;
        }

        public Criteria andBednumEqualTo(Integer value) {
            addCriterion("bednum =", value, "bednum");
            return (Criteria) this;
        }

        public Criteria andBednumNotEqualTo(Integer value) {
            addCriterion("bednum <>", value, "bednum");
            return (Criteria) this;
        }

        public Criteria andBednumGreaterThan(Integer value) {
            addCriterion("bednum >", value, "bednum");
            return (Criteria) this;
        }

        public Criteria andBednumGreaterThanOrEqualTo(Integer value) {
            addCriterion("bednum >=", value, "bednum");
            return (Criteria) this;
        }

        public Criteria andBednumLessThan(Integer value) {
            addCriterion("bednum <", value, "bednum");
            return (Criteria) this;
        }

        public Criteria andBednumLessThanOrEqualTo(Integer value) {
            addCriterion("bednum <=", value, "bednum");
            return (Criteria) this;
        }

        public Criteria andBednumIn(List<Integer> values) {
            addCriterion("bednum in", values, "bednum");
            return (Criteria) this;
        }

        public Criteria andBednumNotIn(List<Integer> values) {
            addCriterion("bednum not in", values, "bednum");
            return (Criteria) this;
        }

        public Criteria andBednumBetween(Integer value1, Integer value2) {
            addCriterion("bednum between", value1, value2, "bednum");
            return (Criteria) this;
        }

        public Criteria andBednumNotBetween(Integer value1, Integer value2) {
            addCriterion("bednum not between", value1, value2, "bednum");
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