package org.example.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        Person person2 = context.getBean("customPerson", Person.class);
        person2.sitInCar();
        Car car1 = context.getBean("customCar", Car.class);
        Car car2 = context.getBean("customCar", Car.class);
        System.out.println(car1==car2);
        context.close();
    }
}
