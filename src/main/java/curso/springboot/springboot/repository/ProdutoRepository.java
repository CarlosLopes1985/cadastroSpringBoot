package curso.springboot.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import curso.springboot.springboot.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
