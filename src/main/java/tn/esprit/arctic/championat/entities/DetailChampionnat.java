package tn.esprit.arctic.championat.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.*;

@Entity
public class DetailChampionnat {

    @Id
    private String code;

    private String description;
    @OneToOne
    @JoinColumn(name = "championnat_id", unique = true)
    private Championnat championnat;
}
