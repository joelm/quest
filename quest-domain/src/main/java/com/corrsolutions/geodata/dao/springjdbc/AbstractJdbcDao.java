package com.corrsolutions.geodata.dao.springjdbc;


import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

import java.util.List;
import java.util.Properties;

public abstract class AbstractJdbcDao<T> extends NamedParameterJdbcDaoSupport {

    private Properties properties;

    /**
     * @param properties the properties to set
     */
    public void setProperties(Properties properties) {
        this.properties = properties;
    }


    protected abstract RowMapper<T> getRowMapper();


    protected void create(String sqlKey, Object[] args) {
        //use of update here allows for an insert via a prepared statement
        getJdbcTemplate().update(getSql(sqlKey), args);
    }

    protected T read(String sqlKey, Integer id) {
        return getJdbcTemplate().queryForObject(getSql(sqlKey), new Object[]{id}, getRowMapper());
    }

    protected List<T> readAll(String sqlKey) {
        return getJdbcTemplate().query(getSql(sqlKey), getRowMapper());
    }

    protected void update(String sqlKey, Object[] args) {
        getJdbcTemplate().update(getSql(sqlKey), args);
    }

    protected List<T> readAllWithQuery(String sqlKey, Object... args) {
        return getJdbcTemplate().query(getSql(sqlKey), args, getRowMapper());
    }

    protected String getSql(String sqlKey) {
        return properties.getProperty(sqlKey);
    }

}
