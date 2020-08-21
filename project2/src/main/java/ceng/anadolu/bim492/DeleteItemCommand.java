package ceng.anadolu.bim492;

import java.util.ArrayList;
import java.util.Stack;

public class DeleteItemCommand implements Command {

    private Stack<ItemComponent> removedItems;

    DeleteItemCommand() {
        this.removedItems = new Stack<>();
    }

    @Override
    public void execute(ItemComponent item) {
        ArrayList<ItemComponent> items = Envantory.getInstance().getItems();
        if (items.contains(item)) {
            items.remove(item);
            removedItems.push(item);

            System.out.println("DELETE OPERATION : \n" + item.toString() + " is deleted from Envantory.");
        } else
            System.err.println("There is no such item in the Envantory.");
    }

    @Override
    public void undo() {
        ItemComponent lastItemRemoved;
        if (!removedItems.empty()) {
            lastItemRemoved = removedItems.pop();
            Envantory.getInstance().getItems().add(lastItemRemoved);

            System.out.println("UNDO OPERATION : \n"
                    + lastItemRemoved.toString() + " added back to Envantory succesfully.");
        } else
            System.err.println("There is no item to getting back!");
    }

    @Override
    public void redo() {

    }
}
