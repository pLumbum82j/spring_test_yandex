package ru.practicum.item;

import java.util.List;

public interface ItemService {
    Item addNewItem(Long userId, Item item);

    void deleteItem(long userId, long itemId);

    List<Item> getItems(long userId);

}
