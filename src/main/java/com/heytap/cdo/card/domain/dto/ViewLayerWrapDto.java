package com.heytap.cdo.card.domain.dto;

import com.heytap.cdo.card.domain.dto.entity.ViewConfig;
import com.heytap.cdo.card.domain.dto.entity.ViewFoot;
import com.heytap.cdo.card.domain.dto.extfeature.ExtFeatureDto;
import com.heytap.cdo.common.domain.dto.ad.ContractAdInfoDto;
import io.protostuff.Tag;

import java.util.List;
import java.util.Map;

public class ViewLayerWrapDto {
    @Tag(3)
    private List<CardDto> cards;
    @Tag(104)
    private ContractAdInfoDto contractAdInfoDto;
    @Tag(106)
    private Map<String, Object> ext;
    @Tag(103)
    private ExtFeatureDto extFeature;
    @Tag(110)
    private FloorPopoverDto floorPopoverDto;
    @Tag(6)
    private ViewFoot foot;
    @Tag(1)
    private int isEnd = 0;
    @Tag(111)
    private PageBackgroundImageDto pageBackgroundImageDto;
    @Tag(5)
    private int pageKey;
    @Tag(107)
    private ReRankDto reRankDto;
    @Tag(108)
    private RefreshDto refreshDto;
    @Tag(109)
    private ExtScreenDto secondScreenDto;
    @Tag(7)
    private Map<String, String> stat;
    @Tag(4)
    private StatConfigDto statConfig;
    @Tag(105)
    private String storeEntrance;
    @Tag(2)
    private String title;
    @Tag(10)
    private ViewConfig viewConfig;
    @Tag(8)
    private boolean refresh = false;
    @Tag(9)
    private int refreshExt = 0;
    @Tag(101)
    private boolean upRefresh = false;

    public List<CardDto> getCards() {
        return cards;
    }

    public void setCards(List<CardDto> cards) {
        this.cards = cards;
    }

    public ContractAdInfoDto getContractAdInfoDto() {
        return contractAdInfoDto;
    }

    public void setContractAdInfoDto(ContractAdInfoDto contractAdInfoDto) {
        this.contractAdInfoDto = contractAdInfoDto;
    }

    public Map<String, Object> getExt() {
        return ext;
    }

    public void setExt(Map<String, Object> ext) {
        this.ext = ext;
    }

    public int getIsEnd() {
        return isEnd;
    }

    public void setIsEnd(int isEnd) {
        this.isEnd = isEnd;
    }

    public int getPageKey() {
        return pageKey;
    }

    public void setPageKey(int pageKey) {
        this.pageKey = pageKey;
    }

    public Map<String, String> getStat() {
        return stat;
    }

    public void setStat(Map<String, String> stat) {
        this.stat = stat;
    }

    public String getStoreEntrance() {
        return storeEntrance;
    }

    public void setStoreEntrance(String storeEntrance) {
        this.storeEntrance = storeEntrance;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isRefresh() {
        return refresh;
    }

    public void setRefresh(boolean refresh) {
        this.refresh = refresh;
    }

    public int getRefreshExt() {
        return refreshExt;
    }

    public void setRefreshExt(int refreshExt) {
        this.refreshExt = refreshExt;
    }

    public boolean isUpRefresh() {
        return upRefresh;
    }

    public void setUpRefresh(boolean upRefresh) {
        this.upRefresh = upRefresh;
    }

    public ExtFeatureDto getExtFeature() {
        return extFeature;
    }

    public void setExtFeature(ExtFeatureDto extFeature) {
        this.extFeature = extFeature;
    }

    public FloorPopoverDto getFloorPopoverDto() {
        return floorPopoverDto;
    }

    public void setFloorPopoverDto(FloorPopoverDto floorPopoverDto) {
        this.floorPopoverDto = floorPopoverDto;
    }

    public ViewFoot getFoot() {
        return foot;
    }

    public void setFoot(ViewFoot foot) {
        this.foot = foot;
    }

    public PageBackgroundImageDto getPageBackgroundImageDto() {
        return pageBackgroundImageDto;
    }

    public void setPageBackgroundImageDto(PageBackgroundImageDto pageBackgroundImageDto) {
        this.pageBackgroundImageDto = pageBackgroundImageDto;
    }

    public ReRankDto getReRankDto() {
        return reRankDto;
    }

    public void setReRankDto(ReRankDto reRankDto) {
        this.reRankDto = reRankDto;
    }

    public RefreshDto getRefreshDto() {
        return refreshDto;
    }

    public void setRefreshDto(RefreshDto refreshDto) {
        this.refreshDto = refreshDto;
    }

    public ExtScreenDto getSecondScreenDto() {
        return secondScreenDto;
    }

    public void setSecondScreenDto(ExtScreenDto secondScreenDto) {
        this.secondScreenDto = secondScreenDto;
    }

    public StatConfigDto getStatConfig() {
        return statConfig;
    }

    public void setStatConfig(StatConfigDto statConfig) {
        this.statConfig = statConfig;
    }

    public ViewConfig getViewConfig() {
        return viewConfig;
    }

    public void setViewConfig(ViewConfig viewConfig) {
        this.viewConfig = viewConfig;
    }

    public String toString() {
        return "ViewLayerWrapDto{isEnd=" + this.isEnd + ", title='" + this.title + "', cards=" + this.cards + ", statConfig=" + this.statConfig + ", pageKey=" + this.pageKey + ", foot=" + this.foot + ", stat=" + this.stat + ", refresh=" + this.refresh + ", refreshExt=" + this.refreshExt + ", viewConfig=" + this.viewConfig + ", upRefresh=" + this.upRefresh + ", extFeature=" + this.extFeature + ", contractAdInfoDto=" + this.contractAdInfoDto + ", storeEntrance='" + this.storeEntrance + "', ext=" + this.ext + ", reRankDto=" + this.reRankDto + ", refreshDto=" + this.refreshDto + ", secondScreenDto=" + this.secondScreenDto + ", floorPopoverDto=" + this.floorPopoverDto + ", pageBackgroundImageDto=" + this.pageBackgroundImageDto + '}';
    }


}
