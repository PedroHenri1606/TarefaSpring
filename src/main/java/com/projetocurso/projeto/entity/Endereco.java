package com.projetocurso.projeto.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "enderecos")
public class Endereco {


    @Id
    @Getter
    @NotNull
    @Column(name = "id_endereco", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Getter @Setter
    @NotNull
    @Column(name = "rua_endereco")
    private String rua;

    @Getter @Setter
    @NotNull
    @Column(name = "numero_endereco")
    private String numero;

    @Getter @Setter
    @NotNull
    @Column(name = "bairro_endereco")
    private String bairro;

    @Getter @Setter
    @NotNull
    @Column(name = "cep_endereco")
    private String cep;

    @Getter @Setter
    @NotNull
    @OneToOne(mappedBy = "endereco")
    private Aluno aluno;
}
