package com.heytap.cdo.card.domain.dto;

import io.protostuff.Tag;

public class ExtScreenDto {
    @Tag(1)
    private boolean guidance;
    @Tag(2)
    private long guidanceAppearanceTime;
    @Tag(5)
    private String guidanceImage;
    @Tag(4)
    private int guidanceImageType;
    @Tag(3)
    private int guidanceJumpThreshold;

    public long getGuidanceAppearanceTime() {
        return this.guidanceAppearanceTime;
    }

    public String getGuidanceImage() {
        return this.guidanceImage;
    }

    public int getGuidanceImageType() {
        return this.guidanceImageType;
    }

    public int getGuidanceJumpThreshold() {
        return this.guidanceJumpThreshold;
    }

    public boolean isGuidance() {
        return this.guidance;
    }

    public void setGuidance(boolean guidance) {
        this.guidance = guidance;
    }

    public void setGuidanceAppearanceTime(long guidanceAppearanceTime) {
        this.guidanceAppearanceTime = guidanceAppearanceTime;
    }

    public void setGuidanceImage(String guidanceImage) {
        this.guidanceImage = guidanceImage;
    }

    public void setGuidanceImageType(int guidanceImageType) {
        this.guidanceImageType = guidanceImageType;
    }

    public void setGuidanceJumpThreshold(int guidanceJumpThreshold) {
        this.guidanceJumpThreshold = guidanceJumpThreshold;
    }

    public String toString() {
        return "ExtScreenDto{guidance=" + this.guidance + ", guidanceAppearanceTime=" + this.guidanceAppearanceTime + ", guidanceJumpThreshold=" + this.guidanceJumpThreshold + ", guidanceImageType=" + this.guidanceImageType + ", guidanceImage='" + this.guidanceImage + "'}";
    }
}