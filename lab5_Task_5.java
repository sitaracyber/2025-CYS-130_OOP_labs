class Animal {

    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    public void bark() {
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dog {

    public void cuteAction() {
        System.out.println("Puppy looks very cute");
    }
}

public class  lab1_Task_5 {

    public static void main(String[] args) {

        Puppy puppy = new Puppy();

        puppy.eat();
        puppy.bark();
        puppy.cuteAction();
    }
}
