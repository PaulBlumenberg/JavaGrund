
package managementsystem;

public class Manager extends Employee {
    public Manager(String firstName, String lastName, double salary, 
                 int birthDay, String gender){
            super(firstName, lastName, salary, birthDay, gender);
            bonus = salary * 0.1;
            department = "management";
    }

    
}
