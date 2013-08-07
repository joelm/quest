package com.corrsolutions.geodata.domain;


public class City {

    private Integer cityId;
    private Integer countryId;
    private Integer regionId;
    private String City;
    private Float latitude;
    private Float longitude;
    private String timeZone;
    private Integer DmaId;
    private String code;

    public City() {
    }

    public City(Integer cityId, Integer countryId, Integer regionId, String city,
                Float latitude, Float longitude, String timeZone, Integer dmaId,
                String code) {
        this.cityId = cityId;
        this.countryId = countryId;
        this.regionId = regionId;
        City = city;
        this.latitude = latitude;
        this.longitude = longitude;
        this.timeZone = timeZone;

        DmaId = dmaId;
        this.code = code;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public Integer getDmaId() {
        return DmaId;
    }

    public void setDmaId(Integer dmaId) {
        DmaId = dmaId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityId=" + cityId +
                ", countryId=" + countryId +
                ", regionId=" + regionId +
                ", City='" + City + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", timeZone='" + timeZone + '\'' +
                ", DmaId=" + DmaId +
                ", code='" + code + '\'' +
                '}';
    }

}
