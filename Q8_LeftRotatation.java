import java.util.Scanner;

public class Q8_LeftRotatation {
    public static void main(String ... ab){
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=src.nextInt();
        System.out.println("Enter how many times you want to rotate");
        int rotate=src.nextInt();
        int temp=num;
        int count=0;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        if(rotate<0){
            rotate=count+rotate;
        }
        rotate=rotate%count;
        if(rotate!=0){
            int divisor=(int)Math.pow(10, rotate);
            int multiplier=(int)Math.pow(10, count-rotate);
            int rem=num%divisor;
            num/=divisor;
            num=num+rem*multiplier;
            
        }
        System.out.println("Rotated number is "+num);
        src.close();
    }

    
}
