package com.rusum.ci_cd_demo.controller;
//2.here we  add a test to test what is in the HelloController
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloControllerTest {

    @Test
    void testHello() {
        HelloController controller = new HelloController();
        String result = controller.hello();
        assertEquals("Jenkins CI/CD Working!", result);
    }
}
//3. after this run in terminal -- mvn clean package after --mvn spring-boot:run to run spring boot app and access it using 8080