package techproed2020.day15dowhileoopdt;

public class DoWhile04 {
    public static void main(String[] args) {
        /*
        /Print the counting numbers which are divisible by 3 and less than 100
		//by using do-while loop
         */
        int i = 1;
        do{
            if(i % 3 ==0){
                System.out.println(i);
            }
            i++;
        }while(i<100);
    }
}
