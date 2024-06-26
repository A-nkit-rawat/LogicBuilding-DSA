import java.util.Scanner;

public class Q24_BarChart {
    public static void main(String ... args){
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int arr[]=new int[src.nextInt()];
        System.out.println("Enter the Elements");
        
        for(int i=0;i<arr.length;i++){
            arr[i]=src.nextInt();
        }
        int max=arr[0];
        // int min=arr[0];

        for(int j=1;j<arr.length;j++){
            if(arr[j]>max){
                max=arr[j];
            }
        }
        for(int i=max;i>=1;i--){
            for(int j=0;j<arr.length;j++){
                if(i<=arr[j]){
                    System.out.print("*\t");
                }
                else{
                    System.out.print(" \t");
                }
                
            }
            System.out.println();
        }
        src.close();
    }
}
