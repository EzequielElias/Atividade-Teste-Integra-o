package br.com.edev.APIVendas.service;

import br.com.edev.APIVendas.model.Product;

public class SaleTotalCalculate {

    public static double saleTotalPriceProduct(Product product, Double discount, Integer quantity) {
        Double productSale1 = product.getPriceWitchDiscount(discount);
        Integer productSale2 = product.getQuantityOfProductFromSale(quantity);
        return productSale1 * productSale2;
    }

    public static Double saleTotalPrice(Double productOne, Double productTwo, Double productTree) {
        return productOne + productTwo + productTree;
    }

}
