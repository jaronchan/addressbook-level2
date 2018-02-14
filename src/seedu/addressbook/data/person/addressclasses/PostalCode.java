package seedu.addressbook.data.person.addressclasses;

/**
 * Represents a Postal Code in an Address.
 */

public class PostalCode {
    private String postalCode;

    public PostalCode (String postalCodeNum){
        this.postalCode = postalCodeNum;
    }

    /**
     * Returns the Street Name as a String.
     */

    public String toString(){
        return postalCode;
    }

}