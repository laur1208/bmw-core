package com.bmw.storage;

import com.bmw.api.Cars;
import com.bmw.api.Storage;

public class BMWStorage implements Storage {

    private final Database database;

    public BMWStorage(final Database database) {
        this.database = database.connect();
    }

    @Override
    public Cars cars() {
        return new BmwCars(this, this.database);
    }
}
