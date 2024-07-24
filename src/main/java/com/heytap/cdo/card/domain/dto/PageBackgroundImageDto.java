package com.heytap.cdo.card.domain.dto;

import io.protostuff.Tag;

public class PageBackgroundImageDto {
    @Tag(2)
    public String darkBackgroundImg;
    @Tag(4)
    public String darkTextColor;
    @Tag(5)
    public String gradientStartColor;
    @Tag(6)
    public String gradientTextColor;
    @Tag(1)
    public String lightBackgroundImg;
    @Tag(3)
    public String lightTextColor;

    public String getDarkBackgroundImg() {
        return this.darkBackgroundImg;
    }

    public String getDarkTextColor() {
        return this.darkTextColor;
    }

    public String getGradientStartColor() {
        return this.gradientStartColor;
    }

    public String getGradientTextColor() {
        return this.gradientTextColor;
    }

    public String getLightBackgroundImg() {
        return this.lightBackgroundImg;
    }

    public String getLightTextColor() {
        return this.lightTextColor;
    }

    public void setDarkBackgroundImg(String darkBackgroundImg) {
        this.darkBackgroundImg = darkBackgroundImg;
    }

    public void setDarkTextColor(String darkTextColor) {
        this.darkTextColor = darkTextColor;
    }

    public void setGradientStartColor(String gradientStartColor) {
        this.gradientStartColor = gradientStartColor;
    }

    public void setGradientTextColor(String gradientTextColor) {
        this.gradientTextColor = gradientTextColor;
    }

    public void setLightBackgroundImg(String lightBackgroundImg) {
        this.lightBackgroundImg = lightBackgroundImg;
    }

    public void setLightTextColor(String lightTextColor) {
        this.lightTextColor = lightTextColor;
    }

    public String toString() {
        return "PageBackgroundImageDto{lightBackgroundImg='" + this.lightBackgroundImg + "', darkBackgroundImg='" + this.darkBackgroundImg + "', lightTextColor='" + this.lightTextColor + "', darkTextColor='" + this.darkTextColor + "', gradientStartColor='" + this.gradientStartColor + "', gradientTextColor='" + this.gradientTextColor + "'}";
    }
}