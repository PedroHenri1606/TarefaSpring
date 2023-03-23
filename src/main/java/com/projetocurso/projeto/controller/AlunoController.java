package com.projetocurso.projeto.controller;

import com.projetocurso.projeto.entity.Aluno;
import com.projetocurso.projeto.repository.AlunoRepository;
import com.projetocurso.projeto.service.AlunoService;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoController {

    @Autowired
    private AlunoService service;
    @GetMapping   //---METODO GET DO HTTP
    public ResponseEntity<List> findAll(){
       List<Aluno> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Aluno> findById(@PathVariable Long id){
        Aluno objeto = service.findById(id);
        return ResponseEntity.ok().body(objeto);
    }

    @PostMapping
    public ResponseEntity<Aluno>adicionar(@RequestBody Aluno aluno){
        aluno = service.adicionar(aluno);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(aluno.getId()).toUri();
        return ResponseEntity.created(uri).body(aluno);
    }
}
