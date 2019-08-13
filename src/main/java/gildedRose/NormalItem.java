package gildedRose;

public class NormalItem implements ItemType {

    @Override
    public void update(Item item) {
        item.decQuality();
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0 && item.quality > 0) {
            item.decQuality();
        }
    }


}
