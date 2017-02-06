package org.academiadecodigo.calculator;

/**
 * Created by codecadet on 14/11/16.
 */
public class Brain {

    public double calculateResult(Operation operation, double n1, double n2) {
        double result;
        switch (operation) {
            case ADD:
                result = n1 + n2;
                break;
            case SUBTRACT:
                result = n1 - n2;
                break;
            case MULTIPLY:
                result = n1 * n2;
                break;
            case DIVIDE:

                if (n2 == 0) {
                    result = -1;
                    System.err.println("divide by zero error");
                    System.exit(0);

                } else {
                    result = (n1 / n2);
                }
                result = n1 / n2;
                break;
            default:
                result = 0;
                System.out.println("Something went wrong...");
                break;
        }
        return result;
    }


}
