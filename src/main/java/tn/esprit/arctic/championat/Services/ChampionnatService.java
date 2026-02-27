package tn.esprit.arctic.championat.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.championat.Repository.ChampionnatRepository;

@Service
@AllArgsConstructor
public class ChampionnatService implements IChampionnatService {

    private ChampionnatRepository championnatRepository;


}
