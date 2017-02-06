package org.academiadecodigo.calculator;

/**
 * Created by ana on 04-02-2017.
 */
public enum Operation {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }


    public String getSymbol() {
        return symbol;
    }

public static String showOperations(){
    String result = "Available Operations: ";

    // Operation.values() returns an array with all the enum values
    for(Operation operation : Operation.values()){
        result += operation.symbol + " ";
    }
    System.out.println(result);
    return result;
}




}
