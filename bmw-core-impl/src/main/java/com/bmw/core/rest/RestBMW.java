package com.bmw.core.rest;

import com.bmw.api.BMW;
import com.bmw.api.Cars;
import com.jcabi.http.Request;
import com.jcabi.http.request.JdkRequest;

public class RestBMW implements BMW {

    private static final Request DEFAULT = new JdkRequest(
            "http://localhost:8080/api"
    ).header("Accept", "application/json");
    private Request request;

    public RestBMW() {
        this(RestBMW.DEFAULT);
    }

    public RestBMW(final Request req) {
        this.request = req;
    }

    @Override
    public Cars cars() {
        return new RestCars(this.request);
    }
}
