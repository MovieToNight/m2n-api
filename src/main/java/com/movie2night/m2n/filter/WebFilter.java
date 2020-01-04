package com.movie2night.m2n.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


@Component
public class WebFilter implements Filter {

    @Override
    public void doFilter
            (ServletRequest request,
             ServletResponse response,
             FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        chain.doFilter(request, response);

    }

}
