package poc.ps.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import poc.ps.productservice.model.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long>
{
}
