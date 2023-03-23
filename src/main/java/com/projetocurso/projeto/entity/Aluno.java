package com.projetocurso.projeto.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "alunos")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @NotNull
    @Column(name = "id_aluno", unique = true)
    private Long id;

    @Getter @Setter
    @NotNull
    @Column(name = "nome_aluno")
    private String nome;

    @Getter @Setter
    @NotNull
    @Column(name = "cpf_aluno")
    private String cpf;

    @Getter @Setter
    @NotNull
    @JoinColumn(name = "endereco_id")
    @OneToOne()
    private Endereco endereco;

    @OneToMany(mappedBy = "aluno")
    private List<Contato> contatos;

    @ManyToMany
    @JoinTable(name = "tb_alunos_cursos",
    joinColumns = @JoinColumn(name = "aluno_id"),
    inverseJoinColumns = @JoinColumn(name = "cursos_id"))
    private List<Curso> cursos;

    @ManyToMany
    @JoinTable(name = "tb_alunos_professores",
    joinColumns = @JoinColumn(name = "aluno_id"),
    inverseJoinColumns = @JoinColumn(name = "professor_id"))
    private List<Professor> professores;

    public Aluno() {}
}
