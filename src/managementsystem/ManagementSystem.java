package managementsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagementSystem {

    Scanner input = new Scanner(System.in);
    boolean loop = true;
    ArrayList<Employee> employees = new ArrayList<>();


    public void menu1() {

        do {
            System.out.println("---Welcome to Mangement system---");
            System.out.println("1. Employee mangement ");
            System.out.println("2. Employee statistic ");
            System.out.println("0. Exit program");

            try {


                switch (input.nextInt()) {
                    case 1:
                        managementMenu();
                        //loop = true;
                        break;
                    case 2:
                        menuStatics();
                        //loop = true;
                        break;
                    case 0:
                        System.out.println("System shutting down....");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Error try again");

                }

            } catch (Exception e) {
                System.out.println("Wrong input, try again");
                input.nextLine();
            }

        }while (loop);
    }

    public void managementMenu() {

        System.out.println("1: Register new employee ");
        System.out.println("2: Fire employee ");
        System.out.println("3: Update name of employee ");
        System.out.println("4: Update birthday of employee ");
        System.out.println("5: Update department of employee ");
        System.out.println("6: Update salary of employee ");
        System.out.println("7: Search employee by name");
        System.out.println("8: Search employee by id");
        System.out.println("9: Search employee by department");
        System.out.println("10: Display all employees");
        System.out.println("0: Back to main");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                addEmployee();
                break;
            case 2:
                fireEmployeeById();
                break;
            case 3:
                updateEmployeeName();
                break;
            case 4:
                updateEmployeeBirthday();
                break;
            case 5:
                updateEmployeeDepartement();
                break;
            case 6:
                updateEmployeeSalary();
                break;
            case 7:
                searchEmployeeName();
                break;
            case 8:
                searchEmployeeId();
                break;
            case 9:
                searchEmployeeDepartement();
                break;
            case 10:
                displayemployees();
                break;

            case 0:
                menu1();
                break;
            default:
                System.out.println("Error try again");

        }
    }

    public void menuStatics() {
        System.out.println("1. Average wage at the company");
        System.out.println("2. Highest salary at the company");
        System.out.println("3. Lowest salary at the company");
        System.out.println("4. Total bonus");
        System.out.println("5. Women in percentage at the company");
        System.out.println("6. Men percentage of the various work role categories");
        System.out.println("0. Back to the main menu");
        int choice = input.nextInt();
        input.nextLine();

        switch (choice) {
            case 1:
                getAverageWage();
                break;
            case 2:
                getHighestSalary();
                break;
            case 3:
                getLowestSalary();
                break;
            case 4:
                getTotalBonus();
                break;
            case 5:
                getWomenInTheCompany();
                break;
            case 6:
                getMenInDifferentCategories();
                break;
            case 0:
                menu1();
                break;
            default:
                System.out.println("Error try again");
        }

    }

    public void addEmployee() {

        input.nextLine();
        System.out.println("Enter first name");
        String firstName = input.nextLine();

        System.out.println("Enter last name");
        String lastName = input.nextLine();

        System.out.println("Enter salary");
        double salary = input.nextDouble();

        System.out.println("Enter birthday xXxXxX");
        int birthday = input.nextInt();

        input.nextLine();
        System.out.println("Enter gender female or male");
        String gender = input.nextLine();

        System.out.println("Enter workrole \n1. Manager \n2. Programmer \n3. Technician \n4. Secretary");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("");
                Employee e1 = new Manager(firstName, lastName, salary,
                        birthday, gender);
                employees.add(e1);
                break;
            case 2:
                System.out.println("");
                Employee e2 = new Programmer(firstName, lastName, salary,
                        birthday, gender);
                employees.add(e2);
                break;
            case 3:
                System.out.println("");
                Employee e3 = new Technician(firstName, lastName, salary,
                        birthday, gender);
                employees.add(e3);
                break;
            case 4:
                System.out.println("");
                Employee e4 = new Secretary(firstName, lastName, salary,
                        birthday, gender);
                employees.add(e4);
                break;
            default:
                System.out.println("Error try again");
        }

        System.out.println(firstName + " " + lastName);

    }

    public void displayemployees() {

        System.out.println(employees.size());
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
    }

    public void updateEmployeeName() {
       
        System.out.println("Pick number to change");
        System.out.println("1. Change first name");
        System.out.println("2. Change last name");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter employee Id to change first name");
                int Id = input.nextInt();
                input.nextLine();

                for (Employee employee : employees) {

                    if (employee.getId() == Id) {
                        System.out.println("Enter new first name for employee");
                        String newfirstName = input.nextLine();
                        employee.setFirstName(newfirstName);
                        System.out.println("first name is updated");
                    }

                }
                break;
            case 2:
                System.out.println("Enter employee Id to change last name employee");
                Id = input.nextInt();
                input.nextLine();

                for (Employee employee : employees) {

                    if (employee.getId() == Id) {
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

    public void updateEmployeeBirthday() {

        System.out.println("Enter employee Id to change age:");
        int Id = input.nextInt();
        input.nextLine();

        for (Employee employee : employees) {

            if (employee.getId() == Id) {
                System.out.println("Enter new birthday for employee");
                int newBirthday = input.nextInt();
                employee.setBirthDay(newBirthday);
                System.out.println("birthday is updated");
            }
            
        }
        
    }

    public void updateEmployeeDepartement() {

        System.out.println("Search employee by Id: ");
        int EmployeeId = input.nextInt();
        input.nextLine();

        for (Employee employee : employees) {
            if (employee.getId() == EmployeeId) {
                System.out.println("Write new Department\n Management\nor\nDevelopment");
                String newDepartment = input.nextLine();
                employee.setDepartment(newDepartment);
            }
            
        }
        
    }

    public void updateEmployeeSalary() {

        System.out.println("Enter employee Id to change salary:");
        int Id = input.nextInt();
        input.nextLine();

        for (Employee employee : employees) {

            if (employee.getId() == Id) {
                System.out.println("Enter new salary for employee");
                double newSalary = input.nextDouble();
                employee.setSalary(newSalary);
                System.out.println("salary is updated");
            }

        }
        
    }

    public void fireEmployeeById() {

        System.out.println("Enter ID to remove employee");
        int id = input.nextInt();

        for (int i = employees.size() - 1; i >= 0; i--) {

            if (employees.get(i).getId() == (id)) {
                employees.remove(employees.get(i));
            }

        }

    }

    public void searchEmployeeId() {
        System.out.println("Search employee by Id: ");
        int EmployeeId = input.nextInt();
        input.nextLine();

        for (Employee employee : employees) {
            if (employee.getId() == EmployeeId) {
                System.out.println(employee);
            }
            
        }
        
    }

    public void searchEmployeeName() {

        System.out.println("Search employee by name: ");
        input.nextLine();
        String employeeFirstName = input.nextLine();
        

        for (Employee employee : employees) {
            if (employee.getFirstName().equals(employeeFirstName)) {
                System.out.println(employee);
            }
        }

    }


    public void searchEmployeeDepartement() {
        
                System.out.println("pick workrole");
                System.out.println("1. Manager");
                System.out.println("2. Programmer");
                System.out.println("3. Technician");
                System.out.println("4. Secretary");
                int choice = input.nextInt();
       switch (choice) {
            case 1:
                for (Employee employee : employees) {
                    if (employee instanceof Manager ) {
                        System.out.println(employee);                                          
                    }

                }              
                break;
            case 2:
                for (Employee employee : employees) {
                    if (employee instanceof Programmer ) {
                        System.out.println(employee);                                          
                    }

                } 
                break;
            case 3:
                for (Employee employee : employees) {
                    if (employee instanceof Technician ) {
                        System.out.println(employee);                                          
                    }

                } 
                break;
            case 4:
                for (Employee employee : employees) {
                    if (employee instanceof Secretary ) {
                        System.out.println(employee);                                          
                    }

                } 
                break;
            default:
                System.out.println("Error try again");
       }        
                
    }

    public void getTotalBonus() {
        double totalBonus = 0;
        for (Employee employee : employees) {
            totalBonus = totalBonus + employee.getBonus();
        }
        System.out.println(totalBonus);
    }

    public void getAverageWage() {
        double averageWage = 0;
        double totalWage = 0;
        for (Employee employee : employees) {
            totalWage = totalWage + employee.getSalary();
        }
        averageWage = totalWage / employees.size();
        System.out.println(averageWage);
    }

    public void getHighestSalary() {
        double highestValue = 0;
        for (Employee employee : employees) {
            if (employee.getSalary() > highestValue) {
                highestValue = employee.getSalary();
            }
        }

        System.out.println(highestValue);

    }

    public void getLowestSalary() {
        double lowestValue = Double.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee.getSalary() < lowestValue) {
                lowestValue = employee.getSalary();
            }
        }
        System.out.println(lowestValue);
    }

    public void getWomenInTheCompany() {
        double femalePercentage = 0;
        double totalFemale = 0;
        for (Employee employee : employees) {
            if (employee.getGender().equals("female")) {
                totalFemale++;

            }

        }

        femalePercentage = (totalFemale / employees.size()) * 100;
        System.out.println("Females in percentage");
        System.out.println(femalePercentage + "%");
    }

    public void getMenInDifferentCategories() {

        System.out.println("Pick workrole");
        System.out.println("1. Manager");
        System.out.println("2. Programmer");
        System.out.println("3. Technician");
        System.out.println("4. Secratary");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                double malePercentage = 0;
                double totalMale = 0;
                double totalManagers =0;
                for (Employee employee : employees) {
                    if (employee instanceof Manager ) {
                        totalManagers++;
                        if(employee.getGender().equals("male"))
                            totalMale++;
                    }

                }
                malePercentage = (totalMale / totalManagers) * 100;
                System.out.println("Males in percentage for managers");
                System.out.println(malePercentage + "%");
                break;
            case 2:
                malePercentage = 0;
                totalMale = 0;
                double totalProgrammers =0;
                for (Employee employee : employees) {
                    if (employee instanceof Programmer ) {
                        totalProgrammers++;
                        if(employee.getGender().equals("male"))
                            totalMale++;
                    }

                }
                malePercentage = (totalMale / totalProgrammers) * 100;
                System.out.println("Males in percentage for Programmers");
                System.out.println(malePercentage + "%");
                break;
            case 3:
                malePercentage = 0;
                totalMale = 0;
                double totalTechnicians =0;
                for (Employee employee : employees) {
                    if (employee instanceof Technician ) {
                        totalTechnicians++;
                        if(employee.getGender().equals("male"))
                            totalMale++;
                    }

                }
                malePercentage = (totalMale / totalTechnicians) * 100;
                System.out.println("Males in percentage for Technicians");
                System.out.println(malePercentage + "%");
                break;
            case 4:
                malePercentage = 0;
                totalMale = 0;
                double totalSecretaries = 0;
                for (Employee employee : employees) {
                    if (employee instanceof Secretary ) {
                        totalSecretaries++;
                        if(employee.getGender().equals("male"))
                            totalMale++;
                    }

                }
                malePercentage = (totalMale / totalSecretaries) * 100;
                System.out.println("Males in percentage for secretaries");
                System.out.println(malePercentage + "%");
                break;
            default:
                System.out.println("Error try again");
        }

    }

}
