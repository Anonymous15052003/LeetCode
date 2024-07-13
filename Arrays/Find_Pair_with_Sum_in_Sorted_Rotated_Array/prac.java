package Find_Pair_with_Sum_in_Sorted_Rotated_Array;

public class prac {
    public static Boolean findPair(int [] arr, int target){
        int pivot = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i+1]<arr[i]){
                pivot = i+1;
                break;
            }
        }
        int l = pivot;
        int r = pivot-1;
        int n = arr.length;

        while (l!=r){
            if (arr[l]+arr[r]==target)return true;
            else if ((arr[l]+arr[r])<target){
                l = (l+1)%n;
            }
            else{
                r = (r-1+n)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {11, 15, 6, 8, 9, 10};
        int x = 16;
        System.out.println(findPair(arr, x));
    }
}
