package Stack;
import java.util.*;
public class stockSpan {
    static void span(int[] a,int n,int[] s){
        Stack<Integer> st=new Stack<>();
        st.push(0);
        s[0]=1;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && a[st.peek()]<=a[i]){
                st.pop();
            }
            s[i] = (st.isEmpty()) ? (i + 1) : (i - st.peek());
            st.push(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] s=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        span(a,n,s);
        for(int i=0;i<n;i++){
            System.out.print(s[i]+" ");
        }
        System.out.println();
    }
}
