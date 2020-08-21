package ceng.anadolu.bim492.baseClasses;

public abstract class Item {
    private String itemName;

    public Item(String itemName){
        this.itemName = itemName;
    }

    public String getItemName(){
        return this.itemName;
    }
}
