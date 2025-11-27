package org.process;

import moduls.Order;

public class OrderProcessor {
    private final Order<?> order;

    public OrderProcessor(Order<?> order) {
        this.order = order;
    }

    public void process() {
        System.out.println("Processing started [%s] [%s]...".formatted(order.getId(), order.getProduct().getName()));

        try {
            Thread.sleep(500L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Processing finished [%s] [%s]".formatted(order.getId(), order.getProduct().getName()));
    }
}
