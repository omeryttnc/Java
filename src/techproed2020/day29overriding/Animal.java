package techproed2020.day29overriding;

public class Animal {

    public static void main(String[] args) {












    }
    /*
    The overriding methods(methods inside the child class) cannot use
    more restricted access modifiers than overridden (methods inside the parent class) methods.
    The access modifiers of overriding methods can be same with or wider than overriding methods.
    for example; if overriding method access modifier is "default" then overriding method access modifier can be default protected and public

    the return type of overriding methods(methods inside the child) must be
    1) same with the return type of overridden  (methods inside the parent class) methods.
    2} The child at the return type of (methods inside the parent class) methods.
     */

    /*
    if the return type of overridden method is primitive then the return type of overriding method must be same
     with the return type of overridden method. Because there must be "IS-A" relationship between the return type in
     overriding and "IS-A" relationship between the classes but primatives are not classes so we can not talk about
     "IS-A" relationship between primitivies.
     */
    public void sound(){
        System.out.println("Animals make sound");
    }
    public void eat(){
        System.out.println("eat all");
    }
    //in the following method;
    /*
    return type is Animal. We can use class name as return type in methods.
    When you use return type different from "valid" you have to use return keyword.
    After the retun keyword you must type sth whose data type is matching with the return type if the method.
    To create an object we use "new" keyword and "constructure" but sometimes Java gives us different ways
    to create an object from a class like String = "Ali";
     */
    public Animal drink(){
        return new Animal();
    }
public int add(){
        return 4;
}
//if a method is "final" it means your cannot update its body
    //if you cannot update ody memthods it means overridign not meaning ful beacause of that Java doesnt allow to
    //override final methods
public final void product(){
    System.out.println("multipication");
}
/*
Java does not allow to override static methods because
static methods are shared by all objects so
    1) no need to override
    2) if a class updates the body it will affect all other classes this can cause some problems.

 */
public static void division(){
    System.out.println("Division");
}

/*
you can not access to private methods from other classess so you
cannot override private methods
 */
private void m1(){
    System.out.println("Method one");
}

/*
default methods can be accessed from other classes if you are in the same packages. so from the same packae you can override
to the default methods becauese of that you cannot override
 */
void m2(){

}
}
/*
public and protected methods can be overridden without any issue
 */
