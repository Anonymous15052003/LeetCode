package Kth_Largest_Element_in_an_Array;

public class quickselect {
    public static int answer(int [] arr, int k){
        k = arr.length-k;
        
        int left = 0;
        int right = arr.length-1;

        while (left<right){
            int pivot = partition(arr,left,right);

            if (pivot<k){
                left = pivot+1;
            }
            else if (pivot>k){
                right = pivot-1;
            }
            else{
                break;
            }
        }
        return arr[k];
    }

    public static int partition(int [] arr, int left, int right){
        int l = left;
        int pivot = arr[right];
        
        for (int i=left;i<right;i++){
            if (arr[i]<=pivot){
                swap(arr,l,i);
                l+=1;
            }
        }
        swap(arr,l,right);
        return l;
    }

    public static void swap(int [] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void main(String[] args) {
        int [] nums = {3,2,1,5,6,4};
        int k = 2;
        int ans = answer(nums,k);
        System.out.println(ans);
    }
}
