import java.util.Arrays;
import java.util.Scanner;

public class UserStringSorter {
    public static void main(String[] args) {
    System.out.println("Name: PRINCE THOMAS \n ROLL NO: 045\nPROGRAM6:String Sorter\nDATE: 26/02/2024");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter strings separated by spaces:");
        String input = scanner.nextLine();
        String[] strings = input.split("\\s+");
        Arrays.sort(strings);
        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }

        scanner.close();
    }
}

