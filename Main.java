import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager();

        while (true) {
            System.out.println("\n--- Employee Management ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Show Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");

            System.out.print("Choose: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter name: ");
                    String name = input.nextLine();

                    System.out.print("Enter salary: ");
                    double salary = input.nextDouble();
                    input.nextLine();

                    System.out.print("Enter department: ");
                    String department = input.nextLine();

                    Employee employee = new Employee(id, name, salary, department);
                    manager.addEmployee(employee);
                    break;
                case 2:
                    manager.showAllEmployees();
                    break;
                case 3:
                    System.out.print("Enter employee ID: ");
                    int searchId = input.nextInt();

                    Employee found = manager.findEmployeeById(searchId);

                    if (found != null) {
                        found.displayEmployee();
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter employee ID: ");
                    int deleteId = input.nextInt();

                    if (manager.deleteEmployee(deleteId)) {
                        System.out.println("Employee deleted.");
                    } else {
                        System.out.println("Employee not found.");
                    }

                    break;
                case 5:
                    System.out.println("Goodbye!");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
