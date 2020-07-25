package techproed2020.day36interfacesiterators;

public class Accounting implements Employee {
    @Override
    public double salary(String department) {
        double task = 5000;
        double education = 5000;
        double numberOfKids = 5000;
        double hourlyRate = 5000;
        double salary = task +education + numberOfKids + hourlyRate; ;
        return salary;
    }

    @Override
    public void task() {
        System.out.println("Automation Tester");
    }

    @Override
    public void personalInfo() {
        System.out.println("2 kids, master degree");
    }
}
