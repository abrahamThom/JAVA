import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
     System.out.println("Name: PRINCE THOMAS \n ROLL NO: 045\nPROGRAM6:String Sorter\nDATE: 01/04/2024");
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.println("Enter a string:");
        String str = scanner.nextLine();

        // Length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // 2. Convert to uppercase
        String upperCase = str.toUpperCase();
        System.out.println("Uppercase string: " + upperCase);

        // Convert to lowercase
        String lowerCase = str.toLowerCase();
        System.out.println("Lowercase string: " + lowerCase);

        // Concatenation
        System.out.println("Enter a string to concatenate with:");
        String concatStr = str.concat(scanner.nextLine());
        System.out.println("Concatenated string: " + concatStr);

        // Substring
        System.out.println("Enter the starting index for substring:");
        int startIndex = scanner.nextInt();
        String substring = str.substring(startIndex);
        System.out.println("Substring: " + substring);

        // Consume newline character
        scanner.nextLine();

        // Replace
        System.out.println("Enter the character to replace:");
        char oldChar = scanner.nextLine().charAt(0);
        System.out.println("Enter the replacement character:");
        char newChar = scanner.nextLine().charAt(0);
        String replacedStr = str.replace(oldChar, newChar);
        System.out.println("Replaced string: " + replacedStr);

        // Split
        System.out.println("Enter the delimiter for splitting:");
        String delimiter = scanner.nextLine();
        String[] splitStr = str.split(delimiter);
        System.out.println("Split string:");
        for (String s : splitStr) {
            System.out.println(s);
        }
        scanner.close();
    }
}

