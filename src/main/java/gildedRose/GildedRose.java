package gildedRose;

import java.util.Arrays;

public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQualityTwo() {
        Arrays.stream(items).forEachOrdered(item -> item.itemType.update(item));
    }

}