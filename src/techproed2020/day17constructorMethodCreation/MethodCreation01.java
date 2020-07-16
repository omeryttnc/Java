package techproed2020.day17constructorMethodCreation;

public class MethodCreation01 {

    public static void main(String[] args) {
add();
substract(5,7);
       System.out.println(multiply(3,5  ));
     //   multiply(3,5);
    }
public static void add(){
    System.out.println("Addition");
}
public static void substract(int x,int y){
    System.out.println(x-y);
}
public static int multiply (int x, int y){
   // System.out.println(x*y);
       return x*y;

}


}
