import java.util.Scanner;
public class practice{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter n : " );
        int n = input.nextInt();
        
        System.out.println("Enter m : " );
        int m = input.nextInt();
        input.close();

        int q = n/m;
        int n1 = m*q;
        int n2;

        if((n * m)>0){
            n2 = m*(q+1);
        } else {
            n2 = m*(q-1);
         }
        if(Math.abs(n-n1) < Math.abs(n-n2)){
            System.out.println("closest number divisible by " + m + " is: " + n1);
        } else {
            System.out.println("closest number divisible by " + m + " is: " + n2);
        }

    }
}