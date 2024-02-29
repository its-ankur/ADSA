package LinkedList;
import java.util.*;



public class LinkedList {
    public Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insertAtBeg(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void insertAtEnd(int a){
        Node newNode=new Node(a);
        if(head==null) {
            head = newNode;
            return;
        }
        Node last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=newNode;
    }
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public Node lastK(int k){
        if(head==null || k<=0){
            return head;
        }
        Node slow=head;
        Node fast=head;
        for(int i=0;i<k;i++){
            if(fast!=null){
                fast=fast.next;
            }
            else{
                return null;
            }
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public void delK(int k){
        if(head==null || k<=0){
            return;
        }
        Node slow=head;
        Node fast=head;
        for(int i=0;i<k;i++){
            if(fast!=null){
                fast=fast.next;
            }
            else{
                return;
            }
        }
        while(fast.next!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next=slow.next.next;
        display();
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a>=0){
            list.insertAtEnd(a);
            a=sc.nextInt();
        }
        System.out.println();
        int k=sc.nextInt();
        Node kth=list.lastK(k);
        System.out.println(kth.data);
        System.out.println("Linked List : ");
        list.display();
    }
}
