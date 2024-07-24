package com.heytap.cdo.card.domain.dto;

import com.heytap.cdo.common.domain.dto.AppInheritDto;
import com.heytap.cdo.common.domain.dto.ResourceDto;
import com.heytap.cdo.common.domain.dto.ad.ContractAdInfoDto;
import io.protostuff.Tag;
import java.util.List;

public class AppListCardDto extends CardDto {
    @Tag(104)
    private String appContextPath;
    @Tag(103)
    private List<ResourceDto> apps;
    @Tag(106)
    private String backgroundImage;
    @Tag(108)
    private ContractAdInfoDto contractAdInfoDto;
    @Tag(102)
    private String desc;
    @Tag(105)
    private String icon;
    @Tag(109)
    private String label;
    @Tag(107)
    private List<AppInheritDto> multipleApps;
    @Tag(101)
    private String title;


    public String getAppContextPath() {
        return appContextPath;
    }

    public void setAppContextPath(String appContextPath) {
        this.appContextPath = appContextPath;
    }

    public List<ResourceDto> getApps() {
        return apps;
    }

    public void setApps(List<ResourceDto> apps) {
        this.apps = apps;
    }

    public String getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public ContractAdInfoDto getContractAdInfoDto() {
        return contractAdInfoDto;
    }

    public void setContractAdInfoDto(ContractAdInfoDto contractAdInfoDto) {
        this.contractAdInfoDto = contractAdInfoDto;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<AppInheritDto> getMultipleApps() {
        return multipleApps;
    }

    public void setMultipleApps(List<AppInheritDto> multipleApps) {
        this.multipleApps = multipleApps;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "AppListCardDto{title='" + this.title + "', desc='" + this.desc + "', apps=" + this.apps + ", appContextPath='" + this.appContextPath + "', icon='" + this.icon + "', backgroundImage='" + this.backgroundImage + "', multipleApps=" + this.multipleApps + ", contractAdInfoDto=" + this.contractAdInfoDto + ", label='" + this.label + "'}";
    }
}