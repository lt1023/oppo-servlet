package com.heytap.cdo.common.domain.dto;

import io.protostuff.Tag;

public class AppInformBookingDto {
        @Tag(4)
        private String content;
        @Tag(7)
        private long endTime;
        @Tag(1)
        private int permanentLabel;
        @Tag(2)
        private long permanentTime;
        @Tag(6)
        private long startTime;
        @Tag(3)
        private String title;
        @Tag(5)
        private int type;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public int getPermanentLabel() {
        return permanentLabel;
    }

    public void setPermanentLabel(int permanentLabel) {
        this.permanentLabel = permanentLabel;
    }

    public long getPermanentTime() {
        return permanentTime;
    }

    public void setPermanentTime(long permanentTime) {
        this.permanentTime = permanentTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
