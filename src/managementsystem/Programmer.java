
package managementsystem;

public class Programmer extends Employee {
    public Programmer(String firstName, String lastName, double salary, int birthDay, String gender){
        super(firstName, lastName, salary, birthDay, gender);
        bonus = salary * 0.05;
        department = "development";
    }
}
