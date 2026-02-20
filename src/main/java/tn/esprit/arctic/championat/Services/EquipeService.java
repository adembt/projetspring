package tn.esprit.arctic.championat.Services;



import tn.esprit.arctic.championat.entities.Equipe;
import tn.esprit.arctic.championat.Repository.EquipeRepository;

public class EquipeService implements IEquipeService {
    EquipeRepository er;
    @Override
    public Equipe ajouterEquipe(Equipe equipe) {
        return er.save(equipe);
    }
}
