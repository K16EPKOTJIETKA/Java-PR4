package org.main;

import moduls.Order;
import moduls.ProductFactory;
import multithreading.AsyncExecutor;
import org.repository.OrderRepository;
import org.process.OrderProcessor;

import java.util.stream.IntStream;

public class ApplicationMain {
    public static void main(String[] args)  {
        final var executor = new AsyncExecutor();
        final var orderRepository = new OrderRepository();
        final var factory = new ProductFactory();


        IntStream.range(0, 100)
                .mapToObj(number -> {
                    final var product = isEven(number)
                            ? factory.createElectronics()
                            : factory.createClothes();

                    return Order.builder()
                            .id(Integer.toString(number))
                            .product(product)
                            .build();
                }).forEach(orderRepository::add);

        // Process all orders asynchronously.
        orderRepository.findAll()
                .stream()
                .map(OrderProcessor::new)
                .forEach(orderProcessor -> executor.execute(orderProcessor::process));

    }

    private static boolean isEven(final int i) {
        return i % 2 == 0;
    }
}

