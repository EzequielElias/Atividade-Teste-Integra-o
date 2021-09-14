package br.com.edev.APIVendas.service;

import br.com.edev.APIVendas.model.ListOfProductInStock;
import br.com.edev.APIVendas.model.OrderItem;

import java.util.List;

public class OrderCalculator {

    public Double calculateOrder(final ListOfProductInStock listOfProductInStock) {
        return listOfProductInStock.getStockRegister().stream().mapToDouble(OrderItem::getTotalPriceSale).sum();
    }


}
