package br.com.edev.APIVendas.model;

import org.junit.jupiter.api.Test;

public class ListOfProductInStockTest {

    private Object product;

    @Test
    public void ImprimirLista() {
        ListOfProductInStock listOfProductInStock = new ListOfProductInStock(product);
        listOfProductInStock.list();
    }

}
