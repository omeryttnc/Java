package techproed2020.day16constructors;

public class Animals {

    int height = 50;
    String name = "rabbit";
    boolean mammal = true;
    /*
    create 2 constructors one is with parameters, the other one is without parameter
     */

    Animals(int height,String name){
        this.height = height;
        this.name = name;

    }

    public static void main(String[] args) {
Animals cow = new Animals(5,"cow");
        System.out.println(cow.height + " " + cow.name);

    }
}
