package com.numerouno.auto;

public class Car {

    private String make;
    private String model;
    private String trim;
    private Wheel[] wheels;
    private Engine engine;

    public Car(String make, String model, String trim, Engine engine) {
        this.make = make;
        this.model = model;
        this.trim = trim;
        this.wheels = new Wheel[4];
        this.engine = engine;
    }

    public Wheel[] getWheels() {
        return this.wheels;
    }

    public void installWheels() {
        Wheel frontRight = new Wheel(19, 10, "winter", "Goodyear");
        Wheel frontLeft = new Wheel (19, 10, "winter", "Goodyear");
        Wheel rearRight = new Wheel (19, 12, "winter", "Goodyear");
        Wheel rearLeft = new Wheel (19, 12, "winter", "Goodyear");

        wheels[0] = frontRight;
        wheels[1] = frontLeft;
        wheels[2] = rearRight;
        wheels[3] = rearLeft;
    }

    public String toString() {
        return "Ima " + this.make + " " + this.model + " " + this.trim;
    }

    public static void main(String[] args) {
        Engine engineOne = new Engine(8, 5, "premium", "boxer");

        Car bimmer = new Car("BMW", "135", "i", engineOne);
        bimmer.installWheels();
        System.out.println(bimmer.toString());

        for(Wheel wheel : bimmer.getWheels()) {
            System.out.println(wheel);
        }

        for(int i=0; i<bimmer.getWheels().length; i++) {
            System.out.println("Value of Wheel at index " + i + ": " + bimmer.getWheels()[i]);
        }
        System.out.println(bimmer.engine);
    }
}