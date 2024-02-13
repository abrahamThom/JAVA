import java.util.Scanner;

class ComplexNumber {
    double real, imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}

public class Maine{
    public static void main(String[] args) {
    System.out.println("PRINCE THOMAS \n ROLL NO:045\nPROGRAM3:Complexnumberaddition\nDATE:13/02/2024");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the real and imaginary parts of the first complex number:");
        System.out.print("Real: ");
        double real1 = scanner.nextDouble();
        System.out.print("Imaginary: ");
        double imaginary1 = scanner.nextDouble();

        System.out.println("\nEnter the real and imaginary parts of the second complex number:");
        System.out.print("Real: ");
        double real2 = scanner.nextDouble();
        System.out.print("Imaginary: ");
        double imaginary2 = scanner.nextDouble();

        
        ComplexNumber complex1 = new ComplexNumber(real1, imaginary1);
        ComplexNumber complex2 = new ComplexNumber(real2, imaginary2);

       
        ComplexNumber sum = complex1.add(complex2);

       
        System.out.println("\nSum of the complex numbers:");
        System.out.println(complex1 + " + " + complex2 + " = " + sum);

        
        scanner.close();
    }
}

