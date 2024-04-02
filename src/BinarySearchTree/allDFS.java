package BinarySearchTree;
import java.util.*;
public class allDFS {
    public static void DFS(Node root){
        Stack<Pair> st=new Stack<>();
        ArrayList<Integer> pre=new ArrayList<>();
        ArrayList<Integer> in=new ArrayList<>();
        ArrayList<Integer> post=new ArrayList<>();
        st.push(new Pair(root,1));
        while(!st.isEmpty()){
            Pair q=st.pop();
            if(q.num==1){
                pre.add(q.a.data);
                q.num++;
                st.push(q);
                if(q.a.left!=null){
                    st.push(new Pair(q.a.left,1));
                }
            }
            else if(q.num==2){
                in.add(q.a.data);
                q.num++;
                st.push(q);
                if(q.a.right!=null){
                    st.push(new Pair(q.a.right,1));
                }
            }
            else if(q.num==3){
                post.add(q.a.data);
            }
        }
        for(int i=0;i<pre.size();i++){
            System.out.print(pre.get(i)+" ");
        }
        System.out.println();
        for(int i=0;i<in.size();i++){
            System.out.print(in.get(i)+" ");
        }
        System.out.println();
        for(int i=0;i<post.size();i++){
            System.out.print(post.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        DFS(root);
    }
}
