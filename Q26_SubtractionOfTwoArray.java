public class Q26_SubtractionOfTwoArray {
    public static void main(String ... args){
        int arr[] ={0,0,0,1,5,8,4,3};
        int arr2[]={0,0,8,4,5,7,6,2};
        // first we have to decide which num is greater;
        int i=arr.length;
        int j=arr2.length;
        int p=0;
        int q=0;
        boolean flag=true;
        while(flag){
            if(i>j){
                if(arr[p]==0){
                    i--;
                    p++;
                }
                else flag=false;
            }
            else if(i==j){
                if(p>=0 && q>=0 && arr[p]==arr2[q] ){
                    i--;
                    j--;
                    p++;
                    q++;
                }
                if(arr[p]>arr2[q]){
                    j--;
                    flag=false;
                }
                else {
                    i--;
                    flag=false;
                }

            }
            else if(j>i){
                if(arr[q]==0){
                    j--;
                    q++;
                }
                else flag=false;
            }
            else{
                flag=false;
            }
            
        }
        int ans[]=new int[i>j?i:j]; 
        if(j>i){
            int [] temp=arr;
            arr=arr2;
            arr2=temp;
        }
        else if(i==0 && j==0){
            System.out.println(0);
            return;
        }
        // System.out.println(i+" "+j);
        
        i=arr.length-1;
        j=arr2.length-1;
        p=ans.length-1;
        q=0;
        while(p>=0){
            int val=0;
            int val2=0;
            if(i>=0){
                val=arr[i];
            }
            if(j>=0){
                val2=arr2[j];
            }
            
            if(val>=val2){
                if(q==-1){
                    val-=1;
                    q=0;
                }
                ans[p]=val-val2;
            }
            if(val<val2){
                // System.out.println(val+" "+val2);
                // return;
                ans[p]=(val+10)-val2;
                q=-1;
            }
            // System.out.print(ans[p]+" ");
            p--;
            i--;
            j--;
            
            
        }
        for(int ele:ans){
            System.out.print(ele);
        }
    }
}
