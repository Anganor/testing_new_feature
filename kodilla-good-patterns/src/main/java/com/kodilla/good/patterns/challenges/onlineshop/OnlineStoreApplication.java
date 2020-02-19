package com.kodilla.good.patterns.challenges.onlineshop;

public class OnlineStoreApplication {
    public static void main(String[] args) {
        ToothbrushOrderRequestRetriever toothbrushOrderRequestRetriever = new ToothbrushOrderRequestRetriever();
        CarOrderRequestRetriever carOrderRequestRetriever = new CarOrderRequestRetriever();

        ProductOrderRequest toothbrushOrderRequest = toothbrushOrderRequestRetriever.retrieve();
        ProductOrderRequest carOrderRequest = carOrderRequestRetriever.retrieve();

        ProductOrderProcessor toothbrushOrderProcessor = new ProductOrderProcessor(new EmailNotification(), new ToothbrushOrderService(), new ToothbrushOrderRepository());
        ProductOrderProcessor carOrderProcessor = new ProductOrderProcessor(new SmsNotification(), new CarOrderService(), new CarOrderRepository());

        toothbrushOrderProcessor.processOrder(toothbrushOrderRequest);
        System.out.println();
        carOrderProcessor.processOrder(carOrderRequest);
    }
}
