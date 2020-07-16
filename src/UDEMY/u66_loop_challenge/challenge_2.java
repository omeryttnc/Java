package UDEMY.u66_loop_challenge;

public class challenge_2 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 0 ; i <= 100; i += 5){
            if(i > 80 ){
                System.out.println("You got A " + i);
                count ++;
            }
if(count==3){
    break;
}
        }
        System.out.println("Totally students " + count + " A");

    }
}
