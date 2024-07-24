package com.heytap.cdo.common.domain.dto;

import io.protostuff.Tag;
import java.util.List;

public class IncsetupDto {
    @Tag(3)
    private List<IncsetupFileDto> fileList;
    @Tag(5)
    private String startPCT;
    @Tag(1)
    private byte status;
    @Tag(2)
    private byte uploadSampleStatus;
    @Tag(4)
    private byte whiteSrc;

    public List<IncsetupFileDto> getFileList() {
        return this.fileList;
    }

    public String getStartPCT() {
        return this.startPCT;
    }

    public byte getStatus() {
        return this.status;
    }

    public byte getUploadSampleStatus() {
        return this.uploadSampleStatus;
    }

    public byte getWhiteSrc() {
        return this.whiteSrc;
    }

    public void setFileList(List<IncsetupFileDto> fileList) {
        this.fileList = fileList;
    }

    public void setStartPCT(String startPCT) {
        this.startPCT = startPCT;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public void setUploadSampleStatus(byte uploadSampleStatus) {
        this.uploadSampleStatus = uploadSampleStatus;
    }

    public void setWhiteSrc(byte whiteSrc) {
        this.whiteSrc = whiteSrc;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IncsetupDto{status=" + ((int) this.status) + ",uploadSampleStatus=" + ((int) this.uploadSampleStatus) + ",startPCT=" + this.startPCT + ",whiteSrc=" + ((int) this.whiteSrc) + ", fileList=[");
        if (this.fileList != null) {
            for (int i = 0; i < this.fileList.size(); i++) {
                sb.append(i);
                sb.append("=");
                sb.append(this.fileList.get(i).toString());
                sb.append(",");
            }
        }
        return ((Object) sb) + "]}";
    }
}