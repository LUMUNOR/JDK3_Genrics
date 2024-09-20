package org.example;


import homeWork.Calculator;
import homeWork.Pair;
import homeWork.ArraysCompare;

public class Main {


    public static void main(String[] args) {
        //testPair();
        //testCalculator();
        testCompareArrays();
    }

    private static  void testCompareArrays(){
        ArraysCompare arraysCompare = new ArraysCompare();
        Integer[] arr1 = {0,2,4,3,9};
        Integer[] arr2 = {1,2,3,4,5};
        String[] arr3 = {"a","sss","fdf","sddf"};
        Double[] arr4 = {1.8,5.4,6.3,4.0};
        System.out.println(arraysCompare.compareArrays(arr1,arr2));
        System.out.println(arraysCompare.compareArrays(arr2,arr3));
        System.out.println(arraysCompare.compareArrays(arr3,arr4));
    }
    private static  void testPair(){
        Pair<?,?> pair = new Pair<>(1,"hello");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);
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