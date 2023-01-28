package Homeworks.Homework3_1.Tree;

public interface People {

    boolean test(String a); // Добавил стандартный интерфейс

    // void info(); // Этот метод вызываю отдельно в каждом следующем подклассе

}

class Parent implements People {

    String surname;
    String name;
    String patronymic;

    Parent(String s, String n, String p) {
        this.surname = s;
        this.name = n;
        this.patronymic = p;
    }

    public Parent(String n, String p) {
        this.name = n;
        this.patronymic = p;
    }

    // @Override // так как Этот метод вызываю отдельно в каждом следующем подклассе
    public void info() {
        System.out.println("Фамилия: " + surname);
        System.out.println("Имя: " + name);
        System.out.println("Отчество: " + patronymic);
    }

    @Override
    public boolean test(String a) {
        return false;
    }

}

class Child implements People {

    String surname;
    String name;
    String patronymic;

    Child(String s, String n, String p) {
        this.surname = s;
        this.name = n;
        this.patronymic = p;
    }

    // @Override // так как Этот метод вызываю отдельно в каждом следующем подклассе
    public void info() {
        System.out.println("Фамилия: " + surname);
        System.out.println("Имя: " + name);
        System.out.println("Отчество: " + patronymic);
    }

    @Override
    public boolean test(String a) {
        return false;
    }

}
