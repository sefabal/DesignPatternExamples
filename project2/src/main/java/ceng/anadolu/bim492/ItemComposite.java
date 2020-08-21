package ceng.anadolu.bim492;

import java.util.ArrayList;

public class ItemComposite extends ItemComponent {

    private ArrayList<ItemComponent> itemComponents;

    ItemComposite(String name) {
        this.name = name;
        this.itemComponents = new ArrayList<>();
    }

    @Override
    public void add(ItemComponent itemComponent) {
        itemComponents.add(itemComponent);
    }

    @Override
    public void remove(ItemComponent itemComponent) {
        super.remove(itemComponent);
    }

    @Override
    public ItemComponent getChild(int i) {
        return itemComponents.get(i);
    }

    @Override
    public void print() {
        System.out.println("***");
        System.out.println("Group name : " + this.name);
        itemComponents.forEach(ItemComponent::print);
        System.out.println("****");
    }

    @Override
    public String toString() {
        return "ItemComposite{" +
                "name='" + name + '\'' +
                '}';
    }
}
