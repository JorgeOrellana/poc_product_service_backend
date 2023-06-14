package poc.ps.productservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ProductRequestDTO
{
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String type;
}
