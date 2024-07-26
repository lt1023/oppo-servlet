package com.demo.serverlet;

import java.util.List;

public class GameBean {
    private String gameName;//游戏名
    private String icon;//图标
    private String devName;//开发者
    private List<String> shotImage;//截图
    private String downloadUrl;//下载地址
    private String size;//安装包大小
    private String installTimes;//安装次数
    private String grade;//评分

    private String updateTime;//更新时间
    private String tag;
    private long appId;
    private String pkgName;

    public long getAppId() {
        return appId;
    }

    public void setAppId(long appId) {
        this.appId = appId;
    }

    public String getPkgName() {
        return pkgName;
    }

    public void setPkgName(String pkgName) {
        this.pkgName = pkgName;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }

    public List<String> getShotImage() {
        return shotImage;
    }

    public void setShotImage(List<String> shotImage) {
        this.shotImage = shotImage;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getInstallTimes() {
        return installTimes;
    }

    public void setInstallTimes(String installTimes) {
        this.installTimes = installTimes;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
