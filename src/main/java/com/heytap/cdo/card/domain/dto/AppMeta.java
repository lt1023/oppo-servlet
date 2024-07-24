package com.heytap.cdo.card.domain.dto;

import io.protostuff.Tag;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppMeta {
    @Tag(1)
    private long appId;
    @Tag(3)
    private Map<String, String> ext;
    @Tag(5)
    private ReRankAppMetaExt reRankAppMetaExt;
    @Tag(2)
    private String srcKey;
    @Tag(4)
    private Map<Integer, List<String>> trackLinks;

    public int getAdType() {
        String str;
        Map<String, String> map = this.ext;
        if (map == null || map.isEmpty() || (str = this.ext.get("adType")) == null) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public long getAdVersionCode() {
        Map<String, String> map = this.ext;
        if (map == null || map.isEmpty()) {
            return 0L;
        }
        return Long.parseLong(this.ext.get("adVersionCode"), 0);
    }

    public long getAppId() {
        return this.appId;
    }

    public String getAppName() {
        Map<String, String> map = this.ext;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return this.ext.get("appName");
    }

    public long getCpdId() {
        String str;
        Map<String, String> map = this.ext;
        if (map == null || map.isEmpty() || (str = this.ext.get("cpdId")) == null) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public String getCpdJson() {
        Map<String, String> map = this.ext;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return this.ext.get("cpdJson");
    }

    public String getDeepLink() {
        Map<String, String> map = this.ext;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return this.ext.get("deepLink");
    }

    public String getDesc() {
        Map<String, String> map = this.ext;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return this.ext.get("desc");
    }

    public String getDspAdId() {
        Map<String, String> map = this.ext;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return this.ext.get("dspAdId");
    }

    public String getDspSrc() {
        Map<String, String> map = this.ext;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return this.ext.get("dspSrc");
    }

    public String getExpTrans() {
        Map<String, String> map = this.ext;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return this.ext.get("expTrans");
    }

    public Map<String, String> getExt() {
        return this.ext;
    }

    public String getFallback() {
        Map<String, String> map = this.ext;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return this.ext.get("fallback");
    }

    public String getIcon() {
        Map<String, String> map = this.ext;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return this.ext.get("icon");
    }

    public String getIconId() {
        Map<String, String> map = this.ext;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return this.ext.get("iconId");
    }

    public String getItemType() {
        Map<String, String> map = this.ext;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return this.ext.get("itemType");
    }

    public String getJumpUrl() {
        Map<String, String> map = this.ext;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return this.ext.get("jumpUrl");
    }

    public String getPkg() {
        Map<String, String> map = this.ext;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return this.ext.get("pkg");
    }

    public ReRankAppMetaExt getReRankAppMetaExt() {
        return this.reRankAppMetaExt;
    }

    public String getRef() {
        Map<String, String> map = this.ext;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return this.ext.get("ref");
    }

    public String getResType() {
        Map<String, String> map = this.ext;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return this.ext.get("resType");
    }

    public String getSrcKey() {
        return this.srcKey;
    }

    public String getSubjectId() {
        Map<String, String> map = this.ext;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return this.ext.get("subjectId");
    }

    public int getSubtype() {
        Map<String, String> map = this.ext;
        if (map == null || map.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(this.ext.get("subtype"), 0);
    }

    public String getTemplateId() {
        Map<String, String> map = this.ext;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return this.ext.get("templateId");
    }

    public String getThirdChannelId() {
        Map<String, String> map = this.ext;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return this.ext.get("thirdChannelId");
    }

    public Map<Integer, List<String>> getTrackLinks() {
        return this.trackLinks;
    }

    public void setAdType(int adType) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put("adType", String.valueOf(adType));
    }

    public void setAdVersionCode(long adVersionCode) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put("adVersionCode", String.valueOf(adVersionCode));
    }

    public void setAppId(long appId) {
        this.appId = appId;
    }

    public void setAppName(String appName) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put("appName", appName);
    }

    public void setCpdId(long cpdId) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put("cpdId", String.valueOf(cpdId));
    }

    public void setCpdJson(String cpdJson) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put("cpdJson", cpdJson);
    }

    public void setDeepLink(String deepLink) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put("deepLink", deepLink);
    }

    public void setDesc(String desc) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put("desc", desc);
    }

    public void setDspAdId(String dspAdId) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put("dspAdId", dspAdId);
    }

    public void setDspSrc(int dspSrc) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put("dspSrc", String.valueOf(dspSrc));
    }

    public void setExpTrans(String expTrans) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put("expTrans", expTrans);
    }

    public void setExt(Map<String, String> ext) {
        this.ext = ext;
    }

    public void setFallback(int fallback) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put("fallback", String.valueOf(fallback));
    }

    public void setIcon(String icon) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put("icon", icon);
    }

    public void setIconId(String iconId) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put("iconId", iconId);
    }

    public void setItemType(String itemType) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put("itemType", itemType);
    }

    public void setJumpUrl(String jumpUrl) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put("jumpUrl", jumpUrl);
    }

    public void setPkg(String pkg) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put("pkg", pkg);
    }

    public void setReRankAppMetaExt(ReRankAppMetaExt reRankAppMetaExt) {
        this.reRankAppMetaExt = reRankAppMetaExt;
    }

    public void setRef(String ref) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put("ref", ref);
    }

    public void setResType(int resType) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put("resType", String.valueOf(resType));
    }

    public void setSrcKey(String srcKey) {
        this.srcKey = srcKey;
    }

    public void setSubjectId(int subjectId) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put("subjectId", String.valueOf(subjectId));
    }

    public void setSubtype(int adVersionCode) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put("subtype", String.valueOf(adVersionCode));
    }

    public void setTemplateId(int templateId) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put("templateId", String.valueOf(templateId));
    }

    public void setThirdChannelId(String thirdChannelId) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put("thirdChannelId", thirdChannelId);
    }

    public void setTrackLinks(Map<Integer, List<String>> trackLinks) {
        this.trackLinks = trackLinks;
    }

    public String toString() {
        return "AppMeta{appId=" + this.appId + ", srcKey='" + this.srcKey + "', ext=" + this.ext + ", trackLinks=" + this.trackLinks + ", reRankAppMetaExt=" + this.reRankAppMetaExt + '}';
    }
}