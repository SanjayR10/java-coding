package Queue;

public class Queue {
    int rear=0,front=0,size=0;
     int[] q;int len;

    Queue(int Size)
    {
       q=new int[Size];
       this.len=Size;
    }

    public void enQueue(int data){
        q[rear]=data;
       rear=(rear+1)%len;
       size=size+1;
    }

    public void deQueue() {
        if (size == 0)
            System.out.println("No elements in queue");
        else {
            int d = q[front];
            System.out.println("Deleted " + d);
            front = (front + 1) % len;
            size = size - 1;
        }
    }

    public void show(){

        System.out.print("Elements: ");

        for(int i=0;i<=rear%len;i++)
        System.out.print(q[(i+front)%len]+" ");
        System.out.println();


    }

    public void noOfElements()
    {
        System.out.println("size: "+size);
    }
}
