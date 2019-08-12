package gildedRose;

import org.junit.Test;

import static java.util.Arrays.*;
import static org.junit.Assert.*;

public class GildedRoseTest {

    @Test
    public void should_return_true_given_item_name_aa_and_sellIn_is_10_and_quality_is_5() {
        Item item = new Item("aa", 10, 5);
        Item[] items = new Item[1];
        items[0] = item;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(9, items[0].sellIn);
        assertEquals(4, items[0].quality);
    }

    @Test
    public void should_return_true_given_item_name_Aged_Brie_and_sellIn_is_10_and_quality_is_5() {
        Item item = new Item("Aged Brie", 10, 5);
        Item[] items = new Item[1];
        items[0] = item;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        assertEquals(9, items[0].sellIn);
        assertEquals(6, items[0].quality);
    }

    @Test
    public void should_return_true_given_item_name_Backstage_and_sellIn_is_10_and_quality_is_45() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 45);
        Item[] items = new Item[1];
        items[0] = item;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        System.out.println(items[0]);
        assertEquals(9, items[0].sellIn);
        assertEquals(47, items[0].quality);
    }

    @Test
    public void should_return_true_given_item_name_Backstage_and_sellIn_is_5_and_quality_is_45() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 45);
        Item[] items = new Item[1];
        items[0] = item;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        System.out.println(items[0]);
        assertEquals(4, items[0].sellIn);
        assertEquals(48, items[0].quality);
    }

    @Test
    public void should_return_true_given_item_name_Backstage_and_sellIn_is_negative_9_and_quality_is_45() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", -9, 45);
        Item[] items = new Item[1];
        items[0] = item;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        System.out.println(items[0]);
        assertEquals(-10, items[0].sellIn);
        assertEquals(0, items[0].quality);
    }

    @Test
    public void should_return_true_given_item_name_aa_and_sellIn_is_negative_9_and_quality_is_45() {
        Item item = new Item("aa", -9, 45);
        Item[] items = new Item[1];
        items[0] = item;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        System.out.println(items[0]);
        assertEquals(-10, items[0].sellIn);
        assertEquals(43, items[0].quality);
    }

    @Test
    public void should_return_true_given_item_name_Aged_Brie_and_sellIn_is_negative_9_and_quality_is_45() {
        Item item = new Item("Aged Brie", -9, 45);
        Item[] items = new Item[1];
        items[0] = item;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        System.out.println(items[0]);
        assertEquals(-10, items[0].sellIn);
        assertEquals(47, items[0].quality);
    }
}