import java.util.Scanner;

class Q1{
    public static void main(String [] b){
        Scanner input= new Scanner(System.in);
        int num=input.nextInt();
        int space=num-2;
        int j=num;
        for(int i=num;i>=1;i--){
            if(i==1 || i==num){
                int k=j;
                while(k!=0){
                    System.out.print("*");
                    k--;
                }
                System.out.println();
            }
            else{
                for(int p=space;p>=1;p--){
                    System.out.print(" ");
                }
                System.out.println("*");
                space--;
            }
        }
        input.close();
    }
}