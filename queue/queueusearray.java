package queue;

public class queueusearray {
    private int data[];
    private int front;
     private int rear; 
     private int size; 
     public queueusearray(){
        data = new int[5];
     front = -1;
      rear = -1;
       size =0 ;
      }
      public int size(){
        return size ; 

      }
      public boolean isempty(){
        return size==0;

      }
      public int front(){
        return data[front];

      }
      public void  enqueue(int element){
          if(size==0){
            front =0;
        }
        if(size==data.length){
            return ;

        }
          rear++;
          if(rear==data.length){
            rear =0;
          }
          data[rear]=element;
          size++;

      }
      public void denque(){
                                                                                    
         }
    
}
