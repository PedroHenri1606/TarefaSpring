package com.projetocurso.projeto.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "contatos")
public class Contato {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @NotNull
    @Column(name = "id_contatos", unique = true)
    private Long id;

    @Getter @Setter
    @NotNull
    @Column(name = "tipo_contato")
    private String tipo;


    @Getter @Setter
    @NotNull
    @Column(name = "valor_contato")
    private String valor;


    @Getter @Setter
    @NotNull
    @ManyToOne
    @JoinColumn(name = "alunos_id")
    private Aluno aluno;

    public Contato() {}
}
