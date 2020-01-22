package AnotherLab;

import java.util.ArrayList;

public class List extends Mobile {

    public List(String name, int amount, int price, String color) {
        super(name, amount, price, color);
    }

    public static void main(String[] args) {
        ArrayList<Mobile> phone = new ArrayList<Mobile>();
      //  phone.add(new Mobile());
        System.out.println(phone);
    }

    public void AddMobile(Mobile currPhone){

    }
}
