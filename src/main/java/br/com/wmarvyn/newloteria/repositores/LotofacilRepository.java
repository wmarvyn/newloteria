package br.com.wmarvyn.newloteria.repositores;

import br.com.wmarvyn.newloteria.domain.Lotofacil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LotofacilRepository extends JpaRepository<Lotofacil, Integer> {

}
