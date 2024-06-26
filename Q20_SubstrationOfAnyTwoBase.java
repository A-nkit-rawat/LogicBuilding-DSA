import java.util.Scanner;

class Q20{
    public static void main(String ... args){
        Scanner src=new Scanner(System.in);
        System.out.println("enter the base");
        int base=src.nextInt();
        System.out.println("enter the first number");
        int num1=src.nextInt();
        System.out.println("enter the second number");
        int num2=src.nextInt();
        if(num1<num2){
            num1=num1+num2;
            num2=num1-num2;
            num1=num1-num2;
        }
        System.out.println(sub(base,num1,num2));
        src.close();
        
    }
    public static int sub(int base,int num1,int num2){
        int flag=0;
        int rem=0;
        int i=0;
        int sub=0;
        while(num2!=0)
        {
            int x=num1%10;
            int y=num2%10;
            if(flag==1){
                x-=1;
             }
            
            if(x-y<0){
                rem+=base;
                flag=1;
            }
             else{
                 flag=0;
                 }
             
            sub=sub+(((x+rem)-y)*(int)Math.pow(10,i++));
            num1/=10;
            num2/=10;
            rem=0;
        }
        while(num1!=0){
            int x=num1%10;
            if(flag==1){
                x-=1;
                flag=0;
            }
            sub+=x*Math.pow(10,i++);
            num1/=10;
        }
        return sub;

        
    }
}