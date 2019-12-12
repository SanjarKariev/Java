package lab9;
/* 1.Напишите метод на вход которого подается двумерный строковый массив
        размером 4х4, при подаче массива другого размера
        необходимо бросить исключение MyArraySizeException.
    2.Далее метод должен пройтись по всем элементам массива,
        преобразовать в int, и просуммировать.
        Если в каком-то элементе массива преобразование не удалось
        (например, в ячейке лежит символ или текст вместо числа),
        должно быть брошено исключе.*/

public class ArrayException {
    static int arrSize = 4;
    static String [][] arr = {{"6", "5", "8", ",5"}, {"4", "7", "8", "0"}, {"1", "3", "6", "2"}, {"0", "6", "3", "5"}};

    public static void main(String[] args){
    }

    public static void CheckArr(String[][] arr) throws MyArraySizeException {
        if (arr.length != arrSize) {
            System.out.println("За пределами масива");
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != arrSize) {
                System.out.println("Не коректный массив");
                throw new MyArraySizeException();
            }
        }
    }
    public static void SumArr(String[][] arr){

    }

    static boolean isInteger(String arr) {
        try {
            Integer.valueOf(arr);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
