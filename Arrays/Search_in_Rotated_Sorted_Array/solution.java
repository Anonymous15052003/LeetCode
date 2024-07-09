package Search_in_Rotated_Sorted_Array;

/* 
Identify the sorted half and search whether the target the present or not
If the target is not present then elimilate that half and go to the next half and perform binary search 
Divide the array into two parts and search 
*/

public class solution {
    public static int search(int [] arr, int n, int target){
        int low=0,high=n-1;

        while (low<=high){
            int mid=(low+high)/2;
            if (arr[mid]==target){
                return mid;
            }
            if (arr[low]<=arr[mid]){
                if (arr[low]<=target && target<=arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if (arr[mid]<=target && target<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        int n = 9, k = 1;
        int ans = search(arr, n, k);
        if (ans == -1)
            System.out.println("Target is not present.");
        else
            System.out.println("The index is: " + ans);
    }
}
