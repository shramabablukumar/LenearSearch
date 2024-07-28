import java.util.*;
public class Linear{
    public static void search(int arr[]){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 30){
                System.out.print(" the Element is find of array" + i);
            }
        }

    }
    public static void main(String args[]){
        int arr[] = {5,10,20,25,30,40,45};
            search(arr);

    }
}
