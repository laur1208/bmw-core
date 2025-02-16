package com.bmw.core.rest;

import com.bmw.api.Car;
import com.bmw.api.Cars;
import com.jcabi.http.Request;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RestCars implements Cars {

    private Request request;

    public RestCars(Request req) {
        this.request = req.uri().path("/cars").back();
    }

    @Override
    public Car insert(Car car) {
        return null;
    }

    @Override
    public Car getById(Integer id) {
        return new RestCar(this.request, id);
    }
}
