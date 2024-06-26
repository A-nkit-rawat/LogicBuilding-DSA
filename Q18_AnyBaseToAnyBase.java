import java.util.Scanner;

public class Q18_AnyBaseToAnyBase {
    public static void main(String []a){
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the base");
        int b1=src.nextInt();
        System.out.println("Enter the value of above base");
        int val=src.nextInt();
        System.out.println("Enter the base you want to convert ");
        int b2=src.nextInt();
        System.out.println(anyDecimalToAnyBase(anyBaseToDecimal(val, b1),b2));
        src.close();

    }
    public static int anyBaseToDecimal(int val, int base){
        int newForm=0;
        int j=0;
        System.out.println("Number changed to Decimal number :");
        for(int i=val;i!=0;i=i/10){
            newForm+=i%10*(int)Math.pow(base, j++);
        }
        // System.out.println(newForm);
        return newForm;
    }
    public static int anyDecimalToAnyBase(int val,int base){
        int i=0;
        int newForm=0;
        while(!(val<base)){
            newForm=newForm+val%base*(int)Math.pow(10,i);
            val/=base;
            i++;
        }
        newForm=newForm+val*(int)Math.pow(10, i);
        return newForm;
    }
}
