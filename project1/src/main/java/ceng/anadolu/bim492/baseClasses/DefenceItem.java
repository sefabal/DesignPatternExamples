package ceng.anadolu.bim492.baseClasses;

import ceng.anadolu.bim492.baseClasses.Item;

public class DefenceItem extends Item {
    private double protectionAmount;

    public DefenceItem(String itemName, double protectionAmount) {
        super(itemName);
        this.protectionAmount = protectionAmount;
    }
}
