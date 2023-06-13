package shriner.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shriner.springframework.sfgdi.services.ConstructorGreetingService;

class SetterInjectedControllerTest {

    //MANUAL DEPENDENCY INJECTION
    //this is the setter dependency injection way

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}