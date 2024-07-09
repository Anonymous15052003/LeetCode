public class easy2 {
    public static void reverseTwoPointers(int [] arr,int i, int j){
        if (i>=j)return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
        reverseTwoPointers(arr,i,j);
    }
    public static void main(String[] args) {
        int [] arr = {1,5,3,7,3,5};
        reverseTwoPointers(arr,0,arr.length-1);
        System.out.print("[");
        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.print("]");
    }
}
