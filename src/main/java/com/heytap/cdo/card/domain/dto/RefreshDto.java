package com.heytap.cdo.card.domain.dto;

import io.protostuff.Tag;

public class RefreshDto {
    @Tag(1)
    private int refreshExt;
    @Tag(2)
    private boolean upRefresh;
    @Tag(5)
    private String upRefreshImage;
    @Tag(4)
    private int upRefreshImageType;
    @Tag(3)
    private int upRefreshThreshold;

    public int getRefreshExt() {
        return this.refreshExt;
    }

    public String getUpRefreshImage() {
        return this.upRefreshImage;
    }

    public int getUpRefreshImageType() {
        return this.upRefreshImageType;
    }

    public int getUpRefreshThreshold() {
        return this.upRefreshThreshold;
    }

    public boolean isUpRefresh() {
        return this.upRefresh;
    }

    public void setRefreshExt(int refreshExt) {
        this.refreshExt = refreshExt;
    }

    public void setUpRefresh(boolean upRefresh) {
        this.upRefresh = upRefresh;
    }

    public void setUpRefreshImage(String upRefreshImage) {
        this.upRefreshImage = upRefreshImage;
    }

    public void setUpRefreshImageType(int upRefreshImageType) {
        this.upRefreshImageType = upRefreshImageType;
    }

    public void setUpRefreshThreshold(int upRefreshThreshold) {
        this.upRefreshThreshold = upRefreshThreshold;
    }

    public String toString() {
        return "RefreshDto{refreshExt=" + this.refreshExt + ", upRefresh=" + this.upRefresh + ", upRefreshThreshold=" + this.upRefreshThreshold + ", upRefreshImageType=" + this.upRefreshImageType + ", upRefreshImage='" + this.upRefreshImage + "'}";
    }
}