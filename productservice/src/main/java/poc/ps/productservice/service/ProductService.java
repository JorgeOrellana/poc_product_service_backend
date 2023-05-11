package poc.ps.productservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import poc.ps.productservice.dto.ProductRequestDTO;
import poc.ps.productservice.dto.ProductResponseDTO;
import poc.ps.productservice.model.Product;
import poc.ps.productservice.repository.ProductRepository;

import java.util.UUID;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductService
{
    private final ProductRepository productRepository;

    public ProductResponseDTO save(ProductRequestDTO productRequestDTO)
    {
        Product product = new Product();
        product.setId(5l);
        product.setName(productRequestDTO.getName());
        product.setDescription(productRequestDTO.getDescription());
        product.setPrice(productRequestDTO.getPrice());
        product.setType(productRequestDTO.getType());

        Product newProduct = productRepository.save(product);
        return new ProductResponseDTO(newProduct);
    }
}
