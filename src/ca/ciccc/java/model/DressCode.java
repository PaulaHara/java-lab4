package ca.ciccc.java.model;

/**
 * @author paula on 12/04/18.
 */
public enum DressCode {
    JERSEY("jersey"), FANCY("fancy"), ANYTHING("anything"), UNIFORM("uniform");

    private String value;

    /**
     * Constructor for DressCode
     * @param value
     */
    DressCode(String value){
        this.value = value;
    }

    /**
     * Value of the enumeration
     * @return value
     */
    public String getValue() {
        return value;
    }

    /**
     * Set the new value for enumeration
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Information about DressCode
     * @return string
     */
    @Override
    public String toString() {
        return "DressCode [jersey, fancy, anything, uniform]";
    }
}
