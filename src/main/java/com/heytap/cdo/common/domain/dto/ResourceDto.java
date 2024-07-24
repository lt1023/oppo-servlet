package com.heytap.cdo.common.domain.dto;

import io.protostuff.Tag;
import com.heytap.cdo.common.domain.dto.ad.ContractAdInfoDto;
import com.heytap.cdo.common.domain.dto.ad.TransAdInfoDto;

import java.util.List;
import java.util.Map;

public class ResourceDto {
    public static final String CAN_DOWNLOAD_METIS_REGION_PKG = "canDownloadMetisRegionPkg";
    private static final String COMPRESS_URL = "compress_url";
    private static final String DEVELOPER = "developer";
    private static final String DOWNLOAD_URL = "download_url";
    private static final String EXP_APP_NAME = "expAppName";
    private static final String NEW_DOWNLOAD_URL = "new_download_url";
    private static final String PKG_PERMISS = "pkgPermiss";
    private static final String PKG_TYPE = "pkg_type";
    private static final String PRIVACY_JUMP = "privacyJump";
    private static final String REQ_RES_STAT = "req_ref";
    private static final String REQ_RES_TYPE = "req_ref_type";
    public static final String RESOURCE_REGION = "resourceRegion";
    private static final String RES_STAT = "ref";
    private static final String RES_TYPE = "refType";
    private static final String SENSITIVE_PERMISSION = "sensitivePermission";
    private static final String TOKEN = "token";
    @Tag(25)
    private String adContent;
    @Tag(23)
    private int adId;
    @Tag(24)
    private String adPos;
    @Tag(45)
    private String adTrackContent;
    @Tag(20)
    private String f90123adapter;
    @Tag(21)
    private String adapterDesc;
    @Tag(37)
    private String adapterTesterAvatar;
    @Tag(38)
    private String adapterTesterName;
    @Tag(19)
    private int adapterType;
    @Tag(1)
    private long appId;
    @Tag(49)
    private AppInformBookingDto appInformBookingDto;
    @Tag(51)
    private AppInformInsiderBookingDto appInformInsiderBookingDto;
    @Tag(3)
    private String appName;
    @Tag(29)
    private long auth;
    @Tag(33)
    private String bg;
    @Tag(4)
    private long catLev1;
    @Tag(5)
    private long catLev2;
    @Tag(6)
    private long catLev3;
    @Tag(30)
    private String catName;
    @Tag(48)
    private String categoryNameV2;
    @Tag(13)
    private String checksum;
    @Tag(53)
    private ContractAdInfoDto contractAdInfoDto;
    @Tag(57)
    private CustomizedLabelDto customizedLabel;
    @Tag(27)
    private String desc;
    @Tag(47)
    private List<Integer> displayInfos;
    @Tag(54)
    private TransAdInfoDto distributeAdInfoDto;
    @Tag(15)
    private long dlCount;
    @Tag(16)
    private String dlDesc;
    @Tag(41)
    private Map<String, String> ext;
    @Tag(100)
    private Map<String, Object> extraTransMap;
    @Tag(18)
    private float grade;
    @Tag(17)
    private long gradeCount;
    @Tag(35)
    private int iconLabel;
    @Tag(14)
    private String iconUrl;
    @Tag(52)
    private IncsetupDto incsetupDto;
    @Tag(40)
    private InstantDto instant;
    @Tag(50)
    private int isShowCardBg;
    @Tag(46)
    private LabelDto labelDto;
    @Tag(34)
    private List<Integer> labels;
    @Tag(12)
    private String md5;
    @Tag(7)
    private String pkgName;
    @Tag(28)
    private int point;
    @Tag(58)
    private RecDescriptionDto recDescription;
    @Tag(43)
    private String ref1;
    @Tag(56)
    private String registrationCode;
    @Tag(32)
    private List<String> screenshots;
    @Tag(26)
    private String shortDesc;
    @Tag(10)
    private long size;
    @Tag(11)
    private String sizeDesc;
    @Tag(36)
    private int special;
    @Tag(39)
    private String srcKey;
    @Tag(42)
    private Map<String, String> stat;
    @Tag(44)
    private String trackContent;
    @Tag(55)
    private String trackId;
    @Tag(31)
    private int type;
    @Tag(22)
    private String url;
    @Tag(9)
    private long verCode;
    @Tag(2)
    private long verId;
    @Tag(8)
    private String verName;

    public String getAdContent() {
        return adContent;
    }

    public void setAdContent(String adContent) {
        this.adContent = adContent;
    }

    public int getAdId() {
        return adId;
    }

    public void setAdId(int adId) {
        this.adId = adId;
    }

    public String getAdPos() {
        return adPos;
    }

    public void setAdPos(String adPos) {
        this.adPos = adPos;
    }

    public String getAdTrackContent() {
        return adTrackContent;
    }

