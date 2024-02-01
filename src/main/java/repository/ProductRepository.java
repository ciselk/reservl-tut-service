package repository;
import model.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface ProductRepository extends MongoRepository<ProductEntity, String> {
    //Optional<ProductEntity> findByUserId(String id);
}