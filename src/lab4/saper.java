package lab4;

import java.util.Scanner;

public class saper {
    public static Scanner scan = new Scanner(System.in);

    public static String field = "*";
    public static String cross = "x";

    public static int bomb1X = (int) (Math.random() * 6);
    public static int bomb1Y = (int) (Math.random() * 6);
    public static int bomb2X = (int) (Math.random() * 6);
    public static int bomb2Y = (int) (Math.random() * 6);
    public static int bomb3X = (int) (Math.random() * 6);
    public static int bomb3Y = (int) (Math.random() * 6);

    private static String[][] arr;

    public static void main(String[] args) {
       Map();
       Player();
    }

    public static void  Map() {
        System.out.println("Веедите длинну поля по оси x:");
        int x = scan.nextInt();
        System.out.println("Веедите длинну поля по оси y:");
        int y = scan.nextInt();
        arr = new String[x][y];

        if (!(x >= 1 && x <= 11) && !(y >= 1 && y <= 11)) {
            System.out.println("Введите от 1 до 10");
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                    saper.arr[i][j] = field;
                    System.out.print(saper.arr[i][j] + "\t");
            }
           System.out.println();
        }

            String[][] arr = new String[x][y];

            Update();
    }

    public static void Player() {
        int x = 0;
        int y = 0;
        int on = 0;
        boolean onn = true;
        while (on != 9) {
            System.out.println("Введи первое число: ");
            x = scan.nextInt();
            System.out.println("Введи второе число: ");
            y = scan.nextInt();
            if (!(x >= 0 && x <= 11) && !(y >= 0 && y <= 11)) {
                System.out.println("Введи от 0 до 6:");
            } else
                on++;

            while (onn) {
                System.out.println();
                if (arr[x][y].equals(field)) {
                    arr[x][y] = cross;
                } else {
                    System.out.println("Нельзя ставить, попробуйте снова");
                }
                if(x == bomb1X && y == bomb1Y ||
                        x == bomb2X && y == bomb2Y ||
                        x == bomb3X && y == bomb3Y){
                    System.out.println("you lost!");
                    System.exit(1);
                }
                onn =false;
            }
            onn = true;
            Update();
        }
    }

    public static void Update(){
        for (int i = 0; i <= arr.length; i++) {
            for (int j = 0; j <= arr.length; j++) {
                System.out.print(arr.length + "\t");
            }
            System.out.println();
        }
        //checkWin(cross);
    }
    /*public static void checkWin(String sdf){
       if (arr[0][0] == sdf && arr[0][1] == sdf && arr[0][2] == sdf ||
                arr[0][3] == sdf && arr[0][4] == sdf ||
                arr[0][5] == sdf ||

                arr[1][0] == sdf && arr[1][1] == sdf && arr[1][2] == sdf ||
                arr[1][3] == sdf && arr[1][4] == sdf ||
                arr[1][5] == sdf ||

                arr[2][0] == sdf && arr[2][1] == sdf && arr[2][2] == sdf ||
                arr[2][3] == sdf && arr[2][4] == sdf ||
                arr[2][5] == sdf ||

                arr[3][0] == sdf && arr[3][1] == sdf && arr[3][2] == sdf ||
                arr[3][3] == sdf && arr[3][4] == sdf ||
                arr[3][5] == sdf ||

                arr[4][0] == sdf && arr[4][1] == sdf && arr[4][2] == sdf ||
                arr[4][3] == sdf && arr[4][4] == sdf ||
                arr[4][5] == sdf ||

                arr[5][0] == sdf && arr[5][1] == sdf && arr[5][2] == sdf ||
                arr[5][3] == sdf && arr[4][4] == sdf ||
                arr[5][5] == sdf){
            System.out.println("you win!");
       }
    }*/
}
