package com.movie2night.m2n.I18N;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

import java.util.Locale;


@Component
public class Message implements MessageSourceAware {

    private static MessageSource messageSource;

    public static String getLocalisedText(String message) {
        return messageSource.getMessage(message, new Object[0], new Locale(""));
    }

    @Override
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }


}
