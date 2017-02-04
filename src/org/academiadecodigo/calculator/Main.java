package org.academiadecodigo.calculator;
/**
 * Created by codecadet on 29/09/16.
 */
public class Main {


    public static void main(String[] args) {

        Calculator calc1 = new Calculator();
Operation.showOperations();
        // calc2.sum(); ->> erro que isto vai dar vai ser null pointer exception

        Calculator calc2;
        calc2 = new Calculator();

        calc1.setColor("black");
        calc1.setBrand( "Texas");
        calc2.setBrand("purple");
        calc2.setBrand("Casio");

        System.out.println("Calculator number one is a " + calc1.getBrand() + " and it is " + calc1.getColor());

        System.out.println("Calculator number two is a " + calc2.getBrand() + " and it is " + calc2.getColor());

        calc1.add(2345 + 3, 5); // o resultado será 2353
        calc1.subtract(30, 5); // resultado esperado 25
        calc1.multiply(20, 5); // resultado experado 100
        calc1.divide(12, 3); // resultado esperado 4
    }
}
