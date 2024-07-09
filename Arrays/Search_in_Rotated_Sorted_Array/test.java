package Search_in_Rotated_Sorted_Array;

public class test {
    public static int search(int [] arr, int target){
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while (left<=right){
            int mid = (left+right)/2;
            if (target == arr[mid]){
                return mid;
            }
            else if (arr[left]<=arr[mid]){
                if (target>=arr[left] && target<=arr[mid]){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
            else{
                if (target>=arr[mid] && target<=arr[right]){
                    left = mid + 1;
                }
                else{
                    right = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        int k = 1;
        int ans = search(arr, k);
        if (ans == -1)
            System.out.println("Target is not present.");
        else
            System.out.println("The index is: " + ans);
    }
}
