package seedu.addressbook.data.person.addressclasses;

/**
 * Represents a Street in an Address.
 */

public class Street {
    private String streetName;

    public Street(String streetName){
        this.streetName = streetName;
    }

    /**
     * Returns the Street Name as a String.
     */

    public String toString(){
        return streetName;
    }

}