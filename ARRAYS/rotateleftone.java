package ARRAYS;
import java.util.Arrays;
public class rotateleftone{
    static void rotateleft(int arr[],int n){
        int temp = arr[0];
        for(int i = 1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6};
        rotateleft(arr, 6);

    }
}