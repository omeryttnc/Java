package techproed2020.day36interfacesiterators;

public interface Ainmal {
    /*
    Normally, we can not create concrete ethods in interfaces but we need it too much
    Java gives us an options to do it by using "default" keyword like in the following
    example.
     */
    //A default method is unique to an instance of the class
    void eat();
    default void drink(){
        System.out.println("one type");
    }
    //A default method is unique to a class.

    static void run (){
/*
When you create concrete methods by uing "default" or "static" keywords
it is not must to override them from concrete child class
 */
        System.out.println("another type");
    }
}
