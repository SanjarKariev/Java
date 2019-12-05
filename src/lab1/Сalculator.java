package lab1;

import java.util.Scanner;

public class Сalculator {
    public static void main(String[] args) {
        System.out.println("Выберите операцию: "
                + "\n" + "1. Сумма"
                + "\n" + "2. Разница"
                + "\n" + "3. Произведение"
                + "\n" + "4. Частное"
                + "\n" + "5. Вывести все результат");//Преведствующее окно

        Scanner scan = new Scanner(System.in);
        //Сканер
        int output = 0;
        //Переменная, к которой мы будем подключать сканер для ввода наших значений
        int a = 0;
        //Переменная, к которой мы будем подключать сканер для ввода наших значений
        int b = 0;
        //Переменная, к которой мы будем подключать сканер для ввода наших значений

        output = scan.nextInt();
        //Подключаем сканер к нашей перменной с помощью которой будет вводится наше значение

        System.out.println("Введи Первое число: ");
        a = scan.nextInt();
        //Подключаем сканер к нашей перменной с помощью которой будет вводится наше значение

        System.out.println("Введи Второе число: ");
        b = scan.nextInt();
        //Подключаем сканер к нашей перменной с помощью которой будет вводится наше значение

        int summa;//+
        int raznost;//-
        int proivedenie;//*
        int chastnoe;/* / */

        summa = a + b;//Сумма
        raznost = a - b;//Разность
        proivedenie = a * b;//Произведение
        chastnoe = a / b;//Частное

        switch (output){
            case 1:
                System.out.println("Ответ: " + summa);
                System.exit(0);//Принуждённый выходиз программы
            case 2:
                System.out.println("Ответ: " + raznost);
                System.exit(0);//Принуждённый выходиз программы
        }//<-Вывод результата по выбранной операции
        if (output == 3){
            System.out.println("Ответ: " + proivedenie);
        }
        if (output == 4){
            System.out.println("Ответ: " + chastnoe);
        }
        if (output == 5){
            System.out.println("Сумма: " + summa
                    + "\n" + "Разница: " + raznost
                    + "\n" + "Произведение: " + proivedenie
                    + "\n" + "Частное: " + chastnoe);
        }
    }
}
