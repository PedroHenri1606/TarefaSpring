package com.projetocurso.projeto.repository;

import com.projetocurso.projeto.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno,Long> {
}
