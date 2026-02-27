package tn.esprit.arctic.championat.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.championat.entities.Sponsor;
import tn.esprit.arctic.championat.Repository.SponsorRepository;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SponsorService implements ISponsorService {

    private final SponsorRepository sp;

    @Override
    public Sponsor ajouterSponsor(Sponsor sponsor) {

        sponsor.setDateCreation(LocalDate.now());
        sponsor.setArchived(false);
        sponsor.setBloquerContrat(false);

        return sp.save(sponsor);
    }

    @Override
    public List<Sponsor> ajouterSponsors(List<Sponsor> sponsors) {

        sponsors.forEach(s -> {
            s.setDateCreation(LocalDate.now());
            s.setArchived(false);
            s.setBloquerContrat(false);
        });

        return sp.saveAll(sponsors);
    }

    @Override
    public Sponsor modifierSponsor(Sponsor sponsor) {

        sponsor.setDateDerniereModification(LocalDate.now());
        return sp.save(sponsor);
    }

    @Override
    public void supprimerSponsor(Long idSponsor) {
        sp.deleteById(idSponsor);
    }

    @Override
    public List<Sponsor> listSponsors() {
        return sp.findAll();
    }

    @Override
    public Sponsor recupererSponsor(Long idSponsor) {
        return sp.findById(idSponsor).orElse(null);
    }

    @Override
    public Boolean archiverSponsor(Long idSponsor) {

        Sponsor sponsor = sp.findById(idSponsor).orElse(null);

        if (sponsor == null) {
            return false;
        }

        sponsor.setArchived(true);
        sp.save(sponsor);

        return true;
    }
    
}