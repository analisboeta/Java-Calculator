package org.academiadecodigo.calculator;

/**
 * Created by codecadet on 29/09/16.
 */
public class Main {


    public static void main(String[] args) {

        Calculator calc1 = new Calculator();
        // calc2.sum(); ->> erro que isto vai dar vai ser null pointer exception
        Calculator calc2;
        calc2 = new Calculator();

        System.out.println("Now it's possible to initiate Calculations!\n");
        Operation.showOperations();


        calc1.setColor("black");
        calc1.setBrand("Texas");
        calc2.setColor("purple");
        calc2.setBrand("Casio");

        System.out.println("\n\tCalculator number one is a " + calc1.getBrand() + " and it is " + calc1.getColor());

        System.out.println("\n\tCalculator number two is a " + calc2.getBrand() + " and it is " + calc2.getColor()+"\n");

        calc1.executeOperation(2345 + 3, Operation.ADD, 5); // expected output 2353.0
        calc1.executeOperation(30, Operation.SUBTRACT, 5); // expected output 25.0
        calc1.executeOperation(20, Operation.MULTIPLY, 5); // expected output 100.0
        calc1.executeOperation(12, Operation.DIVIDE, 3); // expected output 4.0


    }
}
