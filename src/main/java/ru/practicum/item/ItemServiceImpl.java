package ru.practicum.item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
    @Override
    public Item addNewItem(Long userId, Item item) {
        return null;
    }

    @Override
    public void deleteItem(long userId, long itemId) {

    }

    @Override
    public List<Item> getItems(long userId) {
        return null;
    }
}
