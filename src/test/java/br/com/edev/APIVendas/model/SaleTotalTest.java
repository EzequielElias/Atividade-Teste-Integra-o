package br.com.edev.APIVendas.model;

import br.com.edev.APIVendas.service.SaleTotalCalculate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SaleTotalTest {

    @Test
    public void calculateTotalSaleAmount() {
        SaleTotalCalculate saleTotalCalculate = new SaleTotalCalculate();

        Product product1 = new Product(1234L, "Celular", 2000.0, 5, 0.05);
        Product product2 = new Product(12345L, "TV 32'", 2500.0, 5, 0.05);
        Product product3 = new Product(123456L, "Monitor", 1000.0, 5, 0.05);

        Double valor1 = SaleTotalCalculate.saleTotalPriceProduct(product1, 0.0, 2);
//        assertEquals(valor1, 19799.8);
        assertEquals(valor1, 4000.0);
        Double valor2 = SaleTotalCalculate.saleTotalPriceProduct(product2, 0.0, 2);
//        assertEquals(valor2, 6375.2);
        assertEquals(valor2, 5000.0);
        Double valor3 = SaleTotalCalculate.saleTotalPriceProduct(product3, 0.0, 2);
//        assertEquals(valor3, 1289.82);
        assertEquals(valor3, 2000.0);
        System.out.print(valor1 + valor2 + valor3);

        Double priceFinalTotalSale = SaleTotalCalculate.saleTotalPrice(valor1,valor2, valor3);
        assertEquals(priceFinalTotalSale, 11000.0);
//       assertEquals(priceFinalTotalSale, 27464.646);
    }

}
