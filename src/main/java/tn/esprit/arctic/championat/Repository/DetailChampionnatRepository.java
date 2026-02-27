package tn.esprit.arctic.championat.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.arctic.championat.entities.DetailChampionnat;

@Repository
public interface DetailChampionnatRepository extends JpaRepository<DetailChampionnat, Long> {

}
