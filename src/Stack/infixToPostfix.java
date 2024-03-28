package Stack;
import java.util.*;
public class infixToPostfix {
    static void infixToPostfix(String str){
        int n=str.length();
        char[] st=new char[n];
        int i=0;
        for(char s:str.toCharArray()){
            if(Character.isDigit(s)){
                st[i++]=s;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        infixToPostfix(str);
    }
}
