package Homeworks.Homework3.Tree3;

public interface Animals {

    void info(String n);

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
    public void info(String n) {
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
    public void info(String n) {
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
    public void info(String n) {
        System.out.println("Dog: " + instruction);
    }

}