    public void setAdTrackContent(String adTrackContent) {
        this.adTrackContent = adTrackContent;
    }

    public String getF90123adapter() {
        return f90123adapter;
    }

    public void setF90123adapter(String f90123adapter) {
        this.f90123adapter = f90123adapter;
    }

    public String getAdapterDesc() {
        return adapterDesc;
    }

    public void setAdapterDesc(String adapterDesc) {
        this.adapterDesc = adapterDesc;
    }

    public String getAdapterTesterAvatar() {
        return adapterTesterAvatar;
    }

    public void setAdapterTesterAvatar(String adapterTesterAvatar) {
        this.adapterTesterAvatar = adapterTesterAvatar;
    }

    public String getAdapterTesterName() {
        return adapterTesterName;
    }

    public void setAdapterTesterName(String adapterTesterName) {
        this.adapterTesterName = adapterTesterName;
    }

    public int getAdapterType() {
        return adapterType;
    }

    public void setAdapterType(int adapterType) {
        this.adapterType = adapterType;
    }

    public long getAppId() {
        return appId;
    }

    public void setAppId(long appId) {
        this.appId = appId;
    }

    public AppInformBookingDto getAppInformBookingDto() {
        return appInformBookingDto;
    }

    public void setAppInformBookingDto(AppInformBookingDto appInformBookingDto) {
        this.appInformBookingDto = appInformBookingDto;
    }

    public AppInformInsiderBookingDto getAppInformInsiderBookingDto() {
        return appInformInsiderBookingDto;
    }

