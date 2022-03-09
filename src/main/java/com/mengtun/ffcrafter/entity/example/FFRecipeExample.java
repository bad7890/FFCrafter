package com.mengtun.ffcrafter.entity.example;

import java.util.ArrayList;
import java.util.List;

public class FFRecipeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FFRecipeExample() {
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

        public Criteria andRecipeIdIsNull() {
            addCriterion("recipe_id is null");
            return (Criteria) this;
        }

        public Criteria andRecipeIdIsNotNull() {
            addCriterion("recipe_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeIdEqualTo(Integer value) {
            addCriterion("recipe_id =", value, "recipeId");
            return (Criteria) this;
        }

        public Criteria andRecipeIdNotEqualTo(Integer value) {
            addCriterion("recipe_id <>", value, "recipeId");
            return (Criteria) this;
        }

        public Criteria andRecipeIdGreaterThan(Integer value) {
            addCriterion("recipe_id >", value, "recipeId");
            return (Criteria) this;
        }

        public Criteria andRecipeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("recipe_id >=", value, "recipeId");
            return (Criteria) this;
        }

        public Criteria andRecipeIdLessThan(Integer value) {
            addCriterion("recipe_id <", value, "recipeId");
            return (Criteria) this;
        }

        public Criteria andRecipeIdLessThanOrEqualTo(Integer value) {
            addCriterion("recipe_id <=", value, "recipeId");
            return (Criteria) this;
        }

        public Criteria andRecipeIdIn(List<Integer> values) {
            addCriterion("recipe_id in", values, "recipeId");
            return (Criteria) this;
        }

        public Criteria andRecipeIdNotIn(List<Integer> values) {
            addCriterion("recipe_id not in", values, "recipeId");
            return (Criteria) this;
        }

        public Criteria andRecipeIdBetween(Integer value1, Integer value2) {
            addCriterion("recipe_id between", value1, value2, "recipeId");
            return (Criteria) this;
        }

