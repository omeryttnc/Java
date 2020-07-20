package techproed2020.day30polymorphismdt.tekrar;

public class Derived {
    public void getDetails (String temp){
        System.out.println("Derivered class " + temp);
    }
}


class Test extends Derived{
    public void getDetails (String temp){
        System.out.println("Test Class " + temp);
    //return 0;
    }
}