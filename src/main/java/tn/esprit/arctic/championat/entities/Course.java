package tn.esprit.arctic.championat.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import java.util.List;
import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCourse;

    private String emplacement;

    private LocalDate dateCourse;


    @ManyToMany(mappedBy = "courses")
    private List<Championnat> championnat;
    @OneToMany(mappedBy = "course")
    private List<Position> positions;
}

