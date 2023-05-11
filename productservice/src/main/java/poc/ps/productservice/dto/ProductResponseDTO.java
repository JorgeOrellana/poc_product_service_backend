package poc.ps.productservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import poc.ps.productservice.model.Product;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponseDTO
{
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String type;

    public ProductResponseDTO(Product product)
    {
        this.id = product.getId();
        this.name = product.getName();
        this.description = product.getDescription();
        this.price = product.getPrice();
        this.type = product.getType();
    }
}
