import java.util.ArrayList;

public class EmployeeManager {
    private ArrayList<Employee> employees = new ArrayList<>();
    public void addEmployee(Employee employee){
        employees.add(employee);
        System.out.println("Employee added successfully.");
    }
    public void showAllEmployees(){
        if(employees.isEmpty()){
            System.out.println("No employees have been added.");
            return;
        }
        for(Employee employee:employees){
            employee.displayEmployee();
        }
    }
    public Employee findEmployeeById(int id) {
        for(Employee employee:employees){
            if(employee.getId() == id){
                return employee;
            }
        }
        return null;
    }
    public boolean deleteEmployee(int id) {
        Employee employee = findEmployeeById(id);
        if(employee != null){
            employees.remove(employee);
            return true;
        }
        return false;
    }
}
