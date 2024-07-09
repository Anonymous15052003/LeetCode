package Maximum_and_Minimum_Element_in_an_Array;

public class MinMaxFinder {
    public static int setmini(int [] arr, int N){
        int mini=Integer.MAX_VALUE;
        for (int i=0;i<N;i++){
            if (arr[i]<mini){
                mini=arr[i];
            }
        }
        return mini;
    }

    public static int setmax(int [] arr, int N){
        int maxi=Integer.MIN_VALUE;
        for (int i=0;i<N;i++){
            if (arr[i]>maxi){
                maxi=arr[i];
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,5,8,6,4,7};
        int N=arr.length;
        int mini=setmini(arr,N);
        int maxi=setmax(arr,N);
        System.out.println("Min is : "+mini);
        System.out.println("Max is : "+maxi);
    }
}
