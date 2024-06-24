import java.util.Scanner;

public class Q9_LcmAndHcf {
    public static void main(String ... ar){
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=src.nextInt();
        System.out.println("Enter the first number");
        int num2=src.nextInt();
        int max=Math.max(num1,num2);
        int min=Math.min(num1,num2);
        for(int i=max;i<=max*min;i++){
            if(i%max==0 && i%min==0){
                System.out.println("LCM of "+num1 +" and "+num2+" is "+i);
                System.out.println("HCM of "+num1 +" and "+num2+" is "+(min*max)/i);
                break;
            }
        }
        src.close();
        // we can also find HCF using DIvision method
        // divisior <-> quotient
        // remender <-> divisior
        // till remender become zero

    }
}
