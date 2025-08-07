package EXAM_PREPARE.P1_CORE;

class Animal {
    public  void hasLegs(){
        System.out.println("Most of the animal has 4 legs");
    }

    public void isDomestic(){
        System.out.println("Most of the animal are Domestic");
    }
}

class Dog extends Animal{
    @Override
    public void hasLegs() {
        super.hasLegs();

    }

    @Override
    public void isDomestic() {
        super.isDomestic();
    }
}

class  Tiger extends Animal{
    @Override
    public void hasLegs() {
        super.hasLegs();
    }

    @Override
    public void isDomestic() {
        super.isDomestic();
        System.out.println("Tiger are not Domestic Animals");
    }
}

public class P8_INHERITANCE {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.hasLegs();
        d1.isDomestic();

        Animal t = new Tiger();
        t.hasLegs();
        t.isDomestic();

    }
}
