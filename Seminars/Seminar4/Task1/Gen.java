package Seminars.Seminar4.Task1;

public class Gen<T> {

    T ob; // Объявить объект типа Т

    Gen(T o) {
        ob = o; // Передать конструктору объект типа Т
    }

    T getOb() {
        return ob; // Вернуть объеект из метода
    }

    void showType() { // Отобразить тип Т

        System.out.println("Тип Т это:  " + ob.getClass().getName()); //
    }

}

class GenDemo {

    public static void main(String[] args) {

        Gen<Integer> iob; // Создаём ссылку на объект типа Integer
        iob = new Gen<Integer>(88); // Зоздаём экземпляр типа Integer
        iob.showType(); // Отобразить тип данных iob

        int v = iob.getOb(); // присваеваем примитиву значение объекта iob
        System.out.println("Значение: " + v);

        System.out.println();

        Gen<String> str = new Gen<String>("TastMessae");
        str.showType(); // Отобразить тип данных iob
        String str1 = str.getOb(); // присваеваем str1 значение объекта iob
        System.out.println("Значение: " + str1);

    }

}