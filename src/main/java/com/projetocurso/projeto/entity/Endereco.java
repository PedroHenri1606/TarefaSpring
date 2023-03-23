package com.projetocurso.projeto.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "endereco")
@NoArgsConstructor
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @NotNull
    @Column(name = "id_endereco", unique = true)
    private Long id;

    @Getter @Setter
    @NotNull
    @Column(name = "rua_endereco")
    private String rua;

    @Getter @Setter
    @NotNull
    @Column(name = "numero_endereco;")
    private String numero;

    @Getter @Setter
    @NotNull
    @Column(name = "bairro_endereco")
    private String bairro;

    @Getter @Setter
    @Column(name = "cep_endereco")
    private String cep;
}
