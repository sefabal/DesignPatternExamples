package ceng.anadolu.bim492;

import java.util.ArrayList;
import java.util.List;

class DangerousChest {

    private Item[] items;
    private int length;

    DangerousChest() {
        items = new Item[20];
        this.length = 0;
    }

    Iterator<Item> getIterator(ItemType itemType) {

        return new DangerousChestItemIterator(this, itemType);
    }

    Item[] getItems() {
        return items;
    }

    void addItem(Item item) {
        if (length < items.length) {
            System.out.println("Adding " + item.toString() +" to dangerous chest.");
            items[length++] = item;
        } else {
            System.err.println("List is full");
        }
    }
}
