package Homeworks.Homework4.Tree4;

public class Program {

    public static void main(String[] args) {

        String surname_perent = "Петров";
        String name_perent = "Иван";
        String patronymic_perent = "Сергеевич";
        // Вводим ФИО двух человек
        String surname_child = "Петров";
        String name_child = "Юрий";
        String patronymic_child = "Иванович";
        // Или Вводим ID Фамильной Династии
        int surname_perent_num = 1;
        int surname_child_num = 2;

        System.out.println();
        System.out.println("Обобщения");
        System.out.println();
        // Сравниваем Фамилии или ID на выбор с помощью Обопщения
        People<Integer> pr2 = (a) -> (a == surname_perent_num);
        if (pr2.test(surname_child_num)) {
            System.out.println("Фамилии совпадают");

            Parent<String> pr1 = new Parent<>(surname_perent, name_perent, patronymic_perent);
            Child<String> cl1 = new Child<>(surname_child, name_child, patronymic_child);

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

        if (!pr2.test(surname_child_num)) {
            System.out.println("Фамилии не совпадают или Однофамильцы без родственных связей");

            Parent<String> pr1 = new Parent<>(surname_perent, "Иван", "Сергеевич");
            Child<String> cl1 = new Child<>(surname_child, "Юрий", "Иванович");

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
