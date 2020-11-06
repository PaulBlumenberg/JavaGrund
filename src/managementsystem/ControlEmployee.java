
package managementsystem;
import java.util.ArrayList;
import java.util.Scanner;
import static managementsystem.ManagementSystem.input;
import static managementsystem.ManagementSystem.managementMenu;
import static managementsystem.ManagementSystem.menuStatics;

public class ControlEmployee {
    
    static Scanner input = new Scanner(System.in);
    static ArrayList<Employee> employees = new ArrayList<>(); 
    
    static Employee e1 = new Employee(1,"wer","wer",2000.0,12,"wer",12);
    

    
    public static void addEmployee(){
        System.out.println("Enter id");
        int id = input.nextInt();
        
        System.out.println("Enter first name");
        String firstName = input.nextLine();
        input.nextLine();
        System.out.println("Enter last name");
        String lastName = input.nextLine();

        System.out.println("Enter salary");
        double salary = input.nextDouble();

        System.out.println("Enter birthday");
        int birthday = input.nextInt();

        System.out.println("Enter gender");
        String gender = input.nextLine();
        
        input.nextLine();
        System.out.println("Enter departement 1. manager 2.programmer 3. technician 4. secretary");
        int departement = input.nextInt();
        
        /*System.out.println("which departement");
        System.out.println("1. manager");
        System.out.println("2. Programmer");
        System.out.println("3. technician");
        System.out.println("4. secretaries");
        
        switch*/
        
        Employee employee = new Employee(id, firstName, lastName, salary, 
                 birthday, gender, departement);
            employees.add(employee);
            System.out.println("employee is created");

    }
    
    
        public static void updateEmployeeName(){
         //   employees.add(e1);
            System.out.println("1. Change first name");
            System.out.println("2. Change last name");
            int choice = Integer.parseInt(input.nextLine());
            
            switch (choice){
                case 1:
                        System.out.println("Enter book Id to change first name employee");
            int Id = input.nextInt();
            input.nextLine();

            for(Employee employee : employees){

                if(employee.getId()==Id){
                    System.out.println("Enter new first name for employee");
                    String newfirstName = input.nextLine();
                    employee.setFirstName(newfirstName);
                    System.out.println("first name is updated");
                }

            }    
                    break;
                case 2:
                        System.out.println("Enter book Id to change last name employee");
                         Id = input.nextInt();
                        input.nextLine();

            for(Employee employee : employees){

                if(employee.getId()==Id){
                    System.out.println("Enter new last name for employee");
                    String newfirstName = input.nextLine();
                    employee.setFirstName(newfirstName);
                    System.out.println("last name is updated");
                }

            }    
                    break;
                default:
                System.out.println("Error try again");    
            }

        }
        public static void updateEmployeeBirthday(){
            
            System.out.println("Enter employee Id to change age:");
            int Id = input.nextInt();
            input.nextLine();

            for(Employee employee : employees){

                if(employee.getId()==Id){
                    System.out.println("Enter new birthday for employee");
                    int newBirthday = input.nextInt();
                    employee.setBirthDay(newBirthday);
                    System.out.println("birthday is updated");
                }

            }
        }
        
        public static void updateEmployeeDepartement(){
            
            
        }
        
        public static void updateEmployeeSalary(){
            
            System.out.println("Enter employee Id to change salary:");
            int Id = input.nextInt();
            input.nextLine();

            for(Employee employee : employees){

                if(employee.getId()==Id){
                    System.out.println("Enter new salary for employee");
                    double newSalary = input.nextDouble();
                    employee.setSalary(newSalary);
                    System.out.println("salary is updated");
                }

            }
        }
        
        public static void fireEmployeeByName(){
        
            System.out.println("Enter name to remove book");
            String firstName = input.nextLine();

            for (int i = employees.size()-1; i >=0 ; i--){

                if(employees.get(i).getFirstName().equals(firstName))
                    employees.remove(employees.get(i));

            }


        }
        
        
        public static void searchEmployeeId() {
            System.out.println("Search employee by Id: ");
            int EmployeeId = Integer.parseInt(input.nextLine());

            for (Employee emp : employees) {
                if (emp.getId() == EmployeeId) {
                    System.out.println(emp);
                }
            }

        }
        public static void searchEmployeeName(){
            System.out.println("Search employee by name: ");
            String firstName = (input.nextLine());
            boolean found = false;

            for (Employee emp : employees) {
                if (emp.getFirstName().equalsIgnoreCase(firstName)) {
                    System.out.println(emp);
                    found = true;
                }
            }
            if (found){
                System.out.println("No employee found ");
            }
            
        }
        public static void searchEmployeeDepartement(){
            
        }
        public static void displayemployees(){
            System.out.println("hej1");
            for(int i=0; i<employees.size();i++){
                System.out.println(employees.get(i));
            }
        }
        
        
        
            
        
}
