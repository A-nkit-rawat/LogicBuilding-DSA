import java.util.Scanner;

public class Q11_isPythagoreanTriplets {
    public static void main(String ... args){
        Scanner src=new Scanner(System.in);
        int a=src.nextInt();
        int b=src.nextInt();
        int c=src.nextInt();
        int H=a;
        int BorP=b;
        int PorB=c;
        if(b>a){
            H=b;
            BorP=a;
        }
        if(c>b){
            H=c;
            PorB=b;
        }
        if(Math.pow(H,2)==Math.pow(PorB,2)+Math.pow(BorP,2)){
            System.out.println("Numbers are pythagoreous triplet ");
        }
        else{
            System.out.println("Number are not pythogoreous triplet");
        }
        src.close();
    }
}
