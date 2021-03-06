package com.bridgelabz.day14;

public class MyQueue<K>
{
    public final MyLinkedList<K> myLinkedList;
    public MyQueue()
    {
        myLinkedList=new MyLinkedList<>();

    }
    public void enqueue(INode<K> element)
    {
        myLinkedList.append(element);
    }
    public INode<K> peak()
    {
        return myLinkedList.head;
    }
    public void printQueue()
    {
        myLinkedList.printMyNode();
    }
    public INode<K> dequeue()
    {
        return myLinkedList.popLast();
    }
    
}
