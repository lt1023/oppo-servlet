package com.heytap.cdo.card.domain.dto.extfeature;

import io.protostuff.Tag;
import java.util.List;
import java.util.Map;

public class ExtFeatureDto {
    @Tag(1)
    private String desc;
    @Tag(3)
    private Integer pageKey;
    @Tag(4)
    private Map<String, String> stat;
    @Tag(2)
    private List<ExtFeatureSwitches> switches;

    public String getDesc() {
        return this.desc;
    }

    public String getExtFeaturePageKey() {
        Map<String, String> map = this.stat;
        if (map == null) {
            return null;
        }
        return map.get("ext_feature_page_key");
    }

    public Integer getPageKey() {
        return this.pageKey;
    }

    public Map<String, String> getStat() {
        return this.stat;
    }

    public List<ExtFeatureSwitches> getSwitches() {
        return this.switches;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPageKey(Integer pageKey) {
        this.pageKey = pageKey;
    }

    public void setStat(Map<String, String> stat) {
        this.stat = stat;
    }

    public void setSwitches(List<ExtFeatureSwitches> switches) {
        this.switches = switches;
    }
}