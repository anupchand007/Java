package EXAM_PREPARE.P1_CORE;

interface Hunter{
    public void Eats();
    public void makeSound();
}

interface Prey{
    public void Eats();
    public  void runsFrom();
}

class Cat implements Hunter{
    @Override
    public void Eats() {
        System.out.println("Cat eats Mouse");
    }

    @Override
    public void makeSound(){
        System.out.println("Meowsss");
    }
}

class Mouse implements Prey{
    @Override
    public void Eats() {
        System.out.println("Mouse eats rice");
    }

    @Override
    public void runsFrom() {
        System.out.println("Mouse runs from CAT");
    }
}

public class P5_INTERFACE {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.Eats();;
        c.makeSound();

        Mouse m = new Mouse();
        m.Eats();
        m.runsFrom();
    }
}
