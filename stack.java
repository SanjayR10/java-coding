//Stack Implementation using array
import java.util.*;
class stack
{
    int stack[],a;
    public stack(int size)        //to get size of the stack
    {
        stack=new int[size];
        a=-1;
    }
    public static boolean isEmpty()
    {                         //to check whether the stack is empty or not
        return a==-1;
    }
    public static void push(int i)
    {                         //to push a node
        if(a+1<stack.length)
        stack[++a]=i;
    }
    public static int pop()
    {                         //to pop the node
        if(isEmpty())
        return 0;
        else 
        return stack[a--];
    }
    public static void main()
    {
        stack b=new stack(15);    //to print the output
        int i;
        System.out.println("The capacity of the stack is 15");
        System.out.println("how much element do you want to enter?");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(i=0;i<x;i++)
        {
            System.out.println("push:");
            push(sc.nextInt());
        }
        System.out.println("");
        for(int s=0;s<x;s++)
        System.out.println("Pop:"+pop());
    }
}
    
    