package com.farmaciacrud.repository;

import com.farmaciacrud.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    //entender essa etapa pq do List
    public List<Categoria> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);
}
