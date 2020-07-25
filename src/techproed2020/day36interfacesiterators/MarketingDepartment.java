package techproed2020.day36interfacesiterators;

public abstract class MarketingDepartment implements Employee {
    @Override
    public abstract double salary(String department);

    @Override
    public void task() {
        System.out.println("Sales person");
    }

    @Override
    public abstract void personalInfo();
}
