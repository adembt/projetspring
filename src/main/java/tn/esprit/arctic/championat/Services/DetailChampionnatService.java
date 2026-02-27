package tn.esprit.arctic.championat.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.championat.Repository.DetailChampionnatRepository;

@Service
@AllArgsConstructor
public class DetailChampionnatService implements IDetailChampionnatService {

    private DetailChampionnatRepository detailChampionnatRepository;



}
