package lab12;

public class ChangeSort {
    public static void main(String[] args) {
        int[] arr = {-5, 4, -3, 1, 2};
        for (int i = 0; i < arr.length; i++) {
            int min =i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
                if (i != min){
                    int element = arr[i];
                    arr[i] = arr[min];
                    arr[min] = element;
                }
                System.out.println(arr[i]);

        }
    }
}
