package poc.ps.productservice.dto;

import lombok.AllArgsConstructor;
import poc.ps.productservice.model.Inventory;

import java.util.Date;


public class InventoryResponseDTO
{
    private Long id;
    private String name;
    private String description;
    private int amount;
    private Double price;
    private String productType;
    private Date depositDate;
    private String state;

    public InventoryResponseDTO(Inventory inventory)
    {
        this.id = inventory.getId();
        this.name = inventory.getName();
        this.description = inventory.getDescription();
        this.amount = inventory.getAmount();
        this.price = inventory.getPrice();
        this.productType = inventory.getProductType();
        this.depositDate = inventory.getDepositDate();
        this.state = inventory.getState();
    }
}
