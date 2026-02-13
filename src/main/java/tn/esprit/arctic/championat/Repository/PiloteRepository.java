package tn.esprit.arctic.championat.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.championat.entities.Pilote;

public interface PiloteRepository extends JpaRepository<Pilote, Long> {
}