        public Criteria andRecipeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("recipe_id not between", value1, value2, "recipeId");
            return (Criteria) this;
        }

        public Criteria andRecipeNameIsNull() {
            addCriterion("recipe_name is null");
            return (Criteria) this;
        }

        public Criteria andRecipeNameIsNotNull() {
            addCriterion("recipe_name is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeNameEqualTo(String value) {
            addCriterion("recipe_name =", value, "recipeName");
            return (Criteria) this;
        }

        public Criteria andRecipeNameNotEqualTo(String value) {
            addCriterion("recipe_name <>", value, "recipeName");
            return (Criteria) this;
        }

        public Criteria andRecipeNameGreaterThan(String value) {
            addCriterion("recipe_name >", value, "recipeName");
            return (Criteria) this;
        }

        public Criteria andRecipeNameGreaterThanOrEqualTo(String value) {
            addCriterion("recipe_name >=", value, "recipeName");
            return (Criteria) this;
        }

        public Criteria andRecipeNameLessThan(String value) {
            addCriterion("recipe_name <", value, "recipeName");
            return (Criteria) this;
        }

        public Criteria andRecipeNameLessThanOrEqualTo(String value) {
            addCriterion("recipe_name <=", value, "recipeName");
            return (Criteria) this;
        }

        public Criteria andRecipeNameLike(String value) {
            addCriterion("recipe_name like", value, "recipeName");
            return (Criteria) this;
        }

        public Criteria andRecipeNameNotLike(String value) {
            addCriterion("recipe_name not like", value, "recipeName");
            return (Criteria) this;
        }

        public Criteria andRecipeNameIn(List<String> values) {
            addCriterion("recipe_name in", values, "recipeName");
            return (Criteria) this;
        }

        public Criteria andRecipeNameNotIn(List<String> values) {
            addCriterion("recipe_name not in", values, "recipeName");
            return (Criteria) this;
        }

        public Criteria andRecipeNameBetween(String value1, String value2) {
            addCriterion("recipe_name between", value1, value2, "recipeName");
            return (Criteria) this;
        }

        public Criteria andRecipeNameNotBetween(String value1, String value2) {
            addCriterion("recipe_name not between", value1, value2, "recipeName");
            return (Criteria) this;
        }

        public Criteria andRecipeItemIdIsNull() {
            addCriterion("recipe_item_id is null");
            return (Criteria) this;
        }

        public Criteria andRecipeItemIdIsNotNull() {
            addCriterion("recipe_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeItemIdEqualTo(Integer value) {
            addCriterion("recipe_item_id =", value, "recipeItemId");
            return (Criteria) this;
        }

        public Criteria andRecipeItemIdNotEqualTo(Integer value) {
            addCriterion("recipe_item_id <>", value, "recipeItemId");
            return (Criteria) this;
        }

        public Criteria andRecipeItemIdGreaterThan(Integer value) {
            addCriterion("recipe_item_id >", value, "recipeItemId");
            return (Criteria) this;
        }

        public Criteria andRecipeItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("recipe_item_id >=", value, "recipeItemId");
            return (Criteria) this;
        }

        public Criteria andRecipeItemIdLessThan(Integer value) {
            addCriterion("recipe_item_id <", value, "recipeItemId");
            return (Criteria) this;
        }

        public Criteria andRecipeItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("recipe_item_id <=", value, "recipeItemId");
            return (Criteria) this;
        }

        public Criteria andRecipeItemIdIn(List<Integer> values) {
            addCriterion("recipe_item_id in", values, "recipeItemId");
            return (Criteria) this;
        }

        public Criteria andRecipeItemIdNotIn(List<Integer> values) {
            addCriterion("recipe_item_id not in", values, "recipeItemId");
            return (Criteria) this;
        }

        public Criteria andRecipeItemIdBetween(Integer value1, Integer value2) {
            addCriterion("recipe_item_id between", value1, value2, "recipeItemId");
            return (Criteria) this;
        }

        public Criteria andRecipeItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("recipe_item_id not between", value1, value2, "recipeItemId");
            return (Criteria) this;
        }

        public Criteria andRecipeItemNameIsNull() {
            addCriterion("recipe_item_name is null");
            return (Criteria) this;
        }

        public Criteria andRecipeItemNameIsNotNull() {
            addCriterion("recipe_item_name is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeItemNameEqualTo(String value) {
            addCriterion("recipe_item_name =", value, "recipeItemName");
            return (Criteria) this;
        }

        public Criteria andRecipeItemNameNotEqualTo(String value) {
            addCriterion("recipe_item_name <>", value, "recipeItemName");
            return (Criteria) this;
        }

        public Criteria andRecipeItemNameGreaterThan(String value) {
            addCriterion("recipe_item_name >", value, "recipeItemName");
            return (Criteria) this;
        }

        public Criteria andRecipeItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("recipe_item_name >=", value, "recipeItemName");
            return (Criteria) this;
        }

        public Criteria andRecipeItemNameLessThan(String value) {
            addCriterion("recipe_item_name <", value, "recipeItemName");
            return (Criteria) this;
        }

        public Criteria andRecipeItemNameLessThanOrEqualTo(String value) {
            addCriterion("recipe_item_name <=", value, "recipeItemName");
            return (Criteria) this;
        }

        public Criteria andRecipeItemNameLike(String value) {
            addCriterion("recipe_item_name like", value, "recipeItemName");
            return (Criteria) this;
        }

        public Criteria andRecipeItemNameNotLike(String value) {
            addCriterion("recipe_item_name not like", value, "recipeItemName");
            return (Criteria) this;
        }

        public Criteria andRecipeItemNameIn(List<String> values) {
            addCriterion("recipe_item_name in", values, "recipeItemName");
            return (Criteria) this;
        }

        public Criteria andRecipeItemNameNotIn(List<String> values) {
            addCriterion("recipe_item_name not in", values, "recipeItemName");
            return (Criteria) this;
        }

        public Criteria andRecipeItemNameBetween(String value1, String value2) {
            addCriterion("recipe_item_name between", value1, value2, "recipeItemName");
            return (Criteria) this;
        }

        public Criteria andRecipeItemNameNotBetween(String value1, String value2) {
            addCriterion("recipe_item_name not between", value1, value2, "recipeItemName");
            return (Criteria) this;
        }

        public Criteria andRecipeLevelIsNull() {
            addCriterion("recipe_level is null");
            return (Criteria) this;
        }

        public Criteria andRecipeLevelIsNotNull() {
            addCriterion("recipe_level is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeLevelEqualTo(Integer value) {
            addCriterion("recipe_level =", value, "recipeLevel");
            return (Criteria) this;
        }

        public Criteria andRecipeLevelNotEqualTo(Integer value) {
            addCriterion("recipe_level <>", value, "recipeLevel");
            return (Criteria) this;
        }

        public Criteria andRecipeLevelGreaterThan(Integer value) {
            addCriterion("recipe_level >", value, "recipeLevel");
            return (Criteria) this;
        }

        public Criteria andRecipeLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("recipe_level >=", value, "recipeLevel");
            return (Criteria) this;
        }

        public Criteria andRecipeLevelLessThan(Integer value) {
            addCriterion("recipe_level <", value, "recipeLevel");
            return (Criteria) this;
        }

        public Criteria andRecipeLevelLessThanOrEqualTo(Integer value) {
            addCriterion("recipe_level <=", value, "recipeLevel");
            return (Criteria) this;
        }

        public Criteria andRecipeLevelIn(List<Integer> values) {
            addCriterion("recipe_level in", values, "recipeLevel");
            return (Criteria) this;
        }

        public Criteria andRecipeLevelNotIn(List<Integer> values) {
            addCriterion("recipe_level not in", values, "recipeLevel");
            return (Criteria) this;
        }

        public Criteria andRecipeLevelBetween(Integer value1, Integer value2) {
            addCriterion("recipe_level between", value1, value2, "recipeLevel");
            return (Criteria) this;
        }

        public Criteria andRecipeLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("recipe_level not between", value1, value2, "recipeLevel");
            return (Criteria) this;
        }

        public Criteria andRecipeStarIsNull() {
            addCriterion("recipe_star is null");
            return (Criteria) this;
        }

        public Criteria andRecipeStarIsNotNull() {
            addCriterion("recipe_star is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeStarEqualTo(Integer value) {
            addCriterion("recipe_star =", value, "recipeStar");
            return (Criteria) this;
        }

        public Criteria andRecipeStarNotEqualTo(Integer value) {
            addCriterion("recipe_star <>", value, "recipeStar");
            return (Criteria) this;
        }

        public Criteria andRecipeStarGreaterThan(Integer value) {
            addCriterion("recipe_star >", value, "recipeStar");
            return (Criteria) this;
        }

        public Criteria andRecipeStarGreaterThanOrEqualTo(Integer value) {
            addCriterion("recipe_star >=", value, "recipeStar");
            return (Criteria) this;
        }

        public Criteria andRecipeStarLessThan(Integer value) {
            addCriterion("recipe_star <", value, "recipeStar");
            return (Criteria) this;
        }

        public Criteria andRecipeStarLessThanOrEqualTo(Integer value) {
            addCriterion("recipe_star <=", value, "recipeStar");
            return (Criteria) this;
        }

        public Criteria andRecipeStarIn(List<Integer> values) {
            addCriterion("recipe_star in", values, "recipeStar");
            return (Criteria) this;
        }

        public Criteria andRecipeStarNotIn(List<Integer> values) {
            addCriterion("recipe_star not in", values, "recipeStar");
            return (Criteria) this;
        }

        public Criteria andRecipeStarBetween(Integer value1, Integer value2) {
            addCriterion("recipe_star between", value1, value2, "recipeStar");
            return (Criteria) this;
        }

        public Criteria andRecipeStarNotBetween(Integer value1, Integer value2) {
            addCriterion("recipe_star not between", value1, value2, "recipeStar");
            return (Criteria) this;
        }

        public Criteria andRecipeClassIsNull() {
            addCriterion("recipe_class is null");
            return (Criteria) this;
        }

        public Criteria andRecipeClassIsNotNull() {
            addCriterion("recipe_class is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeClassEqualTo(String value) {
            addCriterion("recipe_class =", value, "recipeClass");
            return (Criteria) this;
        }

        public Criteria andRecipeClassNotEqualTo(String value) {
            addCriterion("recipe_class <>", value, "recipeClass");
            return (Criteria) this;
        }

        public Criteria andRecipeClassGreaterThan(String value) {
            addCriterion("recipe_class >", value, "recipeClass");
            return (Criteria) this;
        }

        public Criteria andRecipeClassGreaterThanOrEqualTo(String value) {
            addCriterion("recipe_class >=", value, "recipeClass");
            return (Criteria) this;
        }

        public Criteria andRecipeClassLessThan(String value) {
            addCriterion("recipe_class <", value, "recipeClass");
            return (Criteria) this;
        }

        public Criteria andRecipeClassLessThanOrEqualTo(String value) {
            addCriterion("recipe_class <=", value, "recipeClass");
            return (Criteria) this;
        }

        public Criteria andRecipeClassLike(String value) {
            addCriterion("recipe_class like", value, "recipeClass");
            return (Criteria) this;
        }

        public Criteria andRecipeClassNotLike(String value) {
            addCriterion("recipe_class not like", value, "recipeClass");
            return (Criteria) this;
        }

        public Criteria andRecipeClassIn(List<String> values) {
            addCriterion("recipe_class in", values, "recipeClass");
            return (Criteria) this;
        }

        public Criteria andRecipeClassNotIn(List<String> values) {
            addCriterion("recipe_class not in", values, "recipeClass");
            return (Criteria) this;
        }

        public Criteria andRecipeClassBetween(String value1, String value2) {
            addCriterion("recipe_class between", value1, value2, "recipeClass");
            return (Criteria) this;
        }

        public Criteria andRecipeClassNotBetween(String value1, String value2) {
            addCriterion("recipe_class not between", value1, value2, "recipeClass");
            return (Criteria) this;
        }

        public Criteria andRecipeResultAmountIsNull() {
            addCriterion("recipe_result_amount is null");
            return (Criteria) this;
        }

        public Criteria andRecipeResultAmountIsNotNull() {
            addCriterion("recipe_result_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeResultAmountEqualTo(Integer value) {
            addCriterion("recipe_result_amount =", value, "recipeResultAmount");
            return (Criteria) this;
        }

        public Criteria andRecipeResultAmountNotEqualTo(Integer value) {
            addCriterion("recipe_result_amount <>", value, "recipeResultAmount");
            return (Criteria) this;
        }

        public Criteria andRecipeResultAmountGreaterThan(Integer value) {
            addCriterion("recipe_result_amount >", value, "recipeResultAmount");
            return (Criteria) this;
        }

        public Criteria andRecipeResultAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("recipe_result_amount >=", value, "recipeResultAmount");
            return (Criteria) this;
        }

        public Criteria andRecipeResultAmountLessThan(Integer value) {
            addCriterion("recipe_result_amount <", value, "recipeResultAmount");
            return (Criteria) this;
        }

        public Criteria andRecipeResultAmountLessThanOrEqualTo(Integer value) {
            addCriterion("recipe_result_amount <=", value, "recipeResultAmount");
            return (Criteria) this;
        }

        public Criteria andRecipeResultAmountIn(List<Integer> values) {
            addCriterion("recipe_result_amount in", values, "recipeResultAmount");
            return (Criteria) this;
        }

        public Criteria andRecipeResultAmountNotIn(List<Integer> values) {
            addCriterion("recipe_result_amount not in", values, "recipeResultAmount");
            return (Criteria) this;
        }

        public Criteria andRecipeResultAmountBetween(Integer value1, Integer value2) {
            addCriterion("recipe_result_amount between", value1, value2, "recipeResultAmount");
            return (Criteria) this;
        }

        public Criteria andRecipeResultAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("recipe_result_amount not between", value1, value2, "recipeResultAmount");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial0IsNull() {
            addCriterion("recipe_material_0 is null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial0IsNotNull() {
            addCriterion("recipe_material_0 is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial0EqualTo(Integer value) {
            addCriterion("recipe_material_0 =", value, "recipeMaterial0");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial0NotEqualTo(Integer value) {
            addCriterion("recipe_material_0 <>", value, "recipeMaterial0");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial0GreaterThan(Integer value) {
            addCriterion("recipe_material_0 >", value, "recipeMaterial0");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial0GreaterThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_0 >=", value, "recipeMaterial0");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial0LessThan(Integer value) {
            addCriterion("recipe_material_0 <", value, "recipeMaterial0");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial0LessThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_0 <=", value, "recipeMaterial0");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial0In(List<Integer> values) {
            addCriterion("recipe_material_0 in", values, "recipeMaterial0");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial0NotIn(List<Integer> values) {
            addCriterion("recipe_material_0 not in", values, "recipeMaterial0");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial0Between(Integer value1, Integer value2) {
            addCriterion("recipe_material_0 between", value1, value2, "recipeMaterial0");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial0NotBetween(Integer value1, Integer value2) {
            addCriterion("recipe_material_0 not between", value1, value2, "recipeMaterial0");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum0IsNull() {
            addCriterion("recipe_material_num_0 is null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum0IsNotNull() {
            addCriterion("recipe_material_num_0 is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum0EqualTo(Integer value) {
            addCriterion("recipe_material_num_0 =", value, "recipeMaterialNum0");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum0NotEqualTo(Integer value) {
            addCriterion("recipe_material_num_0 <>", value, "recipeMaterialNum0");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum0GreaterThan(Integer value) {
            addCriterion("recipe_material_num_0 >", value, "recipeMaterialNum0");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum0GreaterThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_num_0 >=", value, "recipeMaterialNum0");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum0LessThan(Integer value) {
            addCriterion("recipe_material_num_0 <", value, "recipeMaterialNum0");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum0LessThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_num_0 <=", value, "recipeMaterialNum0");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum0In(List<Integer> values) {
            addCriterion("recipe_material_num_0 in", values, "recipeMaterialNum0");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum0NotIn(List<Integer> values) {
            addCriterion("recipe_material_num_0 not in", values, "recipeMaterialNum0");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum0Between(Integer value1, Integer value2) {
            addCriterion("recipe_material_num_0 between", value1, value2, "recipeMaterialNum0");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum0NotBetween(Integer value1, Integer value2) {
            addCriterion("recipe_material_num_0 not between", value1, value2, "recipeMaterialNum0");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial1IsNull() {
            addCriterion("recipe_material_1 is null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial1IsNotNull() {
            addCriterion("recipe_material_1 is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial1EqualTo(Integer value) {
            addCriterion("recipe_material_1 =", value, "recipeMaterial1");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial1NotEqualTo(Integer value) {
            addCriterion("recipe_material_1 <>", value, "recipeMaterial1");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial1GreaterThan(Integer value) {
            addCriterion("recipe_material_1 >", value, "recipeMaterial1");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial1GreaterThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_1 >=", value, "recipeMaterial1");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial1LessThan(Integer value) {
            addCriterion("recipe_material_1 <", value, "recipeMaterial1");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial1LessThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_1 <=", value, "recipeMaterial1");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial1In(List<Integer> values) {
            addCriterion("recipe_material_1 in", values, "recipeMaterial1");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial1NotIn(List<Integer> values) {
            addCriterion("recipe_material_1 not in", values, "recipeMaterial1");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial1Between(Integer value1, Integer value2) {
            addCriterion("recipe_material_1 between", value1, value2, "recipeMaterial1");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial1NotBetween(Integer value1, Integer value2) {
            addCriterion("recipe_material_1 not between", value1, value2, "recipeMaterial1");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum1IsNull() {
            addCriterion("recipe_material_num_1 is null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum1IsNotNull() {
            addCriterion("recipe_material_num_1 is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum1EqualTo(Integer value) {
            addCriterion("recipe_material_num_1 =", value, "recipeMaterialNum1");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum1NotEqualTo(Integer value) {
            addCriterion("recipe_material_num_1 <>", value, "recipeMaterialNum1");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum1GreaterThan(Integer value) {
            addCriterion("recipe_material_num_1 >", value, "recipeMaterialNum1");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum1GreaterThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_num_1 >=", value, "recipeMaterialNum1");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum1LessThan(Integer value) {
            addCriterion("recipe_material_num_1 <", value, "recipeMaterialNum1");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum1LessThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_num_1 <=", value, "recipeMaterialNum1");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum1In(List<Integer> values) {
            addCriterion("recipe_material_num_1 in", values, "recipeMaterialNum1");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum1NotIn(List<Integer> values) {
            addCriterion("recipe_material_num_1 not in", values, "recipeMaterialNum1");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum1Between(Integer value1, Integer value2) {
            addCriterion("recipe_material_num_1 between", value1, value2, "recipeMaterialNum1");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum1NotBetween(Integer value1, Integer value2) {
            addCriterion("recipe_material_num_1 not between", value1, value2, "recipeMaterialNum1");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial2IsNull() {
            addCriterion("recipe_material_2 is null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial2IsNotNull() {
            addCriterion("recipe_material_2 is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial2EqualTo(Integer value) {
            addCriterion("recipe_material_2 =", value, "recipeMaterial2");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial2NotEqualTo(Integer value) {
            addCriterion("recipe_material_2 <>", value, "recipeMaterial2");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial2GreaterThan(Integer value) {
            addCriterion("recipe_material_2 >", value, "recipeMaterial2");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial2GreaterThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_2 >=", value, "recipeMaterial2");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial2LessThan(Integer value) {
            addCriterion("recipe_material_2 <", value, "recipeMaterial2");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial2LessThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_2 <=", value, "recipeMaterial2");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial2In(List<Integer> values) {
            addCriterion("recipe_material_2 in", values, "recipeMaterial2");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial2NotIn(List<Integer> values) {
            addCriterion("recipe_material_2 not in", values, "recipeMaterial2");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial2Between(Integer value1, Integer value2) {
            addCriterion("recipe_material_2 between", value1, value2, "recipeMaterial2");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial2NotBetween(Integer value1, Integer value2) {
            addCriterion("recipe_material_2 not between", value1, value2, "recipeMaterial2");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum2IsNull() {
            addCriterion("recipe_material_num_2 is null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum2IsNotNull() {
            addCriterion("recipe_material_num_2 is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum2EqualTo(Integer value) {
            addCriterion("recipe_material_num_2 =", value, "recipeMaterialNum2");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum2NotEqualTo(Integer value) {
            addCriterion("recipe_material_num_2 <>", value, "recipeMaterialNum2");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum2GreaterThan(Integer value) {
            addCriterion("recipe_material_num_2 >", value, "recipeMaterialNum2");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum2GreaterThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_num_2 >=", value, "recipeMaterialNum2");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum2LessThan(Integer value) {
            addCriterion("recipe_material_num_2 <", value, "recipeMaterialNum2");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum2LessThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_num_2 <=", value, "recipeMaterialNum2");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum2In(List<Integer> values) {
            addCriterion("recipe_material_num_2 in", values, "recipeMaterialNum2");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum2NotIn(List<Integer> values) {
            addCriterion("recipe_material_num_2 not in", values, "recipeMaterialNum2");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum2Between(Integer value1, Integer value2) {
            addCriterion("recipe_material_num_2 between", value1, value2, "recipeMaterialNum2");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum2NotBetween(Integer value1, Integer value2) {
            addCriterion("recipe_material_num_2 not between", value1, value2, "recipeMaterialNum2");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial3IsNull() {
            addCriterion("recipe_material_3 is null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial3IsNotNull() {
            addCriterion("recipe_material_3 is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial3EqualTo(Integer value) {
            addCriterion("recipe_material_3 =", value, "recipeMaterial3");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial3NotEqualTo(Integer value) {
            addCriterion("recipe_material_3 <>", value, "recipeMaterial3");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial3GreaterThan(Integer value) {
            addCriterion("recipe_material_3 >", value, "recipeMaterial3");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial3GreaterThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_3 >=", value, "recipeMaterial3");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial3LessThan(Integer value) {
            addCriterion("recipe_material_3 <", value, "recipeMaterial3");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial3LessThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_3 <=", value, "recipeMaterial3");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial3In(List<Integer> values) {
            addCriterion("recipe_material_3 in", values, "recipeMaterial3");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial3NotIn(List<Integer> values) {
            addCriterion("recipe_material_3 not in", values, "recipeMaterial3");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial3Between(Integer value1, Integer value2) {
            addCriterion("recipe_material_3 between", value1, value2, "recipeMaterial3");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial3NotBetween(Integer value1, Integer value2) {
            addCriterion("recipe_material_3 not between", value1, value2, "recipeMaterial3");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum3IsNull() {
            addCriterion("recipe_material_num_3 is null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum3IsNotNull() {
            addCriterion("recipe_material_num_3 is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum3EqualTo(Integer value) {
            addCriterion("recipe_material_num_3 =", value, "recipeMaterialNum3");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum3NotEqualTo(Integer value) {
            addCriterion("recipe_material_num_3 <>", value, "recipeMaterialNum3");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum3GreaterThan(Integer value) {
            addCriterion("recipe_material_num_3 >", value, "recipeMaterialNum3");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum3GreaterThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_num_3 >=", value, "recipeMaterialNum3");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum3LessThan(Integer value) {
            addCriterion("recipe_material_num_3 <", value, "recipeMaterialNum3");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum3LessThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_num_3 <=", value, "recipeMaterialNum3");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum3In(List<Integer> values) {
            addCriterion("recipe_material_num_3 in", values, "recipeMaterialNum3");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum3NotIn(List<Integer> values) {
            addCriterion("recipe_material_num_3 not in", values, "recipeMaterialNum3");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum3Between(Integer value1, Integer value2) {
            addCriterion("recipe_material_num_3 between", value1, value2, "recipeMaterialNum3");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum3NotBetween(Integer value1, Integer value2) {
            addCriterion("recipe_material_num_3 not between", value1, value2, "recipeMaterialNum3");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial4IsNull() {
            addCriterion("recipe_material_4 is null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial4IsNotNull() {
            addCriterion("recipe_material_4 is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial4EqualTo(Integer value) {
            addCriterion("recipe_material_4 =", value, "recipeMaterial4");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial4NotEqualTo(Integer value) {
            addCriterion("recipe_material_4 <>", value, "recipeMaterial4");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial4GreaterThan(Integer value) {
            addCriterion("recipe_material_4 >", value, "recipeMaterial4");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial4GreaterThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_4 >=", value, "recipeMaterial4");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial4LessThan(Integer value) {
            addCriterion("recipe_material_4 <", value, "recipeMaterial4");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial4LessThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_4 <=", value, "recipeMaterial4");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial4In(List<Integer> values) {
            addCriterion("recipe_material_4 in", values, "recipeMaterial4");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial4NotIn(List<Integer> values) {
            addCriterion("recipe_material_4 not in", values, "recipeMaterial4");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial4Between(Integer value1, Integer value2) {
            addCriterion("recipe_material_4 between", value1, value2, "recipeMaterial4");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial4NotBetween(Integer value1, Integer value2) {
            addCriterion("recipe_material_4 not between", value1, value2, "recipeMaterial4");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum4IsNull() {
            addCriterion("recipe_material_num_4 is null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum4IsNotNull() {
            addCriterion("recipe_material_num_4 is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum4EqualTo(Integer value) {
            addCriterion("recipe_material_num_4 =", value, "recipeMaterialNum4");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum4NotEqualTo(Integer value) {
            addCriterion("recipe_material_num_4 <>", value, "recipeMaterialNum4");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum4GreaterThan(Integer value) {
            addCriterion("recipe_material_num_4 >", value, "recipeMaterialNum4");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum4GreaterThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_num_4 >=", value, "recipeMaterialNum4");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum4LessThan(Integer value) {
            addCriterion("recipe_material_num_4 <", value, "recipeMaterialNum4");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum4LessThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_num_4 <=", value, "recipeMaterialNum4");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum4In(List<Integer> values) {
            addCriterion("recipe_material_num_4 in", values, "recipeMaterialNum4");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum4NotIn(List<Integer> values) {
            addCriterion("recipe_material_num_4 not in", values, "recipeMaterialNum4");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum4Between(Integer value1, Integer value2) {
            addCriterion("recipe_material_num_4 between", value1, value2, "recipeMaterialNum4");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum4NotBetween(Integer value1, Integer value2) {
            addCriterion("recipe_material_num_4 not between", value1, value2, "recipeMaterialNum4");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial5IsNull() {
            addCriterion("recipe_material_5 is null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial5IsNotNull() {
            addCriterion("recipe_material_5 is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial5EqualTo(Integer value) {
            addCriterion("recipe_material_5 =", value, "recipeMaterial5");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial5NotEqualTo(Integer value) {
            addCriterion("recipe_material_5 <>", value, "recipeMaterial5");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial5GreaterThan(Integer value) {
            addCriterion("recipe_material_5 >", value, "recipeMaterial5");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial5GreaterThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_5 >=", value, "recipeMaterial5");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial5LessThan(Integer value) {
            addCriterion("recipe_material_5 <", value, "recipeMaterial5");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial5LessThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_5 <=", value, "recipeMaterial5");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial5In(List<Integer> values) {
            addCriterion("recipe_material_5 in", values, "recipeMaterial5");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial5NotIn(List<Integer> values) {
            addCriterion("recipe_material_5 not in", values, "recipeMaterial5");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial5Between(Integer value1, Integer value2) {
            addCriterion("recipe_material_5 between", value1, value2, "recipeMaterial5");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial5NotBetween(Integer value1, Integer value2) {
            addCriterion("recipe_material_5 not between", value1, value2, "recipeMaterial5");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum5IsNull() {
            addCriterion("recipe_material_num_5 is null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum5IsNotNull() {
            addCriterion("recipe_material_num_5 is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum5EqualTo(Integer value) {
            addCriterion("recipe_material_num_5 =", value, "recipeMaterialNum5");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum5NotEqualTo(Integer value) {
            addCriterion("recipe_material_num_5 <>", value, "recipeMaterialNum5");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum5GreaterThan(Integer value) {
            addCriterion("recipe_material_num_5 >", value, "recipeMaterialNum5");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum5GreaterThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_num_5 >=", value, "recipeMaterialNum5");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum5LessThan(Integer value) {
            addCriterion("recipe_material_num_5 <", value, "recipeMaterialNum5");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum5LessThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_num_5 <=", value, "recipeMaterialNum5");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum5In(List<Integer> values) {
            addCriterion("recipe_material_num_5 in", values, "recipeMaterialNum5");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum5NotIn(List<Integer> values) {
            addCriterion("recipe_material_num_5 not in", values, "recipeMaterialNum5");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum5Between(Integer value1, Integer value2) {
            addCriterion("recipe_material_num_5 between", value1, value2, "recipeMaterialNum5");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum5NotBetween(Integer value1, Integer value2) {
            addCriterion("recipe_material_num_5 not between", value1, value2, "recipeMaterialNum5");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial6IsNull() {
            addCriterion("recipe_material_6 is null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial6IsNotNull() {
            addCriterion("recipe_material_6 is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial6EqualTo(Integer value) {
            addCriterion("recipe_material_6 =", value, "recipeMaterial6");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial6NotEqualTo(Integer value) {
            addCriterion("recipe_material_6 <>", value, "recipeMaterial6");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial6GreaterThan(Integer value) {
            addCriterion("recipe_material_6 >", value, "recipeMaterial6");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial6GreaterThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_6 >=", value, "recipeMaterial6");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial6LessThan(Integer value) {
            addCriterion("recipe_material_6 <", value, "recipeMaterial6");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial6LessThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_6 <=", value, "recipeMaterial6");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial6In(List<Integer> values) {
            addCriterion("recipe_material_6 in", values, "recipeMaterial6");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial6NotIn(List<Integer> values) {
            addCriterion("recipe_material_6 not in", values, "recipeMaterial6");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial6Between(Integer value1, Integer value2) {
            addCriterion("recipe_material_6 between", value1, value2, "recipeMaterial6");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial6NotBetween(Integer value1, Integer value2) {
            addCriterion("recipe_material_6 not between", value1, value2, "recipeMaterial6");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum6IsNull() {
            addCriterion("recipe_material_num_6 is null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum6IsNotNull() {
            addCriterion("recipe_material_num_6 is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum6EqualTo(Integer value) {
            addCriterion("recipe_material_num_6 =", value, "recipeMaterialNum6");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum6NotEqualTo(Integer value) {
            addCriterion("recipe_material_num_6 <>", value, "recipeMaterialNum6");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum6GreaterThan(Integer value) {
            addCriterion("recipe_material_num_6 >", value, "recipeMaterialNum6");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum6GreaterThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_num_6 >=", value, "recipeMaterialNum6");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum6LessThan(Integer value) {
            addCriterion("recipe_material_num_6 <", value, "recipeMaterialNum6");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum6LessThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_num_6 <=", value, "recipeMaterialNum6");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum6In(List<Integer> values) {
            addCriterion("recipe_material_num_6 in", values, "recipeMaterialNum6");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum6NotIn(List<Integer> values) {
            addCriterion("recipe_material_num_6 not in", values, "recipeMaterialNum6");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum6Between(Integer value1, Integer value2) {
            addCriterion("recipe_material_num_6 between", value1, value2, "recipeMaterialNum6");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum6NotBetween(Integer value1, Integer value2) {
            addCriterion("recipe_material_num_6 not between", value1, value2, "recipeMaterialNum6");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial7IsNull() {
            addCriterion("recipe_material_7 is null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial7IsNotNull() {
            addCriterion("recipe_material_7 is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial7EqualTo(Integer value) {
            addCriterion("recipe_material_7 =", value, "recipeMaterial7");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial7NotEqualTo(Integer value) {
            addCriterion("recipe_material_7 <>", value, "recipeMaterial7");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial7GreaterThan(Integer value) {
            addCriterion("recipe_material_7 >", value, "recipeMaterial7");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial7GreaterThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_7 >=", value, "recipeMaterial7");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial7LessThan(Integer value) {
            addCriterion("recipe_material_7 <", value, "recipeMaterial7");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial7LessThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_7 <=", value, "recipeMaterial7");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial7In(List<Integer> values) {
            addCriterion("recipe_material_7 in", values, "recipeMaterial7");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial7NotIn(List<Integer> values) {
            addCriterion("recipe_material_7 not in", values, "recipeMaterial7");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial7Between(Integer value1, Integer value2) {
            addCriterion("recipe_material_7 between", value1, value2, "recipeMaterial7");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial7NotBetween(Integer value1, Integer value2) {
            addCriterion("recipe_material_7 not between", value1, value2, "recipeMaterial7");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum7IsNull() {
            addCriterion("recipe_material_num_7 is null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum7IsNotNull() {
            addCriterion("recipe_material_num_7 is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum7EqualTo(Integer value) {
            addCriterion("recipe_material_num_7 =", value, "recipeMaterialNum7");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum7NotEqualTo(Integer value) {
            addCriterion("recipe_material_num_7 <>", value, "recipeMaterialNum7");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum7GreaterThan(Integer value) {
            addCriterion("recipe_material_num_7 >", value, "recipeMaterialNum7");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum7GreaterThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_num_7 >=", value, "recipeMaterialNum7");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum7LessThan(Integer value) {
            addCriterion("recipe_material_num_7 <", value, "recipeMaterialNum7");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum7LessThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_num_7 <=", value, "recipeMaterialNum7");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum7In(List<Integer> values) {
            addCriterion("recipe_material_num_7 in", values, "recipeMaterialNum7");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum7NotIn(List<Integer> values) {
            addCriterion("recipe_material_num_7 not in", values, "recipeMaterialNum7");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum7Between(Integer value1, Integer value2) {
            addCriterion("recipe_material_num_7 between", value1, value2, "recipeMaterialNum7");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum7NotBetween(Integer value1, Integer value2) {
            addCriterion("recipe_material_num_7 not between", value1, value2, "recipeMaterialNum7");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial8IsNull() {
            addCriterion("recipe_material_8 is null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial8IsNotNull() {
            addCriterion("recipe_material_8 is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial8EqualTo(Integer value) {
            addCriterion("recipe_material_8 =", value, "recipeMaterial8");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial8NotEqualTo(Integer value) {
            addCriterion("recipe_material_8 <>", value, "recipeMaterial8");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial8GreaterThan(Integer value) {
            addCriterion("recipe_material_8 >", value, "recipeMaterial8");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial8GreaterThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_8 >=", value, "recipeMaterial8");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial8LessThan(Integer value) {
            addCriterion("recipe_material_8 <", value, "recipeMaterial8");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial8LessThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_8 <=", value, "recipeMaterial8");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial8In(List<Integer> values) {
            addCriterion("recipe_material_8 in", values, "recipeMaterial8");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial8NotIn(List<Integer> values) {
            addCriterion("recipe_material_8 not in", values, "recipeMaterial8");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial8Between(Integer value1, Integer value2) {
            addCriterion("recipe_material_8 between", value1, value2, "recipeMaterial8");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial8NotBetween(Integer value1, Integer value2) {
            addCriterion("recipe_material_8 not between", value1, value2, "recipeMaterial8");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum8IsNull() {
            addCriterion("recipe_material_num_8 is null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum8IsNotNull() {
            addCriterion("recipe_material_num_8 is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum8EqualTo(Integer value) {
            addCriterion("recipe_material_num_8 =", value, "recipeMaterialNum8");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum8NotEqualTo(Integer value) {
            addCriterion("recipe_material_num_8 <>", value, "recipeMaterialNum8");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum8GreaterThan(Integer value) {
            addCriterion("recipe_material_num_8 >", value, "recipeMaterialNum8");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum8GreaterThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_num_8 >=", value, "recipeMaterialNum8");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum8LessThan(Integer value) {
            addCriterion("recipe_material_num_8 <", value, "recipeMaterialNum8");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum8LessThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_num_8 <=", value, "recipeMaterialNum8");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum8In(List<Integer> values) {
            addCriterion("recipe_material_num_8 in", values, "recipeMaterialNum8");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum8NotIn(List<Integer> values) {
            addCriterion("recipe_material_num_8 not in", values, "recipeMaterialNum8");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum8Between(Integer value1, Integer value2) {
            addCriterion("recipe_material_num_8 between", value1, value2, "recipeMaterialNum8");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum8NotBetween(Integer value1, Integer value2) {
            addCriterion("recipe_material_num_8 not between", value1, value2, "recipeMaterialNum8");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial9IsNull() {
            addCriterion("recipe_material_9 is null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial9IsNotNull() {
            addCriterion("recipe_material_9 is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial9EqualTo(Integer value) {
            addCriterion("recipe_material_9 =", value, "recipeMaterial9");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial9NotEqualTo(Integer value) {
            addCriterion("recipe_material_9 <>", value, "recipeMaterial9");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial9GreaterThan(Integer value) {
            addCriterion("recipe_material_9 >", value, "recipeMaterial9");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial9GreaterThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_9 >=", value, "recipeMaterial9");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial9LessThan(Integer value) {
            addCriterion("recipe_material_9 <", value, "recipeMaterial9");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial9LessThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_9 <=", value, "recipeMaterial9");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial9In(List<Integer> values) {
            addCriterion("recipe_material_9 in", values, "recipeMaterial9");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial9NotIn(List<Integer> values) {
            addCriterion("recipe_material_9 not in", values, "recipeMaterial9");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial9Between(Integer value1, Integer value2) {
            addCriterion("recipe_material_9 between", value1, value2, "recipeMaterial9");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterial9NotBetween(Integer value1, Integer value2) {
            addCriterion("recipe_material_9 not between", value1, value2, "recipeMaterial9");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum9IsNull() {
            addCriterion("recipe_material_num_9 is null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum9IsNotNull() {
            addCriterion("recipe_material_num_9 is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum9EqualTo(Integer value) {
            addCriterion("recipe_material_num_9 =", value, "recipeMaterialNum9");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum9NotEqualTo(Integer value) {
            addCriterion("recipe_material_num_9 <>", value, "recipeMaterialNum9");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum9GreaterThan(Integer value) {
            addCriterion("recipe_material_num_9 >", value, "recipeMaterialNum9");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum9GreaterThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_num_9 >=", value, "recipeMaterialNum9");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum9LessThan(Integer value) {
            addCriterion("recipe_material_num_9 <", value, "recipeMaterialNum9");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum9LessThanOrEqualTo(Integer value) {
            addCriterion("recipe_material_num_9 <=", value, "recipeMaterialNum9");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum9In(List<Integer> values) {
            addCriterion("recipe_material_num_9 in", values, "recipeMaterialNum9");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum9NotIn(List<Integer> values) {
            addCriterion("recipe_material_num_9 not in", values, "recipeMaterialNum9");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum9Between(Integer value1, Integer value2) {
            addCriterion("recipe_material_num_9 between", value1, value2, "recipeMaterialNum9");
            return (Criteria) this;
        }

        public Criteria andRecipeMaterialNum9NotBetween(Integer value1, Integer value2) {
            addCriterion("recipe_material_num_9 not between", value1, value2, "recipeMaterialNum9");
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