package com.nbabiy.infopulse.adapter.in.http.controller;

import com.nbabiy.infopulse.adapter.in.http.api.ContactsApi;
import com.nbabiy.infopulse.adapter.in.http.api.response.ContactResponse;
import com.nbabiy.infopulse.adapter.in.http.controller.mapper.ContactMapper;
import com.nbabiy.infopulse.application.entity.Contact;
import com.nbabiy.infopulse.application.port.in.usecase.ReadContactUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ContactController implements ContactsApi {

    private final ContactMapper contactMapper;
    private final ReadContactUseCase readContactUseCase;

    @Override
    public ResponseEntity<List<ContactResponse>> contacts() {
        final List<Contact> contacts = readContactUseCase.read();
        return ResponseEntity.ok(contactMapper.toListResponse(contacts));
    }

}
