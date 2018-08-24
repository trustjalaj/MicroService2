package com.jalaj.microservice2.cucumber.stepdefs;

import com.jalaj.microservice2.MicroserviceApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MicroserviceApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
