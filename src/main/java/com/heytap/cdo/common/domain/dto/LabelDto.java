package com.heytap.cdo.common.domain.dto;


import io.protostuff.Tag;

public class LabelDto {
    @Tag(3)
    private String color;
    @Tag(5)
    private String iconUrl;
    @Tag(1)
    private int id;
    @Tag(4)
    private String text;
    @Tag(2)
    private int type;

    public String getColor() {
        return this.color;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public int getId() {
        return this.id;
    }

    public String getText() {
        return this.text;
    }

    public int getType() {
        return this.type;
    }

    public void setColor(String color2) {
        this.color = color2;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String toString() {
        return "LabelDto{id=" + this.id + ", type=" + this.type + ", color='" + this.color + "', text='" + this.text + "', iconUrl='" + this.iconUrl + "'}";
    }
}