package Find_Minimum_Number_of_Merge_Operations_to_Make_an_Array_Palindrome;

public class optimal {
    public static int findMinOps(int [] arr, int n){
        int ans=0;

        int i=0;
        int j=n-1;

        while (i<=j){
            if (arr[i]==arr[j]){
                i++;
                j--;
            }
            else if(arr[i]>arr[j]){
                j--;
                arr[j]=arr[j]+arr[j+1];
                ans++;
            }
            else{
                i++;
                arr[i]=arr[i]+arr[i-1];
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{1, 4, 5, 9, 1} ;
        System.out.println("Count of minimum operations is "+
                                findMinOps(arr, arr.length));
    
    }
}
