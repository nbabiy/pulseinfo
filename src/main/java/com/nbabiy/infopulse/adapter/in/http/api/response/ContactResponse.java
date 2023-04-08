package com.nbabiy.infopulse.adapter.in.http.api.response;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Getter
@Builder
@Jacksonized
public class ContactResponse {

    private final String firstName;
    private final String lastName;

    private final List<CarResponse> cars;

}
