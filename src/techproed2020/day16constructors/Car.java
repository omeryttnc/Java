package techproed2020.day16constructors;

public class Car {
int price = 20000;
int year = 2015;
String make = "Honda";
String type = "Civic";
//Car(){
//
//}

     Car(int year, String make, String type, int price) {
        this.year = year;
        this.make = make;
        this.type = type;
        this.price=price;
    }

    public static void main(String[] args) {

Car c3 = new Car(2018,"Infinitive","Q50",24000);
        System.out.println(c3.make);
        System.out.println(c3.year);
        System.out.println(c3.type);
        System.out.println(c3.price);
    }
}
