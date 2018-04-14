package ca.ciccc.java.model;

/**
 * @author paula on 12/04/18.
 */
public interface Employable {
    /**
     * @return DressCode
     */
    DressCode getDressCode();

    /**
     * @return isPaidSalary
     */
    boolean isPaidSalary();

    /**
     * @return postSecondaryEducationRequired
     */
    boolean postSecondaryEducationRequired();

    /**
     * @return workVerb
     */
    String getWorkVerb();
}
