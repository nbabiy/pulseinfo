package com.nbabiy.infopulse.adapter.in.http.controller.mapper;

import com.nbabiy.infopulse.adapter.in.http.api.response.ContactResponse;
import com.nbabiy.infopulse.application.entity.Contact;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ContactMapper extends AbstractWebMapper<Contact, ContactResponse> {

    private final CarMapper carMapper;

    @Override
    public ContactResponse toResponse(Contact response) {
        return ContactResponse.builder()
                .firstName(response.getFirstName())
                .lastName(response.getLastName())
                .cars(carMapper.toListResponse(response.getCars()))
                .build();
    }
}
