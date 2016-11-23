package br.edu.ifpr.tads2014.persist.repo;

import br.edu.ifpr.tads2014.persist.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepo extends JpaRepository<Authority, Long> {

}