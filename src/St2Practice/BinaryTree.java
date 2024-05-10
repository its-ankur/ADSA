package St2Practice;
import java.util.*;
class Node{
    static Node root=null;
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
    static void add(Node a){
        if(root==null){
            root=a;
        }
        Node temp=root;
        while(temp!=null){
            if(temp.left==null){
                temp.left=a;
                break;
            }
            else if(temp.right!=null){
                temp.right=a;
                break;
            }
            temp=temp.left;
        }
    }
    static void inorder(Node temp){
        if(temp==null){
            return;
        }
        else{
            inorder(temp.left);
            System.out.print(temp.data+" ");
            inorder(temp.right);
        }
    }
}
public class BinaryTree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=-1){
            Node a=new Node(n);
            Node.add(a);
            n=sc.nextInt();
        }
        Node temp= Node.root;
        Node.inorder(temp);
    }
}
