package techproed2020.day38collectionsdt;
/*
Differences between Abstract Class and Interface
 1) Method Differences:
    ==> Abstract classes can have both abstract and concrete methods but
        interfaces normally can have just abstract methods.
        After Java 8, we can use "default" and "static" keywords to create
        concrete methods in an interface
 2) Variable Differences:
    ==> Abstract classes can have final or non-final, static or non-static variables. But interfaces can have just final(must be initialized) and just static varibles.
    ==> Abstract classes can have public, protected, default, private access variables but interfaces can have just public variables.
 3) Inheritance Differences:
    ==> We use "extends" keyword to inherit from a class(abstract or not) to a class(abstract or not).
    We use "implements" keyword to inherit from a  class(abstract or not) to interface.
    We use "extends" keyword to inherit from an interface to an interface.
    An interface cannot accept a class as parent
    ==> We cannot create multiple inheritance between classes but multiple inheritance is supported by Java when we use interfaces
 */
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class I01 {
    public static void main(String[] args) {

        //Another usage of Iterators

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("C");
        list.add("D");
        list.add("B");
        //System.out.println(list);//[A, C, D, B]

        //Update the list to [AX, CX, DX, BX]
        ListIterator<String> lit = list.listIterator();
//		while(lit.hasNext()) {
//			String el = lit.next();
//			lit.set(el + "X");
//		}
//		System.out.println(list);

        //Print the elements on the console in reverse order

		/*
		 If you decide to use hasPrevious() and previous() methods you have to use hasNext() and next()
		 methods first to move the pointer to the end of the list.
		 */
        while(lit.hasPrevious()) {
            Object el = lit.previous();
            System.out.print(el + " ");
        }

    }

}
