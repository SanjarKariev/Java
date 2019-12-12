package lab7;

public abstract class MyFirst {
    private String name;
    private double salary;

    public MyFirst(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    abstract Double GetSalary();

}
