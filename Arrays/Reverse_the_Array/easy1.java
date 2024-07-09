public class easy1 {
    public static int [] reverseTwoPointers(int [] arr){
        int i = 0;
        int j = arr.length-1;
        
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {1,5,3,7,3,5};
        int [] ans = reverseTwoPointers(arr);
        System.out.print("[");
        for (int i : ans){
            System.out.print(i+" ");
        }
        System.out.print("]");
    }
}