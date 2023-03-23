package com.projetocurso.projeto.service;

import com.projetocurso.projeto.entity.Aluno;
import com.projetocurso.projeto.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    public List<Aluno> findAll(){
        return repository.findAll();
    }

    public Aluno findById(long id){
        Optional<Aluno> objeto = repository.findById(id);
        return objeto.get();
    }

    public Aluno adicionar(Aluno aluno){
        return repository.save(aluno);
    }
}
