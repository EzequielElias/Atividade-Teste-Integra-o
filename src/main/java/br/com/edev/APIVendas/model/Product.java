package br.com.edev.APIVendas.model;

public class Product {

    private Long id;
    private String name;
    private Double price;
    private Integer quantityInStock;
    private Double maxDiscountPercentage;

    public Product(Long id, String name, Double price, Integer quantityInStock, Double maxDiscountPercentage) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
        this.maxDiscountPercentage = maxDiscountPercentage;
    }

    public Double getPriceWitchDiscount(final Double discount) {

        if(discount > maxDiscountPercentage) {
            return price * (1 - maxDiscountPercentage);

        } else {
            return price * (1 - discount);
        }
    }

    public Integer getQuantityOfProductFromSale(final Integer quantitySale) {
        if(quantitySale > quantityInStock) {
            final String message = "Ordered quantity unavailable. Avaible quantity ";
            System.out.println(message + quantityInStock);
            return quantityInStock;
        } else {
            return quantitySale;
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantityInStock=" + quantityInStock +
                ", maxDiscountPercentage=" + maxDiscountPercentage +
                '}';
    }

}
