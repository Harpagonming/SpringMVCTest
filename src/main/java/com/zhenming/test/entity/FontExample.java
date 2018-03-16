package com.zhenming.test.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FontExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FontExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFontNameIsNull() {
            addCriterion("FONT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFontNameIsNotNull() {
            addCriterion("FONT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFontNameEqualTo(String value) {
            addCriterion("FONT_NAME =", value, "fontName");
            return (Criteria) this;
        }

        public Criteria andFontNameNotEqualTo(String value) {
            addCriterion("FONT_NAME <>", value, "fontName");
            return (Criteria) this;
        }

        public Criteria andFontNameGreaterThan(String value) {
            addCriterion("FONT_NAME >", value, "fontName");
            return (Criteria) this;
        }

        public Criteria andFontNameGreaterThanOrEqualTo(String value) {
            addCriterion("FONT_NAME >=", value, "fontName");
            return (Criteria) this;
        }

        public Criteria andFontNameLessThan(String value) {
            addCriterion("FONT_NAME <", value, "fontName");
            return (Criteria) this;
        }

        public Criteria andFontNameLessThanOrEqualTo(String value) {
            addCriterion("FONT_NAME <=", value, "fontName");
            return (Criteria) this;
        }

        public Criteria andFontNameLike(String value) {
            addCriterion("FONT_NAME like", value, "fontName");
            return (Criteria) this;
        }

        public Criteria andFontNameNotLike(String value) {
            addCriterion("FONT_NAME not like", value, "fontName");
            return (Criteria) this;
        }

        public Criteria andFontNameIn(List<String> values) {
            addCriterion("FONT_NAME in", values, "fontName");
            return (Criteria) this;
        }

        public Criteria andFontNameNotIn(List<String> values) {
            addCriterion("FONT_NAME not in", values, "fontName");
            return (Criteria) this;
        }

        public Criteria andFontNameBetween(String value1, String value2) {
            addCriterion("FONT_NAME between", value1, value2, "fontName");
            return (Criteria) this;
        }

        public Criteria andFontNameNotBetween(String value1, String value2) {
            addCriterion("FONT_NAME not between", value1, value2, "fontName");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("PRICE not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andShareTypeIsNull() {
            addCriterion("SHARE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andShareTypeIsNotNull() {
            addCriterion("SHARE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andShareTypeEqualTo(String value) {
            addCriterion("SHARE_TYPE =", value, "shareType");
            return (Criteria) this;
        }

        public Criteria andShareTypeNotEqualTo(String value) {
            addCriterion("SHARE_TYPE <>", value, "shareType");
            return (Criteria) this;
        }

        public Criteria andShareTypeGreaterThan(String value) {
            addCriterion("SHARE_TYPE >", value, "shareType");
            return (Criteria) this;
        }

        public Criteria andShareTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SHARE_TYPE >=", value, "shareType");
            return (Criteria) this;
        }

        public Criteria andShareTypeLessThan(String value) {
            addCriterion("SHARE_TYPE <", value, "shareType");
            return (Criteria) this;
        }

        public Criteria andShareTypeLessThanOrEqualTo(String value) {
            addCriterion("SHARE_TYPE <=", value, "shareType");
            return (Criteria) this;
        }

        public Criteria andShareTypeLike(String value) {
            addCriterion("SHARE_TYPE like", value, "shareType");
            return (Criteria) this;
        }

        public Criteria andShareTypeNotLike(String value) {
            addCriterion("SHARE_TYPE not like", value, "shareType");
            return (Criteria) this;
        }

        public Criteria andShareTypeIn(List<String> values) {
            addCriterion("SHARE_TYPE in", values, "shareType");
            return (Criteria) this;
        }

        public Criteria andShareTypeNotIn(List<String> values) {
            addCriterion("SHARE_TYPE not in", values, "shareType");
            return (Criteria) this;
        }

        public Criteria andShareTypeBetween(String value1, String value2) {
            addCriterion("SHARE_TYPE between", value1, value2, "shareType");
            return (Criteria) this;
        }

        public Criteria andShareTypeNotBetween(String value1, String value2) {
            addCriterion("SHARE_TYPE not between", value1, value2, "shareType");
            return (Criteria) this;
        }

        public Criteria andShareValueIsNull() {
            addCriterion("SHARE_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andShareValueIsNotNull() {
            addCriterion("SHARE_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andShareValueEqualTo(Short value) {
            addCriterion("SHARE_VALUE =", value, "shareValue");
            return (Criteria) this;
        }

        public Criteria andShareValueNotEqualTo(Short value) {
            addCriterion("SHARE_VALUE <>", value, "shareValue");
            return (Criteria) this;
        }

        public Criteria andShareValueGreaterThan(Short value) {
            addCriterion("SHARE_VALUE >", value, "shareValue");
            return (Criteria) this;
        }

        public Criteria andShareValueGreaterThanOrEqualTo(Short value) {
            addCriterion("SHARE_VALUE >=", value, "shareValue");
            return (Criteria) this;
        }

        public Criteria andShareValueLessThan(Short value) {
            addCriterion("SHARE_VALUE <", value, "shareValue");
            return (Criteria) this;
        }

        public Criteria andShareValueLessThanOrEqualTo(Short value) {
            addCriterion("SHARE_VALUE <=", value, "shareValue");
            return (Criteria) this;
        }

        public Criteria andShareValueIn(List<Short> values) {
            addCriterion("SHARE_VALUE in", values, "shareValue");
            return (Criteria) this;
        }

        public Criteria andShareValueNotIn(List<Short> values) {
            addCriterion("SHARE_VALUE not in", values, "shareValue");
            return (Criteria) this;
        }

        public Criteria andShareValueBetween(Short value1, Short value2) {
            addCriterion("SHARE_VALUE between", value1, value2, "shareValue");
            return (Criteria) this;
        }

        public Criteria andShareValueNotBetween(Short value1, Short value2) {
            addCriterion("SHARE_VALUE not between", value1, value2, "shareValue");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("AUTHOR is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("AUTHOR is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("AUTHOR =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("AUTHOR <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("AUTHOR >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHOR >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("AUTHOR <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("AUTHOR <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("AUTHOR like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("AUTHOR not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("AUTHOR in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("AUTHOR not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("AUTHOR between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("AUTHOR not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("INTRODUCTION is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("INTRODUCTION is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("INTRODUCTION =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("INTRODUCTION <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("INTRODUCTION >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("INTRODUCTION >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("INTRODUCTION <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("INTRODUCTION <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("INTRODUCTION like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("INTRODUCTION not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("INTRODUCTION in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("INTRODUCTION not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("INTRODUCTION between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("INTRODUCTION not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIsAppRecommentIsNull() {
            addCriterion("IS_APP_RECOMMENT is null");
            return (Criteria) this;
        }

        public Criteria andIsAppRecommentIsNotNull() {
            addCriterion("IS_APP_RECOMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andIsAppRecommentEqualTo(String value) {
            addCriterion("IS_APP_RECOMMENT =", value, "isAppRecomment");
            return (Criteria) this;
        }

        public Criteria andIsAppRecommentNotEqualTo(String value) {
            addCriterion("IS_APP_RECOMMENT <>", value, "isAppRecomment");
            return (Criteria) this;
        }

        public Criteria andIsAppRecommentGreaterThan(String value) {
            addCriterion("IS_APP_RECOMMENT >", value, "isAppRecomment");
            return (Criteria) this;
        }

        public Criteria andIsAppRecommentGreaterThanOrEqualTo(String value) {
            addCriterion("IS_APP_RECOMMENT >=", value, "isAppRecomment");
            return (Criteria) this;
        }

        public Criteria andIsAppRecommentLessThan(String value) {
            addCriterion("IS_APP_RECOMMENT <", value, "isAppRecomment");
            return (Criteria) this;
        }

        public Criteria andIsAppRecommentLessThanOrEqualTo(String value) {
            addCriterion("IS_APP_RECOMMENT <=", value, "isAppRecomment");
            return (Criteria) this;
        }

        public Criteria andIsAppRecommentLike(String value) {
            addCriterion("IS_APP_RECOMMENT like", value, "isAppRecomment");
            return (Criteria) this;
        }

        public Criteria andIsAppRecommentNotLike(String value) {
            addCriterion("IS_APP_RECOMMENT not like", value, "isAppRecomment");
            return (Criteria) this;
        }

        public Criteria andIsAppRecommentIn(List<String> values) {
            addCriterion("IS_APP_RECOMMENT in", values, "isAppRecomment");
            return (Criteria) this;
        }

        public Criteria andIsAppRecommentNotIn(List<String> values) {
            addCriterion("IS_APP_RECOMMENT not in", values, "isAppRecomment");
            return (Criteria) this;
        }

        public Criteria andIsAppRecommentBetween(String value1, String value2) {
            addCriterion("IS_APP_RECOMMENT between", value1, value2, "isAppRecomment");
            return (Criteria) this;
        }

        public Criteria andIsAppRecommentNotBetween(String value1, String value2) {
            addCriterion("IS_APP_RECOMMENT not between", value1, value2, "isAppRecomment");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAppRecommentLabelIsNull() {
            addCriterion("APP_RECOMMENT_LABEL is null");
            return (Criteria) this;
        }

        public Criteria andAppRecommentLabelIsNotNull() {
            addCriterion("APP_RECOMMENT_LABEL is not null");
            return (Criteria) this;
        }

        public Criteria andAppRecommentLabelEqualTo(String value) {
            addCriterion("APP_RECOMMENT_LABEL =", value, "appRecommentLabel");
            return (Criteria) this;
        }

        public Criteria andAppRecommentLabelNotEqualTo(String value) {
            addCriterion("APP_RECOMMENT_LABEL <>", value, "appRecommentLabel");
            return (Criteria) this;
        }

        public Criteria andAppRecommentLabelGreaterThan(String value) {
            addCriterion("APP_RECOMMENT_LABEL >", value, "appRecommentLabel");
            return (Criteria) this;
        }

        public Criteria andAppRecommentLabelGreaterThanOrEqualTo(String value) {
            addCriterion("APP_RECOMMENT_LABEL >=", value, "appRecommentLabel");
            return (Criteria) this;
        }

        public Criteria andAppRecommentLabelLessThan(String value) {
            addCriterion("APP_RECOMMENT_LABEL <", value, "appRecommentLabel");
            return (Criteria) this;
        }

        public Criteria andAppRecommentLabelLessThanOrEqualTo(String value) {
            addCriterion("APP_RECOMMENT_LABEL <=", value, "appRecommentLabel");
            return (Criteria) this;
        }

        public Criteria andAppRecommentLabelLike(String value) {
            addCriterion("APP_RECOMMENT_LABEL like", value, "appRecommentLabel");
            return (Criteria) this;
        }

        public Criteria andAppRecommentLabelNotLike(String value) {
            addCriterion("APP_RECOMMENT_LABEL not like", value, "appRecommentLabel");
            return (Criteria) this;
        }

        public Criteria andAppRecommentLabelIn(List<String> values) {
            addCriterion("APP_RECOMMENT_LABEL in", values, "appRecommentLabel");
            return (Criteria) this;
        }

        public Criteria andAppRecommentLabelNotIn(List<String> values) {
            addCriterion("APP_RECOMMENT_LABEL not in", values, "appRecommentLabel");
            return (Criteria) this;
        }

        public Criteria andAppRecommentLabelBetween(String value1, String value2) {
            addCriterion("APP_RECOMMENT_LABEL between", value1, value2, "appRecommentLabel");
            return (Criteria) this;
        }

        public Criteria andAppRecommentLabelNotBetween(String value1, String value2) {
            addCriterion("APP_RECOMMENT_LABEL not between", value1, value2, "appRecommentLabel");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("CREATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("CREATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("CREATE_BY =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("CREATE_BY <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("CREATE_BY >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_BY >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("CREATE_BY <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("CREATE_BY <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("CREATE_BY like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("CREATE_BY not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("CREATE_BY in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("CREATE_BY not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("CREATE_BY between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("CREATE_BY not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("UPDATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("UPDATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("UPDATE_BY =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("UPDATE_BY <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("UPDATE_BY >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_BY >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("UPDATE_BY <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_BY <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("UPDATE_BY like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("UPDATE_BY not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("UPDATE_BY in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("UPDATE_BY not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("UPDATE_BY between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("UPDATE_BY not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("IS_DELETED is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("IS_DELETED is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(String value) {
            addCriterion("IS_DELETED =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(String value) {
            addCriterion("IS_DELETED <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(String value) {
            addCriterion("IS_DELETED >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DELETED >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(String value) {
            addCriterion("IS_DELETED <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(String value) {
            addCriterion("IS_DELETED <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLike(String value) {
            addCriterion("IS_DELETED like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotLike(String value) {
            addCriterion("IS_DELETED not like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<String> values) {
            addCriterion("IS_DELETED in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<String> values) {
            addCriterion("IS_DELETED not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(String value1, String value2) {
            addCriterion("IS_DELETED between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(String value1, String value2) {
            addCriterion("IS_DELETED not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("VERSION not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andFontNumIsNull() {
            addCriterion("FONT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andFontNumIsNotNull() {
            addCriterion("FONT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andFontNumEqualTo(Integer value) {
            addCriterion("FONT_NUM =", value, "fontNum");
            return (Criteria) this;
        }

        public Criteria andFontNumNotEqualTo(Integer value) {
            addCriterion("FONT_NUM <>", value, "fontNum");
            return (Criteria) this;
        }

        public Criteria andFontNumGreaterThan(Integer value) {
            addCriterion("FONT_NUM >", value, "fontNum");
            return (Criteria) this;
        }

        public Criteria andFontNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("FONT_NUM >=", value, "fontNum");
            return (Criteria) this;
        }

        public Criteria andFontNumLessThan(Integer value) {
            addCriterion("FONT_NUM <", value, "fontNum");
            return (Criteria) this;
        }

        public Criteria andFontNumLessThanOrEqualTo(Integer value) {
            addCriterion("FONT_NUM <=", value, "fontNum");
            return (Criteria) this;
        }

        public Criteria andFontNumIn(List<Integer> values) {
            addCriterion("FONT_NUM in", values, "fontNum");
            return (Criteria) this;
        }

        public Criteria andFontNumNotIn(List<Integer> values) {
            addCriterion("FONT_NUM not in", values, "fontNum");
            return (Criteria) this;
        }

        public Criteria andFontNumBetween(Integer value1, Integer value2) {
            addCriterion("FONT_NUM between", value1, value2, "fontNum");
            return (Criteria) this;
        }

        public Criteria andFontNumNotBetween(Integer value1, Integer value2) {
            addCriterion("FONT_NUM not between", value1, value2, "fontNum");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("UID is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("UID is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("UID =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("UID <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("UID >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("UID >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("UID <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("UID <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("UID like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("UID not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("UID in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("UID not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("UID between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("UID not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andOpenStatusIsNull() {
            addCriterion("OPEN_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOpenStatusIsNotNull() {
            addCriterion("OPEN_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOpenStatusEqualTo(String value) {
            addCriterion("OPEN_STATUS =", value, "openStatus");
            return (Criteria) this;
        }

        public Criteria andOpenStatusNotEqualTo(String value) {
            addCriterion("OPEN_STATUS <>", value, "openStatus");
            return (Criteria) this;
        }

        public Criteria andOpenStatusGreaterThan(String value) {
            addCriterion("OPEN_STATUS >", value, "openStatus");
            return (Criteria) this;
        }

        public Criteria andOpenStatusGreaterThanOrEqualTo(String value) {
            addCriterion("OPEN_STATUS >=", value, "openStatus");
            return (Criteria) this;
        }

        public Criteria andOpenStatusLessThan(String value) {
            addCriterion("OPEN_STATUS <", value, "openStatus");
            return (Criteria) this;
        }

        public Criteria andOpenStatusLessThanOrEqualTo(String value) {
            addCriterion("OPEN_STATUS <=", value, "openStatus");
            return (Criteria) this;
        }

        public Criteria andOpenStatusLike(String value) {
            addCriterion("OPEN_STATUS like", value, "openStatus");
            return (Criteria) this;
        }

        public Criteria andOpenStatusNotLike(String value) {
            addCriterion("OPEN_STATUS not like", value, "openStatus");
            return (Criteria) this;
        }

        public Criteria andOpenStatusIn(List<String> values) {
            addCriterion("OPEN_STATUS in", values, "openStatus");
            return (Criteria) this;
        }

        public Criteria andOpenStatusNotIn(List<String> values) {
            addCriterion("OPEN_STATUS not in", values, "openStatus");
            return (Criteria) this;
        }

        public Criteria andOpenStatusBetween(String value1, String value2) {
            addCriterion("OPEN_STATUS between", value1, value2, "openStatus");
            return (Criteria) this;
        }

        public Criteria andOpenStatusNotBetween(String value1, String value2) {
            addCriterion("OPEN_STATUS not between", value1, value2, "openStatus");
            return (Criteria) this;
        }

        public Criteria andFontFromIsNull() {
            addCriterion("FONT_FROM is null");
            return (Criteria) this;
        }

        public Criteria andFontFromIsNotNull() {
            addCriterion("FONT_FROM is not null");
            return (Criteria) this;
        }

        public Criteria andFontFromEqualTo(String value) {
            addCriterion("FONT_FROM =", value, "fontFrom");
            return (Criteria) this;
        }

        public Criteria andFontFromNotEqualTo(String value) {
            addCriterion("FONT_FROM <>", value, "fontFrom");
            return (Criteria) this;
        }

        public Criteria andFontFromGreaterThan(String value) {
            addCriterion("FONT_FROM >", value, "fontFrom");
            return (Criteria) this;
        }

        public Criteria andFontFromGreaterThanOrEqualTo(String value) {
            addCriterion("FONT_FROM >=", value, "fontFrom");
            return (Criteria) this;
        }

        public Criteria andFontFromLessThan(String value) {
            addCriterion("FONT_FROM <", value, "fontFrom");
            return (Criteria) this;
        }

        public Criteria andFontFromLessThanOrEqualTo(String value) {
            addCriterion("FONT_FROM <=", value, "fontFrom");
            return (Criteria) this;
        }

        public Criteria andFontFromLike(String value) {
            addCriterion("FONT_FROM like", value, "fontFrom");
            return (Criteria) this;
        }

        public Criteria andFontFromNotLike(String value) {
            addCriterion("FONT_FROM not like", value, "fontFrom");
            return (Criteria) this;
        }

        public Criteria andFontFromIn(List<String> values) {
            addCriterion("FONT_FROM in", values, "fontFrom");
            return (Criteria) this;
        }

        public Criteria andFontFromNotIn(List<String> values) {
            addCriterion("FONT_FROM not in", values, "fontFrom");
            return (Criteria) this;
        }

        public Criteria andFontFromBetween(String value1, String value2) {
            addCriterion("FONT_FROM between", value1, value2, "fontFrom");
            return (Criteria) this;
        }

        public Criteria andFontFromNotBetween(String value1, String value2) {
            addCriterion("FONT_FROM not between", value1, value2, "fontFrom");
            return (Criteria) this;
        }

        public Criteria andFontClientIdIsNull() {
            addCriterion("FONT_CLIENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andFontClientIdIsNotNull() {
            addCriterion("FONT_CLIENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFontClientIdEqualTo(String value) {
            addCriterion("FONT_CLIENT_ID =", value, "fontClientId");
            return (Criteria) this;
        }

        public Criteria andFontClientIdNotEqualTo(String value) {
            addCriterion("FONT_CLIENT_ID <>", value, "fontClientId");
            return (Criteria) this;
        }

        public Criteria andFontClientIdGreaterThan(String value) {
            addCriterion("FONT_CLIENT_ID >", value, "fontClientId");
            return (Criteria) this;
        }

        public Criteria andFontClientIdGreaterThanOrEqualTo(String value) {
            addCriterion("FONT_CLIENT_ID >=", value, "fontClientId");
            return (Criteria) this;
        }

        public Criteria andFontClientIdLessThan(String value) {
            addCriterion("FONT_CLIENT_ID <", value, "fontClientId");
            return (Criteria) this;
        }

        public Criteria andFontClientIdLessThanOrEqualTo(String value) {
            addCriterion("FONT_CLIENT_ID <=", value, "fontClientId");
            return (Criteria) this;
        }

        public Criteria andFontClientIdLike(String value) {
            addCriterion("FONT_CLIENT_ID like", value, "fontClientId");
            return (Criteria) this;
        }

        public Criteria andFontClientIdNotLike(String value) {
            addCriterion("FONT_CLIENT_ID not like", value, "fontClientId");
            return (Criteria) this;
        }

        public Criteria andFontClientIdIn(List<String> values) {
            addCriterion("FONT_CLIENT_ID in", values, "fontClientId");
            return (Criteria) this;
        }

        public Criteria andFontClientIdNotIn(List<String> values) {
            addCriterion("FONT_CLIENT_ID not in", values, "fontClientId");
            return (Criteria) this;
        }

        public Criteria andFontClientIdBetween(String value1, String value2) {
            addCriterion("FONT_CLIENT_ID between", value1, value2, "fontClientId");
            return (Criteria) this;
        }

        public Criteria andFontClientIdNotBetween(String value1, String value2) {
            addCriterion("FONT_CLIENT_ID not between", value1, value2, "fontClientId");
            return (Criteria) this;
        }

        public Criteria andIsWebRecommentIsNull() {
            addCriterion("IS_WEB_RECOMMENT is null");
            return (Criteria) this;
        }

        public Criteria andIsWebRecommentIsNotNull() {
            addCriterion("IS_WEB_RECOMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andIsWebRecommentEqualTo(String value) {
            addCriterion("IS_WEB_RECOMMENT =", value, "isWebRecomment");
            return (Criteria) this;
        }

        public Criteria andIsWebRecommentNotEqualTo(String value) {
            addCriterion("IS_WEB_RECOMMENT <>", value, "isWebRecomment");
            return (Criteria) this;
        }

        public Criteria andIsWebRecommentGreaterThan(String value) {
            addCriterion("IS_WEB_RECOMMENT >", value, "isWebRecomment");
            return (Criteria) this;
        }

        public Criteria andIsWebRecommentGreaterThanOrEqualTo(String value) {
            addCriterion("IS_WEB_RECOMMENT >=", value, "isWebRecomment");
            return (Criteria) this;
        }

        public Criteria andIsWebRecommentLessThan(String value) {
            addCriterion("IS_WEB_RECOMMENT <", value, "isWebRecomment");
            return (Criteria) this;
        }

        public Criteria andIsWebRecommentLessThanOrEqualTo(String value) {
            addCriterion("IS_WEB_RECOMMENT <=", value, "isWebRecomment");
            return (Criteria) this;
        }

        public Criteria andIsWebRecommentLike(String value) {
            addCriterion("IS_WEB_RECOMMENT like", value, "isWebRecomment");
            return (Criteria) this;
        }

        public Criteria andIsWebRecommentNotLike(String value) {
            addCriterion("IS_WEB_RECOMMENT not like", value, "isWebRecomment");
            return (Criteria) this;
        }

        public Criteria andIsWebRecommentIn(List<String> values) {
            addCriterion("IS_WEB_RECOMMENT in", values, "isWebRecomment");
            return (Criteria) this;
        }

        public Criteria andIsWebRecommentNotIn(List<String> values) {
            addCriterion("IS_WEB_RECOMMENT not in", values, "isWebRecomment");
            return (Criteria) this;
        }

        public Criteria andIsWebRecommentBetween(String value1, String value2) {
            addCriterion("IS_WEB_RECOMMENT between", value1, value2, "isWebRecomment");
            return (Criteria) this;
        }

        public Criteria andIsWebRecommentNotBetween(String value1, String value2) {
            addCriterion("IS_WEB_RECOMMENT not between", value1, value2, "isWebRecomment");
            return (Criteria) this;
        }

        public Criteria andWebRecommentLabelIsNull() {
            addCriterion("WEB_RECOMMENT_LABEL is null");
            return (Criteria) this;
        }

        public Criteria andWebRecommentLabelIsNotNull() {
            addCriterion("WEB_RECOMMENT_LABEL is not null");
            return (Criteria) this;
        }

        public Criteria andWebRecommentLabelEqualTo(String value) {
            addCriterion("WEB_RECOMMENT_LABEL =", value, "webRecommentLabel");
            return (Criteria) this;
        }

        public Criteria andWebRecommentLabelNotEqualTo(String value) {
            addCriterion("WEB_RECOMMENT_LABEL <>", value, "webRecommentLabel");
            return (Criteria) this;
        }

        public Criteria andWebRecommentLabelGreaterThan(String value) {
            addCriterion("WEB_RECOMMENT_LABEL >", value, "webRecommentLabel");
            return (Criteria) this;
        }

        public Criteria andWebRecommentLabelGreaterThanOrEqualTo(String value) {
            addCriterion("WEB_RECOMMENT_LABEL >=", value, "webRecommentLabel");
            return (Criteria) this;
        }

        public Criteria andWebRecommentLabelLessThan(String value) {
            addCriterion("WEB_RECOMMENT_LABEL <", value, "webRecommentLabel");
            return (Criteria) this;
        }

        public Criteria andWebRecommentLabelLessThanOrEqualTo(String value) {
            addCriterion("WEB_RECOMMENT_LABEL <=", value, "webRecommentLabel");
            return (Criteria) this;
        }

        public Criteria andWebRecommentLabelLike(String value) {
            addCriterion("WEB_RECOMMENT_LABEL like", value, "webRecommentLabel");
            return (Criteria) this;
        }

        public Criteria andWebRecommentLabelNotLike(String value) {
            addCriterion("WEB_RECOMMENT_LABEL not like", value, "webRecommentLabel");
            return (Criteria) this;
        }

        public Criteria andWebRecommentLabelIn(List<String> values) {
            addCriterion("WEB_RECOMMENT_LABEL in", values, "webRecommentLabel");
            return (Criteria) this;
        }

        public Criteria andWebRecommentLabelNotIn(List<String> values) {
            addCriterion("WEB_RECOMMENT_LABEL not in", values, "webRecommentLabel");
            return (Criteria) this;
        }

        public Criteria andWebRecommentLabelBetween(String value1, String value2) {
            addCriterion("WEB_RECOMMENT_LABEL between", value1, value2, "webRecommentLabel");
            return (Criteria) this;
        }

        public Criteria andWebRecommentLabelNotBetween(String value1, String value2) {
            addCriterion("WEB_RECOMMENT_LABEL not between", value1, value2, "webRecommentLabel");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("LEVEL =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("LEVEL <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("LEVEL >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("LEVEL <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("LEVEL <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("LEVEL like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("LEVEL not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("LEVEL in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("LEVEL not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("LEVEL between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("LEVEL not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andFormaterIsNull() {
            addCriterion("FORMATER is null");
            return (Criteria) this;
        }

        public Criteria andFormaterIsNotNull() {
            addCriterion("FORMATER is not null");
            return (Criteria) this;
        }

        public Criteria andFormaterEqualTo(String value) {
            addCriterion("FORMATER =", value, "formater");
            return (Criteria) this;
        }

        public Criteria andFormaterNotEqualTo(String value) {
            addCriterion("FORMATER <>", value, "formater");
            return (Criteria) this;
        }

        public Criteria andFormaterGreaterThan(String value) {
            addCriterion("FORMATER >", value, "formater");
            return (Criteria) this;
        }

        public Criteria andFormaterGreaterThanOrEqualTo(String value) {
            addCriterion("FORMATER >=", value, "formater");
            return (Criteria) this;
        }

        public Criteria andFormaterLessThan(String value) {
            addCriterion("FORMATER <", value, "formater");
            return (Criteria) this;
        }

        public Criteria andFormaterLessThanOrEqualTo(String value) {
            addCriterion("FORMATER <=", value, "formater");
            return (Criteria) this;
        }

        public Criteria andFormaterLike(String value) {
            addCriterion("FORMATER like", value, "formater");
            return (Criteria) this;
        }

        public Criteria andFormaterNotLike(String value) {
            addCriterion("FORMATER not like", value, "formater");
            return (Criteria) this;
        }

        public Criteria andFormaterIn(List<String> values) {
            addCriterion("FORMATER in", values, "formater");
            return (Criteria) this;
        }

        public Criteria andFormaterNotIn(List<String> values) {
            addCriterion("FORMATER not in", values, "formater");
            return (Criteria) this;
        }

        public Criteria andFormaterBetween(String value1, String value2) {
            addCriterion("FORMATER between", value1, value2, "formater");
            return (Criteria) this;
        }

        public Criteria andFormaterNotBetween(String value1, String value2) {
            addCriterion("FORMATER not between", value1, value2, "formater");
            return (Criteria) this;
        }

        public Criteria andFontModeIsNull() {
            addCriterion("FONT_MODE is null");
            return (Criteria) this;
        }

        public Criteria andFontModeIsNotNull() {
            addCriterion("FONT_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andFontModeEqualTo(String value) {
            addCriterion("FONT_MODE =", value, "fontMode");
            return (Criteria) this;
        }

        public Criteria andFontModeNotEqualTo(String value) {
            addCriterion("FONT_MODE <>", value, "fontMode");
            return (Criteria) this;
        }

        public Criteria andFontModeGreaterThan(String value) {
            addCriterion("FONT_MODE >", value, "fontMode");
            return (Criteria) this;
        }

        public Criteria andFontModeGreaterThanOrEqualTo(String value) {
            addCriterion("FONT_MODE >=", value, "fontMode");
            return (Criteria) this;
        }

        public Criteria andFontModeLessThan(String value) {
            addCriterion("FONT_MODE <", value, "fontMode");
            return (Criteria) this;
        }

        public Criteria andFontModeLessThanOrEqualTo(String value) {
            addCriterion("FONT_MODE <=", value, "fontMode");
            return (Criteria) this;
        }

        public Criteria andFontModeLike(String value) {
            addCriterion("FONT_MODE like", value, "fontMode");
            return (Criteria) this;
        }

        public Criteria andFontModeNotLike(String value) {
            addCriterion("FONT_MODE not like", value, "fontMode");
            return (Criteria) this;
        }

        public Criteria andFontModeIn(List<String> values) {
            addCriterion("FONT_MODE in", values, "fontMode");
            return (Criteria) this;
        }

        public Criteria andFontModeNotIn(List<String> values) {
            addCriterion("FONT_MODE not in", values, "fontMode");
            return (Criteria) this;
        }

        public Criteria andFontModeBetween(String value1, String value2) {
            addCriterion("FONT_MODE between", value1, value2, "fontMode");
            return (Criteria) this;
        }

        public Criteria andFontModeNotBetween(String value1, String value2) {
            addCriterion("FONT_MODE not between", value1, value2, "fontMode");
            return (Criteria) this;
        }

        public Criteria andFontCodeIsNull() {
            addCriterion("FONT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFontCodeIsNotNull() {
            addCriterion("FONT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFontCodeEqualTo(String value) {
            addCriterion("FONT_CODE =", value, "fontCode");
            return (Criteria) this;
        }

        public Criteria andFontCodeNotEqualTo(String value) {
            addCriterion("FONT_CODE <>", value, "fontCode");
            return (Criteria) this;
        }

        public Criteria andFontCodeGreaterThan(String value) {
            addCriterion("FONT_CODE >", value, "fontCode");
            return (Criteria) this;
        }

        public Criteria andFontCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FONT_CODE >=", value, "fontCode");
            return (Criteria) this;
        }

        public Criteria andFontCodeLessThan(String value) {
            addCriterion("FONT_CODE <", value, "fontCode");
            return (Criteria) this;
        }

        public Criteria andFontCodeLessThanOrEqualTo(String value) {
            addCriterion("FONT_CODE <=", value, "fontCode");
            return (Criteria) this;
        }

        public Criteria andFontCodeLike(String value) {
            addCriterion("FONT_CODE like", value, "fontCode");
            return (Criteria) this;
        }

        public Criteria andFontCodeNotLike(String value) {
            addCriterion("FONT_CODE not like", value, "fontCode");
            return (Criteria) this;
        }

        public Criteria andFontCodeIn(List<String> values) {
            addCriterion("FONT_CODE in", values, "fontCode");
            return (Criteria) this;
        }

        public Criteria andFontCodeNotIn(List<String> values) {
            addCriterion("FONT_CODE not in", values, "fontCode");
            return (Criteria) this;
        }

        public Criteria andFontCodeBetween(String value1, String value2) {
            addCriterion("FONT_CODE between", value1, value2, "fontCode");
            return (Criteria) this;
        }

        public Criteria andFontCodeNotBetween(String value1, String value2) {
            addCriterion("FONT_CODE not between", value1, value2, "fontCode");
            return (Criteria) this;
        }

        public Criteria andThicknessIsNull() {
            addCriterion("THICKNESS is null");
            return (Criteria) this;
        }

        public Criteria andThicknessIsNotNull() {
            addCriterion("THICKNESS is not null");
            return (Criteria) this;
        }

        public Criteria andThicknessEqualTo(String value) {
            addCriterion("THICKNESS =", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessNotEqualTo(String value) {
            addCriterion("THICKNESS <>", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessGreaterThan(String value) {
            addCriterion("THICKNESS >", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessGreaterThanOrEqualTo(String value) {
            addCriterion("THICKNESS >=", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessLessThan(String value) {
            addCriterion("THICKNESS <", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessLessThanOrEqualTo(String value) {
            addCriterion("THICKNESS <=", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessLike(String value) {
            addCriterion("THICKNESS like", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessNotLike(String value) {
            addCriterion("THICKNESS not like", value, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessIn(List<String> values) {
            addCriterion("THICKNESS in", values, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessNotIn(List<String> values) {
            addCriterion("THICKNESS not in", values, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessBetween(String value1, String value2) {
            addCriterion("THICKNESS between", value1, value2, "thickness");
            return (Criteria) this;
        }

        public Criteria andThicknessNotBetween(String value1, String value2) {
            addCriterion("THICKNESS not between", value1, value2, "thickness");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("CHANNEL =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("CHANNEL <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("CHANNEL >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("CHANNEL <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("CHANNEL like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("CHANNEL not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("CHANNEL in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("CHANNEL not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("CHANNEL between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("CHANNEL not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andClientParentIdIsNull() {
            addCriterion("CLIENT_PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andClientParentIdIsNotNull() {
            addCriterion("CLIENT_PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andClientParentIdEqualTo(String value) {
            addCriterion("CLIENT_PARENT_ID =", value, "clientParentId");
            return (Criteria) this;
        }

        public Criteria andClientParentIdNotEqualTo(String value) {
            addCriterion("CLIENT_PARENT_ID <>", value, "clientParentId");
            return (Criteria) this;
        }

        public Criteria andClientParentIdGreaterThan(String value) {
            addCriterion("CLIENT_PARENT_ID >", value, "clientParentId");
            return (Criteria) this;
        }

        public Criteria andClientParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENT_PARENT_ID >=", value, "clientParentId");
            return (Criteria) this;
        }

        public Criteria andClientParentIdLessThan(String value) {
            addCriterion("CLIENT_PARENT_ID <", value, "clientParentId");
            return (Criteria) this;
        }

        public Criteria andClientParentIdLessThanOrEqualTo(String value) {
            addCriterion("CLIENT_PARENT_ID <=", value, "clientParentId");
            return (Criteria) this;
        }

        public Criteria andClientParentIdLike(String value) {
            addCriterion("CLIENT_PARENT_ID like", value, "clientParentId");
            return (Criteria) this;
        }

        public Criteria andClientParentIdNotLike(String value) {
            addCriterion("CLIENT_PARENT_ID not like", value, "clientParentId");
            return (Criteria) this;
        }

        public Criteria andClientParentIdIn(List<String> values) {
            addCriterion("CLIENT_PARENT_ID in", values, "clientParentId");
            return (Criteria) this;
        }

        public Criteria andClientParentIdNotIn(List<String> values) {
            addCriterion("CLIENT_PARENT_ID not in", values, "clientParentId");
            return (Criteria) this;
        }

        public Criteria andClientParentIdBetween(String value1, String value2) {
            addCriterion("CLIENT_PARENT_ID between", value1, value2, "clientParentId");
            return (Criteria) this;
        }

        public Criteria andClientParentIdNotBetween(String value1, String value2) {
            addCriterion("CLIENT_PARENT_ID not between", value1, value2, "clientParentId");
            return (Criteria) this;
        }

        public Criteria andRootIdIsNull() {
            addCriterion("ROOT_ID is null");
            return (Criteria) this;
        }

        public Criteria andRootIdIsNotNull() {
            addCriterion("ROOT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRootIdEqualTo(String value) {
            addCriterion("ROOT_ID =", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdNotEqualTo(String value) {
            addCriterion("ROOT_ID <>", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdGreaterThan(String value) {
            addCriterion("ROOT_ID >", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdGreaterThanOrEqualTo(String value) {
            addCriterion("ROOT_ID >=", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdLessThan(String value) {
            addCriterion("ROOT_ID <", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdLessThanOrEqualTo(String value) {
            addCriterion("ROOT_ID <=", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdLike(String value) {
            addCriterion("ROOT_ID like", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdNotLike(String value) {
            addCriterion("ROOT_ID not like", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdIn(List<String> values) {
            addCriterion("ROOT_ID in", values, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdNotIn(List<String> values) {
            addCriterion("ROOT_ID not in", values, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdBetween(String value1, String value2) {
            addCriterion("ROOT_ID between", value1, value2, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdNotBetween(String value1, String value2) {
            addCriterion("ROOT_ID not between", value1, value2, "rootId");
            return (Criteria) this;
        }

        public Criteria andFontCloudIdIsNull() {
            addCriterion("FONT_CLOUD_ID is null");
            return (Criteria) this;
        }

        public Criteria andFontCloudIdIsNotNull() {
            addCriterion("FONT_CLOUD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFontCloudIdEqualTo(String value) {
            addCriterion("FONT_CLOUD_ID =", value, "fontCloudId");
            return (Criteria) this;
        }

        public Criteria andFontCloudIdNotEqualTo(String value) {
            addCriterion("FONT_CLOUD_ID <>", value, "fontCloudId");
            return (Criteria) this;
        }

        public Criteria andFontCloudIdGreaterThan(String value) {
            addCriterion("FONT_CLOUD_ID >", value, "fontCloudId");
            return (Criteria) this;
        }

        public Criteria andFontCloudIdGreaterThanOrEqualTo(String value) {
            addCriterion("FONT_CLOUD_ID >=", value, "fontCloudId");
            return (Criteria) this;
        }

        public Criteria andFontCloudIdLessThan(String value) {
            addCriterion("FONT_CLOUD_ID <", value, "fontCloudId");
            return (Criteria) this;
        }

        public Criteria andFontCloudIdLessThanOrEqualTo(String value) {
            addCriterion("FONT_CLOUD_ID <=", value, "fontCloudId");
            return (Criteria) this;
        }

        public Criteria andFontCloudIdLike(String value) {
            addCriterion("FONT_CLOUD_ID like", value, "fontCloudId");
            return (Criteria) this;
        }

        public Criteria andFontCloudIdNotLike(String value) {
            addCriterion("FONT_CLOUD_ID not like", value, "fontCloudId");
            return (Criteria) this;
        }

        public Criteria andFontCloudIdIn(List<String> values) {
            addCriterion("FONT_CLOUD_ID in", values, "fontCloudId");
            return (Criteria) this;
        }

        public Criteria andFontCloudIdNotIn(List<String> values) {
            addCriterion("FONT_CLOUD_ID not in", values, "fontCloudId");
            return (Criteria) this;
        }

        public Criteria andFontCloudIdBetween(String value1, String value2) {
            addCriterion("FONT_CLOUD_ID between", value1, value2, "fontCloudId");
            return (Criteria) this;
        }

        public Criteria andFontCloudIdNotBetween(String value1, String value2) {
            addCriterion("FONT_CLOUD_ID not between", value1, value2, "fontCloudId");
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