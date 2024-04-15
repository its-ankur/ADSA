package CountNumberOfNodes;
import java.util.*;
public class mirror {
    public static void printMirror(Node root){
        Queue<Node> q=new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            for (int i=1;i<=n;i++) {
                Node temp = q.poll();
                System.out.print(temp.data + " ");
                if (temp.right != null) {
                    q.add(temp.right);
                }
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if(i==n){
                    System.out.println();
                }
            }
        }
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.left.left.left=new Node(8);
        printMirror(root);
    }
}
