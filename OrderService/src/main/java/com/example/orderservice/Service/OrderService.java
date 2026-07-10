package com.example.orderservice.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class OrderService {

    private final RestTemplate restTemplate;

    public OrderService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @SuppressWarnings("unchecked")
    public List<String> getMenu() {
        String url = "http://localhost:8081/items";
        return restTemplate.getForObject(url, List.class);
    }

    public String placeOrder(String item) {

        List<String> menu = getMenu();

        if (menu.contains(item)) {
            return "Order placed for " + item;
        }

        return "Item not available";
    }

}