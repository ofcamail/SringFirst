package org.example.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;
//В Person закомментирован конструктор, поэтому тут ничего не работает.
public class Main2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Person person1 = context.getBean("customPerson", Person.class);
        person1.sitInCar();
        context.close();
    }
}
