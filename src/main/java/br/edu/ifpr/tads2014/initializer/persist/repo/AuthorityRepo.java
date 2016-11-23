package br.edu.ifpr.tads2014.initializer.persist.repo;

import br.edu.ifpr.tads2014.initializer.persist.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepo extends JpaRepository<Authority, Long> {

}