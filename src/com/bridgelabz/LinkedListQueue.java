package com.bridgelabz;

public class LinkedListQueue {
    public class Node<T>
    {
        Node next;
        T data;

    }
    public Node head=null;


    public void enqueue(String data)
    {
        //Initializing the new node object which is to be inserted.
        Node newNode=new Node();
        newNode.data=data;
        newNode.next=null;
        if(head==null)
            head=newNode;
        else
        {
            //Traversing through the linked list.
            Node tempNode=head;
            while(tempNode.next!=null)
            {
                tempNode=tempNode.next;
            }
            //Adding new node with its data.
            tempNode.next=newNode;
        }

    }
    public void print()
    {
        Node tempNode=head;
        while(tempNode!=null)
        {
            System.out.print(tempNode.data+" , ");
            tempNode=tempNode.next;
        }
    }
}

