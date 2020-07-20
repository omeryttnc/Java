package techproed2020.day34abstractclassdt.deneme;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dogs eat meat");
    }

    @Override
    public void sound() {
        System.out.println("Dogs bark");
    }



    @Override
    public void drink() {
        super.drink();
    }
}
