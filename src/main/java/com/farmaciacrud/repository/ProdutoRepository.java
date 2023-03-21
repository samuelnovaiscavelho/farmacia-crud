package com.farmaciacrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import com.farmaciacrud.model.Produto;
import org.springframework.data.repository.query.Param;

import java.util.List;

//@Repository
public interface ProdutoRepository  extends JpaRepository<Produto, Long>{

    List<Produto> findAllByMarcaContainingIgnoreCase(@Param("marca") String marca);

   // public Optional <Produto> findByMarca(String marca);

}
