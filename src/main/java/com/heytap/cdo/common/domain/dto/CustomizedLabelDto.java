package com.heytap.cdo.common.domain.dto;


import io.protostuff.Tag;

public class CustomizedLabelDto {
    @Tag(2)
    private String f90121color;
    @Tag(3)
    private String text;
    @Tag(1)
    private String type;

    public String getColor() {
        return this.f90121color;
    }

    public String getText() {
        return this.text;
    }

    public String getType() {
        return this.type;
    }

    public void setColor(String color2) {
        this.f90121color = color2;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return "CustomizedLabelDto{type='" + this.type + "', color='" + this.f90121color + "', text='" + this.text + "'}";
    }
}