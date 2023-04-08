package com.nbabiy.infopulse.adapter.in.http.api.response;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;

@Getter
@Builder
@Jacksonized
public class CarResponse {

    private final String brand;
    private final String model;

}
