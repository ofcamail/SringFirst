package org.example.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.go();

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = context.getBean("customCar", Car.class);
        car1.go();
        Car car2 = context.getBean("customCar", Car.class );
        System.out.println(car==car2);
        context.close();
    }
}
