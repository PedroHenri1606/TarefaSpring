package com.projetocurso.projeto.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "alunos")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Column(name = "id_aluno", unique = true)
    private Long id;

    @Getter @Setter
    @NotNull
    @Column(name = "nome_aluno")
    private String nome;

    @Getter @Setter
    @NotNull
    @Column(name = "cpf_aluno", unique = true)
    private String cpf;

    @Getter @Setter
    //@NotNull
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", referencedColumnName = "id_endereco")
    private Endereco endereco;

    @Getter
    @OneToMany(mappedBy = "aluno")
    private Set<Contato> contatos;

    @Getter
    @ManyToMany
    @JoinTable(name = "tb_alunos_cursos",
    joinColumns = @JoinColumn(name = "aluno_id"),
    inverseJoinColumns = @JoinColumn(name = "cursos_id"))
    private Set<Curso> cursos = new HashSet<>();

    @Getter
    @ManyToMany
    @JoinTable(name = "tb_alunos_professores",
    joinColumns = @JoinColumn(name = "aluno_id"),
    inverseJoinColumns = @JoinColumn(name = "professor_id"))
    private List<Professor> professores;

    public Aluno() {}

    public Aluno(Long id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }
}
