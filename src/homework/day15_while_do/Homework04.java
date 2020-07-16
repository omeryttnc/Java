package homework.day15_while_do;
/*
4) Write a program to print letters from c to m on the console by using do-while loop.

 */
public class Homework04 {
    public static void main(String[] args) {
        char i = 'c';

        do{
            System.out.print(i+ " ");
            i++;
        }while (i<= 'm');
    }
}
