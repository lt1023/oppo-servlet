package com.heytap.cdo.card.domain.dto;

import io.protostuff.Tag;

public class StatConfigDto {
    @Tag(1)
    private int exposureSwitch = 0;

    public int getExposureSwitch() {
        return this.exposureSwitch;
    }

    public void setExposureSwitch(int exposureSwitch) {
        this.exposureSwitch = exposureSwitch;
    }
}