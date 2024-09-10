package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static class GBox<T>{ // Обобщенный класс
        private T value;

        public GBox (T value){
            this.value = value;
        }

        public T getValue(){
            return value;
        }

        public void setValue(T value){
            this.value = value;
        }

        public void showType(){
            System.out.printf("Тип %s, со значением %s \n",
                               value.getClass().getName(),getValue());
        }

    }

    public static void main(String[] args) {
        GBox<String> stringGBox = new GBox<>("Hello");
        stringGBox.showType();
        GBox<Integer> integerGBox = new GBox<>(24);
        integerGBox.showType();

        //Использование сыррых типов (Raw type)
        GBox<Integer> intBox = new GBox<>(1);
        GBox box = intBox;

        GBox box1 = new GBox(1);
        GBox <Integer> intBox1 = box1;

        GBox<Integer> intBox0 = new GBox<>(1);
        GBox box0 = intBox0;
        box.setValue(4);
    }
}