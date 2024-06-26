import java.util.Scanner;

public class Q15_frequency {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int target=scn.nextInt();
        int count=0; 
        int temp=num;
        while(temp!=0){
            if(temp%10==target){
                count++;
            }
            temp=temp/10;
        }
        System.out.println(target+" is comming "+count+" times in "+num+" number");
        scn.close();
    }
}
