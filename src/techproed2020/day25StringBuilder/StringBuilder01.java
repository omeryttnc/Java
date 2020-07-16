package techproed2020.day25StringBuilder;

public class StringBuilder01 {
    public static void main(String[] args) {
        StringBuilder stb1 = new StringBuilder();
        //1. way to create StringBuilder

        stb1.append("A");
        System.out.println(stb1);
        stb1.append("b");
        System.out.println(stb1);

        //2. way
        StringBuilder stb2 = new StringBuilder("Java");
        stb2.append("X");
        System.out.println(stb2);

        //3.way
        StringBuilder stb3 = new StringBuilder(5);
      //  stb3.append(4);
        stb3.append("abcdew");
        System.out.println(stb3);
        stb3.append("ds");
        System.out.println(stb3);

    }
}
