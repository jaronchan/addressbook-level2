package seedu.addressbook.commands;

import seedu.addressbook.data.person.ReadOnlyPerson;

import java.util.List;


/**
 * Lists all persons in the address book to the user.
 */
public class SortCommand extends Command {

    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Sorts all persons in the address book in alphabetical order and displays sorted list.\n"
            + "Example: " + COMMAND_WORD;


    @Override
    public CommandResult execute() {
        addressBook.sortBook();
        List<ReadOnlyPerson> allPersons = addressBook.getAllPersons().immutableListView();
        return new CommandResult(getMessageForPersonListSortedSummary(allPersons), allPersons);
    }
}