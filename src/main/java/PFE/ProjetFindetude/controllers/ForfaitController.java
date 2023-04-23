package PFE.ProjetFindetude.controllers;

import PFE.ProjetFindetude.models.Forfait;
import PFE.ProjetFindetude.repositories.ForfaitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/forfait")
public class ForfaitController {
    @Autowired  //Sprint Injection
    private ForfaitRepository forfaitRepository; //create instance of the the repisotry
/*
    @GetMapping
    public List<Forfait> list() {

        return forfaitRepository.findAll(); //Query all forfait and return them as object list  and pass them to jackson(serialisation librarie ) then turn forfait into json and return them to the column

    }
*/

    @GetMapping("/{idclient}")
    public ResponseEntity<List<Forfait>> getEmployeeByName(@PathVariable String idclient) {
        List<Forfait> forfaits = forfaitRepository.findAllByIdclient(idclient);
        if (forfaits.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(forfaits);
        }
    }
/*
    @PostMapping //we requiring Post HTTP
    @ResponseStatus(HttpStatus.CREATED) //choose response code
    public Forfait create (@RequestBody final Forfait forfait){ //to be commited to the datbase you need to flush
        return forfaitRepository.saveAndFlush(forfait);
    }

    @RequestMapping(value="{id_client}" , method=RequestMethod.DELETE) //delete without any children records
        public void delete(@PathVariable String id_client){
            forfaitRepository.deleteById(id_client);
        }

    @RequestMapping(value="{id_client}" , method=RequestMethod.PUT)//Update  put or patch(portion of the attributes for update
    public Forfait update(@PathVariable String id_client , @RequestBody Forfait forfait){
      //  TODO: Add validation that all atributes are passed in , otherwise return a 400 bad request
        Forfait existingForfait = forfaitRepository.getReferenceById(id_client); //check the existing one
        BeanUtils.copyProperties(forfait,existingForfait,"id_client"); // allow us to ignore proprieties to ignore #ignore primary key
        return   forfaitRepository.saveAndFlush(existingForfait);
//Put update all attributes


    }
*/

}
