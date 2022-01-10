package Dynamic_stack;

public class DynamicStack {
    int capacity=2;
    int[] Stack=new int[capacity];
    int top=0,topp=0;

    public void push(int data) {
        if(capacity==top)
            extend();
        topp=top;
         Stack[top++]=data;
    }

    private void extend() {
        capacity=capacity*2;
        int[] new_stack=new int[capacity];
        for(int i=0;i<top;i++)
        {
            new_stack[i]=Stack[i];
        }
        Stack=new_stack;
    }

    public void show(){
        for(int i:Stack)
            System.out.print(i+" ");
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack UnderFlow");
        } else {
            int d = Stack[topp];
            Stack[topp] = 0;
            System.out.println("popped " + d);
            top = --topp;
            top = top + 1;
            strink();
        }
    }

    private void strink() {
        if(top-1<=(capacity/2)/2)
        {
            capacity=capacity/2;
            int[] new_stack=new int[capacity];
            for(int i=0;i<top;i++)
            {
                new_stack[i]=Stack[i];
            }
            Stack=new_stack;
        }
    }

    public void peek(){
        System.out.println("Peek element is "+Stack[topp]);
    }

    public boolean isEmpty()
    {
        if(top==0)
            return true;
        else
            return false;
    }

    public int size()
    {
        return top;
    }
}
