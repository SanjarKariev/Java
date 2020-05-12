package OOP;
import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        System.out.println(isInteger("Error"));
    }
    static boolean isInteger(String string){
        try{
            Integer.valueOf(string);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    String name; //название телефона
    String color; // цвет
    int amount; //кол-во телефонов
    int price; //цена телефона

    public Shop(String name, String color, int amount, int price) {
        this.name = name;
        this.color = color;
        this.amount = amount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

class Main{

    public static Scanner scan = new Scanner(System.in);
    public static ArrayList<Shop> list = new ArrayList<>();

    public static void main(String[] args) {
        Menu();
    }

    public static void Menu(){
        System.out.println("Выбрерите операцию: " + "\n"
                + "1. Внести в базу"+ "\n"
                + "2. Покупка");

        int Menu = scan.nextInt();
        if (Menu != 1 && Menu != 2){
            System.out.println("Введите корректное значение" + "\n");
            Menu();
        }
        switch (Menu){
            case 1:
                Data();
            case 2:
                Choose();
        }

    }

    public static void Data(){
        System.out.println("База: " + "\n"
                         + "1.Меню " + "\n"
                         + "2.Внести в базу. " + "\n"
                         + "3.Просмотреть данные базы." + "\n");

        int data = scan.nextInt();
        if (data != 1 && data != 2 && data != 3){
            System.out.println("Введите корректное значение" + "\n");
            Data();
        }
        switch (data){
            case 1:
                Menu();
            case 2:
                DataAdd();
            case 3:
                SoutData();
        }

    }

    public static void DataAdd(){
        System.out.println("Очерёдность внесения в базу:" + "\n"
                + "1.Телефон." + "\n"
                + "2.Цвет." + "\n"
                + "3.Кол-во телефонов." + "\n"
                + "4.Цена." + "\n"
                + "|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|" + "\n");

        String name = scan.next();
        String color = scan.next();
        int amount = Integer.parseInt(scan.next());
        int price = Integer.parseInt(scan.next());

        list.add(new Shop(name,color,amount,price));
            System.out.println("Телефон: " + list.get(list.size()-1).getName() + "\n"
                    + "Цвет: " + list.get(list.size()-1).getColor() + "\n"
                    + "Кол-во: " + list.get(list.size()-1).getAmount() + "\n"
                    + "Цена: " + list.get(list.size()-1).getPrice() + "\n");

        ActionSelection();
        DataAD();

    }

    public static void DataAD(){
        String name = scan.next();
        String color = scan.next();
        int amount = Integer.parseInt(scan.next());

        /*for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)){
                if (list.get(i).getColor().equals(color)){
                    if (list.get(i).getAmount() >= amount){
                        list.get(i).setAmount(list.get(i).getAmount() + amount);
                        System.out.println("Вы добавили колличесто товара" + "\n"
                                + "Телефон: " + list.get(i).getName() + "\n"
                                + "Цвет: " + list.get(i).getColor() + "\n"
                                + "Кол-во: " + list.get(i).getAmount());
                    }
                }
            }
        }*/
    }

    public static void ActionSelection(){
        System.out.println("Ваши дальнейшие действия:" + "\n"
                + "1.Добавить в базу устройство. " + "\n"
                + "2.Меню. " + "\n"
                + "3.Вывести всё что в базе. ");

        int AS = scan.nextInt();
        if (AS != 1 && AS != 2 && AS != 3){
            System.out.println("Введите корректное значение" + "\n");
            ActionSelection();
        }
        switch (AS){
            case 1:
                DataAdd();
            case 2:
                Menu();
            case 3:
                SoutData();
        }
    }

    public static void SoutData(){
        System.out.println("База всех устройств которые присутствуют на складе: " + "\n");
        for (int j = 0; j < list.size(); j++) {
            System.out.println("Телефон: " + list.get(j).getName() + "\n"
                    + "Цвет: " + list.get(j).getColor() + "\n"
                    + "Кол-во: " + list.get(j).getAmount() + "\n"
                    + "Цена: " + list.get(j).getPrice() + "\n");
        }
        System.out.println("Выберите дальнейшее действие: " + "\n"
                + "1.Меню." + "\n"
                + "2.Продолжить заполнять базу.");
        int SD =scan.nextInt();
        if (SD != 1 && SD != 2 ){
            System.out.println("Введите корректное значение" + "\n");
            SoutData();
        }
        switch (SD){
            case 1:
                Menu();
            case 2:
                DataAdd();
        }
    }

    public static void Choose(){
        System.out.println("Покупка: " + "\n"
                + "1.Меню. " + "\n"
                + "2.Покупка товара. " + "\n");

        int choose = scan.nextInt();
        if (choose != 1 && choose != 2){
            System.out.println("Введите корректное значение" + "\n");
            Choose();
        }

        switch (choose){
            case 1:
                Menu();
            case 2:
                chooseAdd();
        }
    }
    public static boolean chooseAdd(){
        /*for (int i=0; i<list.size(); i++) {
                 firstPlaceCell = placeList.get(i);
                for (int j=i+1; j<placeList.size(); j++) {
                    PlaceCell secondPlaceCell = placeList.get(j);
                    if (firstPlaceCell.getX() == secondPlaceCell.getX()
                            && firstPlaceCell.getY() == secondPlaceCell.getY()) {
                        return true;
                    }
                }
            }
            return false;
        }*/
        System.out.println("Воодите значения по очерёдности: " + "\n"
                + "1.Телефон. " + "\n"
                + "2.Цвет. " + "\n"
                + "3.Требуемое колличество. ");

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Телефон: " + list.get(i).getName() + "\n"
                    + "Цвет: " + list.get(i).getColor() + "\n"
                    + "Кол-во: " + list.get(i).getAmount());
        }

        System.out.println("Выберите дальнейшее действие: " + "\n"
                + "1.Меню. " + "\n"
                + "2.База. " + "\n");
        int chooses = scan.nextInt();
        switch (chooses) {
            case 1:
                Menu();
            case 2:
                Data();
        }
        return false;
    }
}
