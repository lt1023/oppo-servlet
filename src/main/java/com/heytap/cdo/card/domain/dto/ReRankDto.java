package com.heytap.cdo.card.domain.dto;

import io.protostuff.Tag;
import java.util.List;

public class ReRankDto {
    @Tag(3)
    private String expTrans;
    @Tag(2)
    private List<MetaListDto> metaLists;
    @Tag(1)
    private Long timeOut;

    public String getExpTrans() {
        return this.expTrans;
    }

    public List<MetaListDto> getMetaLists() {
        return this.metaLists;
    }

    public Long getTimeOut() {
        return this.timeOut;
    }

    public void setExpTrans(String expTrans) {
        this.expTrans = expTrans;
    }

    public void setMetaLists(List<MetaListDto> metaLists) {
        this.metaLists = metaLists;
    }

    public void setTimeOut(Long timeOut) {
        this.timeOut = timeOut;
    }

    public String toString() {
        return "ReRankDto{timeOut=" + this.timeOut + ", metaLists=" + this.metaLists + ", expTrans='" + this.expTrans + "'}";
    }
}