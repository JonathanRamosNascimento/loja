package com.jonathan.loja.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import com.jonathan.loja.domain.Categoria;
import com.jonathan.loja.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

  // @Query("SELECT DISTINCT obj FROM Produto obj INNER JOIN obj.categorias cat
  // WHERE obj.nome LIKE %:nome% AND cat IN :categorias")
  @Transactional(readOnly = true)
  Page<Produto> findDistinctByNomeContainingAndCategoriasIn(String nome, List<Categoria> categorias,
      Pageable pageRequest);

}
