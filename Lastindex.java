import java.util.*;
public class Lastindex {
    public static int lastindex(int arr[], int d, int idx){
        if(idx==arr.length){
            return -1;
        }
        int Liisa= lastindex(arr, idx+1, d);
           if(arr[idx]==-1){
               if(arr[idx]==d){
                   return idx;
               }else{
                   return -1;
               }
           }
           else{
               return Liisa;
           }
    }
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]= scn.nextInt();
        }
        int d= scn.nextInt();
        int fi= lastindex(arr,0,d);
        System.out.println(fi);
    }
}
