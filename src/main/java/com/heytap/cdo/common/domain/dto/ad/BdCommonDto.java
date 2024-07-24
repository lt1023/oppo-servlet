package com.heytap.cdo.common.domain.dto.ad;
import io.protostuff.Tag;
import java.util.Map;

public class BdCommonDto {
    @Tag(1)
    private long adId;
    @Tag(4)
    private Map<String, String> ext;
    @Tag(2)
    private String posId;
    @Tag(3)
    public Integer type;

    public long getAdId() {
        return this.adId;
    }

    public Map<String, String> getExt() {
        return this.ext;
    }

    public String getPosId() {
        return this.posId;
    }

    public int getType() {
        return this.type.intValue();
    }

    public void setAdId(long adId) {
        this.adId = adId;
    }

    public void setExt(Map<String, String> ext) {
        this.ext = ext;
    }

    public void setPosId(String posId) {
        this.posId = posId;
    }

    public void setType(int type) {
        this.type = Integer.valueOf(type);
    }

    public String toString() {
        return "BdCommonDto{adId=" + this.adId + ", posId='" + this.posId + "', type=" + this.type + ", ext=" + this.ext + ", type=" + this.type + '}';
    }
}