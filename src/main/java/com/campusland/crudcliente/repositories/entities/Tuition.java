package com.campusland.crudcliente.repositories.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tuitions")
public class Tuition {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double fee;

    @JoinColumn(name = "student_id")
    @OneToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties("tuition")
    private Student student;


}

