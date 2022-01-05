import java.util.*;
public class firstIndex {
    public static int firstindex(int arr[], int idx, int d){
        if(idx==arr.length){
            return -1;
        }
        int fii= firstindex(arr, idx+1,d);
        if(d==arr[idx]){
            return idx;
        }else{
            return fii;
        }
    }
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n= scn.nextInt();
       int arr[]=new int[n];
       for(int i=0; i<arr.length; i++){
           arr[i]=scn.nextInt();
       }
       int d= scn.nextInt();
       int fi= firstindex(arr,0,d);
       System.out.println(fi);
  }  
}
