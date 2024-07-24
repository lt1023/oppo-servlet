package com.heytap.cdo.common.domain.dto.ad;
import io.protostuff.Tag;
import java.util.List;

public class TransAdInfoDto {
    @Tag(1)
    private long adId;
    @Tag(2)
    private String posId;
    @Tag(4)
    private List<TransAdInfoEventDto> transAdInfoEventDtos;
    @Tag(3)
    private String transparent;

    public long getAdId() {
        return this.adId;
    }

    public String getPosId() {
        return this.posId;
    }

    public List<TransAdInfoEventDto> getTransAdInfoEventDtos() {
        return this.transAdInfoEventDtos;
    }

    public String getTransparent() {
        return this.transparent;
    }

    public void setAdId(long adId) {
        this.adId = adId;
    }

    public void setPosId(String posId) {
        this.posId = posId;
    }

    public void setTransAdInfoEventDtos(List<TransAdInfoEventDto> transAdInfoEventDtos) {
        this.transAdInfoEventDtos = transAdInfoEventDtos;
    }

    public void setTransparent(String transparent) {
        this.transparent = transparent;
    }

    public String toString() {
        return "TransAdInfoDto{adId=" + this.adId + ", posId='" + this.posId + "', transparent='" + this.transparent + "', transAdInfoEventDtos=" + this.transAdInfoEventDtos + '}';
    }
}