package com.example.service;

import com.example.config.YmlConfig;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class PropertiesPrinter {

    private final YmlConfig ymlConfig;

    public PropertiesPrinter(YmlConfig ymlConfig) {
        this.ymlConfig = ymlConfig;
    }

    @PostConstruct
    public void printProperties(){
        System.out.println(ymlConfig);
    }
}
