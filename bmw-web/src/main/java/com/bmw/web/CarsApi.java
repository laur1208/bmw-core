package com.bmw.web;

import com.bmw.api.BMW;
import com.bmw.api.Car;
import com.bmw.core.rest.RestBMW;
import com.bmw.web.output.JsonCar;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class CarsApi {

    private final BMW bmw;

    @GetMapping(
            value = "/cars/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<String> getCar(
            @PathVariable("id") final Integer id
    ) {
        Car car = this.bmw.cars().getById(id);
        System.out.println("car.id() = " + car.id());
        return ResponseEntity.ok(new JsonCar(car).toString());
    }
}
