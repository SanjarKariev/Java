package lab1;

import java.util.Scanner;

public class Сalculator {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        fack();
    }

    public static void fack(){
        System.out.print("выберите операцию" +
                "\n" +
                "1.sum" +
                "\n" +
                "2.raz" +
                "\n" +
                "3.del" +
                "\n" +
                "4.umn" );
        int out = scan.nextInt();
        System.out.print("number `1");
        int a = scan.nextInt();
        System.out.print("number `2");
        int b = scan.nextInt();
        if (out == 1){
            int sum = a + b;
            System.out.println("Ответ:" + sum);
            fack();
            System.exit(0);
        }
        if (out == 2) {
            int raz = a - b;
            System.out.println("Ответ:" + raz);
            fack();
            System.exit(0);
        }
        switch (out){
            case 3:
                int del = a / b;
                System.out.println("Ответ:" + del);
                fack();
                System.exit(0);
            case 4:
                int umn = a * b;
                System.out.println("Ответ:" + umn);
                fack();
                System.exit(0);
        }
    }
}