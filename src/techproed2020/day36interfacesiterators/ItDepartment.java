package techproed2020.day36interfacesiterators;

public abstract class ItDepartment implements Employee{
    @Override
    public abstract double salary(String department);

    @Override
    public void task() {
        System.out.println("Automation tester");

    }

    @Override
    public abstract void personalInfo();
}
