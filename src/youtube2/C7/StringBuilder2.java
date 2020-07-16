package youtube2.C7;

public class StringBuilder2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Welcome");
        str.append("sdfsdf");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.delete(5,9);
        System.out.println(str);
        str.replace(0,2,"000000000");
        System.out.println(str);
    }
}
