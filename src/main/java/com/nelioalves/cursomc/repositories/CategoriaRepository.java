package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.domain.Categoria;

//CAMADA REPOSITORIO --> CHAMA A DE MODELO

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
