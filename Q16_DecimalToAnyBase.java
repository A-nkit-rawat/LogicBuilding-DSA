import java.util.Scanner;

public class Q16_DecimalToAnyBase {
    public static void main(String ... abc){
        Scanner src=new Scanner(System.in);
        int deci=src.nextInt();
        int base=src.nextInt();
        int temp=deci;
        int i=0;
        int newForm=0;
        while(!(temp<base)){
            newForm=newForm+temp%base*(int)Math.pow(10,i);
            temp/=base;
            i++;
        }
        newForm=newForm+temp*(int)Math.pow(10, i);
        System.out.println(newForm);
        src.close();
    }
}
