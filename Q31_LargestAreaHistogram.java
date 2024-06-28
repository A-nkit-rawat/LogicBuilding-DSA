import java.util.Arrays;
import java.util.Stack;

public class Q31_LargestAreaHistogram {
    public static void main(String[] args) {
        int arr[]={10,2,5,4,6,7};
        int sToR[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        int sToL[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            if(st.isEmpty()){
                st.push(i);
                sToR[i]=arr.length;

            }
            else{
                while(!st.isEmpty()&& arr[st.peek()]>=arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    sToR[i]=arr.length;
                }
                else{
                    sToR[i]=st.peek();
                }
                st.push(i);
            }
        }
        st.clear();;
        System.out.println(Arrays.toString(sToR));
        for(int i=0;i<arr.length;i++){
            if(st.isEmpty()){
                st.push(i);
                sToL[i]=0;
            }

            
            else{
                while(!st.isEmpty()&& arr[st.peek()]>=arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    sToL[i]=0;
                }
                else{
                    sToL[i]=st.peek()+1;
                }
                st.push(i);
            }
        }
        System.out.println(Arrays.toString(sToL));
        
        int[] area=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            area[i]=arr[i]*(sToR[i]-sToL[i]);
        }
               
        System.out.println(Arrays.stream(area).max().getAsInt());
    }
}
