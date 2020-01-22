package lab7;

public class FixedPayment extends MyFirst {

    public FixedPayment(String name, Double salary) {

        super(name, salary);
    }

    @Override
    Double GetSalary() {
        return getSalary();
    }
}
