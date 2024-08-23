package in.praveen.mcs.service;

import in.praveen.mcs.dto.ProductRequest;
import in.praveen.mcs.model.Product;
import in.praveen.mcs.repository.ProductReposirory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductReposirory productReposirory;

    public void createproduct(ProductRequest productRequest){
        Product product = Product.builder()
                .name(productRequest.name())
                .description(productRequest.description())
                .price(productRequest.price())
                .build();
        productReposirory.save(product);
        log.info("Product created successfully");


    }
}
