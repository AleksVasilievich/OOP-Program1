
public class Program {
    public static void main(String[] args) {

        People p1 = new People();
        Cat c1 = new Cat();

        People p2 = new People("Кис-Кис");
        Cat c2 = new Cat("Мур-Мур");

        People p3 = new People("Брысь");
        Cat c3 = new Cat("Фырк-Фырк");

        System.out.println("People: ");
        p1.info();
        System.out.println("Cat: ");
        c1.info();

        System.out.println("People: ");
        p2.info();
        System.out.println("Cat: ");
        c2.info();

        System.out.println("People: ");
        p3.info();
        System.out.println("Cat: ");
        c3.info();
    }

}
