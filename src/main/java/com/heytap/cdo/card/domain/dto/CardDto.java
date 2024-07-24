package com.heytap.cdo.card.domain.dto;

import io.protostuff.Tag;
import java.util.HashMap;
import java.util.Map;

public class CardDto {
    @Tag(4)
    private String actionParam;
    @Tag(3)
    private String actionType;
    @Tag(1)
    private int code;
    @Tag(5)
    private int cornerLabel;
    @Tag(6)
    private Map<String, Object> ext;
    @Tag(2)
    private int key;
    @Tag(7)
    private Map<String, String> stat;

    public String getActionParam() {
        return this.actionParam;
    }

    public String getActionType() {
        return this.actionType;
    }

    public int getButtonHidden() {
        Object obj;
        Map<String, Object> map = this.ext;
        if (map == null || (obj = map.get("buttonHidden")) == null) {
            return 0;
        }
        return ((Integer) obj).intValue();
    }

    public Integer getCardStyle() {
        Map<String, Object> map = this.ext;
        if (map == null) {
            return CardStyleEnum.DEFAULT_CARD_STYLE.getCode();
        }
        Object obj = map.get("cardStyle");
        if (obj == null) {
            return CardStyleEnum.DEFAULT_CARD_STYLE.getCode();
        }
        return (Integer) obj;
    }

    public int getCode() {
        return this.code;
    }

    public int getContentType() {
        Map<String, Object> ext = getExt();
        if (ext == null || ext.get(ev0.f2877) == null) {
            return 0;
        }
        return ((Integer) ext.get(ev0.f2877)).intValue();
    }

    public int getCornerLabel() {
        return this.cornerLabel;
    }

    public String getCpdReportSource() {
        Map<String, String> map = this.stat;
        return (map == null || map.get("cpdReportSource") == null) ? "" : this.stat.get("cpdReportSource");
    }

    public Map<String, Object> getExt() {
        return this.ext;
    }

    public String getIconUrl() {
        Map<String, Object> ext = getExt();
        return (ext == null || ext.get("iconUrl") == null) ? "" : (String) ext.get("iconUrl");
    }

    public int getIsPrivilege() {
        Map<String, Object> ext = getExt();
        if (ext == null || ext.get(ev0.f2876) == null) {
            return 0;
        }
        return ((Integer) ext.get(ev0.f2876)).intValue();
    }

    public int getKey() {
        return this.key;
    }

    public long getOdsId() {
        Object obj;
        Map<String, Object> map = this.ext;
        if (map == null || (obj = map.get("ods_id")) == null) {
            return -1L;
        }
        return ((Long) obj).longValue();
    }

    public String getOperationDesc() {
        Map<String, Object> ext = getExt();
        return (ext == null || ext.get(ev0.f2879) == null) ? "" : (String) ext.get(ev0.f2879);
    }

    public int getPageRemoval() {
        Object obj;
        Map<String, Object> map = this.ext;
        if (map == null || (obj = map.get(ev0.f2856)) == null) {
            return 1;
        }
        return ((Integer) obj).intValue();
    }

    public Integer getSizeOfFoldGroup() {
        Map<String, Object> map = this.ext;
        if (map != null) {
            return (Integer) map.get("large_size_group");
        }
        return null;
    }

    public Map<String, String> getStat() {
        return this.stat;
    }

    public String getTitleColor() {
        Map<String, Object> ext = getExt();
        return (ext == null || ext.get(ev0.f2883) == null) ? "" : (String) ext.get(ev0.f2883);
    }

    public void setActionParam(String actionParam) {
        this.actionParam = actionParam;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public void setButtonHidden(int buttonHidden) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put(ev0.f2855, Integer.valueOf(buttonHidden));
    }

    public void setCardStyle(Integer cardStyle) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put(ev0.f2895, cardStyle);
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setContentType(int contentType) {
        Map<String, Object> ext = getExt();
        if (ext == null) {
            ext = Maps.newHashMap();
            setExt(ext);
        }
        ext.put(ev0.f2877, Integer.valueOf(contentType));
    }

    public void setContextTargetPage(String contextTargetPage) {
        Map<String, String> stat = getStat();
        if (stat == null) {
            stat = new HashMap<>();
            setStat(stat);
        }
        stat.put(ev0.f2887, contextTargetPage);
    }

    public void setCornerLabel(int cornerLabel) {
        this.cornerLabel = cornerLabel;
    }

    public void setCpdReportSource(String cpdReportSource) {
        if (this.stat == null) {
            this.stat = new HashMap();
        }
        this.stat.put("cpdReportSource", cpdReportSource);
    }

    public void setDetailBackTargetPage(String detailBackTargetPage) {
        Map<String, String> stat = getStat();
        if (stat == null) {
            stat = Maps.newStringHashMap();
            setStat(stat);
        }
        stat.put(ev0.f2888, detailBackTargetPage);
    }

    public void setExt(Map<String, Object> ext) {
        this.ext = ext;
    }

    public void setIconUrl(String iconUrl) {
        Map<String, Object> ext = getExt();
        if (ext == null) {
            ext = Maps.newHashMap();
            setExt(ext);
        }
        ext.put("iconUrl", iconUrl);
    }

    public void setIsPrivilege(int isPrivilege) {
        Map<String, Object> ext = getExt();
        if (ext == null) {
            ext = Maps.newHashMap();
            setExt(ext);
        }
        ext.put(ev0.f2876, Integer.valueOf(isPrivilege));
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setOdsId(long odsId) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put("ods_id", Long.valueOf(odsId));
        if (this.stat == null) {
            this.stat = new HashMap();
        }
        Map<String, String> map = this.stat;
        map.put("ods_id", "" + odsId);
    }

    public void setOperationDesc(String operationDesc) {
        Map<String, Object> ext = getExt();
        if (ext == null) {
            ext = Maps.newHashMap();
            setExt(ext);
        }
        ext.put(ev0.f2879, operationDesc);
    }

    public void setPageRemoval(int pageRemoval) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put(ev0.f2856, Integer.valueOf(pageRemoval));
    }

    public void setSizeOfFoldGroup(int num) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put("large_size_group", Integer.valueOf(num));
    }

    public void setStat(Map<String, String> stat) {
        this.stat = stat;
    }

    public void setTitleColor(String titleColor) {
        Map<String, Object> ext = getExt();
        if (ext == null) {
            ext = Maps.newHashMap();
            setExt(ext);
        }
        ext.put(ev0.f2883, titleColor);
    }

    public String toString() {
        return "CardDto{code=" + this.code + ", key=" + this.key + ", actionType='" + this.actionType + "', actionParam='" + this.actionParam + "', cornerLabel=" + this.cornerLabel + ", ext=" + this.ext + ", stat=" + this.stat + '}';
    }
}