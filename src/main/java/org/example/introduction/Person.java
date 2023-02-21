package org.example.introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private Transport transport;

    @Qualifier("car")
    @Autowired
    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public void sitInCar() {
        System.out.println("Водитель сел");
        transport.go();
    }
}