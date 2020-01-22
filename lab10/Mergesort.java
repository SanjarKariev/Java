package lab10;

public class Mergesort {
    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 1, 8, 7, 2, 4, 6, 3};
        PrintArr(arr);
        del(arr);
        PrintArr(arr);
    }
    public static void PrintArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();

    }

    public static int[] del(int[] arr){
        if (arr.length <= 1) {
            return arr;
        }

        int [] Left = new int[arr.length / 2];
        int [] Right = new int[arr.length - Left.length];
        System.arraycopy(arr, 0, Left, 0, Left.length);
        System.arraycopy(arr, Left.length, Right, 0, Right.length);
        Left = del(Left);
        Right = del(Right);

        merge(Left, Right, arr);
       // System.out.print(arr.length);
        return arr;
    }

    private static void merge(int[] Left, int[] Right, int[] result) {
        int LeftPos = 0, RightPos = 0, arrMergedPos = 0;
        while(LeftPos < Left.length && RightPos < Right.length) {
            if(Left[LeftPos] < Right[RightPos]){
                result[arrMergedPos] = Left[LeftPos];
                LeftPos++;
            }
            else{
                result[arrMergedPos] = Right[RightPos];
                RightPos++;
            }
            arrMergedPos++;
        }
        System.arraycopy(Left, LeftPos, result, arrMergedPos, Left.length - LeftPos);
        System.arraycopy(Right, RightPos, result, arrMergedPos,Right.length - RightPos);
    }
}