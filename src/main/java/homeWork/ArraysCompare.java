package homeWork;
/* Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных,
но должны иметь одинаковую длину и содержать элементы одного типа по парно по индексам.*/

public class ArraysCompare {

    public static <T,Y> Boolean compareArrays(T [] a, Y [] b){
        return (a.length == b.length) && (a.getClass().isInstance(b));
    }
}
