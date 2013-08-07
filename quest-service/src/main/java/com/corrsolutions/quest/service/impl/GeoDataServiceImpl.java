package com.corrsolutions.quest.service.impl;

import com.corrsolutions.geodata.dao.CityDao;
import com.corrsolutions.geodata.dao.CountryDao;
import com.corrsolutions.geodata.domain.City;
import com.corrsolutions.geodata.domain.Country;
import com.corrsolutions.quest.service.GeoDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class GeoDataServiceImpl implements GeoDataService {

    private static final Logger LOGGER = LoggerFactory.getLogger(GeoDataServiceImpl.class);

    private CountryDao countryDao;

    private CityDao cityDao;


    @Override
    public List<Country> getAllCountries(){
        return countryDao.getAllCountries();
    }

    @Override
    public List<City> getAllCities(){
        return cityDao.getAllCities();
    }


    @Required
    public void setCountryDao(CountryDao countryDao){
        this.countryDao = countryDao;
    }

    @Required
    public void setCityDao(CityDao cityDao){
        this.cityDao = cityDao;
    }
}
