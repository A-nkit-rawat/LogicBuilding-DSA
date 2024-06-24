import java.util.Scanner;

class Q2 {
    public static void  main(String [] a){
        Scanner input=new Scanner(System.in);
        int number= input.nextInt();
        if(number>90) System.out.println("Excellent");
        else if(number>80 && number<=90) System.out.println("Good");
        else if(number>70 && number<=80) System.out.println("Fair");
        else if(number>60 && number<=70) System.out.println("Meet Expectations");
        else if(number<=60) System.out.println("Below par");
        input.close();
    }
}
