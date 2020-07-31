package br.com.wmarvyn.newloteria.services;

import br.com.wmarvyn.newloteria.domain.Lotofacil;
import br.com.wmarvyn.newloteria.repositores.LotofacilRepository;
import javassist.tools.rmi.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class LotofacilServie {


    @Autowired
    private LotofacilRepository repo;

    public Lotofacil find(Integer Concurso) throws ObjectNotFoundException {
        Optional<Lotofacil> obj = repo.findById(Concurso);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! getConcurso: " + Concurso));
    }

    public Lotofacil insert(Lotofacil obj) {
        obj.setId((null));
        return repo.save(obj);
    }
}