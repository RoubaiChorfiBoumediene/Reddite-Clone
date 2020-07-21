package com.redditClone.exception;

import org.springframework.mail.MailException;

public class SpringRedditException extends RuntimeException {
    public SpringRedditException(String exceptionMessage, MailException e) {
        super(exceptionMessage);
    }
}
