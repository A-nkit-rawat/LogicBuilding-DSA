
import java.util.Arrays;
import java.util.Stack;

public class Q29_NGETR {
    public static void main(String[] args) {
        int [] arr={2,5,9,3,1,12,6,8,7};
        Stack<Integer> st=new Stack<>();
        int [] ans=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            if(st.isEmpty()){
                // ans.add(-1)
                ans[i]=-1;
                st.push(arr[i]);
            }
            else{
                while((!st.isEmpty())&&st.peek()<arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    // ans.push(-1);
                    ans[i]=-1;
                }
                else{
                    // ans.push(st.peek());
                    ans[i]=st.peek();
                }
                st.push(arr[i]);
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
