package Homeworks.Homework3.Tree3;

public class Program {
    public static void main(String[] args) {
        Animals a1 = (n) -> {
            String m = "Утро";
            String l = "Обед";
            if (n == m) {
                System.out.println("Наступило утро !");

            } else if (n == l) {
                System.out.println("Тихий час !");
            }

            else {
                System.out.println("Пришол вечер !");
            }

        };

        a1.info("Утро");
        People p1 = new People("Барсик");
        Cat c1 = new Cat("Мяу-Мяу");
        Dog d1 = new Dog("Он под диваном");

        a1.info("Обед");
        People p2 = new People("Кис-Кис");
        Cat c2 = new Cat("Мур-Мур");
        Dog d2 = new Dog("И усом не ведет");

        a1.info("Вечер");
        People p3 = new People("Брысь");
        Cat c3 = new Cat("Фырк-Фырк");
        Dog d3 = new Dog("Вечно под ногами");

        p1.info(null);
        d1.info(null);
        c1.info(null);
        p2.info(null);
        d2.info(null);
        c2.info(null);
        p3.info(null);
        d3.info(null);
        c3.info(null);
    }
}
