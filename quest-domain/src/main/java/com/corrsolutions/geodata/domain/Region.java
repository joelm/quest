package com.corrsolutions.geodata.domain;


public class Region {

    private Integer regionId;
    private Integer countryId;
    private String region;
    private String code;
    private Character adm1Code;

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Character getAdm1Code() {
        return adm1Code;
    }

    public void setAdm1Code(Character adm1Code) {
        this.adm1Code = adm1Code;
    }


}
