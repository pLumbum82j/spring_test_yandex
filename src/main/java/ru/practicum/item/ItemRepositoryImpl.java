package ru.practicum.item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ItemRepositoryImpl implements ItemRepository {
    private static List<Item> items = new ArrayList<>();

    @Override
    public List<Item> findByUserId(long userId) {
        return null;
    }

    @Override
    public Item save(Item item) {
        return null;
    }

    @Override
    public void deleteByUserIdAndItemId(long userId, long itemId) {

    }
}
