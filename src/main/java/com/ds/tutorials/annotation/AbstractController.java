package com.ds.tutorials.annotation;

import org.springframework.http.CacheControl;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

public abstract class AbstractController {

    protected <T> ResponseEntity<RestResponse<T>> generateResponse(final T subject){
        final RestResponse<T> restResponse = new RestResponse<T>();
        restResponse.setStatus(Status.SUCCESS);
        restResponse.setSubject(subject);
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).cacheControl(CacheControl.noCache())
                .body(restResponse);
    }

}