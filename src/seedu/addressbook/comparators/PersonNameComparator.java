package seedu.addressbook.comparators;

import seedu.addressbook.data.person.Person;

import java.util.Comparator;

/**
 *
 * Compares names of Persons.
 *
 */
public class PersonNameComparator implements Comparator<Person>{
    public int compare(Person p1, Person p2) {
        return p1.getName().fullName.compareTo(p2.getName().fullName);
    }
}
