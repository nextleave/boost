package com.geblob.boost.application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestAutoware {
    @Value("${spring.datasource.username}")
    private String username;


}
