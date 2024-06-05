public class insertion {
   
        public static void insertionSort(int[] arr, int size) {
              for (int i= 1;i<size ;i++){
                  int j =i -1 ;
                 int temp = arr[i];
    while (j >= 0 && arr[j] > temp) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                // Place temp in its correct position
                arr[j + 1] = temp;
              }
            //Your code goes here
        }
    }
    

