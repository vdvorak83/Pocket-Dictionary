package ua.com.vseprav.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.vseprav.domain.Dictionary;
import ua.com.vseprav.repositories.DictionaryRepository;
import ua.com.vseprav.services.DictionaryService;

import java.util.List;

@Service
public class DictionaryServiceImpl implements DictionaryService {

    @Autowired
    private DictionaryRepository dictionaryRepository;

    @Override
    public List<Dictionary> findAll() {
        return dictionaryRepository.findAll();
    }

    @Override
    public Dictionary findOne(long id) {
        return dictionaryRepository.findOne(id);
    }

    @Override
    public Dictionary save(Dictionary dictionary) {
        return dictionaryRepository.save(dictionary);
    }

    @Override
    public void delete(long id) {
        dictionaryRepository.delete(id);
    }
}
