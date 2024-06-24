import java.util.Scanner;

class Q5{
    public static void main(String... ar){
        Scanner src=new Scanner(System.in);
        int number =src.nextInt();
        int temp=number;
        int count=0;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        System.out.println(String.format("number of digit in %d is %d", number,count));
        src.close();
    }
}