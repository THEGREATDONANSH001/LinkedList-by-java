public class LinkedListAdd3{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    
    
    public void ChoiceAdd(int key,int data){
        if(key==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<key-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public void print(){
        if(head==null){
            System.out.println("Linked list is empty.");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        LinkedListAdd3 ll=new LinkedListAdd3();
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.print();
        ll.ChoiceAdd(0,1);
        ll.ChoiceAdd(1,2);
        ll.ChoiceAdd(2,3);
        ll.print();

    }
}