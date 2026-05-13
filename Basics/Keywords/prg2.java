import java.util.Scanner;

 class SimpleLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;

        // DO-WHILE: Runs the code first, then checks the condition
        do {
            System.out.println("Enter 1 for a loop, 2 for a message, or 0 to quit:");
            number = input.nextInt();

            switch (number) {
                case 1:
                    int i = 1;
                    // WHILE: Checks condition first, then runs
                    while (i <= 3) {
                        System.out.println("Loop count: " + i);
                        i++; 
                    }
                    break;
                case 2:
                    System.out.println("You chose number 2!");
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Try again.");
            }
        } while (number != 0); // Stops when number is 0
    input.close();
    }
}
