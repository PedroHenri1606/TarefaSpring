package com.projetocurso.projeto.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "professor")
@NoArgsConstructor
public class Professor {

    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "id_professor", unique = true)
    private Long id;

    @Getter @Setter
    @NotNull
    @Column(name = "nome_professor")
    private String nome;

    //@Getter @Setter
    //@ManyToOne
    //@JoinColumn(name = "alunos_id")
    //@Column(name = "alunos_professor")
    private List<Aluno> alunos = new ArrayList<>();

    public Professor(Long id, String nome, List<Aluno> alunos) {
        this.id = id;
        this.nome = nome;
        this.alunos = alunos;
    }
}
