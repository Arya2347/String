import java.util.*;
public class maxinArray {
    public static int maxinArray(int arr[], int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int miso= maxinArray(arr,idx+1);
        if(miso>arr[idx]){
            return miso;
        }else{
            return arr[idx];
        }
    }
  public static void main(String[] args) {
      Scanner scn= new Scanner(System.in);
      int n= scn.nextInt();
      int arr[]=new int[n];
      for(int i=0; i<arr.length; i++){
          arr[i]=scn.nextInt();
      }
      int max= maxinArray(arr,0);
      System.out.println(max);
  }  
}
