package Homeworks.Homework3.Tree3;

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