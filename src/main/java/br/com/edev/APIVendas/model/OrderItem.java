package br.com.edev.APIVendas.model;

public class OrderItem {

    private static Product product;
    private static Integer quantityOrder;
    private static Double discount;

    public OrderItem(Product product, Integer quantityOrder, Double discount) {
        OrderItem.product = product;
        OrderItem.quantityOrder = quantityOrder;
        OrderItem.discount = discount;
    }

    public double getQuantityTotalOrder() {
        return product.getQuantityOfProductFromSale(quantityOrder);
    }

    public double getTotalPriceSale() {
        return product.getPriceWitchDiscount(discount) * quantityOrder;
    }

    public static double getTotalPriceSale(Product product) {
        return 0;
    }

}
