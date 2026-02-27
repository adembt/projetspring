package tn.esprit.arctic.championat.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.championat.Services.IContratService;

@RestController
@AllArgsConstructor
public class ContratController {

    private IContratService contratService;



}