package AnotherLab;


import java.util.Scanner;

public class Main extends List {
    public Main(String name, int amount, int price, String color) {
        super(name, amount, price, color);
    }

    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(isInteger(""));
    }
    static boolean isInteger(String string){
        try{
            Integer.valueOf(string);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
