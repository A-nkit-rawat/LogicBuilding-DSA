import java.util.Scanner;

class Q6 {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int num=src.nextInt();
        int temp=num;
        int count=0;
        while(temp!=0){
            temp/=10;
            count++;
        }
        int p=(int)Math.pow(10, count-1);
        temp=num;
        while(p!=0){
            System.out.println(temp/p);
            temp=temp%p;
            p/=10;
        }
        src.close();
        
    }
}