    public void setAppInformInsiderBookingDto(AppInformInsiderBookingDto appInformInsiderBookingDto) {
        this.appInformInsiderBookingDto = appInformInsiderBookingDto;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public long getAuth() {
        return auth;
    }

    public void setAuth(long auth) {
        this.auth = auth;
    }

    public String getBg() {
        return bg;
    }

    public void setBg(String bg) {
        this.bg = bg;
    }

    public long getCatLev1() {
        return catLev1;
    }

    public void setCatLev1(long catLev1) {
        this.catLev1 = catLev1;
    }

    public long getCatLev2() {
        return catLev2;
    }

    public void setCatLev2(long catLev2) {
        this.catLev2 = catLev2;
    }

    public long getCatLev3() {
        return catLev3;
    }

    public void setCatLev3(long catLev3) {
        this.catLev3 = catLev3;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCategoryNameV2() {
        return categoryNameV2;
    }

    public void setCategoryNameV2(String categoryNameV2) {
        this.categoryNameV2 = categoryNameV2;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public ContractAdInfoDto getContractAdInfoDto() {
        return contractAdInfoDto;
    }

    public void setContractAdInfoDto(ContractAdInfoDto contractAdInfoDto) {
        this.contractAdInfoDto = contractAdInfoDto;
    }

    public CustomizedLabelDto getCustomizedLabel() {
        return customizedLabel;
    }

    public void setCustomizedLabel(CustomizedLabelDto customizedLabel) {
        this.customizedLabel = customizedLabel;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<Integer> getDisplayInfos() {
        return displayInfos;
    }

    public void setDisplayInfos(List<Integer> displayInfos) {
        this.displayInfos = displayInfos;
    }

    public TransAdInfoDto getDistributeAdInfoDto() {
        return distributeAdInfoDto;
    }

    public void setDistributeAdInfoDto(TransAdInfoDto distributeAdInfoDto) {
        this.distributeAdInfoDto = distributeAdInfoDto;
    }

    public long getDlCount() {
        return dlCount;
    }

    public void setDlCount(long dlCount) {
        this.dlCount = dlCount;
    }

    public String getDlDesc() {
        return dlDesc;
    }

    public void setDlDesc(String dlDesc) {
        this.dlDesc = dlDesc;
    }

    public Map<String, String> getExt() {
        return ext;
    }

    public void setExt(Map<String, String> ext) {
        this.ext = ext;
    }

    public Map<String, Object> getExtraTransMap() {
        return extraTransMap;
    }

    public void setExtraTransMap(Map<String, Object> extraTransMap) {
        this.extraTransMap = extraTransMap;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public long getGradeCount() {
        return gradeCount;
    }

    public void setGradeCount(long gradeCount) {
        this.gradeCount = gradeCount;
    }

    public int getIconLabel() {
        return iconLabel;
    }

    public void setIconLabel(int iconLabel) {
        this.iconLabel = iconLabel;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public IncsetupDto getIncsetupDto() {
        return incsetupDto;
    }

    public void setIncsetupDto(IncsetupDto incsetupDto) {
        this.incsetupDto = incsetupDto;
    }

    public InstantDto getInstant() {
        return instant;
    }

    public void setInstant(InstantDto instant) {
        this.instant = instant;
    }

    public int getIsShowCardBg() {
        return isShowCardBg;
    }

    public void setIsShowCardBg(int isShowCardBg) {
        this.isShowCardBg = isShowCardBg;
    }

    public LabelDto getLabelDto() {
        return labelDto;
    }

    public void setLabelDto(LabelDto labelDto) {
        this.labelDto = labelDto;
    }

    public List<Integer> getLabels() {
        return labels;
    }

    public void setLabels(List<Integer> labels) {
        this.labels = labels;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getPkgName() {
        return pkgName;
    }

    public void setPkgName(String pkgName) {
        this.pkgName = pkgName;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public RecDescriptionDto getRecDescription() {
        return recDescription;
    }

    public void setRecDescription(RecDescriptionDto recDescription) {
        this.recDescription = recDescription;
    }

    public String getRef1() {
        return ref1;
    }

    public void setRef1(String ref1) {
        this.ref1 = ref1;
    }

    public String getRegistrationCode() {
        return registrationCode;
    }

    public void setRegistrationCode(String registrationCode) {
        this.registrationCode = registrationCode;
    }

    public List<String> getScreenshots() {
        return screenshots;
    }

    public void setScreenshots(List<String> screenshots) {
        this.screenshots = screenshots;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getSizeDesc() {
        return sizeDesc;
    }

    public void setSizeDesc(String sizeDesc) {
        this.sizeDesc = sizeDesc;
    }

    public int getSpecial() {
        return special;
    }

    public void setSpecial(int special) {
        this.special = special;
    }

    public String getSrcKey() {
        return srcKey;
    }

    public void setSrcKey(String srcKey) {
        this.srcKey = srcKey;
    }

    public Map<String, String> getStat() {
        return stat;
    }

    public void setStat(Map<String, String> stat) {
        this.stat = stat;
    }

    public String getTrackContent() {
        return trackContent;
    }

    public void setTrackContent(String trackContent) {
        this.trackContent = trackContent;
    }

    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getVerCode() {
        return verCode;
    }

    public void setVerCode(long verCode) {
        this.verCode = verCode;
    }

    public long getVerId() {
        return verId;
    }

    public void setVerId(long verId) {
        this.verId = verId;
    }

    public String getVerName() {
        return verName;
    }

    public void setVerName(String verName) {
        this.verName = verName;
    }


    @Override
    public String toString() {
        return "ResourceDto{appId=" + this.appId + ", verId=" + this.verId + ", appName='" + this.appName + "', catLev1=" + this.catLev1 + ", catLev2=" + this.catLev2 + ", catLev3=" + this.catLev3 + ", pkgName='" + this.pkgName + "', verName='" + this.verName + "', verCode=" + this.verCode + ", size=" + this.size + ", sizeDesc='" + this.sizeDesc + "', md5='" + this.md5 + "', checksum='" + this.checksum + "', iconUrl='" + this.iconUrl + "', dlCount=" + this.dlCount + ", dlDesc='" + this.dlDesc + "', gradeCount=" + this.gradeCount + ", grade=" + this.grade + ", adapterType=" + this.adapterType + ", adapter='" + this.f90123adapter + "', adapterDesc='" + this.adapterDesc + "', url='" + this.url + "', adId=" + this.adId + ", adPos='" + this.adPos + "', adContent='" + this.adContent + "', shortDesc='" + this.shortDesc + "', desc='" + this.desc + "', point=" + this.point + ", auth=" + this.auth + ", catName='" + this.catName + "', type=" + this.type + ", screenshots=" + this.screenshots + ", bg='" + this.bg + "', labels=" + this.labels + ", iconLabel=" + this.iconLabel + ", special=" + this.special + ", adapterTesterAvatar='" + this.adapterTesterAvatar + "', adapterTesterName='" + this.adapterTesterName + "', srcKey='" + this.srcKey + "', instant=" + this.instant + ", ext=" + this.ext + ", stat=" + this.stat + ", ref1='" + this.ref1 + "', trackContent='" + this.trackContent + "', adTrackContent='" + this.adTrackContent + "', labelDto=" + this.labelDto + ", displayInfos=" + this.displayInfos + ", categoryNameV2='" + this.categoryNameV2 + "', appInformBookingDto=" + this.appInformBookingDto + ", isShowCardBg=" + this.isShowCardBg + ", appInformInsiderBookingDto=" + this.appInformInsiderBookingDto + ", incsetupDto=" + this.incsetupDto + ", contractAdInfoDto=" + this.contractAdInfoDto + ", distributeAdInfoDto=" + this.distributeAdInfoDto + ", trackId='" + this.trackId + "', registrationCode='" + this.registrationCode + "', customizedLabel=" + this.customizedLabel + ", recDescription=" + this.recDescription + ", extraTransMap=" + this.extraTransMap + '}';
    }



}
