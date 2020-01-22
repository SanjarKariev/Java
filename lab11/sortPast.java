package lab11;

public class sortPast {
    public static void main(String a[]){
        int[] arr = {1, 3, 5, 8, 7, 2};
        int[] arrayP = sortP(arr);
        for(int i:arrayP){
            System.out.print(i);
            System.out.print("\t");
        }
    }

    public static int[] sortP(int[] sort){

        int temp;
        for (int i = 1; i < sort.length; i++) {
            for(int j = i; j > 0; j--){
                if(sort[j] < sort[j-1]){
                    temp = sort[j];
                    sort[j] = sort[j-1];
                    sort[j-1] = temp;
                }
            }
        }
        return sort;
    }
}
