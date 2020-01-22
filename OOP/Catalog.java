package OOP;
import java.util.ArrayList;

class list{
    public static void main(String[] args) {

        ArrayList<Operation> list = new ArrayList<>();
        list.add(new Operation(12000, "Снятие"));
        list.add(new Operation(13000, "Снятие"));
        list.add(new Operation(12000, "Поступление"));
        list.add(new Operation(12000, "Платеж"));
        list.add(new Operation(12000, "Платеж"));

        System.out.println("История операций по карте:" + "\n");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getType() + ": " +
                               list.get(i).getValue());
        }
    }
}

class Operation{
    private int value;
    private String type;

    public Operation(int value, String type) {
        this.value = value;
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}