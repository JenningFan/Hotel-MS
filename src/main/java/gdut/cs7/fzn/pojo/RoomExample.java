package gdut.cs7.fzn.pojo;

import java.util.ArrayList;
import java.util.List;

public class RoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andRoomNumIsNull() {
            addCriterion("room_num is null");
            return (Criteria) this;
        }

        public Criteria andRoomNumIsNotNull() {
            addCriterion("room_num is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNumEqualTo(Integer value) {
            addCriterion("room_num =", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumNotEqualTo(Integer value) {
            addCriterion("room_num <>", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumGreaterThan(Integer value) {
            addCriterion("room_num >", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_num >=", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumLessThan(Integer value) {
            addCriterion("room_num <", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumLessThanOrEqualTo(Integer value) {
            addCriterion("room_num <=", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumIn(List<Integer> values) {
            addCriterion("room_num in", values, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumNotIn(List<Integer> values) {
            addCriterion("room_num not in", values, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumBetween(Integer value1, Integer value2) {
            addCriterion("room_num between", value1, value2, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumNotBetween(Integer value1, Integer value2) {
            addCriterion("room_num not between", value1, value2, "roomNum");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andIsEmptyIsNull() {
            addCriterion("is_empty is null");
            return (Criteria) this;
        }

        public Criteria andIsEmptyIsNotNull() {
            addCriterion("is_empty is not null");
            return (Criteria) this;
        }

        public Criteria andIsEmptyEqualTo(Integer value) {
            addCriterion("is_empty =", value, "isEmpty");
            return (Criteria) this;
        }

        public Criteria andIsEmptyNotEqualTo(Integer value) {
            addCriterion("is_empty <>", value, "isEmpty");
            return (Criteria) this;
        }

        public Criteria andIsEmptyGreaterThan(Integer value) {
            addCriterion("is_empty >", value, "isEmpty");
            return (Criteria) this;
        }

        public Criteria andIsEmptyGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_empty >=", value, "isEmpty");
            return (Criteria) this;
        }

        public Criteria andIsEmptyLessThan(Integer value) {
            addCriterion("is_empty <", value, "isEmpty");
            return (Criteria) this;
        }

        public Criteria andIsEmptyLessThanOrEqualTo(Integer value) {
            addCriterion("is_empty <=", value, "isEmpty");
            return (Criteria) this;
        }

        public Criteria andIsEmptyIn(List<Integer> values) {
            addCriterion("is_empty in", values, "isEmpty");
            return (Criteria) this;
        }

        public Criteria andIsEmptyNotIn(List<Integer> values) {
            addCriterion("is_empty not in", values, "isEmpty");
            return (Criteria) this;
        }

        public Criteria andIsEmptyBetween(Integer value1, Integer value2) {
            addCriterion("is_empty between", value1, value2, "isEmpty");
            return (Criteria) this;
        }

        public Criteria andIsEmptyNotBetween(Integer value1, Integer value2) {
            addCriterion("is_empty not between", value1, value2, "isEmpty");
            return (Criteria) this;
        }

        public Criteria andIsOrderIsNull() {
            addCriterion("is_order is null");
            return (Criteria) this;
        }

        public Criteria andIsOrderIsNotNull() {
            addCriterion("is_order is not null");
            return (Criteria) this;
        }

        public Criteria andIsOrderEqualTo(Integer value) {
            addCriterion("is_order =", value, "isOrder");
            return (Criteria) this;
        }

        public Criteria andIsOrderNotEqualTo(Integer value) {
            addCriterion("is_order <>", value, "isOrder");
            return (Criteria) this;
        }

        public Criteria andIsOrderGreaterThan(Integer value) {
            addCriterion("is_order >", value, "isOrder");
            return (Criteria) this;
        }

        public Criteria andIsOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_order >=", value, "isOrder");
            return (Criteria) this;
        }

        public Criteria andIsOrderLessThan(Integer value) {
            addCriterion("is_order <", value, "isOrder");
            return (Criteria) this;
        }

        public Criteria andIsOrderLessThanOrEqualTo(Integer value) {
            addCriterion("is_order <=", value, "isOrder");
            return (Criteria) this;
        }

        public Criteria andIsOrderIn(List<Integer> values) {
            addCriterion("is_order in", values, "isOrder");
            return (Criteria) this;
        }

        public Criteria andIsOrderNotIn(List<Integer> values) {
            addCriterion("is_order not in", values, "isOrder");
            return (Criteria) this;
        }

        public Criteria andIsOrderBetween(Integer value1, Integer value2) {
            addCriterion("is_order between", value1, value2, "isOrder");
            return (Criteria) this;
        }

        public Criteria andIsOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("is_order not between", value1, value2, "isOrder");
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