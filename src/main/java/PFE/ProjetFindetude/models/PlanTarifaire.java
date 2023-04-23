package PFE.ProjetFindetude.models;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="PlanTarifaire", schema = "pfe")
public class PlanTarifaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IDplanTarif;
    private String nomPlan;
    private Double prixminuteappellocalonnet;
    private Double prixminuteappelinter;
    private Double prixsmslocal;
    private Double prixsmsinter;
    private Double prixmodata;
    private Integer packminute;
    private Integer packsms;
    private Integer packdata;
    private String type;


}
