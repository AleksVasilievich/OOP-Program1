package Homeworks.Homework1.Tree;

public class People {
    String surname;
    String name;
    String patronymic;

    People(String n, String p) {
        this.name = n;
        this.patronymic = p;
    }

    People(String s, String n, String p) {
        this.surname = s;
        this.name = n;
        this.patronymic = p;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    void info() {
        System.out.println("Фамилия: " + surname);
        System.out.println("Имя: " + name);
        System.out.println("Отчество: " + patronymic);

    }
}

class Parent extends People {
    String surname = "Петров";

    Parent(String n, String p) {
        super(n, p);
        setSurname(surname);

    }

}

class Child extends Parent {

    Child(String n, String p) {
        super(n, p);
        setSurname(surname);
    }

}
