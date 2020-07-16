package techproed2020.day28inheritance;

public class Classroom extends School{
    int area = 300;
    boolean broken = true;
    String name = "Math Class";

    public static void main(String[] args) {

    }

    public void science() {
        System.out.println("Science classroom");
    }

    public void desk() {
        System.out.println("Classroom desk");
    }
}
