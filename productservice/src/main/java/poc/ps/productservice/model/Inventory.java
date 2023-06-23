package poc.ps.productservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Getter
@AllArgsConstructor
@Table(name = "t_inventory")
@Entity
public class Inventory
{
    @Id
    private Long id;
    private String name;
    private String description;
    private int amount;
    private Double price;
    private String productType;
    private Date depositDate;
    private String state;
}
