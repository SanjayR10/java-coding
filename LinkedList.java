package Simple_linked_list;

public class LinkedList             //LinkedList class  which contains a inner class for creating node object
{
    Node head;
    int count = -1;

    private class Node              //This is the Node inner class
    {
        private int data;
        private Node next;

        Node(int data)                 //Node inner class contains of int variable and node object variable
        {
            this.data = data;
            this.next = null;
        }
    }

    public void insertLast(int item)       //Method to insert a node in Linked List
    {
        ++count;
        var node = new Node(item);       //First create a new node for the given element
        if (head == null)                 //Check if the linkedlist is empty or not
            head = node;                 //if empty point the head to the newly created node
        else {
            Node n = head;             //if not empty,traverse the linked list untill we get the addess of the
            while (n.next != null)     //last  node..
                n = n.next;

            n.next = node;              //Change the address of the last node by newly created nodes address.
        }
    }

    public void print()             //method to print the link list
    {
        if (head == null)                 //check if the linkedlist is empty or not ,if empty print relevent message.
            System.out.println("No elements available in list");
        else {
            Node n = head;
            while (n.next != null) {       //if  not empty traverse untill null node ,print the nodes data
                System.out.println(n.data);
                n = n.next;
            }
            System.out.println(n.data);
        }
    }

    public void insertBegin(int item) {
        ++count;
        var node = new Node(item);     //create node for the new element
        if (head == null)              //check if list is empty ot not
            head = node;              //if empty point the head node to newly created node
        else {                          //if not empty just point the head to the newly created node
            Node n = head;           //point the newly created node to the older node
            head = node;
            node.next = n;
        }
    }

    public void insertAt(int index, int data)          //method to insert numbers at given index
    {
        if (index < 0 && index > count)                       //check if the index is in valid range
            System.out.println("Enter a valid index");
        else if (index == 0)                                   //if index ==0 ,then its same as insertBegin method
        {
            insertBegin(data);
        } else                                               //if index !=0,then create a new node
        {
            ++count;
            var node = new Node(data);                     //traverse upto index element
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;                     //add the new node address with previous nodes addresss
            n.next = node;                           //add the address of previous node to new node
        }
    }

    public void noOfElement()                     //Printing the no of element accordence with index
    {
        System.out.println(count + 1);
    }

    public void deleteBegining()             //Method to delete first element of the list
    {
        if (head == null)                       //Check if the list contains element or not
            System.out.println("Cannot Delete no element in the list");
        else                                  //If empty print relevant msg
        {
            --count;                           //if !empty print,point the head node to next node.
            head = head.next;
        }
    }

    public void deleteLast()                    //Method to delete last element of the list
    {
        if (head == null)                          //check empty or not if empty print relevant msg
            System.out.println("Cannot Delete no element in the list");
        else if(head.next==null)                 //if one element then put head ==null
        {
            --count;
            head=null;
        }
        else {                                  //if more element put second last nodes address as null
            --count;
            Node n = head;
            while (n.next.next!= null)
                n = n.next;
            n.next=null;
        }
    }

        public void deleteAt ( int index)                //method to delete at specific position
        {
            if (head == null && index > count)              //check if the element is present or not
                System.out.println("Cannot Delete no such element in the list");
            else if (index == 0) {                          //if not present ptint error msg
                deleteBegining();                     //if index 0, same as the deleting as begining
            } else                                     //if index not zero
            {
                --count;
                Node n = head;                      //de refer the deleting node at previous node
                Node n1 = null;
                for (int i = 0; i < index - 1; i++) {         //change the address of the previous node to upcoming node
                    n = n.next;
                }
                n1 = n.next;
                n.next = n1.next;
            }
        }

        public void middleNode() {
            if (head == null)
                System.out.println("No middle  node ");
            else if (head.next == null) {
                System.out.println(head.data);
            } else {
                Node slow = head;
                Node fast = head;
                while (fast.next != null &&fast.next.next!=null)
                {
                    fast=fast.next.next;
                    slow =slow.next;
            }
                System.out.println(slow.data);
        }
        }

        public void reverse()
        {
            Node cur=head;
            Node pre=null;
            Node ne=null;
            while(cur!=null)
            {
                ne=cur.next;
               cur.next=pre;
               pre=cur;
               cur=ne;
            }
            head=pre;
        }

}

