package techproed2020.day27inheritance;

public class Dog extends Mammal{
    boolean loyal = true;
    public static void main(String[] args) {
Dog dog = new Dog();
        System.out.println("can a dog breath? " + dog.breathe);
        System.out.println("can a dog loyal? " + dog.loyal);
        System.out.println("can a dog smell? " + dog.smell);
       /*
       I am able to use static "die" variable but it is not because4
       at the inheritance, it is because of the being static
        */
        dog.bark();
        dog.drink();
        dog.eat();
        dog.feed();
        dog.move();
        System.out.println(dog.die);

    }
    public void bark(){
        System.out.println("They bark");

    }
}
