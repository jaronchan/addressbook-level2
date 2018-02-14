package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.addressclasses.Block;
import seedu.addressbook.data.person.addressclasses.Street;
import seedu.addressbook.data.person.addressclasses.Unit;
import seedu.addressbook.data.person.addressclasses.PostalCode;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "ADDRESS must be in the format of BLOCK, STREET, UNIT, POSTAL_CODE";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";

    private Block block;
    private Street street;
    private Unit unit;
    private PostalCode postalCode;

    private boolean isPrivate;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        String trimmedAddress = address.trim();
        String[] addressDetails = trimmedAddress.split(",");

        this.isPrivate = isPrivate;
        if (!isValidAddress(trimmedAddress) || addressDetails.length != 4) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        this.block = new Block(addressDetails[0].trim());
        this.street = new Street(addressDetails[1].trim());
        this.unit = new Unit(addressDetails[2].trim());
        this.postalCode = new PostalCode(addressDetails[3].trim());
    }

    /**
     * Returns true if a given string is a valid person address.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return this.block.toString() + ", " +
                this.street.toString() + ", " +
                this.unit.toString() + ", " +
                this.postalCode.toString();
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.toString().equals(((Address) other).toString())); // state check
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
