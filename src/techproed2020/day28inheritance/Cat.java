package techproed2020.day28inheritance;

public class Cat extends Animal {

    public Cat() {
        super("Body");
        System.out.println("C");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
    }

	/*
	 When you use super() keyword Java looks for the
	 constructor from parent not from grand-parent
	 or grand-grand-parent...
	*/
}
