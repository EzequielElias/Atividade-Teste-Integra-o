package br.com.edev.APIVendas.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    public void shouldCalculateTotalPriceWitchDiscount() {
        Product product = new Product(1L, "Teste", 100.0, 10, 0.10);
        Double result = product.getPriceWitchDiscount(0.10);
        assertEquals(90.0, result);
    }

    @Test
    public void whenDiscountIsHigherThenMaxDiscountShouldUseMaxDiscountPercentage() {
        Product product = new Product(1L, "Teste", 100.0,10, 0.10);
        Double result = product.getPriceWitchDiscount(0.15);
        assertEquals(90.0, result);
    }

    @Test
    public void whenDiscountIsLowerThenMaxDiscountShouldUseProvidedDiscount() {
        Product product = new Product(1L, "Teste", 100.0, 10, 0.10);
        Double result = product.getPriceWitchDiscount(0.05);
        assertEquals(95.0, result);
    }

    @Test
    public void shouldCalculateStock() {
        Product product = new Product(12345L, "Cell", 2500.0, 5, 0.5);
        Integer result = product.getQuantityOfProductFromSale(3);
        assertEquals(3, result);
    }

}
