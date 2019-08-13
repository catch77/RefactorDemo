package gildedRose;

public class ItemFactory {

    public static ItemType getItem(String name) {
        switch (name) {
            case "Aged Brie":
                return new AgedBrieItem();
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstageItem();
            case "Sulfuras, Hand of Ragnaros":
                return new SulfurasItem();
            default:
                return new NormalItem();
        }
    }
}
