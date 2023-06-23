package poc.ps.productservice;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import poc.ps.productservice.dto.InventoryRequestDTO;
import poc.ps.productservice.dto.InventoryResponseDTO;
import poc.ps.productservice.service.InventoryService;

@RestController
@RequiredArgsConstructor
@RequestMapping("inventory")
public class InventoryController
{
    private InventoryService inventoryService;
    @PostMapping
    public ResponseEntity<InventoryResponseDTO> create(@Validated @RequestBody final InventoryRequestDTO inventoryRequestDTO)
    {
        InventoryResponseDTO inventoryResponseDTO = inventoryService.createInventory(inventoryRequestDTO);
        return ResponseEntity.ok(inventoryResponseDTO);
    }
}
