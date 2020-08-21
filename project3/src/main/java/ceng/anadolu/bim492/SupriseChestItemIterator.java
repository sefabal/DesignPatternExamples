package ceng.anadolu.bim492;

import java.util.List;

public class SupriseChestItemIterator implements Iterator<Item> {

    private SupriseChest supriseChest;
    private int idx;
    private ItemType itemType;

    SupriseChestItemIterator(SupriseChest supriseChest, ItemType itemType) {
        this.supriseChest = supriseChest;
        this.itemType = itemType;
        this.idx = -1;
    }


    @Override
    public boolean hasNext() {
        return findNextIdx() != -1;
    }

    private int findNextIdx() {
        List<Item> items = supriseChest.getItems();
        boolean found = false;
        int tempIdx = idx;
        while (!found) {
            tempIdx++;
            if (tempIdx >= items.size()) {
                tempIdx = -1;
                break;
            }
            if (itemType.equals(ItemType.ANY) || items.get(tempIdx).getType().equals(itemType)) {
                break;
            }
        }
        return tempIdx;
    }


    @Override
    public Item next() {
        idx = findNextIdx();
        if (idx != -1) {
            return supriseChest.getItems().get(idx);
        }
        return null;
    }
}
