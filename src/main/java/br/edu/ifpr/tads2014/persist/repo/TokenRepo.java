package br.edu.ifpr.tads2014.persist.repo;


import br.edu.ifpr.tads2014.persist.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepo extends JpaRepository<Token, String> {
}
