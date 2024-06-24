import java.util.Scanner;
class Q4{
    public static void main(String [] abc){
        Scanner src=new Scanner(System.in);
        int num=src.nextInt();
        int a=0;
        int b=1;
        int c=0;
        for(int i=1;i<=num;i++){
            System.out.print(c+",");
            a=b;
            b=c;
            c=a+b;
        }
        src.close();
    }

}