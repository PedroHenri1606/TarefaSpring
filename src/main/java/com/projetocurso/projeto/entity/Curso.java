package com.projetocurso.projeto.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "curso")
@NoArgsConstructor
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @NotNull
    @Column(name = "id_curso", unique = true)
    private Long id;

    @Getter @Setter
    @NotNull
    @Column(name = "nome_curso", unique = true)
    private String nome;

    @Getter @Setter
    @NotNull
    @Column(name = "carga_horaria_curso", unique = true)
    private String cargaHoraria;

    //@Getter @Setter
    //@NotNull
    //@ManyToMany
    //@JoinColumn(name = "alunos_id")
   // @Column(name = "alunos_curso")
    private List<Aluno> alunos = new ArrayList<>();

    public Curso(Long id, String nome, String cargaHoraria, List<Aluno> alunos) {
        this.id = id;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.alunos = alunos;
    }
}
