package exercise;

public class g {

    public static void main(String[] args) {
        System.out.println(checkEnding("abc","bc"));
    }
        public static boolean checkEnding(String str1, String str2) {

        return str2.equals(str1.substring(str1.length() - str2.length() ));
    }
}
