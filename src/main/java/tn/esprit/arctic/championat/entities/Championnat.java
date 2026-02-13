package tn.esprit.arctic.championat.entities;

import jakarta.persistence.*;
import java.util.List;
@Entity
public class Championnat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChampionnat;

    @Enumerated(EnumType.STRING)
    private Categorie categorie;

    private String libelleC;

    private Integer annee;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "detail_championnat_id")
    private DetailChampionnat detailChampionnat;

    @ManyToMany
    @JoinTable(
            name = "championnat_course",
            joinColumns = @JoinColumn(name = "championnat_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses;


}