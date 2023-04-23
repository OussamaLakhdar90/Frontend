package PFE.ProjetFindetude.controllers;


import PFE.ProjetFindetude.models.PlanTarifaire;
import PFE.ProjetFindetude.repositories.PlanTarifaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/planTarifaire")
public class planTarifaireController {
    @Autowired
    private PlanTarifaireRepository planTarifaireRepository;


    @GetMapping
    private  ResponseEntity<List<PlanTarifaire>>findall(){
        List<PlanTarifaire> plans= planTarifaireRepository.findAll();
        if (plans.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(plans);
        }
    }

}
