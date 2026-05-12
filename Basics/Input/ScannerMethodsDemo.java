import java.util.Scanner;

public class ScannerMethodsDemo {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a boolean value(true/false):");
        boolean myBool = scanner.nextBoolean();
        System.out.println("nextBoolean(): " + myBool);

        System.out.println("Enter a byte value (-128 to 127):");
        byte myByte = scanner.nextByte();
        System.out.println("nextByte(): " + myByte);

        System.out.println("Enter a double value:");
        double myDouble = scanner.nextDouble();
        System.out.println("nextDouble(): " + myDouble);

        System.out.println("Enter a float value:");
        float myFloat = scanner.nextFloat();
        System.out.println("nextFloat(): " + myFloat);

        System.out.println("Enter an integer value:");
        int myInt = scanner.nextInt();
        System.out.println("nextInt(): " + myInt);

        System.out.println("Enter a long value:");
        long myLong = scanner.nextLong();
        System.out.println("nextLong(): " + myLong);

        System.out.println("Enter a short value:");
        short myShort = scanner.nextShort();
        System.out.println("nextShort(): " + myShort);

        System.out.println("Enter a single word:");
        String singleWord = scanner.next();
        System.out.println("next(): " + singleWord);

        System.out.println("Enter a full line:");
        String fullLine = scanner.nextLine();
        System.out.println("nextLine(): " + fullLine.trim());

        scanner.close();
    }
}