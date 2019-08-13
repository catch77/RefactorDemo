package gildedRose;

public class BackstageItem implements ItemType {

    @Override
    public void update(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
            if (item.sellIn < 11) {
                item.addQuality();
            }
            if (item.sellIn < 6) {
                item.addQuality();
            }
        }
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }

}
