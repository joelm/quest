package com.corrsolutions.quest.service;


import com.corrsolutions.geodata.domain.City;
import com.corrsolutions.geodata.domain.Country;

import java.util.List;

public interface GeoDataService {

    List<Country> getAllCountries();

    List<City> getAllCities();
}
