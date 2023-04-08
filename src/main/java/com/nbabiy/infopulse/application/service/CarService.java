package com.nbabiy.infopulse.application.service;

import com.nbabiy.infopulse.application.entity.Car;
import com.nbabiy.infopulse.application.entity.Contact;
import com.nbabiy.infopulse.application.port.in.usecase.ReadContactUseCase;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CarService implements ReadContactUseCase {

    private final List<Contact> contacts = new ArrayList<>();

    @Override
    public List<Contact> read() {
        return contacts;
    }

    @PostConstruct
    private void genContacts() {
        final Car bmwM4 = Car.builder()
                .brand(Car.Brand.BMW)
                .model("M4")
                .build();

        final Contact contactIvan = Contact.builder()
                .firstName("Ivan")
                .lastName("Melnyk")
                .cars(List.of(bmwM4))
                .build();

        contacts.add(contactIvan);

        final Car bmwM5 = Car.builder()
                .brand(Car.Brand.BMW)
                .model("M5")
                .build();

        final Car lexusLX500 = Car.builder()
                .brand(Car.Brand.LEXUS)
                .model("LX500")
                .build();

        final Contact contactNazarii = Contact.builder()
                .firstName("Nazarii")
                .lastName("Babii")
                .cars(List.of(bmwM5, lexusLX500))
                .build();

        contacts.add(contactNazarii);

        final Car volvoVC60 = Car.builder()
                .brand(Car.Brand.VOLVO)
                .model("VC60")
                .build();

        final Car mercedesGTR63 = Car.builder()
                .brand(Car.Brand.MERCEDES)
                .model("GTR63 AMG")
                .build();

        final Contact contactMike = Contact.builder()
                .firstName("Mike")
                .lastName("Chikhuta")
                .cars(List.of(volvoVC60, mercedesGTR63))
                .build();

        contacts.add(contactMike);
    }
}
