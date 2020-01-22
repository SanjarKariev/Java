package lab4;

import java.util.Scanner;

public class Saperscan {

        public static String field = "*";
        public static String[][] arr = new String[6][6];
        public static String cross = "x";
        public static int bomb1X = (int) (Math.random() * 6);
        public static int bomb1Y = (int) (Math.random() * 6);
        public static int bomb2X = (int) (Math.random() * 6);
        public static int bomb2Y = (int) (Math.random() * 6);
        public static int bomb3X = (int) (Math.random() * 6);
        public static int bomb3Y = (int) (Math.random() * 6);

        public static void main(String[] args) {
            Map();
            Player();
        }

        public static void Map() {
            for (int i = 0; i < 6; ++i) {
                for (int j = 0; j < 6; ++j) {
                    arr[i][j] = field;
                    System.out.print(arr[i][j] + "\t");
                }

                System.out.println();
            }
            System.out.println(bomb1X + " " + bomb1Y + "|" + bomb2X +" " + bomb2Y + "|"+ bomb3X +" " + bomb3Y);
        }
        public static void Player(){
            Scanner scan = new Scanner(System.in);
            int x = 0;
            int y = 0;

            boolean onn= true;
            int on = 0;
            while (on != 5) {
                System.out.println("Введи первое число: ");
                x = scan.nextInt();
                System.out.println("Введи второе число: ");
                y = scan.nextInt();
                if (!(x >= 0 && x <= 6) && !(y >= 0 && y <= 6)) {
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
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }
            checkWin(cross);
        }
        public static void checkWin(String sdf){
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
        }
}
