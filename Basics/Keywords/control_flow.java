import java.util.Scanner;
class control_flow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        if (x > 5) {
            System.out.println("x is greater than 5");
        } else {
            System.out.println("x is not greater than 5");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
        }
        sc.close();
    }
 }
