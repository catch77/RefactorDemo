package gildedRose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public ItemType itemType;


    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        this.itemType = ItemFactory.getItem(name);
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void decQuality() {
        if (this.quality > 0) {
            this.quality = this.quality - 1;
        }
    }

    public void addQuality() {
        if (this.quality < 50) {
            this.quality = this.quality + 1;
        }
    }
}
