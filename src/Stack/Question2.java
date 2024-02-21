package Stack;
import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a='[',b=']',c='(',d=')',e='{',f='}';
        String s=sc.nextLine();
        Stack<Character> st=new Stack<>();
        int flag=0;
        for(char q:s.toCharArray()){
            if(q==a || q==c || q==e){
                st.push(q);
            }
            else{
                char w=st.pop();
                if(!(q==b && w==a) && !(q==d && w==c) && !(q==f && w==e)){
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0 && st.isEmpty()){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not balanced");
        }
    }
}
