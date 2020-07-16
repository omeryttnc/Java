package youtube;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setColour("mavi");
        car1.setEngine(1.65);
        car1.setDoors(3);
        car1.setModel("Toyota");

//        car1.colour = "Silver";
//        car1.model = "Renault";
//        car1.engine = 1.6;
//        car1.doors = 4;
//
//        System.out.println("Arabamin rengi");
        System.out.println("color: " + car1.getColour());
        System.out.println("engine: " + car1.getEngine());
        System.out.println("door: " + car1.getDoors());
        System.out.println("model: " + car1.getModel());
    }
}
