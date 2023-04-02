package ru.practicum.item;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;

    @GetMapping
    public List<Item> get(@RequestHeader(value = "X-Later-User-Id", required = false) long userId) {
        return itemService.getItems(userId);
    }

    @PostMapping
    public Item add(@RequestHeader(value = "X-Later-User-Id", required = false) Long userId,
                    @RequestBody Item item) {
        return itemService.addNewItem(userId, item);
    }

    @DeleteMapping("/{itemId}")
    public void deleteItem(@RequestHeader(value = "X-Later-User-Id", required = false) long userId,
                           @PathVariable long itemId) {
        itemService.deleteItem(userId, itemId);
    }
}