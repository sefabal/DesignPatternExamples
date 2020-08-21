package ceng.anadolu.bim492;

import java.util.ArrayList;
import java.util.Stack;

class Envantory {

    private static Envantory singletonEnvantory;

    private Command addItemCommand;

    private Command deleteItemCommand;

    private Stack<Command> undoCommands;

    private ArrayList<ItemComponent> items;

    private Envantory() {
        addItemCommand = new AddItemCommand();
        deleteItemCommand = new DeleteItemCommand();
        undoCommands = new Stack<>();
        items = new ArrayList<>();
    }


    //Singleton constructor for Envantory
    synchronized static Envantory getInstance() {
        if (singletonEnvantory == null)
            singletonEnvantory = new Envantory();

        return singletonEnvantory;
    }

    ArrayList<ItemComponent> getItems() {
        return this.items;
    }

    void addItem(ItemComponent item) {
        undoCommands.push(addItemCommand);
        addItemCommand.execute(item);
    }

    void deleteItem(ItemComponent item) {
        undoCommands.push(deleteItemCommand);
        deleteItemCommand.execute(item);
    }

    void undoLastOperation() {
        if (!undoCommands.empty())
            undoCommands.pop().undo();
        else
            System.err.println("There is no operation to undo.");
    }

    void printItems(){
        System.out.println("PRINT OPERATION");
        items.forEach(ItemComponent::print);
    }
}
