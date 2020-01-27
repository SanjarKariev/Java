package lav13;

public class Generic<T extends Mass> {
    public void sumMass(){
        Mass mass1 = new Mass(10);
        int mass1Id = mass1.getMass();
    }
}
