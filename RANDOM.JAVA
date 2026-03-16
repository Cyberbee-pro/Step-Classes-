import java.util.*;
public class RANDOM{
    public static void main (String args[]){
        int[] arr = {10,20,30,40};
        for(int i =0;i<arr.length;i++){
            sum+=arr[i];
        }
        int eSum =0;
        for (i=0;i<arr.length;i++){
            if(i%2==0){
                eSum=eSum+arr[i];
            }
        }
    }
}