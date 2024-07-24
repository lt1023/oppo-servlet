package com.heytap.cdo.common.domain.dto;

import io.protostuff.Tag;

public class RecDescriptionDto {
    @Tag(3)
    private String actionParam;
    @Tag(2)
    private String text;
    @Tag(1)
    private String type;

    public String getActionParam() {
        return this.actionParam;
    }

    public String getText() {
        return this.text;
    }

    public String getType() {
        return this.type;
    }

    public void setActionParam(String actionParam) {
        this.actionParam = actionParam;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return "RecDescriptionDto{type='" + this.type + "', text='" + this.text + "', actionParam='" + this.actionParam + "'}";
    }
}