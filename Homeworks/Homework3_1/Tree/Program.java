package Homeworks.Homework3_1.Tree;

public class Program {

    public static void main(String[] args) {

        String surname_perent = "Петров";
        String name_perent = "Иван";
        String patronymic_perent = "Сергеевич";
        // Вводим ФИО двух человек
        String surname_child = "Петров";
        String name_child = "Юрий";
        String patronymic_child = "Иванович";

        System.out.println();
        System.out.println("Стандартные интерфейсы");
        System.out.println();
        // Сравниваем Фамилии с помощью стандартного интерфейса
        People pr2 = (a) -> (a == surname_perent);
        if (pr2.test(surname_child)) {
            System.out.println("Фамилии совпадают");

            Parent pr1 = new Parent(surname_perent, name_perent, patronymic_perent);
            Child cl1 = new Child(surname_child, name_child, patronymic_child);

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

        if (!pr2.test(surname_child)) {
            System.out.println("Фамилии не совпадают");

            Parent pr1 = new Parent(surname_perent, "Иван", "Сергеевич");
            Child cl1 = new Child(surname_child, "Юрий", "Иванович");

            System.out.println("------------------");
            System.out.println("ФИО - 1");
            System.out.println("------------------");
            pr1.info();

            System.out.println("------------------");

            System.out.println("------------------");
            System.out.println("ФИО - 2");
            System.out.println("------------------");
            cl1.info();
            System.out.println("------------------");

        }
    }
}
