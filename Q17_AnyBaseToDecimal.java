import java.util.Scanner;

class Q17{
    public static void main(String ... args){
        Scanner src=new Scanner(System.in);
        System.out.print("Enter the base : ");
        int base=src.nextInt();
        System.out.println("Enter the value:");
        int num=src.nextInt();
        int newForm=0;
        int j=0;
        System.out.println("Number changed to Decimal number :");
        for(int i=num;i!=0;i=i/10){
            newForm+=i%10*(int)Math.pow(base, j++);
        }
        System.out.println(newForm);
        src.close();
    }
    
}