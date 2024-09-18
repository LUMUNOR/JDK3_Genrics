package org.example;

import java.io.Serializable;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
//        GBox<String> stringGBox = new GBox<>("Hello");
//        stringGBox.showType();
//        GBox<Integer> integerGBox = new GBox<>(24);
//        integerGBox.showType();
//
//        //Использование сыррых типов (Raw type)
//        GBox<Integer> intBox = new GBox<>(1);
//        GBox box = intBox;
//
//        GBox box1 = new GBox(1);
//        GBox <Integer> intBox1 = box1;
//
//        GBox<Integer> intBox0 = new GBox<>(1);
//        GBox box0 = intBox0;
//        box.setValue(4);
        Serializable se1 = pick("d",new ArrayList<String>());
        System.out.printf("Тип %s\n",
                se1.getClass().getName());
        System.out.printf("Тип %s\n",
                pick("d",new ArrayList<String>()).getClass().getName());
    }
}