package tn.esprit.arctic.championat.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.championat.Repository.EquipeRepository;
import tn.esprit.arctic.championat.entities.Equipe;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipeService implements IEquipeService {

    private final EquipeRepository er;

    @Override
    public Equipe ajouterEquipe(Equipe equipe) {
        return er.save(equipe);
    }


}