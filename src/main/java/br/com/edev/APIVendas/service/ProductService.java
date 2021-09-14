package br.com.edev.APIVendas.service;

import br.com.edev.APIVendas.clients.ProductClientAPI;
import br.com.edev.APIVendas.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductClientAPI clientAPI;

    public List<Product> findAll() {
        return clientAPI.findAll();
    }

}
