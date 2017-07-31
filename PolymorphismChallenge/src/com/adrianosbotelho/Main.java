package com.adrianosbotelho;

class Car{

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String starEngine(){
        return getClass().getSimpleName() + " -> starEngine()";
    }

    public String accelerate(){
        return getClass().getSimpleName() + "-> accelerate()";
    }

    public String brake(){
        return getClass().getSimpleName() + "-> brake()";
    }
}

class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String starEngine() {
        return getClass().getSimpleName() + "-> starEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + "-> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + "-> brake()";
    }
}
 class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String starEngine() {
        return getClass().getSimpleName() + "-> starEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + "-> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + "-> brake()";
    }
}

 class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String starEngine() {
        return "Ford -> starEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }
}


public class Main {

    public static void main(String[] args) {

        Car car = new Car(8,"Base car");
        System.out.println(car.starEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6,"Outlander");
        System.out.println(mitsubishi.starEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6,"Focus");
        System.out.println(ford.starEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6,"Holden");
        System.out.println(holden.starEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());


    }


}
