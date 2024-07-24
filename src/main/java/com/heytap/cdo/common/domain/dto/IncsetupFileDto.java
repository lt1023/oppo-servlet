package com.heytap.cdo.common.domain.dto;

import io.protostuff.Tag;

public class IncsetupFileDto {
    @Tag(4)
    private String headerMd5;
    @Tag(1)
    private String id;
    @Tag(7)
    private Long longSize;
    @Tag(3)
    private String md5;
    @Tag(5)
    private Integer size;
    @Tag(6)
    private Byte type;
    @Tag(2)
    private String url;

    public String getHeaderMd5() {
        return this.headerMd5;
    }

    public String getId() {
        return this.id;
    }

    public Long getLongSize() {
        Long l = this.longSize;
        return Long.valueOf((l == null || l.longValue() <= 0) ? this.size.intValue() : this.longSize.longValue());
    }

    public String getMd5() {
        return this.md5;
    }

    public Integer getSize() {
        return this.size;
    }

    public Byte getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public void setHeaderMd5(String headerMd5) {
        this.headerMd5 = headerMd5;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLongSize(Long longSize) {
        this.longSize = longSize;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String toString() {
        return "IncsetupFileDto{, id=" + this.id + ", url=" + this.url + ", md5=" + this.md5 + ", headerMd5=" + this.headerMd5 + ", size=" + this.size + ", type=" + this.type + ", nSize=" + this.longSize + '}';
    }
}