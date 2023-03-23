package com.projetocurso.projeto.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "cursos")
public class Curso {

    @Id
    @Getter
    @NotNull
    @Column(name = "id_cursos", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Getter @Setter
    @NotNull
    @Column(name = "nome_cursos")
    private String nome;

    @Getter @Setter
    @NotNull
    @Column(name = "carga_horaria_cursos")
    private String cargaHoraria;


    @Getter @Setter
    @JsonIgnore
    @Column(name = "alunos_cursos")
    @ManyToMany(mappedBy = "cursos")
    private List<Aluno> alunos;

}
