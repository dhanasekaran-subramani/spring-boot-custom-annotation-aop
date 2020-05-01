package com.ds.tutorials.annotation;

import lombok.Data;

import java.io.Serializable;

@Data
public class RestResponse<T> implements Serializable {
    private Status status;
    private T subject;
}
