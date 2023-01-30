package Homeworks.Homework4.Tree4;

class Parent<T> implements People<T> {

    String surname;
    String name;
    String patronymic;
    int num;

    Parent(String s, String n, String p) {
        this.surname = s;
        this.name = n;
        this.patronymic = p;
    }

    public Parent(String n, String p) {
        this.name = n;
        this.patronymic = p;
    }

    public Parent(int n) {
        this.num = n;
    }

    // @Override // так как Этот метод вызываю отдельно в каждом следующем подклассе
    public void info() {
        System.out.println("Фамилия: " + surname);
        System.out.println("Имя: " + name);
        System.out.println("Отчество: " + patronymic);
    }

    @Override
    public boolean test(T a) {
        return false;
    }

}