package com.corrsolutions.quest.service.impl;

import com.corrsolutions.geodata.dao.CountryDao;
import com.corrsolutions.geodata.domain.Country;
import com.corrsolutions.quest.service.GeoDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class GeoDataServiceImpl implements GeoDataService {

    private static final Logger LOGGER = LoggerFactory.getLogger(GeoDataServiceImpl.class);

    private CountryDao countryDao;


    @Override
    public List<Country> getAllCountries(){
        return countryDao.getAllCountries();
    }


    @Required
    public void setCountryDao(CountryDao countryDao){
        this.countryDao = countryDao;
    }

}
