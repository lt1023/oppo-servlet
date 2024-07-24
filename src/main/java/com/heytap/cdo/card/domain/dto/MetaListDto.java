package com.heytap.cdo.card.domain.dto;

import io.protostuff.Tag;
import java.util.List;

public class MetaListDto {
    @Tag(2)
    private List<AppMeta> appMetas;
    @Tag(1)
    private String module;
    @Tag(3)
    private String ruleId;
    @Tag(4)
    private boolean sortSuc;

    public List<AppMeta> getAppMetas() {
        return this.appMetas;
    }

    public String getModule() {
        return this.module;
    }

    public String getRuleId() {
        return this.ruleId;
    }

    public boolean isSortSuc() {
        return this.sortSuc;
    }

    public void setAppMetas(List<AppMeta> appMetas) {
        this.appMetas = appMetas;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public void setSortSuc(boolean sortSuc) {
        this.sortSuc = sortSuc;
    }

    public String toString() {
        return "MetaListDto{module='" + this.module + "', appMetas=" + this.appMetas + ", ruleId='" + this.ruleId + "', sortSuc=" + this.sortSuc + '}';
    }
}