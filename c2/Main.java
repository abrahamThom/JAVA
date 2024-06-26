import java.util.Scanner;
class Employee{
    int eNo, eSalary;
    String eName;   

    public Employee(int no, String name, int salary) {
        this.eNo = no;
        this.eName = name;
        this.eSalary = salary;
    }
}
class Main{
    public static void main(String arg[]){
        System.out.println("Prince Thomas\n Roll No:45\n Date:1/4/2024\n Program title: Program to create a class for Employee \n");
        Scanner scanner = new Scanner(System.in);       
        System.out.println("Enter the no of Employees : ");
        int n = scanner.nextInt();
        Employee arr[] = new Employee[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the details of employee " + Integer.toString(i+1));
            System.out.print("Enter the employee id : ");
            int no = scanner.nextInt();
            System.out.print("Enter the employee name : ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Enter the salary : ");
            int salary = scanner.nextInt();
            arr[i] = new Employee(no, name, salary);
        }
        System.out.print("\nEnter the employee id to search : ");
        int id = scanner.nextInt();
        int flag = 0;
        for(int i=0; i<n; i++){
            if(arr[i].eNo == id){
                System.out.println("Employee found.\nid : " + Integer.toString(id) + "\nname : " + arr[i].eName + "\nsalary : " + Integer.toString(arr[i].eSalary));
                flag = 1;
                break;
            }
        }
        if(flag == 0) System.out.println("Employee not found");

        scanner.close();
    }
    }
