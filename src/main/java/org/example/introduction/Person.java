package org.example.introduction;

public class Person {
    private Car car;

//    public Person(Car car) {
//        this.car = car;
//    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void sitInCar(){
        System.out.println("Владелец сел в автомобиль");
        car.go();
    }
}
