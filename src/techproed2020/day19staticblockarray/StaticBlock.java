package techproed2020.day19staticblockarray;
/*
 1) static block is  a code block
 2) we use Static Block to initialize (Assigning first value) static variables
 3) Static Blocks are executed before all methods, before main method before all constructors
 4)if you have more than one static blocks, Java runs the above one first


** sometimes we need some variables before doing anything in that case we need to use static block
 */


public class  StaticBlock {
static int i;
    static {
        i = 12;
        System.out.println("1st static block");
    }

    static {
        System.out.println("2nd static block");
    }

    StaticBlock(){
        System.out.println("I am a constructor");
    }

    public static void main(String[] args) {
        System.out.println("I am main method");
StaticBlock obj1 = new StaticBlock();
    }
}
