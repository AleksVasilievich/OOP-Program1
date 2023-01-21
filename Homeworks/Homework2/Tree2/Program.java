package Homeworks.Homework2.Tree2;

public class Program {
    public static void main(String[] args) {

        Parent pr1 = new Parent();
        Child cl1 = new Child();

        System.out.println("------------------");
        System.out.println("ФИО - Родитель");
        System.out.println("------------------");
        pr1.info();
        System.out.println("------------------");

        System.out.println("------------------");
        System.out.println("ФИО - Ребёнок");
        System.out.println("------------------");
        cl1.info();
        System.out.println("------------------");
    }
}
