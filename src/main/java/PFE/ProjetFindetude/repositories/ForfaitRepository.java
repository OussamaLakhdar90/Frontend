package PFE.ProjetFindetude.repositories;

import PFE.ProjetFindetude.models.Forfait;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ForfaitRepository extends JpaRepository<Forfait, Long>  { //Long refer to the primary key

    List<Forfait> findAllByIdclient(String idclient);
}
