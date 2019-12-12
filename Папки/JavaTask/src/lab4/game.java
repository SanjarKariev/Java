package lab4;

import java.util.Scanner;

public class game {
    public static String field = "*";
    public static String[][] arr = new String[10][10];
    public static String cross = "x";
    public static String circle = "o";
    private static boolean canMove = true;

    public static void main(String[] args) {
        Games();
        while (canMove) {
            People();
            CompMove();
        }

    }

    public static void Games() {
        System.out.println("Выберите клетку \n(0,0)(0,1)(0,2)\n(1,0)(1,1)(1,2)\n(2,0)(2,1)(2,2)\t\n");
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                arr[i][j] = field;
                System.out.print(arr[i][j] + "\t");
            }

            System.out.println();
        }

    }

    public static void UpDate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        checkWin(circle);
        checkWin(cross);
    }

    public static void CompMove() {
        int x = (int) (Math.random() * 3);
        int y = (int) (Math.random() * 3);
        if (arr[x][y] == "*") {
            System.out.println("Ход Компьютера:");
            arr[x][y] = circle;
            UpDate();

        } else {
            CompMove();
        }
    }

    public static void People() {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int last = 0;

        boolean on = true;
        while (on) {
            System.out.println("Введи первое число: ");
            first = scan.nextInt();
            System.out.println("Введи второе число: ");
            last = scan.nextInt();
            if (!(first >= 0 && first <= 2) && !(last >= 0 && last <= 2)) {
                System.out.println("Введи от 0 до 2:");
            } else
                on = false;
        }
        System.out.println(first + " " + last);
        if (arr[first][last].equals(field)) {
            arr[first][last] = cross;
            UpDate();
        } else {
            System.out.println("Нельзя ставить, попробуйте снова");
        }
    }
    public static void checkWin(String sdf) {
        if (arr[0][0] == sdf && arr[0][1] == sdf && arr[0][2] == sdf ||
                arr[1][0] == sdf && arr[1][1] == sdf && arr[1][2] == sdf ||
                arr[2][0] == sdf && arr[2][1] == sdf && arr[2][2] == sdf ||

                arr[0][0] == sdf && arr[1][0] == sdf && arr[2][0] == sdf ||
                arr[0][1] == sdf && arr[1][1] == sdf && arr[2][1] == sdf ||
                arr[0][2] == sdf && arr[1][2] == sdf && arr[2][2] == sdf ||

                arr[0][0] == sdf && arr[1][1] == sdf && arr[2][2] == sdf ||
                arr[0][2] == sdf && arr[1][1] == sdf && arr[2][0] == sdf) {
            System.out.println("you WIN");
            canMove = false;
        }
    }
}
