package homeWork;
/* Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары,
а также переопределение метода toString(), возвращающее строковое представление пары.
Работу сдать в виде ссылки на гит репозиторий. */

public class Pair<F,S> {
    private F first;
    private S second;

    public Pair(F f,S s){
        this.first = f;
        this.second = s;
    }

    public F getFirst(){
        return first;
    }

    public S getSecond(){
        return second;
    }

    @Override
    public String toString() {
        return "First value: " + first.toString() + ", Second value:" + second.toString();
    }
}
