package org.example.springdatatp1.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "centres")
public class Centre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nom_centre", nullable = false)
    private String nomCentre;

    private String adresse;

    @OneToMany(mappedBy = "centre", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Etudiant> etudiants;
}