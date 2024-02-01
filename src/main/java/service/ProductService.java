package service;

import model.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import repository.ProductRepository;

import java.util.List;

@Service //IOC'de olmasını sağlıyor.
@Component
@Repository
public class ProductService {

    @Autowired
    ProductRepository productRepository;
    public ProductEntity updateProduct(ProductEntity productEntity) {
        productEntity.setTitle(productEntity.getTitle().concat(" - TRENDYOL"));
        return productRepository.save(productEntity);
    }

    public List<ProductEntity> returnAllTheProducts() {
        return productRepository.findAll();
    }

}
