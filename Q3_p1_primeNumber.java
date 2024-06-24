import java.util.Scanner;

class Q3 {
    public static void main(String [] a){
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the number ");
        int number=src.nextInt();
        int flag=1;
        if(number<2) {
            System.out.println("Not a prime number");
            src.close();
            return;
        }
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0) {
                System.out.println(number+" is not a prime number ");
                flag=0;
                break;
            }
        }
        if(flag==1) System.out.println(number+" is  prime number");

        src.close();
    }
}
