package techproed2020.day29overriding;

public class Dog extends Animal {
    public static void main(String[] args) {



    }
    public void sound(){
        System.out.println("Dogs bark");
    }

    @Override
    public void eat() {
        System.out.println("Eat meat");

    }
}
