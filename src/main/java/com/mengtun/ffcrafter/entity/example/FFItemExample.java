package com.mengtun.ffcrafter.entity.example;

import java.util.ArrayList;
import java.util.List;


public class FFItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FFItemExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("item_name is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("item_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("item_name =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("item_name <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("item_name >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("item_name >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("item_name <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("item_name <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("item_name like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("item_name not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("item_name in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("item_name not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("item_name between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("item_name not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemCanhqIsNull() {
            addCriterion("item_canhq is null");
            return (Criteria) this;
        }

        public Criteria andItemCanhqIsNotNull() {
            addCriterion("item_canhq is not null");
            return (Criteria) this;
        }

        public Criteria andItemCanhqEqualTo(Integer value) {
            addCriterion("item_canhq =", value, "itemCanhq");
            return (Criteria) this;
        }

        public Criteria andItemCanhqNotEqualTo(Integer value) {
            addCriterion("item_canhq <>", value, "itemCanhq");
            return (Criteria) this;
        }

        public Criteria andItemCanhqGreaterThan(Integer value) {
            addCriterion("item_canhq >", value, "itemCanhq");
            return (Criteria) this;
        }

        public Criteria andItemCanhqGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_canhq >=", value, "itemCanhq");
            return (Criteria) this;
        }

        public Criteria andItemCanhqLessThan(Integer value) {
            addCriterion("item_canhq <", value, "itemCanhq");
            return (Criteria) this;
        }

        public Criteria andItemCanhqLessThanOrEqualTo(Integer value) {
            addCriterion("item_canhq <=", value, "itemCanhq");
            return (Criteria) this;
        }

        public Criteria andItemCanhqIn(List<Integer> values) {
            addCriterion("item_canhq in", values, "itemCanhq");
            return (Criteria) this;
        }

        public Criteria andItemCanhqNotIn(List<Integer> values) {
            addCriterion("item_canhq not in", values, "itemCanhq");
            return (Criteria) this;
        }

        public Criteria andItemCanhqBetween(Integer value1, Integer value2) {
            addCriterion("item_canhq between", value1, value2, "itemCanhq");
            return (Criteria) this;
        }

        public Criteria andItemCanhqNotBetween(Integer value1, Integer value2) {
            addCriterion("item_canhq not between", value1, value2, "itemCanhq");
            return (Criteria) this;
        }

        public Criteria andItemIconIsNull() {
            addCriterion("item_icon is null");
            return (Criteria) this;
        }

        public Criteria andItemIconIsNotNull() {
            addCriterion("item_icon is not null");
            return (Criteria) this;
        }

        public Criteria andItemIconEqualTo(String value) {
            addCriterion("item_icon =", value, "itemIcon");
            return (Criteria) this;
        }

        public Criteria andItemIconNotEqualTo(String value) {
            addCriterion("item_icon <>", value, "itemIcon");
            return (Criteria) this;
        }

        public Criteria andItemIconGreaterThan(String value) {
            addCriterion("item_icon >", value, "itemIcon");
            return (Criteria) this;
        }

        public Criteria andItemIconGreaterThanOrEqualTo(String value) {
            addCriterion("item_icon >=", value, "itemIcon");
            return (Criteria) this;
        }

        public Criteria andItemIconLessThan(String value) {
            addCriterion("item_icon <", value, "itemIcon");
            return (Criteria) this;
        }

        public Criteria andItemIconLessThanOrEqualTo(String value) {
            addCriterion("item_icon <=", value, "itemIcon");
            return (Criteria) this;
        }

        public Criteria andItemIconLike(String value) {
            addCriterion("item_icon like", value, "itemIcon");
            return (Criteria) this;
        }

        public Criteria andItemIconNotLike(String value) {
            addCriterion("item_icon not like", value, "itemIcon");
            return (Criteria) this;
        }

        public Criteria andItemIconIn(List<String> values) {
            addCriterion("item_icon in", values, "itemIcon");
            return (Criteria) this;
        }

        public Criteria andItemIconNotIn(List<String> values) {
            addCriterion("item_icon not in", values, "itemIcon");
            return (Criteria) this;
        }

        public Criteria andItemIconBetween(String value1, String value2) {
            addCriterion("item_icon between", value1, value2, "itemIcon");
            return (Criteria) this;
        }

        public Criteria andItemIconNotBetween(String value1, String value2) {
            addCriterion("item_icon not between", value1, value2, "itemIcon");
            return (Criteria) this;
        }
    }

    /**
     */
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