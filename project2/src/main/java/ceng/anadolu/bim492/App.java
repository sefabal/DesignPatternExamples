package ceng.anadolu.bim492;

public class App {
    public static void main(String[] args) {

        final Envantory envantory = Envantory.getInstance();

        //Create composite items for keeping group of objects
        ItemComponent juices = new ItemComposite("Juices");

        ItemComponent orangeJuice = new Item("Orange Juice", 15);
        ItemComponent appleJuice = new Item("Apple Juice", 23);
        ItemComponent watermelonJuice = new Item("Watermelon Juice", 13);

        ItemComponent alcohols = new ItemComposite("Alcohols");

        ItemComponent beer = new Item("Beer", 22);
        ItemComponent vodka = new Item("Vodka", 55);

        alcohols.add(beer);
        alcohols.add(vodka);

        //add leaf nodes to composite item
        juices.add(orangeJuice);
        juices.add(appleJuice);
        juices.add(watermelonJuice);

        //One leaf node
        ItemComponent bread = new Item("Bread", 15);

        //Add one bread to envantory
        envantory.addItem(bread);
        System.out.println("----------------------");
        //Add group of object to envantory
        envantory.addItem(juices);
        System.out.println("-----------------");

        envantory.undoLastOperation();
        System.out.println("-------------");

        envantory.addItem(juices);

        System.out.println("-------");
        envantory.addItem(alcohols);
        System.out.println("------------");

        envantory.deleteItem(bread);
        System.out.println("-----------------------");

        envantory.undoLastOperation();

        System.out.println("------------------");

        envantory.printItems();
    }
}
