
package managementsystem;

public class Technician extends Employee {
    public Technician(String firstName, String lastName, double salary, int birthDay, String gender){
        super(firstName, lastName, salary, birthDay, gender);
        bonus = salary * 0.06;
        department = "development";
    }
}
