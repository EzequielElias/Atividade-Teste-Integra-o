package br.com.edev.APIVendas.clients;

import br.com.edev.APIVendas.model.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

@Component
public class ProductClientAPI {

    @Value("${product.api.url}")
    private String url;

    private List<Product> products;

    public List<Product> findAll() {
        return this.products;
    }

}
