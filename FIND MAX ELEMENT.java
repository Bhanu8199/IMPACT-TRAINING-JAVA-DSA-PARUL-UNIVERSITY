public class Main {
  public static void main(String[] args) {
    
    // FIND THE MAX ELEMENT
    int[] arr={1,2,3,4,5,6};
    int max=arr[0];
    for(int i=0;i<arr.length;i++){
      if(max<arr[i]){
        max=arr[i];
      }
    }
    System.out.println(max);
  }
}