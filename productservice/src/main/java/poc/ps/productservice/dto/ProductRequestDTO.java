package poc.ps.productservice.dto;

import lombok.Getter;

@Getter
public class ProductRequestDTO
{
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String type;
}
