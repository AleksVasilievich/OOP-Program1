package Homeworks.Homework2.Tree2_1;

public abstract class People {

    String surname = "Петров";

    // abstract void setSurname(String surname);

    // abstract void setName(String name);

    // abstract void setPatronymic(String patrontmic);

    abstract void info();

}

class Parent extends People {

    String name = "Иван";
    String patronymic = "Сергеевич";

    @Override
    public void info() {
        System.out.println("Фамилия: " + surname);
        System.out.println("Имя: " + name);
        System.out.println("Отчество: " + patronymic);
    }

}

class Child extends People {

    String name = "Генадий";
    String patronymic = "Иванович";

    @Override
    public void info() {
        System.out.println("Фамилия: " + surname);
        System.out.println("Имя: " + name);
        System.out.println("Отчество: " + patronymic);
    }

}
