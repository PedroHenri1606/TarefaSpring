package com.projetocurso.projeto.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "professores")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @NotNull
    @Column(name = "id_professor")
    private Long id;

    @Getter @Setter
    @NotNull
    @Column(name = "nome_professor")
    private String nome;

    @Getter @Setter
    @ManyToMany(mappedBy = "professores")
    private Set<Aluno> alunos = new HashSet<>();

}
