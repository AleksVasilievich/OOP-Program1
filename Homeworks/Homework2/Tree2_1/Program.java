package Homeworks.Homework2.Tree2_1;

public class Program {
    public static void main(String[] args) {

        // People pr1 = new People() {

        // @Override
        // void parent(){
        // System.out.println(surname);
        // }

        // @Override
        // void info(){
        // System.out.println(surname);

        // }

        // @Override
        // void child(){
        // System.out.println(surname);
        // }

        // }

        Parent pr1 = new Parent();
        Child cl1 = new Child();
        // Parent pr2 = new Parent();
        // Child cl2 = new Child();

        System.out.println("Abstract");
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
