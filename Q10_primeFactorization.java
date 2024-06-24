import java.util.Scanner;

class Q10{
    public static void main(String ... args){
        Scanner src=new Scanner(System.in);
        int val=src.nextInt();
        for(int i=2;i<=Math.sqrt(val);i++){
            while(val%i==0){
                val/=i;
                System.out.print(i+",");
            }
        }
        if(val!=1){
            System.out.println(val);
        }
        src.close();
    }
}