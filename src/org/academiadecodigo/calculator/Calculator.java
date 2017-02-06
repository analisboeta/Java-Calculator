

//FIXME what the hell is with this package import and shit?
package org.academiadecodigo.calculator;


/**
 * Created by codecadet on 29/09/16.
 */

public class Calculator {

    //propriedades
    private String brand;
    private String color;
    private int batteryLife = 100;
    private Brain brain;
    private Display display;


    //construtores
    public Calculator(String brand, String color) {
        this.brand = brand;
        this.color = color;
        this.brain = new Brain();
        this.display = new Display();
    }

    public Calculator() {
        this.brain = new Brain();
        this.display = new Display();
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

    public void recharge(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public Display getDisplay() {
        return display;
    }

    public void batteryUsage() {
        this.batteryLife = this.batteryLife - 5;
        if (batteryLife < 8) { // If the battery goes any lower than 8, the calculator will shutdown.
            System.exit(0);
        }
    }

    public void executeOperation( int n1, Operation operation, int n2) {
        batteryUsage();
        double result = brain.calculateResult(operation, n1, n2);
        getDisplay().showResult(result);
    }
}