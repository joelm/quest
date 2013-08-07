package com.corrsolutions.geodata.dao.springjdbc;

import com.corrsolutions.geodata.dao.CityDao;
import com.corrsolutions.geodata.domain.City;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CitySpringJdbcDao extends AbstractJdbcDao<City> implements CityDao{


    @Override
    protected RowMapper<City> getRowMapper() {
        return new RowMapper<City>() {
            @Override
            public City mapRow(ResultSet rs, int rowNum) throws SQLException {

                /*Date begin = resultSet.getDate("startDate", new GregorianCalendar(TimeZone.getTimeZone("UTC")));*/
                return new City(rs.getInt("CITYID"),
                        rs.getInt("COUNTRYID"),
                        rs.getInt("REGIONID"),
                        rs.getString("CITY"),
                        rs.getFloat("LATITUDE"),
                        rs.getFloat("LONGITUDE"),
                        rs.getString("TIMEZONE"),
                        rs.getInt("DMAID"),
                        rs.getString("CODE"));
            }
        };
    }


    @Override
    public List<City> getAllCities() {
        return readAll("getAllCitiesSql");
    }


}