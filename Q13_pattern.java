import java.util.Scanner;

public class Q13_pattern {
    public static void main(String ... args){
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the number");
        int val=src.nextInt();
        for(int i=1;i<=val;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
        src.close();
    }
}
