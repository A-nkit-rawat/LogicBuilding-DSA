import java.util.Scanner;

class Q3_p2 {
    public static void main(String ... a){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the range \n Enter the lower range");
        int low=scan.nextInt();
        System.out.println("Enter the upper range");
        int high=scan.nextInt();
        System.out.println("++++++++++++++++++++++++++++++++");
        for(int i=low+1;i<high;i++){
            int flag=1;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    flag=0;
                    break;
                }
            }
            if(flag==1) System.err.println(i);
        }
        scan.close();
    }
}
