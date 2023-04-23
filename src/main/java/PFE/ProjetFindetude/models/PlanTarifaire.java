package PFE.ProjetFindetude.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;



@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name="PlanTarifaire", schema = "pfe")
public class PlanTarifaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IDplanTarif;
    private String nomPlan;
    private Double prixminuteappellocalonnet;

    public Integer getIDplanTarif() {
        return IDplanTarif;
    }

    public void setIDplanTarif(Integer IDplanTarif) {
        this.IDplanTarif = IDplanTarif;
    }

    public String getNomPlan() {
        return nomPlan;
    }

    public void setNomPlan(String nomPlan) {
        this.nomPlan = nomPlan;
    }

    public Double getPrixminuteappellocalonnet() {
        return prixminuteappellocalonnet;
    }

    public void setPrixminuteappellocalonnet(Double prixminuteappellocalonnet) {
        this.prixminuteappellocalonnet = prixminuteappellocalonnet;
    }

    public Double getPrixminuteappelinter() {
        return prixminuteappelinter;
    }

    public void setPrixminuteappelinter(Double prixminuteappelinter) {
        this.prixminuteappelinter = prixminuteappelinter;
    }

    public Double getPrixsmslocal() {
        return prixsmslocal;
    }

    public void setPrixsmslocal(Double prixsmslocal) {
        this.prixsmslocal = prixsmslocal;
    }

    public Double getPrixsmsinter() {
        return prixsmsinter;
    }

    public void setPrixsmsinter(Double prixsmsinter) {
        this.prixsmsinter = prixsmsinter;
    }

    public Double getPrixmodata() {
        return prixmodata;
    }

    public void setPrixmodata(Double prixmodata) {
        this.prixmodata = prixmodata;
    }

    public Integer getPackminute() {
        return packminute;
    }

    public void setPackminute(Integer packminute) {
        this.packminute = packminute;
    }

    public Integer getPacksms() {
        return packsms;
    }

    public void setPacksms(Integer packsms) {
        this.packsms = packsms;
    }

    public Integer getPackdata() {
        return packdata;
    }

    public void setPackdata(Integer packdata) {
        this.packdata = packdata;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private Double prixminuteappelinter;
    private Double prixsmslocal;
    private Double prixsmsinter;
    private Double prixmodata;
    private Integer packminute;
    private Integer packsms;
    private Integer packdata;
    private String type;


}
