package ceng.anadolu.bim492;

import java.util.ArrayList;
import java.util.List;

class SupriseChest {

    private List<Item> items;

    SupriseChest() {
        items = new ArrayList<>();
    }

    Iterator<Item> getIterator(ItemType itemType) {

        return new SupriseChestItemIterator(this, itemType);
    }

    List<Item> getItems() {
        return new ArrayList<>(items);
    }

    void addItem(Item item) {
        System.out.println("Adding " + item.toString() +" to surprise chest.");
        this.items.add(item);
    }
}
