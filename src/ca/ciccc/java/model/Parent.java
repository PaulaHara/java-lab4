package ca.ciccc.java.model;

/**
 * @author paula on 12/04/18.
 */
public class Parent extends Employee implements Comparable<Parent> {
    private final double OVERTIME_PAY_RATE = -2.0;

    private int numberOfHoursSpentPerWeekWithKids;

    /**
     * Constructor for Parents
     * @param name
     * @param numberOfHoursSpentPerWeekWithKids
     */
    public Parent(String name, int numberOfHoursSpentPerWeekWithKids) {
        super(name);
        this.setNumberOfHoursSpentPerWeekWithKids(numberOfHoursSpentPerWeekWithKids);
    }

    /**
     * Kind of clothes that Parents use
     * @return dressCode
     */
    @Override
    public DressCode getDressCode() {
        return DressCode.ANYTHING;
    }

    /**
     * For Parents this will always return false
     * @return false
     */
    @Override
    public boolean isPaidSalary() {
        return false;
    }

    /**
     * For Parents this will always return false
     * @return false
     */
    @Override
    public boolean postSecondaryEducationRequired() {
        return false;
    }

    /**
     * For Parents this will always return "Care"
     * @return Care
     */
    @Override
    public String getWorkVerb() {
        return "Care";
    }

    /**
     * For Parents this will always return -2.0
     * @return -2.0
     */
    @Override
    public double getOverTimePayRate() {
        return OVERTIME_PAY_RATE;
    }

    /**
     * Number of hours spent with kids per week
     * @return numberOfHoursSpentPerWeekWithKids
     */
    public int getNumberOfHoursSpentPerWeekWithKids() {
        return numberOfHoursSpentPerWeekWithKids;
    }

    /**
     * Set the number of hours spent with kids per week
     * @param numberOfHoursSpentPerWeekWithKids
     */
    public void setNumberOfHoursSpentPerWeekWithKids(int numberOfHoursSpentPerWeekWithKids) {
        this.numberOfHoursSpentPerWeekWithKids = numberOfHoursSpentPerWeekWithKids;
    }

    /**
     * @param parent
     * @return <ul><li>1 - if this.numberOfHoursSpentPerWeekWithKids > parent.etNumberOfHoursSpentPerWeekWithKids</li>
     *             <li>0 - if this.numberOfHoursSpentPerWeekWithKids == parent.etNumberOfHoursSpentPerWeekWithKids</li>
     *             <li>-1 - if this.numberOfHoursSpentPerWeekWithKids < parent.etNumberOfHoursSpentPerWeekWithKids</li>
     *         </ul>
     */
    @Override
    public int compareTo(Parent parent) {
        if (this.getNumberOfHoursSpentPerWeekWithKids() > parent.getNumberOfHoursSpentPerWeekWithKids()){
            return 1;
        }else if(this.getNumberOfHoursSpentPerWeekWithKids() == parent.getNumberOfHoursSpentPerWeekWithKids()){
            return 0;
        }
        return -1;
    }

    /**
     * Generate a hashCode for Parent
     * @return hashCode
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + this.getNumberOfHoursSpentPerWeekWithKids() + (this.getName() == null ? 0 : this.getName().hashCode());
        return result;
    }

    /**
     * Verify if the object passed is equals than this
     * @param o
     * @return true, if they are equals, and false if not
     */
    @Override
    public boolean equals(Object o) {
        if(o != null) {
            if(o == this){
                return true;
            }
            if(!(o instanceof Parent)){
                return false;
            }

            Parent parent = (Parent) o;
            return this.getNumberOfHoursSpentPerWeekWithKids() == parent.getNumberOfHoursSpentPerWeekWithKids();
        }

        return false;
    }

    /**
     * All the information about Parent
     * @return string
     */
    @Override
    public String toString() {
        return "Parent [name: "+getName()+", Dress Code: "+getDressCode().getValue()+", " +
                "Paid Salary: "+isPaidSalary()+",\n Post Secondary Education Required: "+postSecondaryEducationRequired()+
                ", Work Verb: "+getWorkVerb()+", Hours Spent Per Week With Kids: "+getNumberOfHoursSpentPerWeekWithKids()+"]";
    }
}
