

public class selection {
    public static void selectionsort (int [] arr){
        for (int i=0 ;i<arr.length-1;i++){
            int min = arr[i];
            int minindex = i;
            for(int j =i+1;j<arr.length;j++){
                if(arr[j]<min){
                   min = arr[j];
  
                    minindex = j;
                     }
  
            }
            int temp = arr[i];
  
            arr[i]=arr[minindex];
            arr[minindex]=temp;
          }
          }
}