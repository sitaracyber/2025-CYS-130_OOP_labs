abstract class AnimalOne {

    public void eat() {
        System.out.println("Animal is eating food");
    }

    abstract void sound();
}

class Cat extends AnimalOne {

    void sound() {
        System.out.println("Cat says Meow");
    }
}

class DogOne extends Cat {

    void sound() {
        System.out.println("Dog says Bark");
    }

    public void eat() {
        System.out.println("Dog is eating meat");
    }
}

public class lab4_Task_1 {

    public static void main(String[] args) {

        AnimalOne animal = new DogOne();

        animal.sound();
        animal.eat();
    }
}