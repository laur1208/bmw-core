package com.bmw.storage;

import org.springframework.jdbc.core.JdbcTemplate;

public class BMWDb implements Database {
    @Override
    public Database connect() {
        return null;
    }

    @Override
    public JdbcTemplate jdbc() {
        return null;
    }

    @Override
    public void close() {

    }
}
