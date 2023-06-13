package shriner.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shriner.springframework.sfgdi.services.ConstructorGreetingService;

class PropertyInjectedControllerTest {

    //MANUAL DEPENDENCY INJECTION
    //this is the properties way of doing dependency injection
    //NOT PREFERABLE

    PropertyInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new PropertyInjectedController();

        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}