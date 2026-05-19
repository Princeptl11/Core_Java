import java.util.Scanner;

public class closestdivisible {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt(); // jis number ke aas paas ke number chahiye

        System.out.print("Enter m: ");
        int m = sc.nextInt(); // jis number ke divisable hone  chahiye

        sc.close();
        for (int i = 0; ; i++) {
            if ((n + i) % m == 0) { // n ke aas paas ke number chahiye jo m se divisable ho
                System.out.println(n + i); 
                break;
            }
            if ((n - i) % m == 0) { // n ke aas paas ke number chahiye jo m se divisable ho
                System.out.println(n - i); 
                break;
            }
        }
    }
}