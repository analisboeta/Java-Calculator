package org.academiadecodigo.calculator;

/**
 * Created by codecadet on 29/09/16.
 */

public class Calculator {



    private String brand;
    private String color;
    private int batteryLife = 100;
    private Brain brain;



    public Calculator(String brand, String color) {
        this.brand = brand;
        this.color = color;
        this.brain = new Brain();
    }

    public Calculator() {
        this.brain = new Brain();
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public void batteryUsage(){
        this.batteryLife = this.batteryLife - 5;
        // If the battery goes any lower than 8, the calculator will shutdown.
        if (batteryLife < 8) {
            System.exit(0);
        }
    }

    public void add(int n1, int n2) {
        batteryUsage();
        int result = brain.add(n1, n2);
        System.out.println(n1 + " + " + n2 + " = "  + result);

    }

    public void subtract(int n1, int n2) {
        batteryUsage();
        int result = brain.subtract(n1,n2);
        System.out.println(n1 + " - " + n2 + " = "  + result);

    }

    public void multiply(int n1, int n2) {
        batteryUsage();
        int result = brain.multiply(n1, n2);
        System.out.println(n1 + " * " + n2 + " = "  + result);

    }

    public void divide(float n1, int n2) { // why is the second number an int?
        batteryUsage();

        if (n2 == 0) {
            System.out.println("Error: can't divide by zero");
            System.exit(0);
        } else {
            int result = brain.divide(n1, n2);
            System.out.println(n1 + " / " + n2 + " = "  + result);
        }
    }
}