package techproed2020.day30polymorphismdt.tekrar;

public class P02 extends P01{
    @Override
    public void add() {
        System.out.println("Addition");    }

    @Override
    public void add(int i) {
        super.add(i);
    }
}
