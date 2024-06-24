import java.util.Scanner;

public class Q7_inverse {
    public static void main(String ... args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number");
        int val=scn.nextInt();
        int temp=val;
        int i=1;
        int newVal=0;
        while(temp!=0){
            newVal=newVal+i*(int)Math.pow(10,temp%10-1);
            System.out.println(newVal);
            temp=temp/10;
            i++;
        }
        System.out.println(newVal);
        scn.close();
    }
}
