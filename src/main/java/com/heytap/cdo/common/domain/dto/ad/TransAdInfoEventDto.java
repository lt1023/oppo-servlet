package com.heytap.cdo.common.domain.dto.ad;


import io.protostuff.Tag;
import java.util.Map;

public class TransAdInfoEventDto {
    @Tag(2)
    private Map<String, String> ext;
    @Tag(1)
    public Integer type;

    public Map<String, String> getExt() {
        return this.ext;
    }

    public Integer getType() {
        return this.type;
    }

    public void setExt(Map<String, String> ext) {
        this.ext = ext;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String toString() {
        return "TransAdInfoEventDto{type=" + this.type + ", ext=" + this.ext + '}';
    }
}