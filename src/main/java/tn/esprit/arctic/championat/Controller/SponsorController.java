package tn.esprit.arctic.championat.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.championat.Services.ISponsorService;

@RestController
@AllArgsConstructor
public class SponsorController {

    private ISponsorService sponsorService;


}