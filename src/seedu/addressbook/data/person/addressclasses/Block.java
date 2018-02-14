package seedu.addressbook.data.person.addressclasses;

/**
 * Represents a Block in an Address.
 */

public class Block {
    private String blockNum;

    public Block(String blockNum){
        this.blockNum = blockNum;
    }

    /**
     * Returns the Block Number as a String.
     */

    public String toString(){
        return blockNum;
    }

}
