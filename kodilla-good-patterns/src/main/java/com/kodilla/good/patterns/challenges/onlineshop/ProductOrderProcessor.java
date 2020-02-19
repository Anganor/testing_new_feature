package com.kodilla.good.patterns.challenges.onlineshop;

public class ProductOrderProcessor {
    private InformationService informationService;
    private ProductOrderService productOrderService;
    private ProductOrderRepository productOrderRepository;

    public ProductOrderProcessor(final InformationService informationService, final ProductOrderService productOrderService, final ProductOrderRepository productOrderRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.productOrderRepository = productOrderRepository;
    }

    public ProductOrderDTO processOrder(ProductOrderRequest productOrderRequest) {
        boolean isProperlySold = productOrderService.sold(productOrderRequest.getUser(), productOrderRequest.getOrderDate(), productOrderRequest.getProduct(), productOrderRequest.getQuantity());
        if (isProperlySold) {
            informationService.inform(productOrderRequest.getUser(), productOrderRequest.getOrderDate());
            productOrderRepository.createProductOrder(productOrderRequest.getUser(), productOrderRequest.getOrderDate(), productOrderRequest.getProduct(), productOrderRequest.getQuantity());
        } else {
            System.out.println(productOrderRequest.getUser().getUsername() + " an error occurred during your request. Transaction has been denied. Please fill out the form and try again later.");
        }
        return new ProductOrderDTO(productOrderRequest.getUser(), productOrderRequest.getOrderDate(), productOrderRequest.getProduct(), productOrderRequest.getQuantity(), isProperlySold);
    }
}
