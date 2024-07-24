package com.heytap.cdo.common.domain.dto.ad;

import io.protostuff.Tag;
import java.util.List;

public class ContractAdInfoDto {
    @Tag(1)
    private List<BdCommonDto> bdCommonDtos;

    public List<BdCommonDto> getBdCommonDtos() {
        return this.bdCommonDtos;
    }

    public void setBdCommonDtos(List<BdCommonDto> bdCommonDtos) {
        this.bdCommonDtos = bdCommonDtos;
    }

    public String toString() {
        return "ContractAdInfoDto{bdCommonDtos=" + this.bdCommonDtos + '}';
    }
}