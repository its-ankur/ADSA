package prioriyQueue;
import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PriorityQueue<Integer> q=new PriorityQueue<>();
        int n=sc.nextInt();
        int k= sc.nextInt();
        for(int i=0;i<n;i++) {
            int y= sc.nextInt();
            q.add(y);
        }
        for(int i=0;i<n;i++){
            int w=q.poll();
            w=-w;
            q.add(w);
        }
        int sum=0;
        for(int i=0;i<n;i++) {
            sum = sum + q.poll();
        }
        System.out.println(sum);
    }
}
