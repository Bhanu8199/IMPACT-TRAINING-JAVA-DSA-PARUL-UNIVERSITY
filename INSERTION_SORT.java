import java.util.Arrays;

public class InsertionSort {
  public static void main(String[] args) {
    
    //insertion sort
    
    int[] arr={9,4,3,1,99,49,78,32};
    for(int i=1;i<arr.length;i++){
      int ele=arr[i];
      int j=i-1;
      
      while(j>=0 && arr[j]>ele){
        arr[j+1]=arr[j];
        j--;
      }
      arr[j+1]=ele;
    }
    System.out.println(Arrays.toString(arr));
  }
}