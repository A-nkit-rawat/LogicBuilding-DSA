import java.util.Scanner;

public class Q12_BenjaminBulbs {
    public static void main(String ... args){
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the number of bulbs");
        int bulb=src.nextInt();
        System.out.println("Number of fluctuation are "+bulb);
        int i=1;
        while(i*i<=bulb){
            System.out.println(i*i);
            i++;
        }
        
        src.close();
    }
}
