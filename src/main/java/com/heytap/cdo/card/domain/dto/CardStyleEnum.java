package com.heytap.cdo.card.domain.dto;

public enum CardStyleEnum {
    V1_CARD_STYLE(100, "重构卡片旧样式"),
    V2_CARD_STYLE(200, "重构卡片新样式"),
    DEFAULT_CARD_STYLE(0, "默认卡片样式");

    private Integer code;
    private String desc;

    CardStyleEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "CardStyleEnum{code=" + this.code + ", desc='" + this.desc + "'}";
    }
}