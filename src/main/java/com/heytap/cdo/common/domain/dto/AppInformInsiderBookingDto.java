package com.heytap.cdo.common.domain.dto;

import io.protostuff.Tag;

public class AppInformInsiderBookingDto {
    @Tag(51)
    private int effectScene;

    public int getEffectScene() {
        return this.effectScene;
    }

    public void setEffectScene(int effectScene) {
        this.effectScene = effectScene;
    }
    @Override
    public String toString() {
        return "AppInformInsiderBookingDto{effectScene=" + this.effectScene + '}';
    }

}
