package com.heytap.cdo.card.domain.dto;

import io.protostuff.Tag;
import java.util.Map;

public class FloorPopoverDto {
    @Tag(5)
    private int cardId;
    @Tag(2)
    private int contentId;
    @Tag(9)
    private Map<String, String> ext;
    @Tag(6)
    private String iconUrl;
    @Tag(1)
    private int id;
    @Tag(8)
    private int leadTime;
    @Tag(3)
    private int pageCode;
    @Tag(4)
    private int pageId;
    @Tag(7)
    private String prompt;

    public int getCardId() {
        return this.cardId;
    }

    public int getContentId() {
        return this.contentId;
    }

    public Map<String, String> getExt() {
        return this.ext;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public int getId() {
        return this.id;
    }

    public int getLeadTime() {
        return this.leadTime;
    }

    public int getPageCode() {
        return this.pageCode;
    }

    public int getPageId() {
        return this.pageId;
    }

    public String getPrompt() {
        return this.prompt;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    public void setExt(Map<String, String> ext) {
        this.ext = ext;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLeadTime(int leadTime) {
        this.leadTime = leadTime;
    }

    public void setPageCode(int pageCode) {
        this.pageCode = pageCode;
    }

    public void setPageId(int pageId) {
        this.pageId = pageId;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String toString() {
        return "FloorPopoverDto{id=" + this.id + ", contentId=" + this.contentId + ", pageCode=" + this.pageCode + ", pageId=" + this.pageId + ", cardId=" + this.cardId + ", iconUrl='" + this.iconUrl + "', prompt='" + this.prompt + "', leadTime=" + this.leadTime + ", ext=" + this.ext + '}';
    }
}