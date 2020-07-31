package br.com.wmarvyn.newloteria.resources;


import br.com.wmarvyn.newloteria.domain.Lotofacil;
import br.com.wmarvyn.newloteria.services.LotofacilServie;
import javassist.tools.rmi.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/Lotofacil")
public class LotofacilResources {
    @Autowired
    private LotofacilServie Servie;

    @RequestMapping(value = "/{Concurso}", method = RequestMethod.GET)
    public ResponseEntity<Lotofacil> find(@PathVariable Integer Concurso) throws ObjectNotFoundException {

        Lotofacil obj = Servie.find(Concurso);
        return ResponseEntity.ok().body(obj);
    }


    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@RequestBody Lotofacil obj){
        obj = Servie.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{Concurso}").buildAndExpand(obj.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }


}
