//TODO colocar os enums no construtor?

//FIXME what the hell is with this package import and shit?
package org.academiadecodigo.calculator;

import com.sun.corba.se.spi.orb.Operation;

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
    private Operation operation; // associar o enum às operacoes


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

    //metodos
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

    public void batteryUsage() {
        this.batteryLife = this.batteryLife - 5;
        if (batteryLife < 8) { // If the battery goes any lower than 8, the calculator will shutdown.
            System.exit(0);
        }
    }

    public void add(int n1, int n2) {
        batteryUsage();
        int result = brain.add(n1, n2);
        display.showResult(result);
    }

    public void subtract(int n1, int n2) {
        batteryUsage();
        int result = brain.subtract(n1, n2);
        display.showResult(result);
    }

    public void multiply(int n1, int n2) {
        batteryUsage();
        int result = brain.multiply(n1, n2);
        display.showResult(result);
    }

    public void divide(float n1, int n2) { // why is the second number an int?
        batteryUsage();

        if (n2 == 0) {
            display.showErrorMessage();
            System.exit(0);
        } else {
            int result = brain.divide(n1, n2);
            display.showResult(result);
        }
    }
}