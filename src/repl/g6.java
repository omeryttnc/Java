package repl;

import java.text.DecimalFormat;

public class g6 {
    public static void main(String[] args) {


        double Width = 5.6;
        double Height = 8.5;
        double Area= Width * Height;
        String rArea = String.format("%.2f", Area);
        String rPerimeter= String.format("%.2f", 2*(Width+Height) );
        System.out.println("Area is 5.6 * 8.5 = "+rArea);
        System.out.println("Perimeter is 2 * (5.6 + 8.5) = "+rPerimeter);

    }
}