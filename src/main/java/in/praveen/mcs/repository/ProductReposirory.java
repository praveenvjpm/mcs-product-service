package in.praveen.mcs.repository;

import in.praveen.mcs.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductReposirory extends MongoRepository<Product,String> {
}
