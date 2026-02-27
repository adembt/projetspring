package tn.esprit.arctic.championat.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.championat.Repository.PiloteRepository;
import tn.esprit.arctic.championat.entities.Pilote;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PiloteService implements IPiloteService {

    private final PiloteRepository pr;

    @Override
    public String addPilote(Pilote pilote) {
        pr.save(pilote);
        return "added successfully";
    }


}