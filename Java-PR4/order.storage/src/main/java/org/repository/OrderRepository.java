package org.repository;

import moduls.Order;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class OrderRepository {
    private final ConcurrentHashMap<String, Order<?>> orders = new ConcurrentHashMap<>();

    public void add(Order<?> order) {
        orders.put(order.getId(), order);
    }

    public List<Order<?>> findAll() {
        return orders.values().stream().toList();
    }
}
