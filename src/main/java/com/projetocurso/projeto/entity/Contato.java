package com.projetocurso.projeto.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "contato")
@NoArgsConstructor
public class Contato {

    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "id_contato", unique = true)
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
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    public Contato(Long id, String tipo, String valor, Aluno aluno) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
        this.aluno = aluno;
    }
}
