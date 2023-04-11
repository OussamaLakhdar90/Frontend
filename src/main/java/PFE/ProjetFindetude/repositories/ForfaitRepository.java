package PFE.ProjetFindetude.repositories;

import PFE.ProjetFindetude.models.Forfait;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForfaitRepository extends JpaRepository<Forfait,String> { //Long refer to the primary key


}
