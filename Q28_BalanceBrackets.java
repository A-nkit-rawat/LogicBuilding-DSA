// false if not balanced
import java.util.Stack;

public class Q28_BalanceBrackets {
    public static void main(String[] args) {
        String testCase1="(({(a+b)-{[d*e]}-[p/q]}";
        // String testCase2="[(a+b)-{[d*e]}-{[p/q}]]";

        System.out.println(checkBalancedBrackets(testCase1));

    }
    public static boolean checkBalancedBrackets(String test){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<test.length();i++){
            Character ch=test.charAt(i);
            if(ch==')'||ch=='}'||ch==']'){
                if(!st.isEmpty()){
                    while(st.peek()!='{'&&st.peek()!='['&&st.peek()!='('){
                        System.out.println(st.pop());
                    }
                    if(ch==')'){
                        if(st.peek()!='('){
                            return false;
                        }
                    }
                    else if(ch=='}'){
                        if(st.peek()!='{'){
                            return false;
                        }
                    }
                    else if(ch==']'){
                        if(st.peek()!='['){
                            return false;
                        }
                    }
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else{
                System.out.println(ch);
                st.push(ch);
            }
            System.out.println(st);
            
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
        
        
    }
}
