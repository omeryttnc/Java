package techproed2020.day26encapsulation;

public class E03 {
    private String disease= "Headache";
    private int creditNumber;
    private boolean old= true;
    public static void main(String[] args) {
        /*
        1) create three variables which are disease, credit card number and old (boolean)
        2) Encapsulated them all
        3) Make the disease readable but not updatable
        4) Make credit card number updatable but not readble
        5) make the old both
         */
    }
/*
ıf the data type of encapsulated data ıs boolean do not use "get" for the getter method name
method name, use "is". This is naming convention of getters for encapsulated data.
For setters every time we use set.
 */

    public boolean isOld() {
        return old;
    }

    public void setCreditNumber(int creditNumber) {
        this.creditNumber = creditNumber;
    }

    public void setOld(boolean old) {
        this.old = old;
    }

    public String getDisease() {
        return disease;
    }

    }


/*
if you dont want any type data to be updatable DO NOT create SETTERS. if all data of a class are encapsulated no setter
method is created than the class is called "IMMUTABLE CLASS"
 */
