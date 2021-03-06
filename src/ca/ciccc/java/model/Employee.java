package ca.ciccc.java.model;

/**
 * @author paula on 12/04/18.
 */
public abstract class Employee implements Employable {
    private String name;

    /**
     * Name of the employee
     * @param name
     */
    public Employee(String name){
        this.setName(name);
    }

    /**
     * Each employee will have a OverTimePayRate different
     * @return OverTimePayRate
     */
    public abstract double getOverTimePayRate();

    /**
     * Return the name of the employee
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the employee
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Brief description about Employee
     * @return string
     */
    @Override
    public String toString() {
        return "Employee abstract class, implements Employable";
    }
}
