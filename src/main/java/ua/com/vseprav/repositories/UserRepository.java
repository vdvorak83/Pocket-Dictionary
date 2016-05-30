package ua.com.vseprav.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.com.vseprav.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUserName(String username);
}