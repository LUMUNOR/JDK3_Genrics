package lesson;

import java.io.Serializable;

public class Lesson {
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

    private static class Cat implements Serializable {
        private String name;

        public Cat(){
            this.name = "Cat";
        }
        public void voise(){
            System.out.println("meow");
        }
    }

    private static <T> T pick(T first, T  second) {
        return second;
    }
}
