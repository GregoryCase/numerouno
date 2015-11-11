package com.numerouno.auto;

public class Engine {
    private int cylinders;
    private int displacement;
    private String fuelType;
    private String pistonArrangement;

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getPistonArrangement() {
        return pistonArrangement;
    }

    public void setPistonArrangement(String pistonArrangement) {
        this.pistonArrangement = pistonArrangement;
    }

    public Engine() {
        setCylinders(8);
        setDisplacement(5);
        setFuelType("premium");
        setPistonArrangement("boxer");
    }

    public Engine(int cylinders, int displacement, String fuelType, String pistonArrangement) {
        this.setCylinders(cylinders);
        this.setDisplacement(displacement);
        this.setFuelType(fuelType);
        this.setPistonArrangement(pistonArrangement);
    }

    public String toString() {
        return "I have " + getCylinders() + " cylinders, I displace" + getDisplacement() + " L, I only take " + getFuelType() + " type fuel, and my cylinders are arranged in a " + getPistonArrangement() + " form factor.";
    }
}

