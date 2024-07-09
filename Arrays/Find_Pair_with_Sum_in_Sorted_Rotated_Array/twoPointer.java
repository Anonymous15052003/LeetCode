package Find_Pair_with_Sum_in_Sorted_Rotated_Array;

public class twoPointer {
    public static boolean findPair(int [] arr, int sum){
        int n = arr.length;
        int pivot = 0;
        for (int i=0;i<n;i++){
            if (arr[i]>arr[i+1]){
                pivot=i+1;
                break;
            }
        }
        int l=pivot;
        int r = pivot-1;
        while (l!=r){
            if (arr[l]+arr[r]==sum){
                return true;
            }
            else if (arr[l]+arr[r]<sum){
                l=(l+1)%n;
            }
            else{
                r=(r-1+n)%n;
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
