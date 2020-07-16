package UDEMY.u86_challange_constructure;

public class SpecificTypes extends Car{
    private int handSteering;
    private int changingGears;
    private int speed;

    public SpecificTypes(String name, String size, int handSteering, int changingGears, int speed) {
        super(name, size);
        this.handSteering = handSteering;
        this.changingGears = changingGears;
        this.speed = speed;
    }
}
