package com.example.backendproject.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(uniqueConstraints=@UniqueConstraint(columnNames="TITRE"))
@Builder
public class Chapitre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CHAMP_ID")
    private Long id;

    @Column(name = "TITRE")
    private String titre;
}

