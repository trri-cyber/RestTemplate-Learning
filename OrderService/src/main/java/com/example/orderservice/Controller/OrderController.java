package com.example.orderservice.Controller;

import com.example.orderservice.Service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/menu")
    public List<String> menu() {
        return orderService.getMenu();
    }

    @PostMapping("/order")
    public String order(@RequestParam String item) {
        return orderService.placeOrder(item);
    }
    @PostMapping("/items")
    public List<String> getItems(@RequestParam String item) {

        String[] items = item.split(",");

        return Arrays.asList(items);
    }
}