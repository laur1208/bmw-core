package com.bmw.core;

import com.bmw.api.BMW;
import com.bmw.api.Cars;
import com.bmw.api.Storage;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BMWCore implements BMW {

    private final Storage storage;

    public Cars cars() {
        return this.storage.cars();
    }

}
