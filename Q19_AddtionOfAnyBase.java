import java.util.Scanner;

public class Q19_AddtionOfAnyBase {
    public static void main(String ... abc){
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the base :");
        int b=src.nextInt();
        System.out.println("Enter the value first");
        int val1=src.nextInt();
        System.out.println("Enter the value second");
        int val2=src.nextInt();
        int sum=sum(b,val1,val2);
        System.out.println(sum);
        src.close();

    }
    public static int sum(int base,int num1,int num2){
        int rem=0;
        int addition=0;
        int i=0;
        while(num1!=0 && num2!=0){
            addition+=((num1%10+num2%10+rem)%base)*(int)Math.pow(10, i++);
            rem=(num1%10+num2%10+rem)/base;
            num1/=10;
            num2/=10;
            
        }
        while(num1!=0){
            addition+=(rem+num1)*Math.pow(10, i++);
            num1/=10;
            rem=0;
        }
        while(num2!=0){
            addition+=(rem+num2)*Math.pow(10, i++);
            rem=0;
            num2/=10;
        }
        addition+=rem*Math.pow(10,i);
        System.out.println(addition);
        return addition;
    }
}
