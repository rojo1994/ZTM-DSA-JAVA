package LinkedList3;

public class LinkedListZTM {

    private Node head;
    private Node tail;
    private int length;

    public LinkedListZTM(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }

    }

    public void printListReverse(Node head){
        if(head == null)return;

        printListReverse(head.next);

        System.out.println(head.value);

    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }

        length++;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }

        length++;

    }

    public Node get(int index){
        if(index < 0 || index >= length) return null;
        Node temp = head;

        for(int i = 0; i < index; i++){
            temp = temp.next;
        }

        return temp;
    }

    public boolean insert(int index, int value){
        if(index < 0 || index >= length){
            return false;
        }

        if(index == length){
            append(value);
            return true;
        }

        if(index == 0){
            prepend(value);
            return true;
        }

        Node newNode = new Node(value);
        Node temp = get(index - 1);

        newNode.next = temp.next;
        temp.next = newNode;

        length++;

        return true;

    }

    public Node removeFirst(){
        Node temp = head;
        if(length == 0){
            return null;
        }

        head = head.next;
        temp.next = null;
        length--;

        return temp;
    }

    public Node removeLast(){
        Node temp = head;
        Node prev = head;
        while(temp.next != null){
            prev = temp;
            temp = temp.next;
        }

        tail = prev;
        tail.next = null;
        length--;

        return temp;
    }

    public Node remove(int index){
        if(index < length || index >= length)return null;
        if(index == 0){
            Node temp = head;
            head = head.next;
            temp.next = null;

            return temp;
        }

        Node prev = get(index - 1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;

        length--;
        return temp;

    }

    public static void main(String[] args) {

        LinkedListZTM ll = new LinkedListZTM(3);

        ll.append(76);
        ll.append(89);
        ll.prepend(1);
        ll.prepend(110);

        ll.printList();
        System.out.println("Reversed");
        ll.printListReverse(ll.head);

    }







}
