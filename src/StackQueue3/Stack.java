package StackQueue3;

public class Stack {
    private Node top;

    private int heigth;

    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        heigth = 1;
    }

    public void printStack(){
        Node temp = top;
        while(temp != null){
            System.out.println(temp.value);
            temp =temp.next;
        }
    }

    public void getTop(){
        System.out.println("Top: " + top.value);
    }

    public void getHeight(){
        System.out.println("Height: " + heigth);
    }

    public void push(int value){
        Node newNode = new Node(value);
        if (heigth == 0){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
        heigth++;

    }

    public Node pop(){
        if(heigth == 0) return null;
        Node temp = top;
        top = top.next;
        temp.next = null;

        heigth--;

        return temp;

    }






}
