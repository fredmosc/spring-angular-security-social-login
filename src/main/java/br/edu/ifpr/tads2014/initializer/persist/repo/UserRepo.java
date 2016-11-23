package br.edu.ifpr.tads2014.initializer.persist.repo;


import br.edu.ifpr.tads2014.initializer.persist.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByLogin(String login);

}
