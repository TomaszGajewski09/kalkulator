package com.kodilla.kalkulator;

public class Calculator {

    public int add(int x, int y){
        return x+y;
    }
    public int subtract(int x, int y) {
        return x-y;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(1,3);
        System.out.println(result);

        result = calculator.subtract(3,2);
        System.out.println(result);
    }
}
