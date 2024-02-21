package Stack;
import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character> st=new Stack<>();
        for(char a:s.toCharArray()){
            st.push(a);
        }
        while(!st.isEmpty()){
            System.out.print(st.pop());
        }
        System.out.println();
    }
}
