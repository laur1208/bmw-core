package com.bmw.web;

import com.bmw.api.BMW;
import com.bmw.api.Cars;
import com.bmw.core.BMWCore;
import com.bmw.storage.BMWDb;
import com.bmw.storage.BMWStorage;
import org.springframework.stereotype.Component;

@Component
public class BmwCoreComponent implements BMW {

    private final BMW bmw;

    public BmwCoreComponent() {
        this(
                new BMWCore(
                        new BMWStorage(
                                new BMWDb(

                                )
                        )
                )
        );
    }

    private BmwCoreComponent(BMW bmw) {
        this.bmw = bmw;
    }


    public Cars cars() {
        return this.bmw.cars();
    }
}
