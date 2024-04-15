package CountNumberOfNodes;
import java.util.*;

public class Count {
    public static void printlevel(Node root){
        Queue<Node> q=new ArrayDeque<>();
        q.add(root);
        int max=0;
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=1;i<=n;i++){
                if(max<n) {
                    max=n;
                }
                Node temp=q.poll();
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null) {
                    q.add(temp.right);
                }
            }
        }
        System.out.println(max);
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
        printlevel(root);
    }
}
