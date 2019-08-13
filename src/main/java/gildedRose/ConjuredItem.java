package gildedRose;

public class ConjuredItem implements ItemType {

    @Override
    public void update(Item item) {
        item.decQuality();
        item.decQuality();
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0 && item.quality > 0) {
            item.decQuality();
            item.decQuality();
        }
    }

}
