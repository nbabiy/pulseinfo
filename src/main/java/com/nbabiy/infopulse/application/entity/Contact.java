package com.nbabiy.infopulse.application.entity;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class Contact {

    private String firstName;
    private String lastName;

    private List<Car> cars;

}
