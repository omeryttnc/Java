package youtube;

public class Car {
    //fields, properties
    private String colour;
    private String model;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        if(doors == 2 || doors == 4 ){

            this.doors = doors;
        }else{
            System.out.println("kapi sadece 2 veya 4 olabilir");
        }
    }

    private double engine;
    private int doors;
}