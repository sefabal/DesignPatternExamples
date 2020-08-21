package ceng.anadolu.bim492;

public class Item {
    private String name;
    private ItemType type;


    Item(ItemType type, String name){
        this.type = type;
        this.name = name;
    }


    public void setType(ItemType type) {
        this.type = type;
    }

    ItemType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
