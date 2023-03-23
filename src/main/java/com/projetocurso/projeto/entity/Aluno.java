package com.projetocurso.projeto.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "alunos")
@NoArgsConstructor
public class Aluno {

    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "id_aluno", unique = true)
    private Long id;

    @NotNull
    @Getter @Setter
    @Column(name = "nome_aluno")
    private String nome;

    @NotNull
    @Getter @Setter
    @Column(name = "cpf_aluno", unique = true)
    private String cpf;

    @NotNull
    @Getter @Setter
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "endereco_id")
    private Endereco Endereco;

    public Aluno(Long id, String nome, String cpf, com.projetocurso.projeto.entity.Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        Endereco = endereco;
    }
}
