package com.heytap.cdo.common.domain.dto;

import io.protostuff.Tag;
import java.util.HashMap;
import java.util.Map;

public class InstantDto extends AppInheritDto {
    @Tag(17)
    private String adContent;
    @Tag(15)
    private int adId;
    @Tag(16)
    private String adPos;
    @Tag(18)
    private String adTraceId;
    @Tag(9)
    private String checksum;
    @Tag(7)
    private String description;
    @Tag(10)
    private String iconUrl;
    @Tag(1)
    private long id;
    @Tag(8)
    private String md5;
    @Tag(2)
    private String name;
    @Tag(12)
    private long onlineTime;
    @Tag(3)
    private String pkgName;
    @Tag(11)
    private long size;
    @Tag(19)
    private Map<String, String> stat;
    @Tag(14)
    private int state;
    @Tag(13)
    private String url;
    @Tag(5)
    private long vCode;
    @Tag(4)
    private long vId;
    @Tag(6)
    private String vName;

    public String getAdContent() {
        return this.adContent;
    }

    public int getAdId() {
        return this.adId;
    }

    public String getAdPos() {
        return this.adPos;
    }

    public String getAdTraceId() {
        return this.adTraceId;
    }

    public String getChecksum() {
        return this.checksum;
    }

    public String getDescription() {
        return this.description;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public long getId() {
        return this.id;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getName() {
        return this.name;
    }

    public long getOnlineTime() {
        return this.onlineTime;
    }

    public String getPkgName() {
        return this.pkgName;
    }

    public long getSize() {
        return this.size;
    }

    public String getSrcKey() {
        Map<String, String> map = this.stat;
        if (map != null) {
            return map.get("source_key");
        }
        return null;
    }

    public Map<String, String> getStat() {
        return this.stat;
    }

    public int getState() {
        return this.state;
    }

    public String getUrl() {
        return this.url;
    }

    public long getvCode() {
        return this.vCode;
    }

    public long getvId() {
        return this.vId;
    }

    public String getvName() {
        return this.vName;
    }

    public void setAdContent(String adContent) {
        this.adContent = adContent;
    }

    public void setAdId(int adId) {
        this.adId = adId;
    }

    public void setAdPos(String adPos) {
        this.adPos = adPos;
    }

    public void setAdTraceId(String adTraceId) {
        this.adTraceId = adTraceId;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOnlineTime(long onlineTime) {
        this.onlineTime = onlineTime;
    }

    public void setPkgName(String pkgName) {
        this.pkgName = pkgName;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public void setSrcKey(String srcKey) {
        if (this.stat == null) {
            this.stat = new HashMap();
        }
        this.stat.put("source_key", srcKey);
    }

    public void setStat(Map<String, String> stat) {
        this.stat = stat;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setvCode(long vCode) {
        this.vCode = vCode;
    }

    public void setvId(long vId) {
        this.vId = vId;
    }

    public void setvName(String vName) {
        this.vName = vName;
    }

    @Override
    public String toString() {
        return "InstantDto{id=" + this.id + ", name='" + this.name + "', pkgName='" + this.pkgName + "', vId=" + this.vId + ", vCode=" + this.vCode + ", vName='" + this.vName + "', description='" + this.description + "', md5='" + this.md5 + "', checksum='" + this.checksum + "', iconUrl='" + this.iconUrl + "', size=" + this.size + ", onlineTime=" + this.onlineTime + ", url='" + this.url + "', state=" + this.state + ", adId=" + this.adId + ", adPos='" + this.adPos + "', adContent='" + this.adContent + "', adTraceId='" + this.adTraceId + "', stat=" + this.stat + '}';
    }
}