package com.corrsolutions.geodata.dao.springjdbc;


import com.corrsolutions.geodata.dao.CountryDao;
import com.corrsolutions.geodata.domain.Country;
import org.springframework.jdbc.core.RowMapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CountrySpringJdbcDao extends AbstractJdbcDao<Country> implements CountryDao {

    @Override
    public List<Country> getAllCountries() {
        return readAll("getAllCountriesSql");
    }

    @Override
    protected RowMapper<Country> getRowMapper() {
        return new RowMapper<Country>() {
            @Override
            public Country mapRow(ResultSet rs, int rowNum) throws SQLException {

                //final Date endDate = rs.getDate("END_DATE");
                return new Country(rs.getInt("COUNTRYID"),
                        rs.getString("COUNTRY"),
                        rs.getString("FIPS104"),
                        rs.getString("ISO2"),
                        rs.getString("ISO3"),
                        rs.getString("ISON"),
                        rs.getString("INTERNET"),
                        rs.getString("CAPITAL"),
                        rs.getString("MAPREFERENCE"),
                        rs.getString("NATIONALITYSINGULAR"),
                        rs.getString("NATIONALITYPLURAL"),
                        rs.getString("CURRENCY"),
                        rs.getString("CURRENCYCODE"),
                        rs.getInt("POPULATION"),
                        rs.getString("TITLE"),
                        rs.getString("COMMENT"));
            }
        };
    }

}
