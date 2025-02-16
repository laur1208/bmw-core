package com.bmw.web.output;

import com.bmw.api.Car;

import javax.json.Json;

public class JsonCar extends AbstractJsonObject {

    public JsonCar(final Car car) {
        super(
                Json.createObjectBuilder()
                        .add("id", car.id()).build()
        );
    }
}
