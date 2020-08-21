package ceng.anadolu.bim492;

import java.util.List;

public class DangerousChestItemIterator implements Iterator<Item> {
    private DangerousChest dangerousChest;
    private int idx;
    private ItemType itemType;

    DangerousChestItemIterator(DangerousChest dangerousChest, ItemType itemType) {
        this.dangerousChest = dangerousChest;
        this.itemType = itemType;
        this.idx = -1;
    }

    @Override
    public boolean hasNext() {
        return findNextIdx() != -1;
    }

    private int findNextIdx() {
        Item[] items = dangerousChest.getItems();
        boolean found = false;
        int tempIdx = idx;
        while (!found) {
            tempIdx++;
            if (items[tempIdx] == null) {
                tempIdx = -1;
                break;
            }
            if (itemType.equals(ItemType.ANY) || items[tempIdx].getType().equals(itemType)) {
                break;
            }
        }
        return tempIdx;
    }

    @Override
    public Item next() {
        idx = findNextIdx();
        if (idx != -1) {
            return dangerousChest.getItems()[idx];
        }
        return null;
    }
}
