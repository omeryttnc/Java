package UDEMY.u57_overlaoding;

public class calculateFeetAndInchesToCentimeter {

    public static void main(String[] args) {
        double centimeter = calculateFeetAndInchesToCentimere(-7, 5);
         if (centimeter < 0.0) {
            System.out.println("Invalid parameter");
        }
calculateFeetAndInchesToCentimere(100);
    }

    public static double calculateFeetAndInchesToCentimere(double feet, double inches) {
        if ((feet < 0) || (inches < 0 || inches > 12)) {
            System.out.println("invalid feet or inches parameters");
            return -1;
        }

        double centimeter = (feet * 12) * 2.54;
        centimeter += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches =" + centimeter + " cm");
        return centimeter;
    }


    public static double calculateFeetAndInchesToCentimere(double inches) {
        if (inches < 0){
            return -1;

        }
        double feet = (int) inches/12;
        double remaininginches = (int) inches % 12;
        System.out.println(inches + "inches is equals to " + feet +" feet and  " + remaininginches + "inches");
        return feet;
    }

}