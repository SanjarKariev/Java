package lab7;

public class HourlyPayment extends MyFirst {
    HourlyPayment(String name, Double salary) {
        super(name, salary);
    }

    @Override
    Double GetSalary() {
        return 20.8 * 8 * getSalary();
    }
}
