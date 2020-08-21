package ceng.anadolu.bim492;

public abstract class ItemComponent {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(ItemComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove(ItemComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public ItemComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

}
