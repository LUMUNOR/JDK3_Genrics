package org.example;


import homeWork.Calculator;

public class Main {


    public static void main(String[] args) {
        testCalculator();
    }
    private static void testCalculator(){
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(-1,2.78678));
        System.out.println(calculator.multiply(-1,2.78678));
        System.out.println(calculator.divide(-1,2.78678));
        System.out.println(calculator.subtract(-1,2.78678));
        System.out.println(calculator.divide(2,0));
    }
}