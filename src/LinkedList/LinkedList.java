package LinkedList;
import java.util.*;

public class LinkedList {
    static int count(Node head){
        int count=0;
        while(head!=null){
            if(head.data==1){
                count++;
            }
            head=head.next;
        }
        return count;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        a.next=b;
        b.next=c;
        c.next=null;
        Node head=a;
        int q=count(head);
        System.out.println(q);
    }
}
