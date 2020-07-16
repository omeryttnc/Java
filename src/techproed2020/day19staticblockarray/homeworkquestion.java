package techproed2020.day19staticblockarray;

public class homeworkquestion {
    int x = 3;
    int y = 5;
    homeworkquestion(){
        x += 1;
        System.out.print("-x" + x);
    }
    homeworkquestion(int i){
        this();
        this.y=i;
        x += y;
        System.out.print("-x" +x);
    }
    homeworkquestion(int i,int i2){
        this(3);
        this.x -=4;
        System.out.print("-x" +x);
    }


    public static void main(String[] args) {
    homeworkquestion mc1 = new homeworkquestion(4,3);
    }

}
