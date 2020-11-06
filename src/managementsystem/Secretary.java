
package managementsystem;

public class Secretary extends Employee{
    public Secretary(String firstName, String lastName, double salary, int birthDay, String gender){
        super(firstName, lastName, salary, birthDay, gender);
        bonus = salary * 0.04;
        department = "management";
    }
}
