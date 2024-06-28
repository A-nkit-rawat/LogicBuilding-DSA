import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

class Q32{
    public static void main(String[] args) {
        System.out.println("Enter the window size : ");
        Scanner src=new Scanner(System.in);
        int size=src.nextInt();
        int arr[]={2,9,3,8,1,7,12,6,14,4,2,8,7,5,12,5};
        SWM(size, arr);
        src.close();
    }
    // i will keep increasing by 1 
    //j will jump to nge within the window
    //j =i if j<i
    public static void SWM(int size, int[] arr){
        int []ans=new int[arr.length-size];
        int nGtr[]=greatestToRight(arr);
        int j=0;
        for(int i=0;i<arr.length-size;i++){
            if(j<i){
                j=i;
            }
            while(i+3>=nGtr[j]){
                j=nGtr[j];
            }
            ans[i]=arr[j];
            
        }
        System.out.println(Arrays.toString(ans));
    }
    public static int[] greatestToRight(int [] arr){
        int ans[]=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            if(st.isEmpty()){
                ans[i]=Integer.MAX_VALUE;
                st.push(i);
            }
            else{
                while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans[i]=Integer.MAX_VALUE;
                }
                else{
                    ans[i]=st.peek();
                }
                st.push(i);
            }
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}