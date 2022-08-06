package com.example.backendproject.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Exercice")
@Builder
public class Exercice {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "exercice_id")
        private Long id;
    }

