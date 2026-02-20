package tn.esprit.arctic.championat.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.championat.entities.Equipe;

public interface EquipeRepository extends JpaRepository<Equipe, Long> {
}
