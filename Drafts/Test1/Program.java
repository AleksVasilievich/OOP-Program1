package Drafts.Test1;

class Program {
    private int X;
    private int Y;
    Direction direction;

    public Program(int X, int Y, Direction direction) {
        this.X = X;
        this.Y = Y;
        this.direction = direction;
    }

    public Direction getDirection() {
        return this.direction;
    }

    public int getX() {
        return this.X;
        // текущая координата X
    }

    public int getY() {
        return this.Y;
        // текущая координата Y
    }

    public void turnLeft() {
        switch (getDirection()) {
            case UP -> this.direction = Direction.LEFT;
            case LEFT -> this.direction = Direction.DOWN;
            case DOWN -> this.direction = Direction.RIGHT;
            case RIGHT -> this.direction = Direction.UP;
        }
        // повернуться на 90 градусов против часовой стрелки
    }

    public void turnRight() {
        switch (getDirection()) {
            case UP -> this.direction = Direction.RIGHT;
            case LEFT -> this.direction = Direction.UP;
            case DOWN -> this.direction = Direction.LEFT;
            case RIGHT -> this.direction = Direction.DOWN;
        }
        // повернуться на 90 градусов по часовой стрелке
    }

    public void stepForward() {
        switch (getDirection()) {
            case UP -> this.Y++;
            case LEFT -> this.X--;
            case DOWN -> this.Y--;
            case RIGHT -> this.X++;
        }
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
    }
}

enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}