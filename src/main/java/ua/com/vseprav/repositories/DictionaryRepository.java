package ua.com.vseprav.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.vseprav.domain.Dictionary;

@Repository
public interface DictionaryRepository extends JpaRepository<Dictionary, Long> {
}
