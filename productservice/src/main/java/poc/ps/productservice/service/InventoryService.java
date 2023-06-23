package poc.ps.productservice.service;

import org.springframework.stereotype.Service;
import poc.ps.productservice.dto.InventoryRequestDTO;
import poc.ps.productservice.dto.InventoryResponseDTO;
import poc.ps.productservice.model.Inventory;
import poc.ps.productservice.repository.InventoryRepository;

import java.util.UUID;

@Service
public class InventoryService
{
    private InventoryRepository inventoryRepository;

    public InventoryResponseDTO createInventory(InventoryRequestDTO inventoryRequestDTO)
    {
        Inventory inventory = new Inventory(UUID.randomUUID().getLeastSignificantBits(),
                inventoryRequestDTO.getName(),
                inventoryRequestDTO.getDescription(),
                inventoryRequestDTO.getAmount(),
                inventoryRequestDTO.getPrice(),
                inventoryRequestDTO.getProductType(),
                inventoryRequestDTO.getDepositDate(),
                inventoryRequestDTO.getState());

        return new InventoryResponseDTO(inventory);
    }
}
