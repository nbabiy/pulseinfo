package com.nbabiy.infopulse.adapter.in.http.controller.mapper;

import com.nbabiy.infopulse.adapter.in.http.api.response.CarResponse;
import com.nbabiy.infopulse.application.entity.Car;
import org.springframework.stereotype.Component;

@Component
public class CarMapper extends AbstractWebMapper<Car, CarResponse>{

    @Override
    public CarResponse toResponse(Car response) {
        return CarResponse.builder()
                .brand(response.getBrand().getConventional())
                .model(response.getModel())
                .build();
    }
}
