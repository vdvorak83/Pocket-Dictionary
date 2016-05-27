package ua.com.vseprav.services;

import ua.com.vseprav.domain.Dictionary;

import java.util.List;

public interface DictionaryService {

    List<Dictionary> findAll();

    Dictionary findOne(long id);

    Dictionary save(Dictionary dictionary);

    void delete(long id);

}
