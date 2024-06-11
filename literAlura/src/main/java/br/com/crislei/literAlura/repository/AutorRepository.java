package br.com.crislei.literAlura.repository;


import br.com.crislei.literAlura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

// Interage com o banco de dados, realiza operações na Entidade Autor
@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {
    List<Autor> findAll();

    Optional<Autor> findByNome(String nome);

    @Query("SELECT a.nome, a.anoDeNascimento, a.anoDeFalecimento FROM Autor a WHERE a.id = :autorId")
    List<Object[]> obterDadosAutor(@Param("autorId") Long autorId);
    @Query("SELECT a FROM Autor a WHERE a.nome ILIKE %:trechoDoNomeAutor%")

    List<Autor> autorPorTrechoDoNome(String trechoDoNomeAutor);
}