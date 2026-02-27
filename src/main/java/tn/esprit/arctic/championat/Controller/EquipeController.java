package tn.esprit.arctic.championat.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.championat.Services.IEquipeService;

@RestController
@AllArgsConstructor
public class EquipeController {

    private IEquipeService equipeService;

}
