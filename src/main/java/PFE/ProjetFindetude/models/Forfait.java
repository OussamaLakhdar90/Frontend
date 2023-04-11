package PFE.ProjetFindetude.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name="forfait", schema = "pfe")
public class Forfait {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //jpa will utilise postgres created sequence
    private String id_client;
    private String id_date;
    private Integer total_appel_on_net;
    private Integer total_sms_local;
    private Integer total_sms_inter;
    private Integer total_appel_inter;
    private Integer total_appel_offnet;
    private Double total_data;
    private Double cout_appel_onnet;
    private Double cout_appel_offnet;
    private Double cout_appel_international;
    private Double cout_sms_national ;
    private Double cout_sms_international ;




    public Forfait(){


    }

    public String getId_client() {
        return id_client;
    }

    public void setId_client(String id_client) {
        this.id_client = id_client;
    }

    public String getId_date() {
        return id_date;
    }

    public void setId_date(String id_date) {
        this.id_date = id_date;
    }

    public Integer getTotal_appel_on_net() {
        return total_appel_on_net;
    }

    public void setTotal_appel_on_net(Integer total_appel_on_net) {
        this.total_appel_on_net = total_appel_on_net;
    }

    public Integer getTotal_sms_local() {
        return total_sms_local;
    }

    public void setTotal_sms_local(Integer total_sms_local) {
        this.total_sms_local = total_sms_local;
    }

    public Integer getTotal_sms_inter() {
        return total_sms_inter;
    }

    public void setTotal_sms_inter(Integer total_sms_inter) {
        this.total_sms_inter = total_sms_inter;
    }

    public Integer getTotal_appel_inter() {
        return total_appel_inter;
    }

    public void setTotal_appel_inter(Integer total_appel_inter) {
        this.total_appel_inter = total_appel_inter;
    }

    public Integer getTotal_appel_offnet() {
        return total_appel_offnet;
    }

    public void setTotal_appel_offnet(Integer total_appel_offnet) {
        this.total_appel_offnet = total_appel_offnet;
    }

    public Double getTotal_data() {
        return total_data;
    }

    public void setTotal_data(Double total_data) {
        this.total_data = total_data;
    }

    public Double getcout_appel_onnet() {
        return cout_appel_onnet;
    }

    public void setcout_appel_onnet(Double cout_appel_onnet) {
        this.cout_appel_onnet = cout_appel_onnet;
    }

    public Double getcout_appel_offnet() {
        return cout_appel_offnet;
    }

    public void setcout_appel_offnet(Double cout_appel_offnet) {
        this.cout_appel_offnet = cout_appel_offnet;
    }

    public Double getcout_appel_international() {
        return cout_appel_international;
    }

    public void setcout_appel_international(Double cout_appel_international) {
        this.cout_appel_international = cout_appel_international;
    }

    public Double getcout_sms_national() {
        return cout_sms_national;
    }

    public void setcout_sms_national(Double cout_sms_national) {
        this.cout_sms_national = cout_sms_national;
    }

    public Double getcout_sms_international() {
        return cout_sms_international;
    }

    public void setcout_sms_international(Double cout_sms_international) {
        this.cout_sms_international = cout_sms_international;
    }
}
