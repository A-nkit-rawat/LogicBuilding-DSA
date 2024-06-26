import java.util.Scanner;

class Q22{
    public static void main(String ... args){
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int arr[]=new int[src.nextInt()];
        System.out.println("Enter the Elements");
        
        for(int i=0;i<arr.length;i++){
            arr[i]=src.nextInt();
        }
        int max=arr[0];
        int min=arr[0];

        for(int j=1;j<arr.length;j++){
            if(arr[j]>max){
                max=arr[j];
            }
            if(arr[j]<min){
                min=arr[j];
            }
        }
        System.out.println("span of an array is : "+(max-min));
        src.close();
    }
}