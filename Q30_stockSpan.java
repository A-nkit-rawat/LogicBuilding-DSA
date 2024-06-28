import java.util.Arrays;
import java.util.Stack;

public class Q30_stockSpan {
    public static void main(String[] args) {
        int [] arr={1,5,7,12,18,15,16};
        Stack<Integer> st=new Stack<>();
        int[] ans= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(st.isEmpty()){
                ans[i]=i+1;
                st.push(i);
            }
            else{
                while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans[i]=i+1;
                    st.push(i);
                }
                else{
                    ans[i]=i-st.peek();
                    st.push(i);
                }
            }
            System.out.println(Arrays.toString(ans));
        }

    }
}
