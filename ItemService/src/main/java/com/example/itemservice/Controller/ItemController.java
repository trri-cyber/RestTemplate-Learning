package com.example.itemservice.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ItemController {

    @GetMapping("/items")
    public List<String> getItems() {

        List<String> items = new ArrayList<>();

        items.add("Burger");
        items.add("Pizza");
        items.add("Juice");
        items.add("Sandwich");

        return items;
    }
}