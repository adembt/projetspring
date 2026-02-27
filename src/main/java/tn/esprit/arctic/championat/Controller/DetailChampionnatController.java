package tn.esprit.arctic.championat.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.championat.Services.IDetailChampionnatService;

@RestController
@AllArgsConstructor
public class DetailChampionnatController {

    private IDetailChampionnatService detailChampionnatService;



}
