package PFE.ProjetFindetude.controllers;






import PFE.ProjetFindetude.models.Predictedforfait;
import PFE.ProjetFindetude.repositories.PredictedforfaitRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/predictedforfait")
public class PredictedforfaitController {

    @Autowired  //Sprint Injection
    private PredictedforfaitRepository predictedforfaitRepository;

    @GetMapping
    @RequestMapping("{id_client}") //add aditional id to the request
    public Predictedforfait get(@PathVariable String id_client){
        return predictedforfaitRepository.getReferenceById(id_client); //returns and query the forfait for ID

    }








}
