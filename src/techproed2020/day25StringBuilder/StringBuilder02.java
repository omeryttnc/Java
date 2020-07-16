package techproed2020.day25StringBuilder;

public class StringBuilder02 {
    public static void main(String[] args) {
        //How to use substring () with StringBuilder

    StringBuilder str = new StringBuilder("Learn Java");

    /*
    if a method which you are using is coming from String class
    it cannot update the StringBuilder
     */
        System.out.println(str.substring(6));

        System.out.println(str);

//How to use multiple append () in one line
str.append("x").append("y");
        System.out.println(str);

        //how to use insert method
        //insert is different from the replace(); replace() method deletes the
        //character but insert() method just inserts without deleting

        str.insert(0,"A");
        System.out.println(str);
        str.replace(6,7,"/");
        //str.insert(6,"/");
        System.out.println(str);

// how to use delete();
        str.delete(1,6);
        System.out.println(str);

        // how to use deleteCharAt()

        str.deleteCharAt(1);
        System.out.println(str);
//How to use reserve()
        // if they ask you how to reserve a String
        // Tell them which one do you want reverse() in StringBuilder class or loops?
        //They will tell you use loops then start to type loops codes
        str.reverse();
        System.out.println(str);
StringBuilder stb2 = new StringBuilder(9);
// Difference between length() and capacity()
        stb2.append("aaabbbcccddd");
        System.out.println(stb2.capacity());
        System.out.println(stb2.length());
        //how to use setCharAt()
        stb2.setCharAt(1,'X');
        System.out.println(stb2);

 
    }
}
