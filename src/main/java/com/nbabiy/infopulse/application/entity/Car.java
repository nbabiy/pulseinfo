package com.nbabiy.infopulse.application.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Car {

    private Brand brand;
    private String model;

    @AllArgsConstructor
    @Getter
    public enum Brand {

        BMW("BMW"),
        MERCEDES("Mercedes"),
        VOLVO("Volvo"),
        LEXUS("Lexus");

        private final String conventional;

    }

}
