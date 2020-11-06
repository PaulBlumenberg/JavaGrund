
package managementsystem;

public class Employee {
    
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    protected double bonus;   
    private int birthDay;
    private String gender;
    protected String department;
    static int idGenerator = 1;
            
    public Employee(String firstName, String lastName, double salary, 
                 int birthDay, String gender) {
        this.id =idGenerator;
        idGenerator++;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;

        this.birthDay = birthDay;
        this.gender = gender;
        
    }
    


    public double getBonus() {
        return bonus;
    }

    public Employee(double bonus) {
        this.bonus = bonus;
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
   
    
    


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + ", birthDay=" + birthDay + ", gender=" + gender;
    }
    

    
    


    
}

