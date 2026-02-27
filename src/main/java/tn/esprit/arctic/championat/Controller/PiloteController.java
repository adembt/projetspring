package tn.esprit.arctic.championat.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.championat.Services.IPiloteService;

@RestController
@AllArgsConstructor
public class PiloteController {

    private IPiloteService piloteService;


}