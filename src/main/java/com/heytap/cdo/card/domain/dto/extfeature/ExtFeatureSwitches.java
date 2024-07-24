package com.heytap.cdo.card.domain.dto.extfeature;

import io.protostuff.Tag;
import java.util.Map;

public class ExtFeatureSwitches {
    @Tag(1)
    private Long id;
    @Tag(3)
    private String name;
    @Tag(4)
    private Map<String, String> stat;
    @Tag(2)
    private Integer status;
    @Tag(5)
    private String type;

    public String getExtFeatureId() {
        Map<String, String> map = this.stat;
        if (map == null) {
            return null;
        }
        return map.get("ext_feature_id");
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Map<String, String> getStat() {
        return this.stat;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getType() {
        return this.type;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStat(Map<String, String> stat) {
        this.stat = stat;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setType(String type) {
        this.type = type;
    }
}