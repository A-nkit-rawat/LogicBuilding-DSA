public class Q14_pattern {
    public static void main(String ... args){
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(7);
        pattern5(5);
        pattern6(5);
        pattern7(5);
        pattern8(5);
        pattern9(5);
        pattern10(5);
        pattern16(5);
    }
    public static void pattern1(int val){
        for(int i=1;i<=val;i++){
            for(int j=i;j<=val;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
    public static void pattern2(int val){
        int temp=val;
        int space=0;
        int star=val;
        while(temp!=0){
            for(int i=1;i<=space;i++){
                System.out.print(" \t");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*\t");
            }
            System.out.println();
            temp--;
            space++;
            star--;
        }
    }
    public static void pattern3(int val){
        int star=1;
        int space=val-1;
        int temp=val;
        while(temp!=0){
            for(int i=1;i<=space;i++){
                System.out.print(" \t");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*\t");
            }
            System.out.println();
            temp--;
            star++;
            space--;
        }
    }
    public static void pattern4(int val){
        int space=val/2;
        int star=1;
        int times=val;
        while(times!=0){
        for(int i=1;i<=space;i++){
            System.out.print(" \t");
        }
        for(int j=1;j<=star;j++){
            System.out.print("*\t");
        }
        System.out.println();
        if(times>val/2+1){
            
            star+=2;
            space--;    
        }
        else{
            star-=2;
            space++;
            }
        times--;
        } 
    
    }
    public static void pattern5(int val){
        int star=val/2+1;
        int space=1;
        for(int i=1;i<=val;i++){
            for(int j=1;j<=star;j++){
                System.out.print("*\t");
            }
            for(int k=1;k<=space;k++){
                System.out.print(" \t");
            }
            for(int l=1;l<=star;l++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i<=val/2){
                star--;
                space+=2;
            }
            else{
                star++;
                space-=2;
            }

        }
    }
    public static void pattern6(int val){
        int os=0; // increase to 1
        int is=val-2; // reduce to 2
        for(int i=1;i<=val;i++){
            
            for(int j=1;j<=os;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k=1;k<=is;k++){
                System.err.print(" ");
            }
            if(!(i==val/2+1)){
            System.out.print("*");
            }
            System.out.println();
            // System.out.println("");
            if(i<=val/2){
                is-=2;
                os++;
            }
            else{
                os--;
                is+=2;
            }
        }

    }
    public static void pattern7(int val){
        int is=-1;
        int os=val/2;
        for(int i=1;i<=val;i++){
            for(int j=1;j<=os;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k=1;k<=is;k++){
                System.out.print(" ");
            }
            if(!(i==1 || i== val)){
                System.out.print("*");
            }
            if(i<=val/2){
                os--;
                is+=2;
            }
            else{
                os++;
                is-=2;
            }
            System.out.println();
        }
    }
    public static void pattern8(int val){
        int a=1;
        for(int i=1;i<=val;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+++"\t");
            }
            System.out.println();
            
        }
    }
    public static void pattern9(int val){
        int a,c=0;
        int b=1;
        for(int i=1;i<=val;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c+"\t");
                a=b;
                b=c;
                c=a+b;
            }
            System.out.println();
        }

    }
    public static int factorial(int num){
        int temp=num;
        if(num==0) return 1;
        for(int i=1;i<num;i++){
            temp*=i;
        }
        return temp;
    }
    public static void pattern10(int val){
        for(int i=0;i<val;i++){
            for(int j=0;j<=i;j++){
                // System.out.println(factorial(i));
                // System.out.println(factorial(j));
                // System.out.println(factorial(i-j));
                int p=factorial(i)/(factorial(j)*factorial(i-j));
                System.out.print(p+"\t");
            }
            System.out.println();
            
        }
        pattern11(2);
    }
    public static void pattern11(int val){
        for(int i=1;i<=10;i++){
            System.out.println(String.format("%d * %d = %d", val,i,val*i));
        }
        pattern12(7);
    }
    public static void pattern12(int val){
        int sp=val/2;
        int star=1;
        int p=0;
        for(int k=1;k<=val;k++){
            for(int i=1;i<=sp;i++){
                System.out.print(" \t");
            }
            for(int j=1;j<=star;j++){
                
                if(j<=(star/2)+1){
                    p++;
                    System.out.print(p+"\t");
                }
                else{
                    p--;
                    System.out.print(p+"\t");
                }
            }
            System.out.println();
            if(k<=val/2){
                sp--;
                star+=2;
                
            }
            else{
                p-=2;
                sp++;
                star-=2;
            }
            
        }
        pattern13(4);
    }
    public static void pattern13(int val){
        int sp=(val+val-1)-2;
        int st=1;
        for(int l=1;l<=val;l++){
            for(int i=1;i<=st;i++){
                System.out.print(i+"\t");
            }
            for(int j=1;j<=sp;j++){
                System.out.print(" \t");
            }
            for(int k=st;k>=1;k--){
                if(!(k==val)){
                    System.out.print(k+"\t");
                }
            }
            System.out.println();
            sp-=2;
            st++;
        }
        pattern14(5);
    }
    public static void pattern14(int val){
        int sp=val/2;
        int st=1;
        for(int i=1;i<=val;i++){
            for(int j=1;j<=sp;j++){
                if(i==val/2+1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print(" \t");
                }
            }
            for(int k=1;k<=st;k++){
                System.out.print("*\t");
            }
            if(i<=val/2){
                st++;
            }
            else{
                st--;
            }
            System.out.println();
        }
    }
    public static void pattern15(int val){
        int sp=val-2;

        for(int i=1;i<=val;i++){
            System.out.print("*");
            for(int k=1;k<=sp;k++){
                if(i==val/2+1){
                    System.out.println("*");
                }
                else if(i>val/2+1){

                }
            }
            System.out.print("*");
        }
        
    }
    public static void pattern16(int val){
        for(int i=1;i<=val;i++){
            for(int j=1;j<=val;j++){
                if(j==1 || j==val|| ((i+j==val+1||i==j) && (i>val/2))){
                    System.out.print("*\t");
                }
                else{
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
    
}
