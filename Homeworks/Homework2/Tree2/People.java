package Homeworks.Homework2.Tree2;

public interface People {
    String surname = "Петров";

    void info();

}

class Parent implements People {
    String name = "Иван";
    String patronymic = "Сергеевич";

    @Override
    public void info() {
        System.out.println("Фамилия: " + surname);
        System.out.println("Имя: " + name);
        System.out.println("Отчество: " + patronymic);
    }
}

class Child implements People {

    String name = "Генадий";
    String patronymic = "Иванович";

    @Override
    public void info() {
        System.out.println("Фамилия: " + surname);
        System.out.println("Имя: " + name);
        System.out.println("Отчество: " + patronymic);
    }

}
