package ru.practicum.item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ItemRepositoryImpl implements ItemRepository {
    private static List<Item> items = new ArrayList<>();
    private static Long itemId = 0L;

    private Long generatedId() {
        return itemId++;
    }

    @Override
    public List<Item> findByUserId(long userId) {
        List<Item> result = new ArrayList<>();
        for (Item itemList : items) {
            if (itemList.getUserId() == userId) {
                result.add(itemList);
            }
        }
        return result;
    }

    @Override
    public Item save(Item item) {
        item.setId(generatedId());
        items.add(item);
        return item;
    }

    @Override
    public void deleteByUserIdAndItemId(long userId, long itemId) {
        for (Item itemlist : items) {
            if (itemlist.getId() == userId && itemlist.getId() == itemId) {
                items.remove(itemlist);
            }
        }
    }
}
