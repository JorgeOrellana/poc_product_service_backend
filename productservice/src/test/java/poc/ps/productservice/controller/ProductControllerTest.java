package poc.ps.productservice.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import poc.ps.productservice.dto.ProductRequestDTO;
import poc.ps.productservice.dto.ProductResponseDTO;
import poc.ps.productservice.model.Product;
import poc.ps.productservice.repository.ProductRepository;
import poc.ps.productservice.service.ProductService;

import java.util.Arrays;
import java.util.List;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
public class ProductControllerTest
{
    @Mock
    private ProductService productService;
    @InjectMocks
    private ProductController productController;

    private ProductResponseDTO productResponseDTO;
    private ProductRequestDTO productRequestDTO;
    @BeforeEach
    public void setUp()
    {
        productRequestDTO = new ProductRequestDTO(Long.valueOf(13), "Product", "Product description", 120.0, "Product");
        Product product = new Product(Long.valueOf(13), "Product", "Product description", 120.0, "Product");
        productResponseDTO = new ProductResponseDTO(product);
    }

    @Test
    public void testCreateProduct()
    {


        Mockito.when(productService.save(productRequestDTO)).thenReturn(productResponseDTO);

        ResponseEntity<ProductResponseDTO> result = productController.createProduct(productRequestDTO);

        assertEquals("Create Product Test", HttpStatus.OK, result.getStatusCode());
        assertEquals("Verify content", productRequestDTO.getName(), result.getBody().getName());
        assertEquals("Verify content", productRequestDTO.getDescription(), result.getBody().getDescription());
    }

    @Test
    public void testGetAllProducts()
    {
        List<ProductResponseDTO> products = Arrays.asList(productResponseDTO);
        Mockito.when(productService.getAllProducts()).thenReturn(products);

        ResponseEntity<List<ProductResponseDTO>> result = productController.getAllProducts();

        assertEquals("Get All Products", products.size(), result.getBody().size());
    }
}
