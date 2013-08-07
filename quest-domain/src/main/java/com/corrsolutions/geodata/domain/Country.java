package com.corrsolutions.geodata.domain;


public class Country {

    private Integer countryId;
    private String country;
    private String FIPS104;
    private String iso2;
    private String iso3;
    private String ison;
    private String internet;
    private String capital;
    private String mapRef;
    private String nationalitySingular;
    private String nationalityPlural;
    private String currency;
    private String currencyCode;
    private Integer population;
    private String title;
    private String Comment;


    public Country() {
    }

    public Country(Integer countryId, String country, String FIPS104,
                   String iso2, String iso3, String ison, String internet,
                   String capital, String mapRef, String nationalitySingular,
                   String nationalityPlural, String currency, String currencyCode,
                   Integer population, String title, String comment) {
        this.countryId = countryId;
        this.country = country;
        this.FIPS104 = FIPS104;
        this.iso2 = iso2;
        this.iso3 = iso3;
        this.ison = ison;
        this.internet = internet;
        this.capital = capital;
        this.mapRef = mapRef;
        this.nationalitySingular = nationalitySingular;
        this.nationalityPlural = nationalityPlural;
        this.currency = currency;
        this.currencyCode = currencyCode;
        this.population = population;
        this.title = title;
        Comment = comment;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFIPS104() {
        return FIPS104;
    }

    public void setFIPS104(String FIPS104) {
        this.FIPS104 = FIPS104;
    }

    public String getIso2() {
        return iso2;
    }

    public void setIso2(String iso2) {
        this.iso2 = iso2;
    }

    public String getIso3() {
        return iso3;
    }

    public void setIso3(String iso3) {
        this.iso3 = iso3;
    }

    public String getIson() {
        return ison;
    }

    public void setIson(String ison) {
        this.ison = ison;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getMapRef() {
        return mapRef;
    }

    public void setMapRef(String mapRef) {
        this.mapRef = mapRef;
    }

    public String getNationalitySingular() {
        return nationalitySingular;
    }

    public void setNationalitySingular(String nationalitySingular) {
        this.nationalitySingular = nationalitySingular;
    }

    public String getNationalityPlural() {
        return nationalityPlural;
    }

    public void setNationalityPlural(String nationalityPlural) {
        this.nationalityPlural = nationalityPlural;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }


    @Override
    public String toString() {
        return "Country{" +
                "countryId=" + countryId +
                ", country='" + country + '\'' +
                ", FIPS104='" + FIPS104 + '\'' +
                ", iso2='" + iso2 + '\'' +
                ", iso3='" + iso3 + '\'' +
                ", ison='" + ison + '\'' +
                ", internet='" + internet + '\'' +
                ", capital='" + capital + '\'' +
                ", mapRef='" + mapRef + '\'' +
                ", nationalitySingular='" + nationalitySingular + '\'' +
                ", nationalityPlural='" + nationalityPlural + '\'' +
                ", currency='" + currency + '\'' +
                ", currencyCode='" + currencyCode + '\'' +
                ", population=" + population +
                ", title='" + title + '\'' +
                ", Comment='" + Comment + '\'' +
                '}';
    }

}
