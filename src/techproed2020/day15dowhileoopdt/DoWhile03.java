package techproed2020.day15dowhileoopdt;
//Print first 5 even counting numbers on the console by using do-while loop
public class DoWhile03 {
    public static void main(String[] args) {
        int i = 1;
        do {
            if(i % 2 ==0){
                System.out.println(i);
            }
            i++;
        }while(i<=10);
    }
}
