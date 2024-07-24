package com.heytap.cdo.common.domain.dto;

import io.protostuff.Tag;

public class AppInheritDto {
    @Tag(1100)
    private int cooperateGameType;

    public int getCooperateGameType() {
        return this.cooperateGameType;
    }

    public void setCooperateGameType(int cooperateGameType) {
        this.cooperateGameType = cooperateGameType;
    }

    public String toString() {
        return "AppInheritDto{cooperateGameType=" + this.cooperateGameType + '}';
    }

}
