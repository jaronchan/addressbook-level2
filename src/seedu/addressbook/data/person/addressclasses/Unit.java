package seedu.addressbook.data.person.addressclasses;

/**
 * Represents a Unit in an Address.
 */

public class Unit {
    private String unitNum;

    public Unit (String unitNum){
        this.unitNum = unitNum;
    }

    /**
     * Returns the Unit Number as a String.
     */

    public String toString(){
        return unitNum;
    }

}