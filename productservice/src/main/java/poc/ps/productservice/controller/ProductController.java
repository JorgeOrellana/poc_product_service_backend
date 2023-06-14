package poc.ps.productservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import poc.ps.productservice.dto.ProductRequestDTO;
import poc.ps.productservice.dto.ProductResponseDTO;
import poc.ps.productservice.service.ProductService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("product")
public class ProductController
{
    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ProductResponseDTO> createProduct(@RequestBody ProductRequestDTO productRequestDTO)
    {
        ProductResponseDTO newProductRequestDTO = productService.save(productRequestDTO);
        return ResponseEntity.ok(newProductRequestDTO);
    }

    @GetMapping
    public ResponseEntity<List<ProductResponseDTO>> getAllProducts()
    {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable String id)
    {
        productService.deleteProductById(id);
        return ResponseEntity.ok("Deleted successfully");
    }
}
