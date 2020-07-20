package techproed2020.day29overriding.tekrar;

public class Animal {
    public static void main(String[] args) {

    }
    public void sound(){
        System.out.println("Animals make sound");
    }

    public void eat(){
        System.out.println("Eat all");
    }
    public Animal drink(){
        return new Animal();
    }
    public int add(){
        return 4;
    }
    public final void product(){
        System.out.println("Multipication");
    }
    public static void division(){
        System.out.println("Division");
    }
    private void m1(){
        System.out.println("Method one");
    }
}
