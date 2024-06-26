public class Q25_SumOfTwoArray {
    public static void main(String ... args){
        int arr[]={5263};
        int arr2[]={999554};
        int maxLength=arr.length<arr2.length?arr2.length:arr.length;
        int rem=0;
        int result=0;
        int i=0;
        for( i=0;i<(arr.length>arr2.length?arr2.length:arr.length);i++){
            result=(arr[arr.length-1-i]+arr2[arr2.length-1-i]+rem)%10*(int)Math.pow(10,i);
            rem=(arr[arr.length-1-i]+arr2[arr2.length-1-i]+rem)/10;
        }
        for(int j=i;j<maxLength;j++){
            if(maxLength==arr.length){
                result=result+(arr[arr.length-1-j]+rem)%10*(int)Math.pow(10,j);
                rem=(arr[arr.length-1-j]+rem)/10;
            }
            else{
                result=result+(arr2[arr2.length-1-j]+rem)*(int)Math.pow(10,j);
                rem=(arr[arr2.length-1-j]+rem)/10;
            }
        }
        result=result+(rem*(int)Math.pow(10, i));
        System.out.println(result);

    }
}   
