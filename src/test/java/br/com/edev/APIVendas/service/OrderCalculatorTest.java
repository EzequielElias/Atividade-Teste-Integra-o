/*

---------------------------------------------------------
CÓDIGO EXEMPLO PRA CONSULTAS FUTURAS, PORÉM NÃO UTILIZADO
---------------------------------------------------------

package br.com.edev.APIVendas.service;

import br.com.edev.APIVendas.model.OrderItem;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class OrderCalculatorTest {

    private OrderCalculator orderCalculator;

    public OrderCalculatorTest() {
        System.out.println("Construtor");
        this.orderCalculator = new OrderCalculator();
    }

    @BeforeEach
    void setUp() {
        System.out.println("Execução de texte antes de cada um");
    }

    @BeforeAll
    static void setupAll() {
        System.out.println("Before all");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After all");
    }

    @AfterEach
    void afterEach() {
        System.out.println("After each");
    }

    @Test
    public void shouldCalculateTotalOrderPrice() {
        final Order order = new Order(aListOfOrderItems());
        Double result = orderCalculator.calculateOrder(order);
        assertEquals(30, result);
    }

    @Test
    public void shouldCalculateTotalOfMultipleOrders() {
        final List<Order> orders =
                Arrays.asList(new Order(aListOfOrderItems()),
                              new Order(aListOfOrderItems())
                );
        final Double result = orderCalculator.calculateMultipleOrders(orders);
        assertEquals(60.0, result);


    }


    public List<OrderItem> aListOfOrderItems() {
        return Arrays.asList(
                aOrderItem(20.0),
                aOrderItem(10.0)
        );
    }

    private OrderItem aOrderItem(final Double expectedValue) {
        OrderItem orderItem = mock(OrderItem.class);
        when(orderItem.totalPrice()).thenReturn(expectedValue);
        return orderItem;
    }

} */
