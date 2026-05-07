import java.util.Scanner;

public class Numbers {

    void findEven(int start, int end) {
        boolean found = false;
        System.out.print("Even numbers: ");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) System.out.print("No even numbers in this range");
        System.out.println();
    }

    void findOdd(int start, int end) {
        boolean found = false;
        System.out.print("Odd numbers: ");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) System.out.print("No odd numbers in this range");
        System.out.println();
    }

    void findPrime(int start, int end) {
        boolean found = false;
        System.out.print("Prime numbers: ");
        for (int i = start; i <= end; i++) {
            if (i > 1) {
                boolean isPrime = true;
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(i + " ");
                    found = true;
                }
            }
        }
        if (!found) System.out.print("No prime numbers in this range");
        System.out.println();
    }

    void findArmstrong(int start, int end) {
        boolean found = false;
        System.out.print("Armstrong numbers: ");
        for (int i = start; i <= end; i++) {
            int sum = 0, temp = i;
            int digits = String.valueOf(i).length();
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) System.out.print("No Armstrong numbers in this range");
        System.out.println();
    }

    void findPalindrome(int start, int end) {
        boolean found = false;
        System.out.print("Palindrome numbers: ");
        for (int i = start; i <= end; i++) {
            int temp = i;
            int reverse = 0;
            while (temp != 0) {
                int mod = temp % 10;
                reverse = (reverse * 10) + mod;
                temp = temp / 10;
            }
            if (i == reverse) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) System.out.print("No palindrome numbers in this range");
        System.out.println();
    }

    void perfect(int start, int end) {
        boolean found = false;
        System.out.print("Perfect numbers: ");
        for (int i = start; i <= end; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) sum += j;
            }
            if (sum == i) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) System.out.print("No perfect numbers in this range");
        System.out.println();
    }

    void findStrong(int start, int end) {
        boolean found = false;
        System.out.print("Strong numbers: ");
        for (int i = start; i <= end; i++) {
            int temp = i, sum = 0;
            while (temp != 0) {
                int digit = temp % 10;
                int fact = 1;
                for (int j = 1; j <= digit; j++) fact *= j;
                sum += fact;
                temp /= 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) System.out.print("No strong numbers in this range");
        System.out.println();
    }

    void decimalToBinary(int n) {
        System.out.println("Binary: " + Integer.toBinaryString(n));
    }

    void decimalToHex(int n) {
        System.out.println("Hexadecimal: " + Integer.toHexString(n));
    }

    void decimalToOctal(int n) {
        System.out.println("Octal: " + Integer.toOctalString(n));
    }

    void binaryToDecimal(String bin) {
        try {
            System.out.println("Decimal: " + Integer.parseInt(bin, 2));
        } catch (Exception e) {
            System.out.println("Invalid binary number!");
        }
    }

    void hexToDecimal(String hex) {
        try {
            System.out.println("Decimal: " + Integer.parseInt(hex, 16));
        } catch (Exception e) {
            System.out.println("Invalid hexadecimal number!");
        }
    }

    void octalToDecimal(String oct) {
        try {
            System.out.println("Decimal: " + Integer.parseInt(oct, 8));
        } catch (Exception e) {
            System.out.println("Invalid octal number!");
        }
    }

    void binaryToHex(String bin) {
        try {
            int decimal = Integer.parseInt(bin, 2);
            System.out.println("Hexadecimal: " + Integer.toHexString(decimal));
        } catch (Exception e) {
            System.out.println("Invalid binary number!");
        }
    }

    void hexToBinary(String hex) {
        try {
            int decimal = Integer.parseInt(hex, 16);
            System.out.println("Binary: " + Integer.toBinaryString(decimal));
        } catch (Exception e) {
            System.out.println("Invalid hexadecimal number!");
        }
    }

    // ---------------- VALIDATED MAIN ----------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Numbers util = new Numbers();
        boolean exit = false;

        while (!exit) {

            System.out.println("\n=== Main Menu ===");
            System.out.println("1. Number Finder");
            System.out.println("2. Number Converter");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                sc.next();
                continue;
            }

            int mainChoice = sc.nextInt();

            switch (mainChoice) {

                case 1:
                    boolean back1 = false;

                    while (!back1) {
                        System.out.println("\n--- Number Finder Menu ---");
                        System.out.println("1. Even");
                        System.out.println("2. Odd");
                        System.out.println("3. Prime");
                        System.out.println("4. Armstrong");
                        System.out.println("5. Palindrome");
                        System.out.println("6. Perfect");
                        System.out.println("7. Strong");
                        System.out.println("8. Back");
                        System.out.print("Enter choice: ");

                        if (!sc.hasNextInt()) {
                            System.out.println("Invalid input!");
                            sc.next();
                            continue;
                        }

                        int findChoice = sc.nextInt();

                        if (findChoice == 8) {
                            back1 = true;
                            break;
                        }

                        System.out.print("Enter start range: ");
                        if (!sc.hasNextInt()) {
                            System.out.println("Invalid input!");
                            sc.next();
                            continue;
                        }
                        int start = sc.nextInt();

                        System.out.print("Enter end range: ");
                        if (!sc.hasNextInt()) {
                            System.out.println("Invalid input!");
                            sc.next();
                            continue;
                        }
                        int end = sc.nextInt();

                        if (start > end) {
                            System.out.println("Start should be less than or equal to end!");
                            continue;
                        }

                        switch (findChoice) {
                            case 1: util.findEven(start, end); break;
                            case 2: util.findOdd(start, end); break;
                            case 3: util.findPrime(start, end); break;
                            case 4: util.findArmstrong(start, end); break;
                            case 5: util.findPalindrome(start, end); break;
                            case 6: util.perfect(start, end); break;
                            case 7: util.findStrong(start, end); break;
                            default: System.out.println("Invalid choice!");
                        }
                    }
                    break;

                case 2:
                    boolean back2 = false;

                    while (!back2) {
                        System.out.println("\n--- Number Converter Menu ---");
                        System.out.println("1. Decimal to Binary");
                        System.out.println("2. Decimal to Hexadecimal");
                        System.out.println("3. Binary to Decimal");
                        System.out.println("4. Hexadecimal to Decimal");
                        System.out.println("5. Decimal to Octal");
                        System.out.println("6. Octal to Decimal");
                        System.out.println("7. Binary to Hexadecimal");
                        System.out.println("8. Hexadecimal to Binary");
                        System.out.println("9. Back");
                        System.out.print("Enter choice: ");

                        if (!sc.hasNextInt()) {
                            System.out.println("Invalid input!");
                            sc.next();
                            continue;
                        }

                        int convChoice = sc.nextInt();

                        if (convChoice == 9) {
                            back2 = true;
                            break;
                        }

                        switch (convChoice) {
                            case 1:
                                System.out.print("Enter decimal number: ");
                                if (sc.hasNextInt()) util.decimalToBinary(sc.nextInt());
                                else { System.out.println("Invalid input!"); sc.next(); }
                                break;

                            case 2:
                                System.out.print("Enter decimal number: ");
                                if (sc.hasNextInt()) util.decimalToHex(sc.nextInt());
                                else { System.out.println("Invalid input!"); sc.next(); }
                                break;

                            case 3:
                                System.out.print("Enter binary number: ");
                                util.binaryToDecimal(sc.next());
                                break;

                            case 4:
                                System.out.print("Enter hexadecimal number: ");
                                util.hexToDecimal(sc.next());
                                break;

                            case 5:
                                System.out.print("Enter decimal number: ");
                                if (sc.hasNextInt()) util.decimalToOctal(sc.nextInt());
                                else { System.out.println("Invalid input!"); sc.next(); }
                                break;

                            case 6:
                                System.out.print("Enter octal number: ");
                                util.octalToDecimal(sc.next());
                                break;

                            case 7:
                                System.out.print("Enter binary number: ");
                                util.binaryToHex(sc.next());
                                break;

                            case 8:
                                System.out.print("Enter hexadecimal number: ");
                                util.hexToBinary(sc.next());
                                break;

                            default:
                                System.out.println("Invalid choice!");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid main menu choice!");
            }
        }

        sc.close();
    }
}