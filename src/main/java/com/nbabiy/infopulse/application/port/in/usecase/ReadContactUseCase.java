package com.nbabiy.infopulse.application.port.in.usecase;

import com.nbabiy.infopulse.application.entity.Contact;

import java.util.List;

public interface ReadContactUseCase {

    List<Contact> readAll();

}
