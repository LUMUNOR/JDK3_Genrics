package homeWork;
/* Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа,
над которыми должна быть произведена операция. Методы должны возвращать результат своей работы. */

public class Calculator {

    public static <A extends Number, B extends Number> Float sum( A a, B b){
        return ((Number)a.floatValue())+((Number)b.floatValue();
    }

}
