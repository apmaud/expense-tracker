package com.apmaud.blog.payload.res;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageRes {
    private String message;

    public MessageRes(String message) {
        this.message = message;
    }

}
