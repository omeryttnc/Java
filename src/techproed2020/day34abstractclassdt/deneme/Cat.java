package techproed2020.day34abstractclassdt.deneme;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cats eat cheese");
    }

    @Override
    public void breathe() {

    }

    @Override
    public void sound() {
        System.out.println("Cats meow");
    }

    @Override
    public void drink() {
        System.out.println("Cats drink water and milk");    }
}
