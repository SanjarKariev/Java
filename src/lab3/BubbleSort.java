package lab3;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 0, 9, 4};
        int perem;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    perem = arr[i];
                    arr[i] = arr[j];
                    arr[j] = perem;
                }
            }
            System.out.println("Сортировка завершена: " + arr[i]);
        }
    }
}
