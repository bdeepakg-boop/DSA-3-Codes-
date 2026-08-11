import java.util.Scanner;

public class Prime{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the number:");
        int n =sc.nextInt();
        while(n >0){
            int d=n%10;

            if(d == 2 || d==3 || d==5 || d==7)
                System.out.print(d + " ");
            n=n/10;
}
 
    }
}