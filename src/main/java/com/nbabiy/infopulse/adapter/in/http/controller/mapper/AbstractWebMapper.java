package com.nbabiy.infopulse.adapter.in.http.controller.mapper;

import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractWebMapper<T, R> {

    public abstract R toResponse(T response);

    public List<R> toListResponse(List<T> entities) {
        return entities.stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }

}