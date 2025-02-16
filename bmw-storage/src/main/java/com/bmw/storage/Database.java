package com.bmw.storage;


import org.springframework.jdbc.core.JdbcTemplate;

public interface Database {

    Database connect();

    JdbcTemplate jdbc();

    void close();

}
