package techproed2020.day29overriding;

public class MethodSignature {
    public static void main(String[] args) {

    }
    /*
    Method signature contains just method name and
    parameteres,
    Access modifier, return type, method body or other keywords are not int
    the Method Signature
     */

    public void add(){
        System.out.println("Addition");
    }
    public int add2(int i){
        System.out.println("Addition");
        return 5;
    }
    private int add3(String str){
        System.out.println("Addition");
    return 5;
    }
}
