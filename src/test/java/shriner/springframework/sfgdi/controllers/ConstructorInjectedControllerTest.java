package shriner.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shriner.springframework.sfgdi.services.ConstructorGreetingService;

class ConstructorInjectedControllerTest {

    //MANUAL DEPENDENCY INJECTION
    //this is constructor dependency injection
    //THIS IS THE PREFERRED MANUAL WAY AND HOW SPRING DOES IT

    ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}