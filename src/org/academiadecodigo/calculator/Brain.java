package org.academiadecodigo.calculator;

/**
 * Created by codecadet on 14/11/16.
 */
public class Brain {


    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int subtract(int n1, int n2) {
        return n1 - n2;
    }

    public int multiply(int n1, int n2) {
        return n1 * n2;
    }

    public int divide(float n1, int n2) {

        if (n2 == 0) {
            return -1; //erro pode ser assim?

        } else {
            return (int) (n1 / n2);
        }

    }
}
