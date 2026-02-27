package tn.esprit.arctic.championat.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.arctic.championat.entities.Championnat;

@Repository
public interface ChampionnatRepository extends JpaRepository<Championnat, Long> {

}
