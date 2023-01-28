package Drafts.Test1;

public static void moveRobot(Robot robot, int toX, int toY) {
    public static void moveRobot(Robot robot, int toX, int toY) {
        int startX = Robot.getX();
        int startY = Robot.getY();
        int startDirection = Robot.getDirection();
        robot.stepForward(); // your implementation here
    }
}

public static void main(String[] args) {
    Robot robot = new Robot(); // Создание экземпляра класса Robot
    moveRobot(robot, -1, 8);   // Вызов вашего метода, в аргументы передаете координаты и экземпляр класса
    System.out.println(robot.getX()); // Вывод координат робота после выполнения метода
    System.out.println(robot.getY());
}
