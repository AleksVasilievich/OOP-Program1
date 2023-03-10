package Homeworks.Homework2.Tree2;

public interface People {

    public void setSurname(String surname);

    public void setName(String name);

    public void setPatronymic(String patronymic);

    void info();
}

class Parent extends PeoplePetrov {
    String surname = "Петров";
    String name = "Иван";
    String patronymic = "Сергеевич";

    Parent(String n, String p) {
        super(n, p);
    }

    @Override
    public void info() {
        System.out.println("Фамилия: " + surname);
        System.out.println("Имя: " + name);
        System.out.println("Отчество: " + patronymic);
    }
}

class Child extends PeoplePetrov {
    String name = "Генадий";
    String patronymic = "Иванович";

    Child(String n, String p) {
        super(n, p);

    }

    @Override
    public void info() {
        System.out.println("Фамилия: " + surname);
        System.out.println("Имя: " + name);
        System.out.println("Отчество: " + patronymic);
    }

}
