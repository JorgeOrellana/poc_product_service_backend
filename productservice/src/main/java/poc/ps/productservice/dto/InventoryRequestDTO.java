package poc.ps.productservice.dto;

import lombok.Getter;

import java.util.Date;

@Getter
public class InventoryRequestDTO
{
    private Long id;
    private String name;
    private String description;
    private int amount;
    private Double price;
    private String productType;
    private Date depositDate;
    private String state;
}
