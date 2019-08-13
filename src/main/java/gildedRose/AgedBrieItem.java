package gildedRose;

public class AgedBrieItem implements ItemType {

    @Override
    public void update(Item item) {
        item.addQuality();
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            item.addQuality();
        }
    }

}
