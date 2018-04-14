package ca.ciccc.java.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author paula on 12/04/18.
 */
public class Employees {
    private List<HockeyPlayer> hockeyPlayer = new ArrayList<>();
    private List<Professor> professor = new ArrayList<>();
    private List<Parent> parent = new ArrayList<>();
    private List<GasStationAttendant> gasStationAttendant = new ArrayList<>();

    /**
     * Constructor for Employees: initialize all Lists
     */
    public Employees(){
        this.getHockeyPlayer().add(new HockeyPlayer("Wayne Gretzky", 894));
        this.getHockeyPlayer().add(new HockeyPlayer("Who Ever", 0));
        this.getHockeyPlayer().add(new HockeyPlayer("Brent Gretzky", 1));
        this.getHockeyPlayer().add(new HockeyPlayer("Pavel Bure", 437));
        this.getHockeyPlayer().add(new HockeyPlayer("Jason Bourne", 437));

        this.getProfessor().add(new Professor("Albert Einstein", "Physics"));
        this.getProfessor().add(new Professor("Alan Turing", "Computer Systems"));
        this.getProfessor().add(new Professor("Richard Feynman", "Physics"));
        this.getProfessor().add(new Professor("Tim Berners-Lee", "Computer Systems"));
        this.getProfessor().add(new Professor("Kurt Godel", "Logic"));

        this.getParent().add(new Parent("Tiger Woods", 1));
        this.getParent().add(new Parent("Super Mom", 168));
        this.getParent().add(new Parent("Lazy Larry", 20));
        this.getParent().add(new Parent("Ex Hausted", 168));
        this.getParent().add(new Parent("Super Dad", 167));

        this.getGasStationAttendant().add(new GasStationAttendant("Joe Smith", 10));
        this.getGasStationAttendant().add(new GasStationAttendant("Tony Baloney", 100));
        this.getGasStationAttendant().add(new GasStationAttendant("Benjamin Franklin", 100));
        this.getGasStationAttendant().add(new GasStationAttendant("Mary Fairy", 101));
        this.getGasStationAttendant().add(new GasStationAttendant("Bee See", 1));
    }

    /**
     * Return list of {@link HockeyPlayer}s
     * @return hockeyPlayer
     */
    public List<HockeyPlayer> getHockeyPlayer() {
        return hockeyPlayer;
    }

    /**
     * Set list of {@link HockeyPlayer}s
     * @param hockeyPlayer
     */
    public void setHockeyPlayer(List<HockeyPlayer> hockeyPlayer) {
        this.hockeyPlayer = hockeyPlayer;
    }

    /**
     * Return list of {@link Professor}s
     * @return professor
     */
    public List<Professor> getProfessor() {
        return professor;
    }

    /**
     * Set list of {@link Professor}s
     * @param professor
     */
    public void setProfessor(List<Professor> professor) {
        this.professor = professor;
    }

    /**
     * Return list of {@link Parent}s
     * @return parent
     */
    public List<Parent> getParent() {
        return parent;
    }

    /**
     * Set list of {@link Parent}s
     * @param parent
     */
    public void setParent(List<Parent> parent) {
        this.parent = parent;
    }

    /**
     * Return list of {@link GasStationAttendant}s
     * @return gasStationAttendant
     */
    public List<GasStationAttendant> getGasStationAttendant() {
        return gasStationAttendant;
    }

    /**
     * Set list of {@link GasStationAttendant}s
     * @param gasStationAttendant
     */
    public void setGasStationAttendant(List<GasStationAttendant> gasStationAttendant) {
        this.gasStationAttendant = gasStationAttendant;
    }

    /**
     * Print all employees of the list that are equals
     * @param employeeList
     */
    public void printEqualEmployee(List<? extends Employee> employeeList){
        if(employeeList.size() > 0) {
            boolean thereIsEqualsEmployee = false;
            int size = employeeList.size();
            int count = 0;

            while(count < size) {
                Employee employee = employeeList.get(count);

                for (int index = count+1; index < size; index++) {
                    if (employeeList.get(index).equals(employee)) {
                        System.out.println(employee);
                        System.out.println(employeeList.get(index));
                        thereIsEqualsEmployee = true;
                    }
                }
                count++;
            }

            if(!thereIsEqualsEmployee){
                System.out.println("There is no equals employees in this list!");
            }
        }
    }
}
