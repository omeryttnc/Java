package practice.Day_04;

public class OCAType_2 {
    public static void main(String[] args) {
        String str = "M ";
        str = str.concat("E ");
        String add = "S ";
        str = str.concat(add);
        str.replace("S","T");
        str = str.replace("S","T");
        str = str.concat(add);
        System.out.println(str);
    }
}
