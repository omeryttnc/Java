package techproed2020.day27inheritance;

public class Insect extends Animal {
    boolean poison = true;

    public static void main(String[] args) {
        Insect insect = new Insect();
        System.out.println("are insect poison? " + insect.poison);
        System.out.println("can insects breath? " + insect.breathe);
        insect.drink();
        insect.eat();
        insect.invisiable();
        insect.move();
    }

    public void invisiable() {
        System.out.println("Some are insects are invisible");
    }
}
