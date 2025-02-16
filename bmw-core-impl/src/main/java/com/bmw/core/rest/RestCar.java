package com.bmw.core.rest;

import com.bmw.api.Car;
import com.jcabi.http.Request;
import com.jcabi.http.response.JsonResponse;
import lombok.RequiredArgsConstructor;

import java.io.IOException;

@RequiredArgsConstructor
public class RestCar implements Car {

    private Request request;

    public RestCar(Request req, Integer id) {
        this.request = req.uri().path("/" + id).back();
    }

    @Override
    public Integer id() {
        Integer id = null;
        try {
            System.out.println("this.request.uri() = " + this.request.uri());
            id = this.request.fetch()
                    .as(JsonResponse.class)
                    .json()
                    .readObject()
                    .getInt("id");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return id;
    }
}
