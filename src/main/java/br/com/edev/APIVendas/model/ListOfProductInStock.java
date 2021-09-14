package br.com.edev.APIVendas.model;

import java.util.Arrays;
import java.util.List;

public class ListOfProductInStock {

    private final List<Product> stockRegister;

    public List<Product> getStockRegister() {
        return stockRegister;
    }

    public ListOfProductInStock(Object stockRebister) {
        this.stockRegister = Arrays.asList(
                new Product(123456789L, "TV", 2000.0, 5, 0.1),
                new Product(987654321L, "CELL", 1500.0, 5, 0.1),
                new Product(2468101214L, "Notebook", 3000.0, 5, 0.2)
        );
    }

    public void list() {
        for(Product list : stockRegister) {
            System.out.println(list);
        }
    }

}
