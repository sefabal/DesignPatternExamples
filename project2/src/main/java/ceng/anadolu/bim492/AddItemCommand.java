package ceng.anadolu.bim492;

import java.util.Stack;

public class AddItemCommand implements Command {

    private Stack<ItemComponent> addedItems;

    AddItemCommand() {
        addedItems = new Stack<>();
    }

    @Override
    public void execute(ItemComponent item) {
        addedItems.push(item);
        Envantory.getInstance().getItems().add(item);
        System.out.println("ADD OPERATION : \n" + item.toString() + " is added to the inventory.");
    }

    @Override
    public void undo() {
        ItemComponent lastAddedItem;

        if (!addedItems.empty()) {
            lastAddedItem = addedItems.pop();
            Envantory.getInstance().getItems().remove(lastAddedItem);
            System.out.println("UNDO OPERATION : \n"
                    + lastAddedItem.toString() + " is getting back(deleting) from envantory.");
        } else {
            System.err.println("There is no item added to list.");
        }

    }

    @Override
    public void redo() {

    }
}
