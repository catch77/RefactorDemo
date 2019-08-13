package gildedRose;
public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQualityTwo() {
        for (int i = 0; i < items.length; i++) {
            switch (items[i].name) {
                case "Aged Brie":
                    addQuality(items[i]);
                    items[i].sellIn = items[i].sellIn - 1;
                    if (items[i].sellIn < 0) {
                        addQuality(items[i]);
                    }
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                        if (items[i].sellIn < 11) {
                            addQuality(items[i]);
                        }
                        if (items[i].sellIn < 6) {
                            addQuality(items[i]);
                        }
                    }
                    items[i].sellIn = items[i].sellIn - 1;
                    if (items[i].sellIn < 0) {
                        items[i].quality = 0;
                    }
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    break;
                default:
                    decQuality(items[i]);
                    items[i].sellIn = items[i].sellIn - 1;
                    if (items[i].sellIn < 0 && items[i].quality > 0) {
                        decQuality(items[i]);
                    }
                    break;
            }
        }
    }

    private void decQuality(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }

    private void addQuality(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

}