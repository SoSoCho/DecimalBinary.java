import java.util.Scanner;

public class DecimalBinary {

    public String toBinary(int n) {
        if (n == 0) {
            return "0";
        }

        // int rem = remainder of division by two numbers
        // n is of integer type

        String binary = "";
        while (n > 0) {
            int rem = n % 2;
            binary = rem + binary;
            n = n / 2;
        }
        return binary;
    }


    //pow() is used to calculate a number raise to the power of some other number.
    //This function accepts two parameters and returns the value of first parameter raised to the second parameter.
    // pow *= 2, means pow = pow*2
    // i/= 10, means divide i by 10 and put the result in i

    public int binaryTodecimal(int i) {
        int n = 0;
        for (int pow = 1; i > 0; pow *= 2, i /= 10)
            n += pow * (i % 10);
        return n;
    }

    public static void main(String[] args) {

        int answer2 = 0;
        String answer;

        final int info = 10;
        for (int i = 0; i < info; i++) {

            Scanner kb = new Scanner(System.in);
            System.out.println("==================================");
            System.out.println("Enter your choice: ");
            System.out.println("Press 1 to convert decimal to binary");
            System.out.println("Press 2 to convert binary to decimal");
            System.out.println("Press 3 to exit the converter");
            answer = kb.next();

            switch (answer) {
                case "1": // if the answer is one do this action
                    System.out.print("Enter a decimal number: ");
                    answer2 = kb.nextInt();
                    DecimalBinary decimalToBinary = new DecimalBinary();
                    String binary = decimalToBinary.toBinary(answer2);
                    System.out.println("The 8-bit binary representation is: " + binary);
                    break; // leave the switch

                case "2": // if answer is 2 do the following actions
                    System.out.print("Enter a binary number: ");
                    answer2 = kb.nextInt();
                    DecimalBinary binaryToDecimal = new DecimalBinary();
                    int n = binaryToDecimal.binaryTodecimal(answer2);
                    System.out.println("The decimal representation is: " + n);
                    break; // leave the switch case

                case "3": // when the answer is 3
                    System.out.println("Goodbye");
                    System.exit(0);

            }
        }
    }
}