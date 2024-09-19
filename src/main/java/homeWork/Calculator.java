package homeWork;
/* Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа,
над которыми должна быть произведена операция. Методы должны возвращать результат своей работы. */

public class Calculator {

    public static <A extends Number, B extends Number> Double sum( A a, B b){
        return (Double)a+(Double)b;
    }

    public static <A extends Number, B extends Number> Double multiply( A a, B b){
        return (Double)a*(Double)b;
    }

    public static <A extends Number, B extends Number> Double divide( A a, B b){
        try {
            return (Double)a/(Double)b;
        } catch (ArithmeticException e){
            System.out.println("Деление на 0!");
            return 0.0;
        }
    }

    public static <A extends Number, B extends Number> Double subtract( A a, B b){
        return (Double)a-(Double)b;
    }

}
