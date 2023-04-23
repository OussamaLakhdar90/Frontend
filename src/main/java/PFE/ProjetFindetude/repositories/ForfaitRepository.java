package PFE.ProjetFindetude.repositories;

import PFE.ProjetFindetude.models.Forfait;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ForfaitRepository extends JpaRepository<Forfait,Integer> { //Long refer to the primary key

    List<Forfait> findAllByIdclient(String idclient);
}
