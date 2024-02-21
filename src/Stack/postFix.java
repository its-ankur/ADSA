package Stack;
import java.util.*;
public class postFix {
    static int evaluate(String str){
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isDigit(c)){
                s.push(c-'0');
            }
            else{
                int val1=s.pop();
                int val2=s.pop();
                switch (c){
                    case '+':
                        s.push(val2+val1);
                        break;
                    case '-':
                        s.push(val2-val1);
                        break;
                    case '*':
                        s.push(val2*val1);
                        break;
                    case '/':
                        s.push(val2/val1);
                        break;
                }
            }
        }
        return s.pop();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(evaluate(str));
    }
}
