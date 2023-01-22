package Homeworks.Homework2.WorldAnimals2;

public class Program {
    public static void main(String[] args) {

        People p1 = new People("Барсик");
        People p2 = new People("Кис-Кис");
        People p3 = new People("Брысь");

        Cat c1 = new Cat("Мяу-Мяу");
        Cat c2 = new Cat("Мур-Мур");
        Cat c3 = new Cat("Фырк-Фырк");

        Dog d1 = new Dog("Он под диваном");
        Dog d2 = new Dog("И усом не ведет");
        Dog d3 = new Dog("Вечно под ногами");

        p1.info();
        d1.info();
        c1.info();
        p2.info();
        d2.info();
        c2.info();
        p3.info();
        d3.info();
        c3.info();
    }

}
