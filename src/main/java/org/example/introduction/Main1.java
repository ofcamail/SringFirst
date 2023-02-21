package org.example.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext4.xml");

        Transport moto1  = context.getBean("moto", Moto.class);
        Transport moto2 = context.getBean("moto", Moto.class);
        System.out.println(moto1 == moto2);
        System.out.println(moto1);
        System.out.println(moto2);

        moto1.go();

        Person person = context.getBean("person", Person.class);
        person.sitInCar();

        context.close();
    }
}
