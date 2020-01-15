package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.domain.ItemPedido;

//CAMADA REPOSITORIO --> CHAMA A DE MODELO

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {

}
