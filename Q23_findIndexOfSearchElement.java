import java.util.Scanner;

public class Q23_findIndexOfSearchElement {
    public static void main(String ... abc){
        
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size=src.nextInt();
        int [] arr= new int[size];
        System.out.println("Enter the element: ");
        for(int i=0;i<size;i++){
            arr[i]=src.nextInt();
        }
        System.out.println("Enter the number you want to find :");
        int target=src.nextInt();
        for(int j=0;j<arr.length;j++){
            if(arr[j]==target){
                System.out.println(j);
                break;
            }
        }
        src.close();
    }
    
}
