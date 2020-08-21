package ceng.anadolu.bim492;

public class App {
    public static void main(String[] args) {

        Item sword = new Item(ItemType.WEAPON, "SWORD");
        Item excellentRing = new Item(ItemType.RING, "Excellent ring");
        Item fireBall = new Item(ItemType.POTION, "Fire Ball");
        Item luckyRing = new Item(ItemType.RING, "Lucky ring");

        System.out.println("****************" +
                "\n---Create surpriseChest and add new Items");


        SupriseChest supriseChest = new SupriseChest();
        supriseChest.addItem(sword);
        supriseChest.addItem(excellentRing);
        supriseChest.addItem(fireBall);
        supriseChest.addItem(luckyRing);

        System.out.println("**********");

        Iterator<Item> supriseChestRingIterator = supriseChest.getIterator(ItemType.RING);

        System.out.println("---Getting supriseChest Ring iterator [ArrayList Iterator]");

        while (supriseChestRingIterator.hasNext()) {
            Item nextItem = supriseChestRingIterator.next();
            System.out.println("\t▬" + nextItem.toString());
        }


        Item poison = new Item(ItemType.POISON, "Checked Poison");
        Item otherPoison = new Item(ItemType.POISON, "Unnecessary Poison");
        Item bomb = new Item(ItemType.BOMB, "BIG BOMB");

        System.out.println("****************" +
                "\n---Create dangerousChest and add new Items");

        DangerousChest dangerousChest = new DangerousChest();
        dangerousChest.addItem(poison);
        dangerousChest.addItem(otherPoison);
        dangerousChest.addItem(bomb);
        System.out.println("***********");

        System.out.println("---Printing dangerousChest Poision Iterator [ArrayIterator]");
        Iterator<Item> dangerousChestPoisonIterator = dangerousChest.getIterator(ItemType.POISON);

        while (dangerousChestPoisonIterator.hasNext()) {
            Item nextItem = dangerousChestPoisonIterator.next();
            System.out.println("\t▬" + nextItem.toString());
        }


    }
}
