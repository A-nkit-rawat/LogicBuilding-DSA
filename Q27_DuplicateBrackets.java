import java.util.Stack;

public class Q27_DuplicateBrackets {
    public static void main(String[] args) {
        String experssion="((a+b)+((d+e)))";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<experssion.length();i++){
            Character ch=experssion.charAt(i);
            if(ch!=')'){
                st.push(ch);
            }
            else{
                if(st.peek()=='('){
                    System.out.println(false);
                    return;
                }
                else {
                    while(st.peek()!='('){
                        st.pop();
                    }
                    st.pop();
                }

            }
            System.out.println(st);
        }
        System.out.println(true);
    }
}
