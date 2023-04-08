package com.nbabiy.infopulse.adapter.in.http.api;

import com.nbabiy.infopulse.adapter.in.http.api.response.ContactResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface ContactsApi {

    @GetMapping("/contacts")
    ResponseEntity<List<ContactResponse>> contacts();
}
