

public class Animals {
    String speak;
    String hear;
    String move;

    Animals(String s, String h, String m) {
        this.speak = s;
        this.hear = h;
        this.move = m;
    }

    Animals(String s) {
        this.speak = s;
    }

    Animals() {
    }

    public String getSpeak() {
        return speak;
    }

    public String getHear() {
        return hear;
    }

    public String getMove() {
        return move;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    public void setHear(String hear) {
        this.hear = hear;
    }

    public void setMove(String move) {
        this.move = move;
    }

    void info() {
        System.out.println("говорит: " + speak);
        // System.out.println("Имя: " + hear);
        // System.out.println("Отчество: " + move);

    }

}

class People extends Animals {

    String p1 = "Барсик";
    String p2 = "Кис-Кис";
    String p3 = "Брысь";

    People() {
        setSpeak(p1);
    }

    People(String s) {
        super(s);
    }

}

class Cat extends Animals {
    String c1 = "Мяу-Мяу";
    String c2 = "Мур-Мур";
    String c3 = "Фырк-Фырк";

    Cat() {
        setSpeak(c1);
    }

    Cat(String s) {
        super(s);
    }

}