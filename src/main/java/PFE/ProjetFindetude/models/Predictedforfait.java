package PFE.ProjetFindetude.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name="predictedforfait", schema = "pfe")
@Data
public class Predictedforfait {
@Id
private String id_client;
private String forfait;




}
