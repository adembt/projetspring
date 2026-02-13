package tn.esprit.arctic.championat.Services;

import tn.esprit.arctic.championat.entities.Pilote;
import tn.esprit.arctic.championat.Repository.PiloteRepository;

public class PiloteService implements IPiloteService{
    PiloteRepository pr;

    @Override
    public String addPiole(Pilote pilote) {
        pr.save(pilote);
        return "added successfully ";
    }
}
