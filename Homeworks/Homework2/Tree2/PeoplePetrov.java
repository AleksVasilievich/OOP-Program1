package Homeworks.Homework2.Tree2;

public class PeoplePetrov implements People {
    String surname = "Петров";
    String name;
    String patronymic;

    PeoplePetrov(String n, String p) {
        this.name = n;
        this.patronymic = p;
    }

    PeoplePetrov(String s, String n, String p) {
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

    public void info() {
        System.out.println("Фамилия: " + surname);
        System.out.println("Имя: " + name);
        System.out.println("Отчество: " + patronymic);

    }

}
