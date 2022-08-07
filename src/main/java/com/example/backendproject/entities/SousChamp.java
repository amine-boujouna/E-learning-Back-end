package com.example.backendproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(uniqueConstraints=@UniqueConstraint(columnNames="TITRE"))
@Builder
public class SousChamp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SOUS_CHAMP_ID")
    private Long id;

    @Column(name = "TITRE")
    private String titre;

    @ManyToOne
    @JsonIgnore
    private Champ champ;
}
