package com.movie2night.m2n.exception;

import org.slf4j.Logger;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;

import static org.slf4j.LoggerFactory.getLogger;

@ControllerAdvice
public class DefaultExceptionHandler extends ResponseEntityExceptionHandler {
    private static final Logger log = getLogger(DefaultExceptionHandler.class);


    @ExceptionHandler(Throwable.class)
    @ResponseBody
    ResponseEntity<?> handle(HttpServletRequest request, Throwable ex) {
        String requestUri = requestUrlWithQueryString(request);

        log.error("Request {} failed with exception", requestUri, ex);

        return ResponseEntity
                .status(getStatus(ex))
                .body("");
    }

    private String requestUrlWithQueryString(HttpServletRequest request) {
        if (StringUtils.isEmpty(request.getQueryString())) {
            return request.getRequestURI();
        }

        return request.getRequestURI() + "?" + request.getQueryString();
    }

    private HttpStatus getStatus(Throwable ex) {
        ResponseStatus responseStatus = AnnotationUtils.findAnnotation(ex.getClass(), ResponseStatus.class);
        if (responseStatus != null) {
            return responseStatus.code();
        }

        return HttpStatus.INTERNAL_SERVER_ERROR;
    }

}
