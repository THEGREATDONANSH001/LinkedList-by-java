public class LinkedListAdd{
    class Node1{
        int data;
        Node1 next;
        Node1(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node1 head;
    public static Node1 tail;
    public void addFirst(int data){
        Node1 newNode=new Node1(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void print(){
        if(head==null){
            System.out.print("linked list is empty");
        }
        Node1 temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        LinkedListAdd ll=new LinkedListAdd();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(0);
        ll.print();
    }
}