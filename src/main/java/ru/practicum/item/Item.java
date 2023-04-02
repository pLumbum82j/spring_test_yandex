package ru.practicum.item;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
class Item {
    private Long id;
    private Long userId;
    private String url;
}