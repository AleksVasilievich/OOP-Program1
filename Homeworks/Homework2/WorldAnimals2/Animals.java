package Homeworks.Homework2.WorldAnimals2;

public interface Animals {

    void info();

}

class People implements Animals {
    public String instruction;

    People(String instr) {
        this.instruction = instr;

    }

    public String getInstruction() {
        return instruction;
    }

    public void setSpeak(String instruction) {
        this.instruction = instruction;
    }

    @Override
    public void info() {
        System.out.println("People: " + instruction);
    }

}

class Cat implements Animals {
    public String instruction;

    Cat(String instr) {
        this.instruction = instr;

    }

    public String getInstruction() {
        return instruction;
    }

    public void setSpeak(String instruction) {
        this.instruction = instruction;
    }

    @Override
    public void info() {
        System.out.println("Cat: " + instruction);
    }

}

class Dog implements Animals {
    public String instruction;

    Dog(String instr) {
        this.instruction = instr;

    }

    public String getInstruction() {
        return instruction;
    }

    public void setSpeak(String instruction) {
        this.instruction = instruction;
    }

    @Override
    public void info() {
        System.out.println("Dog: " + instruction);
    }

}
