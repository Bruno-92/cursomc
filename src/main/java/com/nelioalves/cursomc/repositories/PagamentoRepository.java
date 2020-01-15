package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.domain.Pagamento;

//CAMADA REPOSITORIO --> CHAMA A DE MODELO

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
