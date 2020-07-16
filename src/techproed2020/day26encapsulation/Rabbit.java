package techproed2020.day26encapsulation;

import techproed2020.day27inheritance.Mammal;

public class Rabbit extends Mammal {
    public static void main(String[] args) {

        Rabbit rabbit = new Rabbit();
rabbit.eat();
rabbit.drink();
rabbit.move();
rabbit.feed();
        System.out.println(rabbit.breathe);

    }
}
